package com.example.goodweather.city_manager;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.goodweather.MainActivity;
import com.example.goodweather.R;
import com.example.goodweather.base.BaseActivity;
import com.example.goodweather.bean.WeatherBean;
import com.example.goodweather.db.DBManager;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class SearchCityActivity extends BaseActivity implements View.OnClickListener {
    EditText searchEt;
    ImageView submitIv;
    GridView searchGv;
    String[] hotCitys = {"北京", "南昌", "吉安", "深圳", "珠海", "佛山", "南京", "苏州", "厦门",
            "长沙", "成都", "福州", "杭州", "武汉", "青岛", "西安", "太原", "沈阳", "重庆", "天津", "南宁"};
    private ArrayAdapter<String> adapter;
    String url1 = "https://wis.qq.com/weather/common?source=pc&weather_type=observe|index|rise|alarm|air|tips|forecast_24h|forecast_1h&province=";
    String url2 = "&city=";
    String city;
    String provice;

    //    表示需要显示的城市的集合
    List<String> cityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);
        searchEt = findViewById(R.id.search_et);
        submitIv = findViewById(R.id.search_iv_submit);
        searchGv = findViewById(R.id.search_gv);
        submitIv.setOnClickListener(this);
//        设置适配器
        adapter = new ArrayAdapter<>(this, R.layout.item_hotcity, hotCitys);
        searchGv.setAdapter(adapter);

        cityList = DBManager.queryAllCityName();  //获取数据库包含的城市信息列表
        setListener();
    }

    /* 设置监听事件*/
    private void setListener() {
        searchGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                city = hotCitys[position];
                if (!cityList.contains(city) && !TextUtils.isEmpty(city)) {
                    // 获取省份
                    provice = findObjectProvince(city);
                    String url = url1 + provice + url2 + city;
                    loadData(url);
                } else {
                    Toast.makeText(SearchCityActivity.this, "亲,当前城市已添加", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search_iv_submit:
                city = searchEt.getText().toString();
                if (!TextUtils.isEmpty(city)) {
//                      判断是否能够找到这个城市
                    provice = findObjectProvince(city);
                    String url = url1 + provice + url2 + city;
                    loadData(url);
                } else {
                    Toast.makeText(this, "输入内容不能为空！", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    public void onSuccess(String result) {
        WeatherBean weatherBean = new Gson().fromJson(result, WeatherBean.class);
        if (weatherBean.getData().getIndex().getClothes() != null) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            city = provice + " " + city;
            intent.putExtra("city", city);
            startActivity(intent);
        } else {
            Toast.makeText(this, "暂时未收入此城市天气信息...", Toast.LENGTH_SHORT).show();
        }
    }

    public static List<String[]> allCity() {

        List<String[]> allCityList = new ArrayList<>();

        allCityList.add(new String[]{"北京"});
        allCityList.add(new String[]{"上海"});
        allCityList.add(new String[]{"天津"});
        allCityList.add(new String[]{"重庆"});


        allCityList.add(new String[]{"哈尔滨", "齐齐哈尔", "牡丹江", "大庆", "伊春", "双鸭山", "鹤岗", "鸡西", "佳木斯", "七台河", "黑河", "绥化", "大兴安岭"});
        allCityList.add(new String[]{"长春", "延边", "吉林", "白山", "白城", "四平", "松原", "辽源", "大安", "通化"});
        allCityList.add(new String[]{"沈阳", "大连", "葫芦岛", "旅顺", "本溪", "抚顺", "铁岭", "辽阳", "营口", "阜新", "朝阳", "锦州", "丹东", "鞍山"});
        allCityList.add(new String[]{"呼和浩特", "呼伦贝尔", "锡林浩特", "包头", "赤峰", "海拉尔", "乌海", "鄂尔多斯", "通辽"});

        allCityList.add(new String[]{"石家庄", "唐山", "张家口", "廊坊", "邢台", "邯郸", "沧州", "衡水", "承德", "保定", "秦皇岛"});
        allCityList.add(new String[]{"郑州", "开封", "洛阳", "平顶山", "焦作", "鹤壁", "新乡", "安阳", "濮阳", "许昌", "漯河", "三门峡", "南阳", "商丘", "信阳", "周口", "驻马店"});
        allCityList.add(new String[]{"济南", "青岛", "淄博", "威海", "曲阜", "临沂", "烟台", "枣庄", "聊城", "济宁", "菏泽", "泰安", "日照", "东营", "德州", "滨州", "莱芜", "潍坊"});
        allCityList.add(new String[]{"太原", "阳泉", "晋城", "晋中", "临汾", "运城", "长治", "朔州", "忻州", "大同", "吕梁"});

        allCityList.add(new String[]{"南京", "苏州", "昆山", "南通", "太仓", "吴县", "徐州", "宜兴", "镇江", "淮安", "常熟", "盐城", "泰州", "无锡", "连云港", "扬州", "常州", "宿迁"});
        allCityList.add(new String[]{"合肥", "巢湖", "蚌埠", "安庆", "六安", "滁州", "马鞍山", "阜阳", "宣城", "铜陵", "淮北", "芜湖", "毫州", "宿州", "淮南", "池州"});
        allCityList.add(new String[]{"西安", "韩城", "安康", "汉中", "宝鸡", "咸阳", "榆林", "渭南", "商洛", "铜川", "延安"});
        allCityList.add(new String[]{"银川", "固原", "中卫", "石嘴山", "吴忠"});

        allCityList.add(new String[]{"兰州", "白银", "庆阳", "酒泉", "天水", "武威", "张掖", "甘南", "临夏", "平凉", "定西", "金昌"});
        allCityList.add(new String[]{"西宁", "海北", "海西", "黄南", "果洛", "玉树", "海东", "海南"});
        allCityList.add(new String[]{"武汉", "宜昌", "黄冈", "恩施", "荆州", "神农架", "十堰", "咸宁", "襄樊", "孝感", "随州", "黄石", "荆门", "鄂州"});
        allCityList.add(new String[]{"长沙", "邵阳", "常德", "郴州", "吉首", "株洲", "娄底", "湘潭", "益阳", "永州", "岳阳", "衡阳", "怀化", "韶山", "张家界"});

        allCityList.add(new String[]{"杭州", "湖州", "金华", "宁波", "丽水", "绍兴", "雁荡山", "衢州", "嘉兴", "台州", "舟山", "温州"});
        allCityList.add(new String[]{"南昌", "萍乡", "九江", "上饶", "抚州", "吉安", "鹰潭", "宜春", "新余", "景德镇", "赣州"});
        allCityList.add(new String[]{"福州", "厦门", "龙岩", "南平", "宁德", "莆田", "泉州", "三明", "漳州"});
        allCityList.add(new String[]{"贵阳", "安顺", "赤水", "遵义", "铜仁", "六盘水", "毕节", "凯里", "都匀"});

        allCityList.add(new String[]{"成都", "泸州", "内江", "凉山", "阿坝", "巴中", "广元", "乐山", "绵阳", "德阳", "攀枝花", "雅安", "宜宾", "自贡", "甘孜州", "达州", "资阳", "广安", "遂宁", "眉山", "南充"});
        allCityList.add(new String[]{"广州", "深圳", "潮州", "韶关", "湛江", "惠州", "清远", "东莞", "江门", "茂名", "肇庆", "汕尾", "河源", "揭阳", "梅州", "中山", "德庆", "阳江", "云浮", "珠海", "汕头", "佛山"});
        allCityList.add(new String[]{"南宁", "桂林", "阳朔", "柳州", "梧州", "玉林", "桂平", "贺州", "钦州", "贵港", "防城港", "百色", "北海", "河池", "来宾", "崇左"});
        allCityList.add(new String[]{"昆明", "保山", "楚雄", "德宏", "红河", "临沧", "怒江", "曲靖", "思茅", "文山", "玉溪", "昭通", "丽江", "大理"});

        allCityList.add(new String[]{"海口", "三亚", "儋州", "琼山", "通什", "文昌"});
        allCityList.add(new String[]{"乌鲁木齐", "阿勒泰", "阿克苏", "昌吉", "哈密", "和田", "喀什", "克拉玛依", "石河子", "塔城", "库尔勒", "吐鲁番", "伊宁"});

        allCityList.add(new String[]{"拉萨", "昌都地区", "山南地区", "阿里地区", "那曲地区", "林芝地区", "日喀则地区"});
        allCityList.add(new String[]{"香港"});
        allCityList.add(new String[]{"澳门"});
        allCityList.add(new String[]{"台湾"});


        return allCityList;
    }

    public static List<String> provinceList() {
        List<String> list = new ArrayList<>();

        list.add("北京");
        list.add("上海");
        list.add("天津");
        list.add("重庆");

        list.add("黑龙江");
        list.add("吉林");
        list.add("辽宁");
        list.add("内蒙古");

        list.add("河北");
        list.add("河南");
        list.add("山东");
        list.add("山西");

        list.add("江苏");
        list.add("安徽");
        list.add("陕西");
        list.add("宁夏");

        list.add("甘肃");
        list.add("青海");
        list.add("湖北");
        list.add("湖南");

        list.add("浙江");
        list.add("江西");
        list.add("福建");
        list.add("贵州");

        list.add("四川");
        list.add("广东");
        list.add("广西");
        list.add("云南");

        list.add("海南");
        list.add("新疆");
        list.add("西藏");

        list.add("香港");
        list.add("澳门");
        list.add("台湾");
        return list;
    }

    public static List<String> provinceList2() {
        List<String> list = new ArrayList<>();

        list.add("北京市");
        list.add("上海市");
        list.add("天津市");
        list.add("重庆市");

        list.add("黑龙江省");
        list.add("吉林省");
        list.add("辽宁省");
        list.add("内蒙古自治区");

        list.add("河北省");
        list.add("河南省");
        list.add("山东省");
        list.add("山西省");

        list.add("江苏省");
        list.add("安徽省");
        list.add("陕西省");
        list.add("宁夏回族自治区");

        list.add("甘肃省");
        list.add("青海省");
        list.add("湖北省");
        list.add("湖南省");

        list.add("浙江省");
        list.add("江西省");
        list.add("福建省");
        list.add("贵州省");

        list.add("四川省");
        list.add("广东省");
        list.add("广西壮族自治区");
        list.add("云南省");

        list.add("海南省");
        list.add("新疆维吾尔族自治区");
        list.add("西藏自治区");

        list.add("香港");
        list.add("澳门");
        list.add("台湾");
        return list;
    }

    public static String findObjectProvince(String cityName) {
        if (cityName.contains("市")) {
            int index = cityName.indexOf("市");
            cityName = cityName.substring(0, index);

        }
        for (int i = 0; i < allCity().size(); i++) {
            for (int j = 0; j < allCity().get(i).length; j++) {
                if (allCity().get(i)[j].equals(cityName)) {
                    String provinceName = provinceList().get(i);
                    return provinceName;
                }
            }

        }
        return "查询失败";
    }


    private String GetProvice(String city) {
        String[] Citys = {
                "A", "阿坝", "阿拉善", "阿里", "安康", "安庆", "鞍山", "安顺", "安阳", "澳门", "B", "北京", "白银",
                "保定", "宝鸡", "保山", "包头", "巴中", "北海", "蚌埠", "本溪", "毕节", "滨州", "百色", "亳州",
                "C", "重庆", "成都", "长沙", "长春", "沧州", "常德", "昌都", "长治", "常州", "巢湖", "潮州", "承德",
                "郴州", "赤峰", "池州", "崇左", "楚雄", "滁州", "朝阳", "D", "大连", "东莞", "大理", "丹东", "大庆",
                "大同", "大兴安岭", "德宏", "德阳", "德州", "定西", "迪庆", "东营", "E", "鄂尔多斯", "恩施", "鄂州",
                "F", "福州", "防城港", "佛山", "抚顺", "抚州", "阜新", "阜阳", "G", "广州", "桂林", "贵阳", "甘南",
                "赣州", "甘孜", "广安", "广元", "贵港", "果洛", "H", "杭州", "哈尔滨", "合肥", "海口", "呼和浩特",
                "海北", "海东", "海南", "海西", "邯郸", "汉中", "鹤壁", "河池", "鹤岗", "黑河", "衡水", "衡阳",
                "河源", "贺州", "红河", "淮安", "淮北", "怀化", "淮南", "黄冈", "黄南", "黄山", "黄石", "惠州",
                "葫芦岛", "呼伦贝尔", "湖州", "菏泽", "J", "济南", "佳木斯", "吉安", "江门", "焦作", "嘉兴", "嘉峪关",
                "揭阳", "吉林", "金昌", "晋城", "景德镇", "荆门", "荆州", "金华", "济宁", "晋中", "锦州", "九江",
                "酒泉", "K", "昆明", "开封", "L", "兰州", "拉萨", "来宾", "莱芜", "廊坊", "乐山", "凉山", "连云港",
                "聊城", "辽阳", "辽源", "丽江", "临沧", "临汾", "临夏", "临沂", "林芝", "丽水", "六安", "六盘水",
                "柳州", "陇南", "龙岩", "娄底", "漯河", "洛阳", "泸州", "吕梁", "M", "马鞍山", "茂名", "眉山", "梅州",
                "绵阳", "牡丹江", "N", "南京", "南昌", "南宁", "宁波", "南充", "南平", "南通", "南阳", "那曲", "内江",
                "宁德", "怒江", "P", "盘锦", "攀枝花", "平顶山", "平凉", "萍乡", "莆田", "濮阳", "Q", "青岛", "黔东南",
                "黔南", "黔西南", "庆阳", "清远", "秦皇岛", "钦州", "齐齐哈尔", "泉州", "曲靖", "衢州", "R", "日喀则",
                "日照", "S", "上海", "深圳", "苏州", "沈阳", "石家庄", "三门峡", "三明", "三亚", "商洛", "商丘", "上饶",
                "山南", "汕头", "汕尾", "韶关", "绍兴", "邵阳", "十堰", "朔州", "四平", "绥化", "遂宁", "随州", "宿迁",
                "宿州", "T", "天津", "太原", "泰安", "泰州", "台州", "唐山", "天水", "铁岭", "铜川", "通化", "通辽",
                "铜陵", "铜仁", "台湾", "W", "武汉", "乌鲁木齐", "无锡", "威海", "潍坊", "文山", "温州", "乌海", "芜湖",
                "乌兰察布", "武威", "梧州", "X", "厦门", "西安", "西宁", "襄樊", "湘潭", "湘西", "咸宁", "咸阳", "孝感",
                "邢台", "新乡", "信阳", "新余", "忻州", "西双版纳", "宣城", "许昌", "徐州", "香港", "锡林郭勒", "兴安",
                "Y", "银川", "雅安", "延安", "延边", "盐城", "阳江", "阳泉", "扬州", "烟台", "宜宾", "宜昌", "宜春",
                "营口", "益阳", "永州", "岳阳", "榆林", "运城", "云浮", "玉树", "玉溪", "玉林", "Z", "杂多县", "赞皇县",
                "枣强县", "枣阳市", "枣庄", "泽库县", "增城市", "曾都区", "泽普县", "泽州县", "札达县", "扎赉特旗",
                "扎兰屯市", "扎鲁特旗", "扎囊县", "张北县", "张店区", "章贡区", "张家港", "张家界", "张家口", "漳平市",
                "漳浦县", "章丘市", "樟树市", "张湾区", "彰武县", "漳县", "张掖", "漳州", "长子县", "湛河区", "湛江",
                "站前区", "沾益县", "诏安县", "召陵区", "昭平县", "肇庆", "昭通", "赵县", "昭阳区", "招远市", "肇源县",
                "肇州县", "柞水县", "柘城县", "浙江", "镇安县", "振安区", "镇巴县", "正安县", "正定县", "正定新区",
                "正蓝旗", "正宁县", "蒸湘区", "正镶白旗", "正阳县", "郑州", "镇海区", "镇江", "浈江区", "镇康县",
                "镇赉县", "镇平县", "振兴区", "镇雄县", "镇原县", "志丹县", "治多县", "芝罘区", "枝江市",
                "芷江侗族自治县", "织金县", "中方县", "中江县", "钟楼区", "中牟县", "中宁县", "中山", "中山区",
                "钟山区", "钟山县", "中卫", "钟祥市", "中阳县", "中原区", "周村区", "周口", "周宁县", "舟曲县", "舟山",
                "周至县", "庄河市", "诸城市", "珠海", "珠晖区", "诸暨市", "驻马店", "准格尔旗", "涿鹿县", "卓尼",
                "涿州市", "卓资县", "珠山区", "竹山县", "竹溪县", "株洲", "株洲县", "淄博", "子长县", "淄川区", "自贡",
                "秭归县", "紫金县", "自流井区", "资溪县", "资兴市", "资阳"
        };
        for (int i = 0; i < Citys.length; i++) {
            if (Citys[i].contains(city)) {
                if (Citys[i].split(" ").length > 1) {
                    provice = Citys[i].split(" ")[0];
                } else {
                    provice = Citys[i].split(" ")[0];
                }
                break;
            }
        }
        return provice;
    }
}
