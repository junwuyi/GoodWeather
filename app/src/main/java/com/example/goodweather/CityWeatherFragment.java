package com.example.goodweather;


import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.goodweather.adapter.HourWeatherHolder;
import com.example.goodweather.base.BaseFragment;
import com.example.goodweather.bean.HourForecast;
import com.example.goodweather.bean.WeatherBean;
import com.example.goodweather.db.DBManager;
import com.example.goodweather.util.DateUtil;
import com.google.gson.Gson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.example.goodweather.city_manager.SearchCityActivity.findObjectProvince;


/**
 * A simple {@link Fragment} subclass.
 */
public class CityWeatherFragment extends BaseFragment implements View.OnClickListener {
    TextView tempTv, cityTv, conditionTv, windTv, tempRangeTv, dateTv, clothIndexTv, humidityTv,
            carIndexTv, coldIndexTv, sportIndexTv, raysIndexTv, tipTv, umbrellaTv, fishTv, traffic, tourism;
    ImageView dayIv, bing_pic_img;
    LinearLayout futureLayout;
    ScrollView outLayout;
    Menu menu;
    String url1 = "https://wis.qq.com/weather/common?source=pc&weather_type=observe|index|rise|alarm|air|tips|forecast_24h|forecast_1h&province=";
    String url2 = "&city=";
    String city;
    String provice;
    private WeatherBean.DataBean.IndexBean index;
    private SharedPreferences pref;
    private int bgNum;

    //=============兵哥
    private List<HourForecast> hourForecastList = new ArrayList<>();
    RecyclerView recyclerView;
    //=============兵哥


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_city_weather, container, false);
        initView(view);
//        可以通过activity传值获取到当前fragment加载的是那个地方的省份和天气情况
        Bundle bundle = getArguments();
//        获取省份
        String provice_city = bundle.getString("city");
        Log.i("provice_city",provice_city);
        //provice = findObjectProvince(provice_city);

        if (provice_city.split(" ").length > 1) {
            provice = provice_city.split(" ")[0];
            city = provice_city.split(" ")[1];
        } else {
            city = provice_city.split(" ")[0];
//            provice = provice_city.split(" ")[0];
            provice = findObjectProvince(provice_city);
        }
        Log.i("bing_", provice);
        String url = url1 + provice + url2 + city;
//          调用父类获取数据的方法
        loadData(url);
        return view;
    }

    @Override
    public void onSuccess(String result) {
//        解析并展示数据
        try {
            parseShowData(result);
        } catch (ParseException e) {
            e.printStackTrace();
        }
//         更新数据
        int i = DBManager.updateInfoByCity(city, result);
        if (i <= 0) {
//            更新数据库失败，说明没有这条城市信息，增加这个城市记录
            DBManager.addCityInfo(city, result);
        }
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
//        数据库当中查找上一次信息显示在Fragment当中
        String s = DBManager.queryInfoByCity(city);
        if (!TextUtils.isEmpty(s)) {
            try {
                parseShowData(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

    }

    private void parseShowData(String result) throws ParseException {
//        使用gson解析数据
        WeatherBean weatherBean = new Gson().fromJson(result, WeatherBean.class);
        WeatherBean.DataBean resultsBean = weatherBean.getData();
        index = resultsBean.getIndex();
//        设置TextView
        cityTv.setText(city);
        tipTv.setText(resultsBean.getTips().getObserve().get_$0());
//        获取今日天气情况
        WeatherBean.DataBean.ObserveBean todayDataBean = resultsBean.getObserve();

        //获取天气图标代码
       /* String weather_code = todayDataBean.getWeather_code();
        String imgUrl = "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/currentweather/day/" + weather_code + ".png";
        Glide.with(this.getActivity()).load(imgUrl).into(dayIv);*/


        //兵 clothIndexTv,
        //  carIndexTv, coldIndexTv, sportIndexTv, raysIndexTv, tipTv, umbrellaTv, fishTv,traffic,lunar
        clothIndexTv.setText("穿衣 " + index.getClothes().getInfo());
        coldIndexTv.setText("感冒 " + index.getCold().getInfo());
        sportIndexTv.setText("运动 " + index.getSports().getInfo());
        raysIndexTv.setText("紫外线 " + index.getUltraviolet().getInfo());
        umbrellaTv.setText("雨伞 " + index.getUmbrella().getInfo());
        fishTv.setText("钓鱼 " + index.getFish().getInfo());
        traffic.setText("交通 " + index.getTraffic().getInfo());
        carIndexTv.setText("洗车 " + index.getCarwash().getInfo());
        tourism.setText("旅游 " + index.getTourism().getInfo());


        String time = changeTime(todayDataBean.getUpdate_time());
        dateTv.setText("发布时间 " + time);
        windTv.setText(resultsBean.getForecast_24h().get_$1().getDay_wind_direction() + " " + todayDataBean.getWind_power() + "级");
        humidityTv.setText("湿度 " + todayDataBean.getHumidity() + "%");
        tempRangeTv.setText("气压 " + todayDataBean.getPressure() + "hPa");
        conditionTv.setText(todayDataBean.getWeather_short());
//        获取实时天气温度情况，需要处理字符串
        tempTv.setText(todayDataBean.getDegree() + "°");

//        获取未来三天的天气情况，加载到layout当中
        WeatherBean.DataBean.Forecast24hBean futureList = resultsBean.getForecast_24h();
        //================今天
        View itemView = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        itemView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        futureLayout.addView(itemView);
        TextView idateTv = itemView.findViewById(R.id.item_center_tv_date);
        TextView iconTv = itemView.findViewById(R.id.item_center_tv_con);
        TextView itemprangeTv = itemView.findViewById(R.id.item_center_tv_temp);
        TextView wind = itemView.findViewById(R.id.item_center_tv_winddirection);
        // 获取对应的位置的天气情况
        idateTv.setText(futureList.get_$1().getTime().substring(5).replace("-", "/") + "   " + "今天");
        iconTv.setText(futureList.get_$1().getDay_weather());
        wind.setText(futureList.get_$1().getDay_wind_direction());
        itemprangeTv.setText(futureList.get_$1().getMin_degree() + "~" + futureList.get_$1().getMax_degree() + "°C");
        //================今天

        View itemView0 = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        itemView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        futureLayout.addView(itemView0);
        TextView idateTv0 = itemView0.findViewById(R.id.item_center_tv_date);
        TextView iconTv0 = itemView0.findViewById(R.id.item_center_tv_con);
        TextView itemprangeTv0 = itemView0.findViewById(R.id.item_center_tv_temp);
        TextView wind0 = itemView0.findViewById(R.id.item_center_tv_winddirection);

//          获取对应的位置的天气情况
        idateTv0.setText(futureList.get_$2().getTime().substring(5).replace("-", "/") + "   " + DateUtil.dateToWeek(futureList.get_$2().getTime()));
        iconTv0.setText(futureList.get_$2().getDay_weather());
        wind0.setText(futureList.get_$2().getDay_wind_direction());
        itemprangeTv0.setText(futureList.get_$2().getMin_degree() + "~" + futureList.get_$2().getMax_degree() + "°C");

        View itemView3 = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        itemView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        futureLayout.addView(itemView3);
        TextView idateTv3 = itemView3.findViewById(R.id.item_center_tv_date);
        TextView iconTv3 = itemView3.findViewById(R.id.item_center_tv_con);
        TextView itemprangeTv3 = itemView3.findViewById(R.id.item_center_tv_temp);
        TextView wind3 = itemView3.findViewById(R.id.item_center_tv_winddirection);
//          获取对应的位置的天气情况
        idateTv3.setText(futureList.get_$3().getTime().substring(5).replace("-", "/") + "   " + DateUtil.dateToWeek(futureList.get_$3().getTime()));
        iconTv3.setText(futureList.get_$3().getDay_weather());
        wind3.setText(futureList.get_$3().getDay_wind_direction());
        itemprangeTv3.setText(futureList.get_$3().getMin_degree() + "~" + futureList.get_$3().getMax_degree() + "°C");

        View itemView2 = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        itemView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        futureLayout.addView(itemView2);
        TextView idateTv2 = itemView2.findViewById(R.id.item_center_tv_date);
        TextView iconTv2 = itemView2.findViewById(R.id.item_center_tv_con);
        TextView itemprangeTv2 = itemView2.findViewById(R.id.item_center_tv_temp);
        TextView wind2 = itemView2.findViewById(R.id.item_center_tv_winddirection);
//          获取对应的位置的天气情况
        idateTv2.setText(futureList.get_$4().getTime().substring(5).replace("-", "/") + "   " + DateUtil.dateToWeek(futureList.get_$4().getTime()));
        iconTv2.setText(futureList.get_$4().getDay_weather());
        wind2.setText(futureList.get_$4().getDay_wind_direction());
        itemprangeTv2.setText(futureList.get_$4().getMin_degree() + "~" + futureList.get_$4().getMax_degree() + "°C");

        /**
         *24小时
         */
        initHourForecast(resultsBean);
        //RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        HourWeatherHolder adapter = new HourWeatherHolder(this.getActivity(), hourForecastList);
        // new HourWeatherHolder(getApplicationContext(),)
        recyclerView.setAdapter(adapter);

    }


    private void initHourForecast(WeatherBean.DataBean resultsBean) throws ParseException {
        WeatherBean.DataBean.Forecast1h forecast_1h = resultsBean.getForecast_1h();

           /* String hour = changeTime(forecast_1h.get_$0().getUpdate_time());
            String weather_code = forecast_1h.get_$0().getWeather_code();
            String degree = forecast_1h.get_$0().getDegree();*/

        String weather_code0 = forecast_1h.get_$0().getWeather_code();
        HourForecast hourForecast0 = new HourForecast(changeTime(forecast_1h.get_$0().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code0 + ".png", forecast_1h.get_$0().getDegree() + "°");
        hourForecastList.add(hourForecast0);

        String weather_code1 = forecast_1h.get_$1().getWeather_code();
        HourForecast hourForecast1 = new HourForecast(changeTime(forecast_1h.get_$1().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code1 + ".png", forecast_1h.get_$1().getDegree() + "°");
        hourForecastList.add(hourForecast1);

        String weather_code2 = forecast_1h.get_$2().getWeather_code();
        HourForecast hourForecast2 = new HourForecast(changeTime(forecast_1h.get_$2().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code2 + ".png", forecast_1h.get_$2().getDegree() + "°");
        hourForecastList.add(hourForecast2);

        String weather_code3 = forecast_1h.get_$3().getWeather_code();
        HourForecast hourForecast3 = new HourForecast(changeTime(forecast_1h.get_$3().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code3 + ".png", forecast_1h.get_$3().getDegree() + "°");
        hourForecastList.add(hourForecast3);

        String weather_code4 = forecast_1h.get_$4().getWeather_code();
        HourForecast hourForecast4 = new HourForecast(changeTime(forecast_1h.get_$4().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code4 + ".png", forecast_1h.get_$4().getDegree() + "°");
        hourForecastList.add(hourForecast4);

        String weather_code5 = forecast_1h.get_$5().getWeather_code();
        HourForecast hourForecast5 = new HourForecast(changeTime(forecast_1h.get_$5().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code5 + ".png", forecast_1h.get_$5().getDegree() + "°");
        hourForecastList.add(hourForecast5);

        String weather_code6 = forecast_1h.get_$6().getWeather_code();
        HourForecast hourForecast6 = new HourForecast(changeTime(forecast_1h.get_$6().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code6 + ".png", forecast_1h.get_$6().getDegree() + "°");
        hourForecastList.add(hourForecast6);

        String weather_code7 = forecast_1h.get_$7().getWeather_code();
        HourForecast hourForecast7 = new HourForecast(changeTime(forecast_1h.get_$7().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code7 + ".png", forecast_1h.get_$7().getDegree() + "°");
        hourForecastList.add(hourForecast7);

        String weather_code8 = forecast_1h.get_$8().getWeather_code();
        HourForecast hourForecast8 = new HourForecast(changeTime(forecast_1h.get_$8().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code8 + ".png", forecast_1h.get_$8().getDegree() + "°");
        hourForecastList.add(hourForecast8);

        String weather_code9 = forecast_1h.get_$9().getWeather_code();
        HourForecast hourForecast9 = new HourForecast(changeTime(forecast_1h.get_$9().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code9 + ".png", forecast_1h.get_$9().getDegree() + "°");
        hourForecastList.add(hourForecast9);

        String weather_code10 = forecast_1h.get_$10().getWeather_code();
        HourForecast hourForecast10 = new HourForecast(changeTime(forecast_1h.get_$10().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code10 + ".png", forecast_1h.get_$10().getDegree() + "°");
        hourForecastList.add(hourForecast10);

        String weather_code12 = forecast_1h.get_$12().getWeather_code();
        HourForecast hourForecast12 = new HourForecast(changeTime(forecast_1h.get_$12().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code12 + ".png", forecast_1h.get_$12().getDegree() + "°");
        hourForecastList.add(hourForecast12);

        String weather_code13 = forecast_1h.get_$13().getWeather_code();
        HourForecast hourForecast13 = new HourForecast(changeTime(forecast_1h.get_$13().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code13 + ".png", forecast_1h.get_$13().getDegree() + "°");
        hourForecastList.add(hourForecast13);

        String weather_code14 = forecast_1h.get_$14().getWeather_code();
        HourForecast hourForecast14 = new HourForecast(changeTime(forecast_1h.get_$14().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code14 + ".png", forecast_1h.get_$14().getDegree() + "°");
        hourForecastList.add(hourForecast14);

        String weather_code15 = forecast_1h.get_$15().getWeather_code();
        HourForecast hourForecast15 = new HourForecast(changeTime(forecast_1h.get_$15().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code15 + ".png", forecast_1h.get_$15().getDegree() + "°");
        hourForecastList.add(hourForecast15);

        String weather_code16 = forecast_1h.get_$16().getWeather_code();
        HourForecast hourForecast16 = new HourForecast(changeTime(forecast_1h.get_$16().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code16 + ".png", forecast_1h.get_$16().getDegree() + "°");
        hourForecastList.add(hourForecast16);

        String weather_code17 = forecast_1h.get_$17().getWeather_code();
        HourForecast hourForecast17 = new HourForecast(changeTime(forecast_1h.get_$17().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code17 + ".png", forecast_1h.get_$17().getDegree() + "°");
        hourForecastList.add(hourForecast17);

        String weather_code18 = forecast_1h.get_$18().getWeather_code();
        HourForecast hourForecast18 = new HourForecast(changeTime(forecast_1h.get_$18().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code18 + ".png", forecast_1h.get_$18().getDegree() + "°");
        hourForecastList.add(hourForecast18);

        String weather_code19 = forecast_1h.get_$19().getWeather_code();
        HourForecast hourForecast19 = new HourForecast(changeTime(forecast_1h.get_$19().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code19 + ".png", forecast_1h.get_$19().getDegree() + "°");
        hourForecastList.add(hourForecast19);

        String weather_code20 = forecast_1h.get_$20().getWeather_code();
        HourForecast hourForecast20 = new HourForecast(changeTime(forecast_1h.get_$20().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/" + weather_code20 + ".png", forecast_1h.get_$20().getDegree() + "°");
        hourForecastList.add(hourForecast20);

        String weather_code21 = forecast_1h.get_$21().getWeather_code();
        HourForecast hourForecast21 = new HourForecast(changeTime(forecast_1h.get_$21().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2121/weather/pc/icon/weather/day/" + weather_code21 + ".png", forecast_1h.get_$21().getDegree() + "°");
        hourForecastList.add(hourForecast21);

        String weather_code22 = forecast_1h.get_$22().getWeather_code();
        HourForecast hourForecast22 = new HourForecast(changeTime(forecast_1h.get_$22().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2222/weather/pc/icon/weather/day/" + weather_code22 + ".png", forecast_1h.get_$22().getDegree() + "°");
        hourForecastList.add(hourForecast22);

        String weather_code23 = forecast_1h.get_$23().getWeather_code();
        HourForecast hourForecast23 = new HourForecast(changeTime(forecast_1h.get_$23().getUpdate_time()), "https://mat1.gtimg.com/pingjs/ext2323/weather/pc/icon/weather/day/" + weather_code23 + ".png", forecast_1h.get_$23().getDegree() + "°");
        hourForecastList.add(hourForecast23);
    }

    //    时间格式化
    private String changeTime(String update_time) throws ParseException {
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMddHHmm");
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String sfstr = "";
        sfstr = sf2.format(sf1.parse(update_time)).substring(11);
        return sfstr;
    }

    private void initView(View view) {
//        用于初始化控件操作
        tipTv = view.findViewById(R.id.frag_tv_tips);
        tempTv = view.findViewById(R.id.frag_tv_currenttemp);
        cityTv = view.findViewById(R.id.frag_tv_city);
        conditionTv = view.findViewById(R.id.frag_tv_condition);
        windTv = view.findViewById(R.id.frag_tv_wind);

        humidityTv = view.findViewById(R.id.frag_tv_humidity);

        tempRangeTv = view.findViewById(R.id.frag_tv_temprange);
        dateTv = view.findViewById(R.id.frag_tv_date);
        clothIndexTv = view.findViewById(R.id.frag_index_tv_dress);
        carIndexTv = view.findViewById(R.id.frag_index_tv_washcar);
        coldIndexTv = view.findViewById(R.id.frag_index_tv_cold);
        sportIndexTv = view.findViewById(R.id.frag_index_tv_sport);
        raysIndexTv = view.findViewById(R.id.frag_index_tv_rays);
        futureLayout = view.findViewById(R.id.frag_center_layout);
        outLayout = view.findViewById(R.id.out_layout);
        umbrellaTv = view.findViewById(R.id.frag_index_tv_umbrella);

        //fishTv,traffic,tourism
        fishTv = view.findViewById(R.id.frag_index_tv_fish);
        traffic = view.findViewById(R.id.frag_index_tv_traffic);
        tourism = view.findViewById(R.id.frag_index_tv_tourism);


        recyclerView = view.findViewById(R.id.recycler_view);
        bing_pic_img = view.findViewById(R.id.bing_pic_img);

//        设置点击事件的监听
        clothIndexTv.setOnClickListener(this);
        carIndexTv.setOnClickListener(this);
        coldIndexTv.setOnClickListener(this);
        sportIndexTv.setOnClickListener(this);
        raysIndexTv.setOnClickListener(this);
        umbrellaTv.setOnClickListener(this);

        //fishTv,traffic,lunar
        fishTv.setOnClickListener(this);
        traffic.setOnClickListener(this);
        tourism.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        switch (v.getId()) {
            case R.id.frag_index_tv_dress:
                builder.setTitle("穿衣指数");
                WeatherBean.DataBean.IndexBean.ClothesBean cloth = index.getClothes();
                String msg = cloth.getInfo() + "\n" + cloth.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.frag_index_tv_washcar:
                builder.setTitle("洗车指数");
                WeatherBean.DataBean.IndexBean.CarwashBean car = index.getCarwash();
                msg = car.getInfo() + "\n" + car.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.frag_index_tv_cold:
                builder.setTitle("感冒指数");
                WeatherBean.DataBean.IndexBean.ColdBean cold = index.getCold();
                msg = cold.getInfo() + "\n" + cold.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.frag_index_tv_sport:
                builder.setTitle("运动指数");
                WeatherBean.DataBean.IndexBean.SportsBean sport = index.getSports();
                msg = sport.getInfo() + "\n" + sport.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.frag_index_tv_rays:
                builder.setTitle("紫外线指数");
                WeatherBean.DataBean.IndexBean.UltravioletBean ultraviolet = index.getUltraviolet();
                msg = ultraviolet.getInfo() + "\n" + ultraviolet.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.frag_index_tv_umbrella:
                builder.setTitle("雨伞指数");
                WeatherBean.DataBean.IndexBean.UmbrellaBean umbrella = index.getUmbrella();
                msg = umbrella.getInfo() + "\n" + umbrella.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;

            case R.id.frag_index_tv_fish:
                builder.setTitle("钓鱼指数");
                WeatherBean.DataBean.IndexBean.FishBean fish = index.getFish();
                msg = fish.getInfo() + "\n" + fish.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.frag_index_tv_traffic:
                builder.setTitle("交通指数");
                WeatherBean.DataBean.IndexBean.TrafficBean traffic = index.getTraffic();
                msg = traffic.getInfo() + "\n" + traffic.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.frag_index_tv_tourism:
                builder.setTitle("旅游指数");
                WeatherBean.DataBean.IndexBean.TourismBean tourism = index.getTourism();
                msg = tourism.getInfo() + "\n" + tourism.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
        }
        builder.create().show();
    }
}
