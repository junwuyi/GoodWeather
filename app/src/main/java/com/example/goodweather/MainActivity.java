package com.example.goodweather;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.example.goodweather.city_manager.CityManagerActivity;
import com.example.goodweather.db.DBManager;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView addCityIv, moreIv, bing_pic_img;
    LinearLayout pointLayout;
    RelativeLayout outLayout;
    ViewPager mainVp;
    //    ViewPager的数据源
    List<Fragment> fragmentList;
    //    表示需要显示的城市的集合
    List<String> cityList;
    //    表示ViewPager的页数指数器显示集合
    List<ImageView> imgList;
    private CityFragmentPagerAdapter adapter;
    private SharedPreferences pref;
    private int bgNum;
    String requestBingPic;

    RecyclerView recyclerView;

    /*
     * */
    static ByteArrayOutputStream byteOut = null;
    private Bitmap bitmap = null;
    private Button btn_cut;
    private ImageView shareIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addCityIv = findViewById(R.id.main_iv_add);
        moreIv = findViewById(R.id.main_iv_more);
        pointLayout = findViewById(R.id.main_layout_point);
        outLayout = findViewById(R.id.main_out_layout);

        bing_pic_img = findViewById(R.id.bing_pic_img);
        recyclerView = findViewById(R.id.recycler_view);


        //fullScreen(this);

        checkNeedPermissions();

        /**
         *
         */
        shareIv = findViewById(R.id.main_share_weather);
        shareIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_SHORT).show();
                //captureScreen();
            }
        });
        btn_cut = findViewById(R.id.btn_cut);
        btn_cut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                captureScreen();
            }
        });

        exchangeBg();
        mainVp = findViewById(R.id.main_vp);
//        添加点击事件
        addCityIv.setOnClickListener(this);
        moreIv.setOnClickListener(this);
        //shareIv.setOnClickListener(this);

        Glide.with(this)
                .load(requestBingPic)
                .crossFade()//或者使用 dontAnimate() 关闭动画
                .placeholder(R.drawable.night)//图片加载出来前，显示的图片
                .error(R.drawable.city)//图片加载失败后，显示的图片
                .into(bing_pic_img);

        fragmentList = new ArrayList<>();
//        cityList = new ArrayList<>();
        cityList = DBManager.queryAllCityName();  //获取数据库包含的城市信息列表
        imgList = new ArrayList<>();

        if (cityList.size() == 0) {
            cityList.add("南昌");
//            cityList.add("上海");
//            cityList.add("广东省 广州");
//            cityList.add("广东省 深圳");
//            cityList.add("福建省 厦门");
        }
        /* 因为可能搜索界面点击跳转此界面，会传值，所以此处获取一下*/
        try {
            Intent intent = getIntent();
            String city = intent.getStringExtra("city");
            if (!cityList.contains(city) && !TextUtils.isEmpty(city)) {
                cityList.add(city);
            }
        } catch (Exception e) {
            Log.i("bingo", "程序出现问题了！！");
        }
//        初始化ViewPager页面的方法
        initPager();
        adapter = new CityFragmentPagerAdapter(getSupportFragmentManager(), fragmentList);
        mainVp.setAdapter(adapter);
//        创建小圆点指示器
        initPoint();
//        设置最后一个城市信息
        mainVp.setCurrentItem(fragmentList.size() - 1);
//        设置ViewPager页面监听
        setPagerListener();

    }

    private void checkNeedPermissions() {
        //6.0以上需要动态申请权限
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED
                || ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED
                || ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            //多个权限一起申请
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.CAMERA,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE
            }, 1);
        }
    }

    /**
     *
     */
    public void captureScreen() {
        Runnable action = new Runnable() {
            @Override
            public void run() {
                /*获取windows中最顶层的view*/
                final View contentView = getWindow().getDecorView();
                try {
                    Log.e("HEHE", contentView.getHeight() + ":" + contentView.getWidth());
                    bitmap = Bitmap.createBitmap(contentView.getWidth(), contentView.getHeight(), Bitmap.Config.ARGB_4444);
                    contentView.draw(new Canvas(bitmap));
                    ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteOut);
                    File foder = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/test/");

                    if (!foder.exists()) {

                        foder.mkdirs();

                    }

                    savePic(bitmap, foder.toString() + "short.png");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (null != byteOut)
                            byteOut.close();
                        if (null != bitmap && !bitmap.isRecycled()) {
//                            bitmap.recycle();
                            bitmap = null;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        };
        try {
            action.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     */
    private void savePic(Bitmap b, String strFileName) {
        Log.i("filepath:", strFileName);
        //Toast.makeText(MainActivity.this, strFileName, Toast.LENGTH_SHORT).show();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(strFileName);
            if (null != fos) {
                boolean success = b.compress(Bitmap.CompressFormat.PNG, 100, fos);
                fos.flush();
                fos.close();
                if (success) {
                    //Toast.makeText(MainActivity.this, "截屏成功", Toast.LENGTH_SHORT).show();
                    shareImage(strFileName);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //path为本地文件绝对路径
    public void shareImage(String path) {

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
            builder.detectFileUriExposure();
        }


        //由文件得到uri
        Uri imageUri = Uri.fromFile(new File(path));
        Log.d("share", "uri:" + imageUri);
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
//        ArrayList<Uri> imageUris = new ArrayList<Uri>();//不需要多文件可以删掉
//        for (File f : files) {
//            imageUris.add(Uri.fromFile(f));
//        }
//        shareIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM,imageUris);//多个文件
        shareIntent.setType("image/*");//选择视频
        //shareIntent.setType(“audio/*”); //选择音频
        //shareIntent.setType(“video/*”); //选择视频
        //shareIntent.setType(“video/;image/”);//同时选择音频和视频
        startActivity(Intent.createChooser(shareIntent, "分享到"));
    }

    /**
     * 通过设置全屏，设置状态栏透明
     *
     * @param activity
     */
    private void fullScreen(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window window = activity.getWindow();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                //5.x开始需要把颜色设置透明，否则导航栏会呈现系统默认的浅灰色
                View decorView = window.getDecorView();
                //两个 flag 要结合使用，表示让应用的主体内容占用系统状态栏的空间
                int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
                decorView.setSystemUiVisibility(option);
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(Color.TRANSPARENT);
                //导航栏颜色也可以正常设置
//                window.setNavigationBarColor(Color.TRANSPARENT);
            } else {
                WindowManager.LayoutParams attributes = window.getAttributes();
                int flagTranslucentStatus = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
                int flagTranslucentNavigation = WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION;
                attributes.flags |= flagTranslucentStatus;
//                attributes.flags |= flagTranslucentNavigation;
                window.setAttributes(attributes);
            }
        }
    }

    //        换壁纸的函数
    public void exchangeBg() {
        pref = getSharedPreferences("bg_pref", MODE_PRIVATE);
        bgNum = pref.getInt("bg", 2);
        switch (bgNum) {
            case 0:
                requestBingPic = "https://api.pingping6.com/tools/scenery/index.php?v=" + Math.random() * 1000;
                break;
            case 1:
                requestBingPic = "https://api.btstu.cn/sjbz/api.php?lx=meizi&format=images&method=mobile&v=" + Math.random() * 1000;
                break;
            case 2:
                requestBingPic = "https://api.btstu.cn/sjbz/api.php?lx=dongman&format=images&method=mobile&v=" + Math.random() * 1000;
                break;
        }

    }

    private void setPagerListener() {
        /* 设置监听事件*/
        mainVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < imgList.size(); i++) {
                    imgList.get(i).setImageResource(R.mipmap.a1);
                }
                imgList.get(position).setImageResource(R.mipmap.a2);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    private void initPoint() {
//        创建小圆点 ViewPager页面指示器的函数
        for (int i = 0; i < fragmentList.size(); i++) {
            ImageView pIv = new ImageView(this);
            pIv.setImageResource(R.mipmap.a1);
            pIv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) pIv.getLayoutParams();
            lp.setMargins(0, 0, 20, 0);
            imgList.add(pIv);
            pointLayout.addView(pIv);
        }
        imgList.get(imgList.size() - 1).setImageResource(R.mipmap.a2);
    }

    private void initPager() {
        /* 创建Fragment对象，添加到ViewPager数据源当中*/
        for (int i = 0; i < cityList.size(); i++) {
            CityWeatherFragment cwFrag = new CityWeatherFragment();
            Bundle bundle = new Bundle();
            bundle.putString("city", cityList.get(i));
            cwFrag.setArguments(bundle);
            fragmentList.add(cwFrag);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.main_iv_add:
                intent.setClass(this, CityManagerActivity.class);
                break;
            case R.id.main_iv_more:
                intent.setClass(this, MoreActivity.class);
                break;
        }
        startActivity(intent);
    }

    /* 当页面重写加载时会调用的函数，这个函数在页面获取焦点之前进行调用，此处完成ViewPager页数的更新*/
    @Override
    protected void onRestart() {
        super.onRestart();
//        获取数据库当中还剩下的城市集合
        List<String> list = DBManager.queryAllCityName();
        if (list.size() == 0) {
            list.add("南昌");
        }
        cityList.clear();    //重写加载之前，清空原本数据源
        cityList.addAll(list);
//        剩余城市也要创建对应的fragment页面
        fragmentList.clear();
        initPager();
        adapter.notifyDataSetChanged();
//        页面数量发生改变，指示器的数量也会发生变化，重写设置添加指示器
        imgList.clear();
        pointLayout.removeAllViews();   //将布局当中所有元素全部移除
        initPoint();
        mainVp.setCurrentItem(fragmentList.size() - 1);
    }
}
