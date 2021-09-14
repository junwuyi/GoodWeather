package com.example.goodweather;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.goodweather.db.DBManager;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;


public class MoreActivity extends AppCompatActivity implements View.OnClickListener {
    TextView bgTv, cacheTv, versionTv, shareTv, yiyanTv, fankTv;
    RadioGroup exbgRg;
    ImageView backIv;
    private SharedPreferences pref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        bgTv = findViewById(R.id.more_tv_exchangebg);
        cacheTv = findViewById(R.id.more_tv_cache);
        versionTv = findViewById(R.id.more_tv_version);
        shareTv = findViewById(R.id.more_tv_share);
        yiyanTv = findViewById(R.id.more_tv_icon_yiyan);
        backIv = findViewById(R.id.more_iv_back);
        exbgRg = findViewById(R.id.more_rg);
        fankTv = findViewById(R.id.more_tv_icon_fank);
        bgTv.setOnClickListener(this);
        cacheTv.setOnClickListener(this);
        shareTv.setOnClickListener(this);
        yiyanTv.setOnClickListener(this);
        backIv.setOnClickListener(this);
        fankTv.setOnClickListener(this);
        pref = getSharedPreferences("bg_pref", MODE_PRIVATE);
        String versionName = getVersionName();
        versionTv.setText("好天气 V" + versionName);
        setRGListener();
    }

    private void setRGListener() {
        /* 设置改变背景图片的单选按钮的监听*/
        exbgRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                获取目前的默认壁纸
                int bg = pref.getInt("bg", 0);
                SharedPreferences.Editor editor = pref.edit();
                Intent intent = new Intent(MoreActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                switch (checkedId) {
                    case R.id.more_rb_green:
                        if (bg == 0) {
                            Toast.makeText(MoreActivity.this, "您选择的为当前背景，无需改变！", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        editor.putInt("bg", 0);
                        editor.commit();
                        break;
                    case R.id.more_rb_pink:
                        if (bg == 1) {
                            Toast.makeText(MoreActivity.this, "您选择的为当前背景，无需改变！", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        editor.putInt("bg", 1);
                        editor.commit();
                        break;
                    case R.id.more_rb_blue:
                        if (bg == 2) {
                            Toast.makeText(MoreActivity.this, "您选择的为当前背景，无需改变！", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        editor.putInt("bg", 2);
                        editor.commit();
                        break;
                }
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.more_iv_back:
                finish();
                break;
            case R.id.more_tv_cache:
                clearCache();
                break;
            case R.id.more_tv_share:
                shareSoftwareMsg("好天气App是一款超萌超可爱的天气预报软件，画面简约，播报天气情况非常精准，快来下载吧！" + "\n" + "https://jq.qq.com/?_wv=1027&k=ihhS89Rb");
                break;
            case R.id.more_tv_icon_yiyan:
                yiYan();
                break;
            case R.id.more_tv_icon_fank:
                Intent intent = new Intent(this, ContactActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.more_tv_exchangebg:
                if (exbgRg.getVisibility() == View.VISIBLE) {
                    exbgRg.setVisibility(View.GONE);
                } else {
                    exbgRg.setVisibility(View.VISIBLE);
                }
                break;
        }
    }

    private void yiYan() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        String msg = dictMin[(int) (Math.random() * dictMin.length)];
        builder.setTitle("随机一言").setMessage(msg).setPositiveButton("确定", null);
        builder.create().show();

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


    private void shareSoftwareMsg(String s) {
        /* 分享软件的函数*/
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(intent, "好天气"));
    }

    private void clearCache() {
        /* 清除缓存的函数*/
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("提示信息").setMessage("确定要删除所有缓存么？");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                DBManager.deleteAllInfo();
                Toast.makeText(MoreActivity.this, "已清除全部缓存！", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MoreActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        }).setNegativeButton("取消", null);
        builder.create().show();
    }

    /**
     * 获取应用的版本名称
     *
     * @return
     */
    public String getVersionName() {
        PackageManager manager = getPackageManager();
        String versionName = null;
        try {
            PackageInfo info = manager.getPackageInfo(getPackageName(), 0);
            versionName = info.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionName;
    }

    static String[] dictMin = {
            "无法舍弃两个方中的任何一方，那不是温柔，那不过是软弱罢了。",
            "这世上所有的不公平都是因为当事人能力的不足。",
            "如果我闭上了双眼，看到的是黑暗的话，那么当我睁开眼睛去看这个世界的时候，是否会是一片光明？",
            "你觉得被圈养的鸟儿为什么无法自由地翱翔天际？是因为鸟笼不是属于它的东西。",
            "人的生存只有俩种：“美丽的活着”，亦或“为美丽的人活着”。",
            "要么变强改变一切，要么一直做被伤害的人。",
            "世上根本没有运气 ，所谓的运气不过就是情况与情况的结合 。",
            "只要我尚存一丝气息，你便是我永生难忘的梦。",
            "真正重要的东西，不管痛苦也好、悲伤也好。都要努力到底，就算失去生命，也要用双手来保护到底。",
            "比起做伤害别人的人，做一个被伤害的人，善良的人这样便很幸福。",
            "是天使借给魔鬼他的面容，还是魔鬼借给天使他的镰刀。",
            "或许前路永夜，即便如此我也要前进，因为星光即使微弱也会为我照亮前路",
            "你的所言所行，全都闪烁着光芒，太过刺目，于是我闭上双眼，但内心还是无法停止对你的憧憬。",
            "你驻足于春色中，于那独一无二的春色之中",
            "在美丽的谎言中，一个走出了深渊，一个走向了天堂。",
            "仿佛要消失般的羸弱，但是，仍旧拼命绽放着光芒。怦怦，怦怦，如同心跳一般，这就是生命之灯。",
            "星星在你的头顶上闪耀着，与你交互诉说的话语，一句一句地，如同星点般翩然落至眼前。",
            "正因为有了音乐，才有了相遇的瞬间，有了相会的感动，有了相逢的人们，有了邂逅的思念。",
            "就算悲伤难抑，遍体鳞伤地处于谷底，也不能停止演奏！——宫园薰《四月是你的谎言》",
            "你既然已经做出了选择，又何必去问为什么选择。",
            "星星为什么看起来如此渺小，是因为它把自己放得太高。",
            "要想成为强者，就不要回避心里的恐惧，恐惧并不是弱点。强者，是要让你的敌人比你更恐惧 。",
            "有些梦想虽然遥不可及，但不是不可能实现。只要我足够的强。",
            "失败的人只有一种。就是在抵达成功之前放弃的人",
            "勇敢，不是靠别人为他担心而证明的，强者，要能够使亲人和朋友感觉到安全和放心。",
            "弱者没有资格要求公平。",
            "浮舟相随：京洛雪浅，阡陌千灯，恍然一梦，长歌命中。",
            "从来没有想过这个背影我会用一辈子去眺望。",
            "天下皆白，唯我独黑；非攻墨门，兼爱平生。",
            "有些时候后悔本身就是一种无法偿还的代价。",
            "得到了不该得到的，就会失去不该失去的。",
            "秦时古梦情犹在，明月皓空情正浓。羽兰相伴情相随，雪高执手情难离。",
            "身锁樊笼凭遗落，飞琼清影曲无弦。弹指尘梦空山语，真意何妨我共兼。",
            "记忆在时间中尘封，往事如流水匆匆逝去，生命花瓣在冬夜飘零，犹如停留在叶面的晨露。",
            "我们仰望著同一片天空却看著不同的地方。——新海诚《秒速5厘米》",
            "一朵花坠落的速度,连时间都放慢了脚步。——《秒速五厘米》",
            "秒速5厘米，那是樱花飘落的速度，那么怎样的速度，才能走完我与你之间的距离？",
            "总在不停寻觅你的踪影，无论十字路口抑或梦境之中，明知你不在，却依然不停地找寻。",
            "只顾仰望着星空的人注定不会留意到自己下一步是否会跨入深渊。",
            "如果愿望能够实现，我愿马上去到你身边，已经没有什么是我做不到的了，我会放下一切抱紧你。",
            "如果，樱花掉落的速度是每秒5厘米，那么两颗心需要多久才能靠近？我要用什么样的速度，才能与你相遇？",
            "我想成为一个温柔的人，因为曾被温柔的人那样对待，深深了解那种被温柔相待的感觉。",
            "记忆是一种相聚的方式，放下是一种自由的形式。不必悲伤，不必忧愁，邂逅的回忆都是美好的故事。",
            "最近的烦恼是小小的离别带来的寂寞，一瞬间的邂逅与分别，这一个一个的刹那，我想好好珍惜起来。",
            "即使这样，我也觉得能遇上你真的太好了。",
            "我想要变强。因为我遇到了许多的邂逅、有了想要守护的事物。",
            "无论如何思念，也有些东西终究无法企及，那么，忘了就好。",
            "若结局非你所愿，就在尘埃落定前奋力一搏。",
            "看得见交错的存在，听得见想要沟通的话语，而在今天也细细地品味，名为“邂逅”的那项奇迹。",
            "一旦被爱过，去爱过，就无法忘记了。",
            "就算有一天，离别的时刻来临，但那也不一定意味着永别。",
            "无意义的理想,迟早会在现实面前崩溃。",
            "趁着黑暗逃跑的话只是匹夫的夜盗而已。高奏凯歌离去的话，那就是征服王的掠夺。",
            "梦存高远 志在争霸 这股热情确实值得赞许 但所谓梦 终有一天是要醒来的。",
            "不过傲慢分为两种。一种是能力过于低下，还有一种是志向异常远大的。前者显得非常愚蠢，后者是难得一见的珍贵种类。",
            "想要救谁，就意味着救不了其他人。听好，人类能救的，只有自己一方的事物。虽然是理所当然，但这就是正义的伙伴的定义。",
            "此世原即如此，面对如斯常事何需悲叹？何须惊讶？",
            "真正的恐惧，不是安静的状态，而是变化的动态，指的就是从希望变成绝望的那一瞬间。",
            "伤害别人的人，就有要被伤害的觉悟。",
            "就算是对我抱有敌意的人，也是被某个人深爱着而降生在这个世界上的。",
            "我愿为你戴上罪之王冠，即使背负上所有的罪恶与孤独，绝不让你受伤。",
            "最深的痛苦，莫过于回忆幸福的时光。",
            "当我无计可施，驻足不前时；当我被黑暗覆盖，被绝望淹没时 谁是我的照明灯？",
            "我们总是在注意错过太多，却不注意自己拥有多少。",
            "时光再美，怎如初见。",
            "花就算凋零了只剩下淡淡的香味，也会向着太阳散发出香气。",
            "岁月的暖，漫过时间的河，抚过久闭的心扉，我在时光斑驳深处，聆听到花开的声音。",
            "夏之忆，泣凋零，彼日花未名。",
            "只能在回忆里看着你，希望记忆中的你不要离我远去。",
            "所谓道别啊，单方面是不作数的。",
            "隐约雷鸣 阴霾天空 但盼风雨来 能留你在此。",
            "隐约雷鸣 阴霾天空 即使天无雨 我亦留此地。",
            "但原来你一直都注视着别的世界。",
            "永往直前的努力是好事，偶尔也得回眸走过的路。",
            "真正强大的人不会在意周围的眼光，靠自己就能毅力不倒。",
            "就算活着感受到痛苦，也要重视起生存下去的重量。",
            "我失去归宿的现实才是我真正的归宿。",
            "如果与你相遇是我的好运，那么其他的事情也一定不坏。",
            "你重要的东西，也是我要去珍惜的。",
            "如果你死了,我会用我的死来复活你。",
            "真正让我难受的，大概是因为让你看到如此狼狈的自己。",
            "对于我来说，只要能守护你，就已足矣。",
            "我早就闭上了双眼，我的目的只在于黑暗之中。",
            "要是喜欢一个人，就要连那个人脏的地方一起喜欢。",
            "一定要保护自己的梦想，即使牺牲一切。 ",
            "正因为我们看不见，那才可怕。",
            "不幸的人总是在创造比自己更不幸的人。",
            "梦总是有会醒来的时候，不会醒的梦总有一天会变成悲伤",
            "对于世界末日的传说，我不会特别在意。只要喜欢的人在身边，就无所谓……",
            "我一直都想证明：努力是能够超越天才的!",
            "想哭的时候能哭出来，也是一种坚强。",
            "不相信自己的人， 连努力的价值都没有。",
            "憧憬是距离理解最遥远的感情。",
            "请不要对我温柔……因为我无以回报……",
            "其实...根本就没有什么天堂和地狱吧....",
            "闭上眼睛想象世界，我能看到什么？",
            "没有任何回忆是可以遗忘的。",
            "有些事情，可以理解但无法接受！",
            "为了所爱的人，就连星星的轨迹我也要改变！》",
            "痛苦可以成为两人间的某种牵绊。",
            "正因为不会发生，所以才叫奇迹。",
            "当你想做一件事，却无能为力的时候，是最痛苦的。",
            "无论谁的心中，都有自己的歌。",
            "无论身边围着多少人，我永远都是那么孤独。",
            "迷茫不仅会害了自己，甚至会害了自己想要守护的人。",
            "此时此刻，我竟不知究竟是悲伤，还是快乐。",
            "不管夜晚多么黑暗，黎明总是会到来。",
            "世界上有些事，还是让它永远成为谜比较好。",
            "什么都无所谓只想在你身边，什么都无所谓只想和你说话，什么都无所谓所以请你不要逃避。",
            "我不会让任何人看到我软弱的一面。 ",
            "人的怨恨是无止尽的。",
            "梦想是否无聊并不是别人来决定的，不管是什么样的梦想，自己拼命努力去追寻才是最重要的！",
            "我总觉得，他在我身边呢。",
            "对别人抱有期待，只能让自己受伤。",
            "堕落是不需要理由的。",
            "在走廊里摔倒会流鼻血，在人生中摔倒会流眼泪。",
            "没有你在的天界，就算我活着也没有任何意义。 ",
            "每个人做任何事,都只是为了自己,虽然有人会说,我希望能为哪个人做些什么,但事实上,也只不过是希望看到别人幸福时,自己也有份幸福感罢了。",
            "优姬，我想告诉你，美的不是这个世界，而是承载这个世界的美丽的你的眼神。",
            "比起牺牲自己的圣人,我更愿意成为不明事理的勇者，而且救你也要救的彻底。",
            "重要的，珍惜的，一直在身边，一旦成为理所当然，就难以发现。",
            "不动声色，无以言表，扮演温柔。"
    };
}
