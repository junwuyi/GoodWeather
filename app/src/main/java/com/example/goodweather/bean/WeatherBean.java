package com.example.goodweather.bean;


import com.google.gson.annotations.SerializedName;

public class WeatherBean {

    /**
     * data : {"air":{"aqi":39,"aqi_level":1,"aqi_name":"优","co":"0.8","no2":"44","o3":"40","pm10":"39","pm2.5":"17","so2":"6","update_time":"20200923000000"},"alarm":{},"forecast_24h":{"0":{"day_weather":"阴","day_weather_code":"02","day_weather_short":"阴","day_wind_direction":"东南风","day_wind_direction_code":"3","day_wind_power":"3","day_wind_power_code":"0","max_degree":"33","min_degree":"26","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-22"},"1":{"day_weather":"阴","day_weather_code":"02","day_weather_short":"阴","day_wind_direction":"东南风","day_wind_direction_code":"3","day_wind_power":"3","day_wind_power_code":"0","max_degree":"33","min_degree":"26","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-22"},"2":{"day_weather":"中雨","day_weather_code":"08","day_weather_short":"中雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"32","min_degree":"25","night_weather":"雷阵雨","night_weather_code":"04","night_weather_short":"雷阵雨","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-23"},"3":{"day_weather":"阵雨","day_weather_code":"03","day_weather_short":"阵雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"30","min_degree":"24","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-24"},"4":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"33","min_degree":"25","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-25"},"5":{"day_weather":"雷阵雨","day_weather_code":"04","day_weather_short":"雷阵雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"32","min_degree":"26","night_weather":"雷阵雨","night_weather_code":"04","night_weather_short":"雷阵雨","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-26"},"6":{"day_weather":"雷阵雨","day_weather_code":"04","day_weather_short":"雷阵雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"31","min_degree":"26","night_weather":"雷阵雨","night_weather_code":"04","night_weather_short":"雷阵雨","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-27"},"7":{"day_weather":"雷阵雨","day_weather_code":"04","day_weather_short":"雷阵雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"32","min_degree":"27","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-28"}},"index":{"airconditioner":{"detail":"您将感到些燥热，建议您在适当的时候开启制冷空调来降低温度，以免中暑。","info":"部分时间开启","name":"空调开启"},"allergy":{"detail":"天气条件较易诱发过敏，有降水，最好穿长衣长裤，预防感冒可能引发的过敏。","info":"较易发","name":"过敏"},"carwash":{"detail":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。","info":"不宜","name":"洗车"},"chill":{"detail":"温度未达到风寒所需的低温，稍作防寒准备即可。","info":"无","name":"风寒"},"clothes":{"detail":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。","info":"炎热","name":"穿衣"},"cold":{"detail":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。","info":"少发","name":"感冒"},"comfort":{"detail":"白天虽然天气以阴为主，但由于天热，加上湿度较大，您会感到很闷热，很不舒适。","info":"很不舒适","name":"舒适度"},"diffusion":{"detail":"气象条件有利于空气污染物稀释、扩散和清除。","info":"良","name":"空气污染扩散条件"},"dry":{"detail":"有降水，路面潮湿，车辆易打滑，请小心驾驶。","info":"潮湿","name":"路况"},"drying":{"detail":"有降水，不适宜晾晒。若需要晾晒，请在室内准备出充足的空间。","info":"不宜","name":"晾晒"},"fish":{"detail":"天气不好，有风，不适合垂钓。","info":"不宜","name":"钓鱼"},"heatstroke":{"detail":"桑拿天突然\u201c驾到\u201d，小心\u201c情绪中暑\u201d~","info":"易发","name":"中暑"},"makeup":{"detail":"天气较热，易出汗，建议使用防脱水化妆品，少用粉底和胭脂，经常补粉。","info":"防脱水","name":"化妆"},"mood":{"detail":"有降水，雨水不仅给大地带来了一丝清凉，也可让较高气温带来的烦躁心绪降降温。","info":"较差","name":"心情"},"morning":{"detail":"有降水，且风力稍大，请尽量避免户外晨练，若坚持晨练请带上雨具。","info":"不宜","name":"晨练"},"sports":{"detail":"有降水，推荐您在室内进行低强度运动；若坚持户外运动，请选择合适的运动，并携带雨具。","info":"较不宜","name":"运动"},"sunglasses":{"detail":"白天有降水天气，视线较差，不需要佩戴太阳镜","info":"不需要","name":"太阳镜"},"sunscreen":{"detail":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","info":"弱","name":"防晒"},"time":"20200922","tourism":{"detail":"较热，微风，有降水，请尽量不要外出，若外出，请注意防雷并携带雨具，注意防暑降温。","info":"一般","name":"旅游"},"traffic":{"detail":"有降水，路面湿滑，刹车距离延长，事故易发期，注意车距，务必小心驾驶。","info":"一般","name":"交通"},"ultraviolet":{"detail":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","info":"最弱","name":"紫外线强度"},"umbrella":{"detail":"有降水，如果您要短时间外出的话可不必带雨伞。","info":"带伞","name":"雨伞"}},"observe":{"degree":"28","humidity":"87","precipitation":"0.0","pressure":"1006","update_time":"202009230045","weather":"晴","weather_code":"00","weather_short":"晴","wind_direction":"5","wind_power":"1"},"rise":{"0":{"sunrise":"06:16","sunset":"18:22","time":"20200923"},"1":{"sunrise":"06:16","sunset":"18:21","time":"20200924"},"10":{"sunrise":"06:19","sunset":"18:12","time":"20201003"},"11":{"sunrise":"06:19","sunset":"18:11","time":"20201004"},"12":{"sunrise":"06:20","sunset":"18:10","time":"20201005"},"13":{"sunrise":"06:20","sunset":"18:09","time":"20201006"},"14":{"sunrise":"06:20","sunset":"18:08","time":"20201007"},"15":{"sunrise":"","sunset":"","time":"20200922"},"2":{"sunrise":"06:16","sunset":"18:20","time":"20200925"},"3":{"sunrise":"06:16","sunset":"18:19","time":"20200926"},"4":{"sunrise":"06:17","sunset":"18:18","time":"20200927"},"5":{"sunrise":"06:17","sunset":"18:17","time":"20200928"},"6":{"sunrise":"06:17","sunset":"18:16","time":"20200929"},"7":{"sunrise":"06:18","sunset":"18:15","time":"20200930"},"8":{"sunrise":"06:18","sunset":"18:14","time":"20201001"},"9":{"sunrise":"06:18","sunset":"18:13","time":"20201002"}},"tips":{"observe":{"0":"你若安好，便是晴天~","1":"现在的温度比较舒适~"}}}
     * message : OK
     * status : 200
     */

    private DataBean data;
    private String message;
    private int status;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * air : {"aqi":39,"aqi_level":1,"aqi_name":"优","co":"0.8","no2":"44","o3":"40","pm10":"39","pm2.5":"17","so2":"6","update_time":"20200923000000"}
         * alarm : {}
         * forecast_24h : {"0":{"day_weather":"阴","day_weather_code":"02","day_weather_short":"阴","day_wind_direction":"东南风","day_wind_direction_code":"3","day_wind_power":"3","day_wind_power_code":"0","max_degree":"33","min_degree":"26","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-22"},"1":{"day_weather":"阴","day_weather_code":"02","day_weather_short":"阴","day_wind_direction":"东南风","day_wind_direction_code":"3","day_wind_power":"3","day_wind_power_code":"0","max_degree":"33","min_degree":"26","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-22"},"2":{"day_weather":"中雨","day_weather_code":"08","day_weather_short":"中雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"32","min_degree":"25","night_weather":"雷阵雨","night_weather_code":"04","night_weather_short":"雷阵雨","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-23"},"3":{"day_weather":"阵雨","day_weather_code":"03","day_weather_short":"阵雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"30","min_degree":"24","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-24"},"4":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"33","min_degree":"25","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-25"},"5":{"day_weather":"雷阵雨","day_weather_code":"04","day_weather_short":"雷阵雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"32","min_degree":"26","night_weather":"雷阵雨","night_weather_code":"04","night_weather_short":"雷阵雨","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-26"},"6":{"day_weather":"雷阵雨","day_weather_code":"04","day_weather_short":"雷阵雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"31","min_degree":"26","night_weather":"雷阵雨","night_weather_code":"04","night_weather_short":"雷阵雨","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-27"},"7":{"day_weather":"雷阵雨","day_weather_code":"04","day_weather_short":"雷阵雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"32","min_degree":"27","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-28"}}
         * index : {"airconditioner":{"detail":"您将感到些燥热，建议您在适当的时候开启制冷空调来降低温度，以免中暑。","info":"部分时间开启","name":"空调开启"},"allergy":{"detail":"天气条件较易诱发过敏，有降水，最好穿长衣长裤，预防感冒可能引发的过敏。","info":"较易发","name":"过敏"},"carwash":{"detail":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。","info":"不宜","name":"洗车"},"chill":{"detail":"温度未达到风寒所需的低温，稍作防寒准备即可。","info":"无","name":"风寒"},"clothes":{"detail":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。","info":"炎热","name":"穿衣"},"cold":{"detail":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。","info":"少发","name":"感冒"},"comfort":{"detail":"白天虽然天气以阴为主，但由于天热，加上湿度较大，您会感到很闷热，很不舒适。","info":"很不舒适","name":"舒适度"},"diffusion":{"detail":"气象条件有利于空气污染物稀释、扩散和清除。","info":"良","name":"空气污染扩散条件"},"dry":{"detail":"有降水，路面潮湿，车辆易打滑，请小心驾驶。","info":"潮湿","name":"路况"},"drying":{"detail":"有降水，不适宜晾晒。若需要晾晒，请在室内准备出充足的空间。","info":"不宜","name":"晾晒"},"fish":{"detail":"天气不好，有风，不适合垂钓。","info":"不宜","name":"钓鱼"},"heatstroke":{"detail":"桑拿天突然\u201c驾到\u201d，小心\u201c情绪中暑\u201d~","info":"易发","name":"中暑"},"makeup":{"detail":"天气较热，易出汗，建议使用防脱水化妆品，少用粉底和胭脂，经常补粉。","info":"防脱水","name":"化妆"},"mood":{"detail":"有降水，雨水不仅给大地带来了一丝清凉，也可让较高气温带来的烦躁心绪降降温。","info":"较差","name":"心情"},"morning":{"detail":"有降水，且风力稍大，请尽量避免户外晨练，若坚持晨练请带上雨具。","info":"不宜","name":"晨练"},"sports":{"detail":"有降水，推荐您在室内进行低强度运动；若坚持户外运动，请选择合适的运动，并携带雨具。","info":"较不宜","name":"运动"},"sunglasses":{"detail":"白天有降水天气，视线较差，不需要佩戴太阳镜","info":"不需要","name":"太阳镜"},"sunscreen":{"detail":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","info":"弱","name":"防晒"},"time":"20200922","tourism":{"detail":"较热，微风，有降水，请尽量不要外出，若外出，请注意防雷并携带雨具，注意防暑降温。","info":"一般","name":"旅游"},"traffic":{"detail":"有降水，路面湿滑，刹车距离延长，事故易发期，注意车距，务必小心驾驶。","info":"一般","name":"交通"},"ultraviolet":{"detail":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","info":"最弱","name":"紫外线强度"},"umbrella":{"detail":"有降水，如果您要短时间外出的话可不必带雨伞。","info":"带伞","name":"雨伞"}}
         * observe : {"degree":"28","humidity":"87","precipitation":"0.0","pressure":"1006","update_time":"202009230045","weather":"晴","weather_code":"00","weather_short":"晴","wind_direction":"5","wind_power":"1"}
         * rise : {"0":{"sunrise":"06:16","sunset":"18:22","time":"20200923"},"1":{"sunrise":"06:16","sunset":"18:21","time":"20200924"},"10":{"sunrise":"06:19","sunset":"18:12","time":"20201003"},"11":{"sunrise":"06:19","sunset":"18:11","time":"20201004"},"12":{"sunrise":"06:20","sunset":"18:10","time":"20201005"},"13":{"sunrise":"06:20","sunset":"18:09","time":"20201006"},"14":{"sunrise":"06:20","sunset":"18:08","time":"20201007"},"15":{"sunrise":"","sunset":"","time":"20200922"},"2":{"sunrise":"06:16","sunset":"18:20","time":"20200925"},"3":{"sunrise":"06:16","sunset":"18:19","time":"20200926"},"4":{"sunrise":"06:17","sunset":"18:18","time":"20200927"},"5":{"sunrise":"06:17","sunset":"18:17","time":"20200928"},"6":{"sunrise":"06:17","sunset":"18:16","time":"20200929"},"7":{"sunrise":"06:18","sunset":"18:15","time":"20200930"},"8":{"sunrise":"06:18","sunset":"18:14","time":"20201001"},"9":{"sunrise":"06:18","sunset":"18:13","time":"20201002"}}
         * tips : {"observe":{"0":"你若安好，便是晴天~","1":"现在的温度比较舒适~"}}
         */

        private AirBean air;
        private AlarmBean alarm;
        private Forecast1h forecast_1h;
        private Forecast24hBean forecast_24h;
        private IndexBean index;
        private ObserveBean observe;
        private RiseBean rise;
        private TipsBean tips;

        public AirBean getAir() {
            return air;
        }

        public void setAir(AirBean air) {
            this.air = air;
        }

        public AlarmBean getAlarm() {
            return alarm;
        }

        public void setAlarm(AlarmBean alarm) {
            this.alarm = alarm;
        }

        public Forecast1h getForecast_1h() {
            return forecast_1h;
        }

        public void setForecast_1h(Forecast1h forecast_1h) {
            this.forecast_1h = forecast_1h;
        }

        public Forecast24hBean getForecast_24h() {
            return forecast_24h;
        }

        public void setForecast_24h(Forecast24hBean forecast_24h) {
            this.forecast_24h = forecast_24h;
        }

        public IndexBean getIndex() {
            return index;
        }

        public void setIndex(IndexBean index) {
            this.index = index;
        }

        public ObserveBean getObserve() {
            return observe;
        }

        public void setObserve(ObserveBean observe) {
            this.observe = observe;
        }

        public RiseBean getRise() {
            return rise;
        }

        public void setRise(RiseBean rise) {
            this.rise = rise;
        }

        public TipsBean getTips() {
            return tips;
        }

        public void setTips(TipsBean tips) {
            this.tips = tips;
        }

        public static class AirBean {
            /**
             * aqi : 39
             * aqi_level : 1
             * aqi_name : 优
             * co : 0.8
             * no2 : 44
             * o3 : 40
             * pm10 : 39
             * pm2.5 : 17
             * so2 : 6       202106011600
             * update_time : 20200923000000
             */

            private int aqi;

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }
        }

        public static class AlarmBean {
        }

        public static class Forecast1h {
            @SerializedName("0")
            private Forecast1h._$0 _$0;
            @SerializedName("1")
            private Forecast1h._$1 _$1;
            @SerializedName("2")
            private Forecast1h._$2 _$2;
            @SerializedName("3")
            private Forecast1h._$3 _$3;
            @SerializedName("4")
            private Forecast1h._$4 _$4;
            @SerializedName("5")
            private Forecast1h._$5 _$5;
            @SerializedName("6")
            private Forecast1h._$6 _$6;
            @SerializedName("7")
            private Forecast1h._$7 _$7;
            @SerializedName("8")
            private Forecast1h._$8 _$8;
            @SerializedName("9")
            private Forecast1h._$9 _$9;
            @SerializedName("10")
            private Forecast1h._$10 _$10;
            @SerializedName("11")
            private Forecast1h._$11 _$11;
            @SerializedName("12")
            private Forecast1h._$12 _$12;
            @SerializedName("13")
            private Forecast1h._$13 _$13;
            @SerializedName("14")
            private Forecast1h._$14 _$14;
            @SerializedName("15")
            private Forecast1h._$15 _$15;
            @SerializedName("16")
            private Forecast1h._$16 _$16;
            @SerializedName("17")
            private Forecast1h._$17 _$17;
            @SerializedName("18")
            private Forecast1h._$18 _$18;
            @SerializedName("19")
            private Forecast1h._$19 _$19;
            @SerializedName("20")
            private Forecast1h._$20 _$20;
            @SerializedName("21")
            private Forecast1h._$21 _$21;
            @SerializedName("22")
            private Forecast1h._$22 _$22;
            @SerializedName("23")
            private Forecast1h._$23 _$23;
            @SerializedName("24")
            private Forecast1h._$24 _$24;
            @SerializedName("25")
            private Forecast1h._$25 _$25;
            @SerializedName("26")
            private Forecast1h._$26 _$26;
            @SerializedName("27")
            private Forecast1h._$27 _$27;
            @SerializedName("28")
            private Forecast1h._$28 _$28;
            @SerializedName("29")
            private Forecast1h._$29 _$29;
            @SerializedName("30")
            private Forecast1h._$30 _$30;
            @SerializedName("31")
            private Forecast1h._$31 _$31;
            @SerializedName("32")
            private Forecast1h._$32 _$32;
            @SerializedName("33")
            private Forecast1h._$33 _$33;
            @SerializedName("34")
            private Forecast1h._$34 _$34;
            @SerializedName("35")
            private Forecast1h._$35 _$35;
            @SerializedName("36")
            private Forecast1h._$36 _$36;
            @SerializedName("37")
            private Forecast1h._$37 _$37;
            @SerializedName("38")
            private Forecast1h._$38 _$38;
            @SerializedName("39")
            private Forecast1h._$39 _$39;
            @SerializedName("40")
            private Forecast1h._$40 _$40;
            @SerializedName("41")
            private Forecast1h._$41 _$41;
            @SerializedName("42")
            private Forecast1h._$42 _$42;
            @SerializedName("43")
            private Forecast1h._$43 _$43;
            @SerializedName("44")
            private Forecast1h._$44 _$44;
            @SerializedName("45")
            private Forecast1h._$45 _$45;
            @SerializedName("46")
            private Forecast1h._$46 _$46;
            @SerializedName("47")
            private Forecast1h._$47 _$47;

            public _$0 get_$0() {
                return _$0;
            }

            public void set_$0(_$0 _$0) {
                this._$0 = _$0;
            }

            public _$1 get_$1() {
                return _$1;
            }

            public void set_$1(_$1 _$1) {
                this._$1 = _$1;
            }

            public _$2 get_$2() {
                return _$2;
            }

            public void set_$2(_$2 _$2) {
                this._$2 = _$2;
            }

            public _$3 get_$3() {
                return _$3;
            }

            public void set_$3(_$3 _$3) {
                this._$3 = _$3;
            }

            public _$4 get_$4() {
                return _$4;
            }

            public void set_$4(_$4 _$4) {
                this._$4 = _$4;
            }

            public _$5 get_$5() {
                return _$5;
            }

            public void set_$5(_$5 _$5) {
                this._$5 = _$5;
            }

            public _$6 get_$6() {
                return _$6;
            }

            public void set_$6(_$6 _$6) {
                this._$6 = _$6;
            }

            public _$7 get_$7() {
                return _$7;
            }

            public void set_$7(_$7 _$7) {
                this._$7 = _$7;
            }

            public _$8 get_$8() {
                return _$8;
            }

            public void set_$8(_$8 _$8) {
                this._$8 = _$8;
            }

            public _$9 get_$9() {
                return _$9;
            }

            public void set_$9(_$9 _$9) {
                this._$9 = _$9;
            }

            public _$10 get_$10() {
                return _$10;
            }

            public void set_$10(_$10 _$10) {
                this._$10 = _$10;
            }

            public _$11 get_$11() {
                return _$11;
            }

            public void set_$11(_$11 _$11) {
                this._$11 = _$11;
            }

            public _$12 get_$12() {
                return _$12;
            }

            public void set_$12(_$12 _$12) {
                this._$12 = _$12;
            }

            public _$13 get_$13() {
                return _$13;
            }

            public void set_$13(_$13 _$13) {
                this._$13 = _$13;
            }

            public _$14 get_$14() {
                return _$14;
            }

            public void set_$14(_$14 _$14) {
                this._$14 = _$14;
            }

            public _$15 get_$15() {
                return _$15;
            }

            public void set_$15(_$15 _$15) {
                this._$15 = _$15;
            }

            public _$16 get_$16() {
                return _$16;
            }

            public void set_$16(_$16 _$16) {
                this._$16 = _$16;
            }

            public _$17 get_$17() {
                return _$17;
            }

            public void set_$17(_$17 _$17) {
                this._$17 = _$17;
            }

            public _$18 get_$18() {
                return _$18;
            }

            public void set_$18(_$18 _$18) {
                this._$18 = _$18;
            }

            public _$19 get_$19() {
                return _$19;
            }

            public void set_$19(_$19 _$19) {
                this._$19 = _$19;
            }

            public _$20 get_$20() {
                return _$20;
            }

            public void set_$20(_$20 _$20) {
                this._$20 = _$20;
            }

            public _$21 get_$21() {
                return _$21;
            }

            public void set_$21(_$21 _$21) {
                this._$21 = _$21;
            }

            public _$22 get_$22() {
                return _$22;
            }

            public void set_$22(_$22 _$22) {
                this._$22 = _$22;
            }

            public _$23 get_$23() {
                return _$23;
            }

            public void set_$23(_$23 _$23) {
                this._$23 = _$23;
            }

            public _$24 get_$24() {
                return _$24;
            }

            public void set_$24(_$24 _$24) {
                this._$24 = _$24;
            }

            public _$25 get_$25() {
                return _$25;
            }

            public void set_$25(_$25 _$25) {
                this._$25 = _$25;
            }

            public _$26 get_$26() {
                return _$26;
            }

            public void set_$26(_$26 _$26) {
                this._$26 = _$26;
            }

            public _$27 get_$27() {
                return _$27;
            }

            public void set_$27(_$27 _$27) {
                this._$27 = _$27;
            }

            public _$28 get_$28() {
                return _$28;
            }

            public void set_$28(_$28 _$28) {
                this._$28 = _$28;
            }

            public _$29 get_$29() {
                return _$29;
            }

            public void set_$29(_$29 _$29) {
                this._$29 = _$29;
            }

            public _$30 get_$30() {
                return _$30;
            }

            public void set_$30(_$30 _$30) {
                this._$30 = _$30;
            }

            public _$31 get_$31() {
                return _$31;
            }

            public void set_$31(_$31 _$31) {
                this._$31 = _$31;
            }

            public _$32 get_$32() {
                return _$32;
            }

            public void set_$32(_$32 _$32) {
                this._$32 = _$32;
            }

            public _$33 get_$33() {
                return _$33;
            }

            public void set_$33(_$33 _$33) {
                this._$33 = _$33;
            }

            public _$34 get_$34() {
                return _$34;
            }

            public void set_$34(_$34 _$34) {
                this._$34 = _$34;
            }

            public _$35 get_$35() {
                return _$35;
            }

            public void set_$35(_$35 _$35) {
                this._$35 = _$35;
            }

            public _$36 get_$36() {
                return _$36;
            }

            public void set_$36(_$36 _$36) {
                this._$36 = _$36;
            }

            public _$37 get_$37() {
                return _$37;
            }

            public void set_$37(_$37 _$37) {
                this._$37 = _$37;
            }

            public _$38 get_$38() {
                return _$38;
            }

            public void set_$38(_$38 _$38) {
                this._$38 = _$38;
            }

            public _$39 get_$39() {
                return _$39;
            }

            public void set_$39(_$39 _$39) {
                this._$39 = _$39;
            }

            public _$40 get_$40() {
                return _$40;
            }

            public void set_$40(_$40 _$40) {
                this._$40 = _$40;
            }

            public _$41 get_$41() {
                return _$41;
            }

            public void set_$41(_$41 _$41) {
                this._$41 = _$41;
            }

            public _$42 get_$42() {
                return _$42;
            }

            public void set_$42(_$42 _$42) {
                this._$42 = _$42;
            }

            public _$43 get_$43() {
                return _$43;
            }

            public void set_$43(_$43 _$43) {
                this._$43 = _$43;
            }

            public _$44 get_$44() {
                return _$44;
            }

            public void set_$44(_$44 _$44) {
                this._$44 = _$44;
            }

            public _$45 get_$45() {
                return _$45;
            }

            public void set_$45(_$45 _$45) {
                this._$45 = _$45;
            }

            public _$46 get_$46() {
                return _$46;
            }

            public void set_$46(_$46 _$46) {
                this._$46 = _$46;
            }

            public _$47 get_$47() {
                return _$47;
            }

            public void set_$47(_$47 _$47) {
                this._$47 = _$47;
            }

            public static class _$0 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$1 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$2 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$3 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$4 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$5 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$6 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$7 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$8 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$9 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$10 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$11 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$12 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$13 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$14 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$15 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$16 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$17 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$18 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$19 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$20 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$21 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$22 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$23 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$24 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$25 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$26 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$27 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$28 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$29 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$30 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$31 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$32 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$33 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$34 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$35 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$36 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$37 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$38 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$39 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$40 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$41 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$42 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$43 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$44 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$45 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$46 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$47 {
                private String degree;
                private String update_time;
                private String weather;
                private String weather_code;
                private String weather_short;
                private String wind_direction;
                private String wind_power;

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }
        }

        public static class Forecast24hBean {
            /**
             * 0 : {"day_weather":"阴","day_weather_code":"02","day_weather_short":"阴","day_wind_direction":"东南风","day_wind_direction_code":"3","day_wind_power":"3","day_wind_power_code":"0","max_degree":"33","min_degree":"26","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-22"}
             * 1 : {"day_weather":"阴","day_weather_code":"02","day_weather_short":"阴","day_wind_direction":"东南风","day_wind_direction_code":"3","day_wind_power":"3","day_wind_power_code":"0","max_degree":"33","min_degree":"26","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-22"}
             * 2 : {"day_weather":"中雨","day_weather_code":"08","day_weather_short":"中雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"32","min_degree":"25","night_weather":"雷阵雨","night_weather_code":"04","night_weather_short":"雷阵雨","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-23"}
             * 3 : {"day_weather":"阵雨","day_weather_code":"03","day_weather_short":"阵雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"30","min_degree":"24","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-24"}
             * 4 : {"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"33","min_degree":"25","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-25"}
             * 5 : {"day_weather":"雷阵雨","day_weather_code":"04","day_weather_short":"雷阵雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"32","min_degree":"26","night_weather":"雷阵雨","night_weather_code":"04","night_weather_short":"雷阵雨","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-26"}
             * 6 : {"day_weather":"雷阵雨","day_weather_code":"04","day_weather_short":"雷阵雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"31","min_degree":"26","night_weather":"雷阵雨","night_weather_code":"04","night_weather_short":"雷阵雨","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-27"}
             * 7 : {"day_weather":"雷阵雨","day_weather_code":"04","day_weather_short":"雷阵雨","day_wind_direction":"微风","day_wind_direction_code":"0","day_wind_power":"3","day_wind_power_code":"0","max_degree":"32","min_degree":"27","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"微风","night_wind_direction_code":"0","night_wind_power":"3","night_wind_power_code":"0","time":"2020-09-28"}
             */

            @SerializedName("0")
            private _$0Bean _$0;
            @SerializedName("1")
            private _$1Bean _$1;
            @SerializedName("2")
            private _$2Bean _$2;
            @SerializedName("3")
            private _$3Bean _$3;
            @SerializedName("4")
            private _$4Bean _$4;
            @SerializedName("5")
            private _$5Bean _$5;
            @SerializedName("6")
            private _$6Bean _$6;
            @SerializedName("7")
            private _$7Bean _$7;

            public _$0Bean get_$0() {
                return _$0;
            }

            public void set_$0(_$0Bean _$0) {
                this._$0 = _$0;
            }

            public _$1Bean get_$1() {
                return _$1;
            }

            public void set_$1(_$1Bean _$1) {
                this._$1 = _$1;
            }

            public _$2Bean get_$2() {
                return _$2;
            }

            public void set_$2(_$2Bean _$2) {
                this._$2 = _$2;
            }

            public _$3Bean get_$3() {
                return _$3;
            }

            public void set_$3(_$3Bean _$3) {
                this._$3 = _$3;
            }

            public _$4Bean get_$4() {
                return _$4;
            }

            public void set_$4(_$4Bean _$4) {
                this._$4 = _$4;
            }

            public _$5Bean get_$5() {
                return _$5;
            }

            public void set_$5(_$5Bean _$5) {
                this._$5 = _$5;
            }

            public _$6Bean get_$6() {
                return _$6;
            }

            public void set_$6(_$6Bean _$6) {
                this._$6 = _$6;
            }

            public _$7Bean get_$7() {
                return _$7;
            }

            public void set_$7(_$7Bean _$7) {
                this._$7 = _$7;
            }

            public static class _$0Bean {
                /**
                 * day_weather : 阴
                 * day_weather_code : 02
                 * day_weather_short : 阴
                 * day_wind_direction : 东南风
                 * day_wind_direction_code : 3
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 33
                 * min_degree : 26
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 微风
                 * night_wind_direction_code : 0
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-09-22
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$1Bean {
                /**
                 * day_weather : 阴
                 * day_weather_code : 02
                 * day_weather_short : 阴
                 * day_wind_direction : 东南风
                 * day_wind_direction_code : 3
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 33
                 * min_degree : 26
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 微风
                 * night_wind_direction_code : 0
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-09-22
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$2Bean {
                /**
                 * day_weather : 中雨
                 * day_weather_code : 08
                 * day_weather_short : 中雨
                 * day_wind_direction : 微风
                 * day_wind_direction_code : 0
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 32
                 * min_degree : 25
                 * night_weather : 雷阵雨
                 * night_weather_code : 04
                 * night_weather_short : 雷阵雨
                 * night_wind_direction : 微风
                 * night_wind_direction_code : 0
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-09-23
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$3Bean {
                /**
                 * day_weather : 阵雨
                 * day_weather_code : 03
                 * day_weather_short : 阵雨
                 * day_wind_direction : 微风
                 * day_wind_direction_code : 0
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 30
                 * min_degree : 24
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 微风
                 * night_wind_direction_code : 0
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-09-24
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$4Bean {
                /**
                 * day_weather : 多云
                 * day_weather_code : 01
                 * day_weather_short : 多云
                 * day_wind_direction : 微风
                 * day_wind_direction_code : 0
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 33
                 * min_degree : 25
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 微风
                 * night_wind_direction_code : 0
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-09-25
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$5Bean {
                /**
                 * day_weather : 雷阵雨
                 * day_weather_code : 04
                 * day_weather_short : 雷阵雨
                 * day_wind_direction : 微风
                 * day_wind_direction_code : 0
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 32
                 * min_degree : 26
                 * night_weather : 雷阵雨
                 * night_weather_code : 04
                 * night_weather_short : 雷阵雨
                 * night_wind_direction : 微风
                 * night_wind_direction_code : 0
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-09-26
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$6Bean {
                /**
                 * day_weather : 雷阵雨
                 * day_weather_code : 04
                 * day_weather_short : 雷阵雨
                 * day_wind_direction : 微风
                 * day_wind_direction_code : 0
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 31
                 * min_degree : 26
                 * night_weather : 雷阵雨
                 * night_weather_code : 04
                 * night_weather_short : 雷阵雨
                 * night_wind_direction : 微风
                 * night_wind_direction_code : 0
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-09-27
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$7Bean {
                /**
                 * day_weather : 雷阵雨
                 * day_weather_code : 04
                 * day_weather_short : 雷阵雨
                 * day_wind_direction : 微风
                 * day_wind_direction_code : 0
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 32
                 * min_degree : 27
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 微风
                 * night_wind_direction_code : 0
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-09-28
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }
        }

        public static class IndexBean {
            /**
             * airconditioner : {"detail":"您将感到些燥热，建议您在适当的时候开启制冷空调来降低温度，以免中暑。","info":"部分时间开启","name":"空调开启"}
             * allergy : {"detail":"天气条件较易诱发过敏，有降水，最好穿长衣长裤，预防感冒可能引发的过敏。","info":"较易发","name":"过敏"}
             * carwash : {"detail":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。","info":"不宜","name":"洗车"}
             * chill : {"detail":"温度未达到风寒所需的低温，稍作防寒准备即可。","info":"无","name":"风寒"}
             * clothes : {"detail":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。","info":"炎热","name":"穿衣"}
             * cold : {"detail":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。","info":"少发","name":"感冒"}
             * comfort : {"detail":"白天虽然天气以阴为主，但由于天热，加上湿度较大，您会感到很闷热，很不舒适。","info":"很不舒适","name":"舒适度"}
             * diffusion : {"detail":"气象条件有利于空气污染物稀释、扩散和清除。","info":"良","name":"空气污染扩散条件"}
             * dry : {"detail":"有降水，路面潮湿，车辆易打滑，请小心驾驶。","info":"潮湿","name":"路况"}
             * drying : {"detail":"有降水，不适宜晾晒。若需要晾晒，请在室内准备出充足的空间。","info":"不宜","name":"晾晒"}
             * fish : {"detail":"天气不好，有风，不适合垂钓。","info":"不宜","name":"钓鱼"}
             * heatstroke : {"detail":"桑拿天突然\u201c驾到\u201d，小心\u201c情绪中暑\u201d~","info":"易发","name":"中暑"}
             * makeup : {"detail":"天气较热，易出汗，建议使用防脱水化妆品，少用粉底和胭脂，经常补粉。","info":"防脱水","name":"化妆"}
             * mood : {"detail":"有降水，雨水不仅给大地带来了一丝清凉，也可让较高气温带来的烦躁心绪降降温。","info":"较差","name":"心情"}
             * morning : {"detail":"有降水，且风力稍大，请尽量避免户外晨练，若坚持晨练请带上雨具。","info":"不宜","name":"晨练"}
             * sports : {"detail":"有降水，推荐您在室内进行低强度运动；若坚持户外运动，请选择合适的运动，并携带雨具。","info":"较不宜","name":"运动"}
             * sunglasses : {"detail":"白天有降水天气，视线较差，不需要佩戴太阳镜","info":"不需要","name":"太阳镜"}
             * sunscreen : {"detail":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","info":"弱","name":"防晒"}
             * time : 20200922
             * tourism : {"detail":"较热，微风，有降水，请尽量不要外出，若外出，请注意防雷并携带雨具，注意防暑降温。","info":"一般","name":"旅游"}
             * traffic : {"detail":"有降水，路面湿滑，刹车距离延长，事故易发期，注意车距，务必小心驾驶。","info":"一般","name":"交通"}
             * ultraviolet : {"detail":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","info":"最弱","name":"紫外线强度"}
             * umbrella : {"detail":"有降水，如果您要短时间外出的话可不必带雨伞。","info":"带伞","name":"雨伞"}
             */

            private AirconditionerBean airconditioner;
            private AllergyBean allergy;
            private CarwashBean carwash;
            private ChillBean chill;
            private ClothesBean clothes;
            private ColdBean cold;
            private ComfortBean comfort;
            private DiffusionBean diffusion;
            private DryBean dry;
            private DryingBean drying;
            private FishBean fish;
            private HeatstrokeBean heatstroke;
            private MakeupBean makeup;
            private MoodBean mood;
            private MorningBean morning;
            private SportsBean sports;
            private SunglassesBean sunglasses;
            private SunscreenBean sunscreen;
            private String time;
            private TourismBean tourism;
            private TrafficBean traffic;
            private UltravioletBean ultraviolet;
            private UmbrellaBean umbrella;

            public AirconditionerBean getAirconditioner() {
                return airconditioner;
            }

            public void setAirconditioner(AirconditionerBean airconditioner) {
                this.airconditioner = airconditioner;
            }

            public AllergyBean getAllergy() {
                return allergy;
            }

            public void setAllergy(AllergyBean allergy) {
                this.allergy = allergy;
            }

            public CarwashBean getCarwash() {
                return carwash;
            }

            public void setCarwash(CarwashBean carwash) {
                this.carwash = carwash;
            }

            public ChillBean getChill() {
                return chill;
            }

            public void setChill(ChillBean chill) {
                this.chill = chill;
            }

            public ClothesBean getClothes() {
                return clothes;
            }

            public void setClothes(ClothesBean clothes) {
                this.clothes = clothes;
            }

            public ColdBean getCold() {
                return cold;
            }

            public void setCold(ColdBean cold) {
                this.cold = cold;
            }

            public ComfortBean getComfort() {
                return comfort;
            }

            public void setComfort(ComfortBean comfort) {
                this.comfort = comfort;
            }

            public DiffusionBean getDiffusion() {
                return diffusion;
            }

            public void setDiffusion(DiffusionBean diffusion) {
                this.diffusion = diffusion;
            }

            public DryBean getDry() {
                return dry;
            }

            public void setDry(DryBean dry) {
                this.dry = dry;
            }

            public DryingBean getDrying() {
                return drying;
            }

            public void setDrying(DryingBean drying) {
                this.drying = drying;
            }

            public FishBean getFish() {
                return fish;
            }

            public void setFish(FishBean fish) {
                this.fish = fish;
            }

            public HeatstrokeBean getHeatstroke() {
                return heatstroke;
            }

            public void setHeatstroke(HeatstrokeBean heatstroke) {
                this.heatstroke = heatstroke;
            }

            public MakeupBean getMakeup() {
                return makeup;
            }

            public void setMakeup(MakeupBean makeup) {
                this.makeup = makeup;
            }

            public MoodBean getMood() {
                return mood;
            }

            public void setMood(MoodBean mood) {
                this.mood = mood;
            }

            public MorningBean getMorning() {
                return morning;
            }

            public void setMorning(MorningBean morning) {
                this.morning = morning;
            }

            public SportsBean getSports() {
                return sports;
            }

            public void setSports(SportsBean sports) {
                this.sports = sports;
            }

            public SunglassesBean getSunglasses() {
                return sunglasses;
            }

            public void setSunglasses(SunglassesBean sunglasses) {
                this.sunglasses = sunglasses;
            }

            public SunscreenBean getSunscreen() {
                return sunscreen;
            }

            public void setSunscreen(SunscreenBean sunscreen) {
                this.sunscreen = sunscreen;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public TourismBean getTourism() {
                return tourism;
            }

            public void setTourism(TourismBean tourism) {
                this.tourism = tourism;
            }

            public TrafficBean getTraffic() {
                return traffic;
            }

            public void setTraffic(TrafficBean traffic) {
                this.traffic = traffic;
            }

            public UltravioletBean getUltraviolet() {
                return ultraviolet;
            }

            public void setUltraviolet(UltravioletBean ultraviolet) {
                this.ultraviolet = ultraviolet;
            }

            public UmbrellaBean getUmbrella() {
                return umbrella;
            }

            public void setUmbrella(UmbrellaBean umbrella) {
                this.umbrella = umbrella;
            }

            public static class AirconditionerBean {
                /**
                 * detail : 您将感到些燥热，建议您在适当的时候开启制冷空调来降低温度，以免中暑。
                 * info : 部分时间开启
                 * name : 空调开启
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class AllergyBean {
                /**
                 * detail : 天气条件较易诱发过敏，有降水，最好穿长衣长裤，预防感冒可能引发的过敏。
                 * info : 较易发
                 * name : 过敏
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class CarwashBean {
                /**
                 * detail : 不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。
                 * info : 不宜
                 * name : 洗车
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ChillBean {
                /**
                 * detail : 温度未达到风寒所需的低温，稍作防寒准备即可。
                 * info : 无
                 * name : 风寒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ClothesBean {
                /**
                 * detail : 天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。
                 * info : 炎热
                 * name : 穿衣
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ColdBean {
                /**
                 * detail : 各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。
                 * info : 少发
                 * name : 感冒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ComfortBean {
                /**
                 * detail : 白天虽然天气以阴为主，但由于天热，加上湿度较大，您会感到很闷热，很不舒适。
                 * info : 很不舒适
                 * name : 舒适度
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DiffusionBean {
                /**
                 * detail : 气象条件有利于空气污染物稀释、扩散和清除。
                 * info : 良
                 * name : 空气污染扩散条件
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DryBean {
                /**
                 * detail : 有降水，路面潮湿，车辆易打滑，请小心驾驶。
                 * info : 潮湿
                 * name : 路况
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DryingBean {
                /**
                 * detail : 有降水，不适宜晾晒。若需要晾晒，请在室内准备出充足的空间。
                 * info : 不宜
                 * name : 晾晒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class FishBean {
                /**
                 * detail : 天气不好，有风，不适合垂钓。
                 * info : 不宜
                 * name : 钓鱼
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class HeatstrokeBean {
                /**
                 * detail : 桑拿天突然“驾到”，小心“情绪中暑”~
                 * info : 易发
                 * name : 中暑
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MakeupBean {
                /**
                 * detail : 天气较热，易出汗，建议使用防脱水化妆品，少用粉底和胭脂，经常补粉。
                 * info : 防脱水
                 * name : 化妆
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MoodBean {
                /**
                 * detail : 有降水，雨水不仅给大地带来了一丝清凉，也可让较高气温带来的烦躁心绪降降温。
                 * info : 较差
                 * name : 心情
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MorningBean {
                /**
                 * detail : 有降水，且风力稍大，请尽量避免户外晨练，若坚持晨练请带上雨具。
                 * info : 不宜
                 * name : 晨练
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SportsBean {
                /**
                 * detail : 有降水，推荐您在室内进行低强度运动；若坚持户外运动，请选择合适的运动，并携带雨具。
                 * info : 较不宜
                 * name : 运动
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SunglassesBean {
                /**
                 * detail : 白天有降水天气，视线较差，不需要佩戴太阳镜
                 * info : 不需要
                 * name : 太阳镜
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SunscreenBean {
                /**
                 * detail : 属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。
                 * info : 弱
                 * name : 防晒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class TourismBean {
                /**
                 * detail : 较热，微风，有降水，请尽量不要外出，若外出，请注意防雷并携带雨具，注意防暑降温。
                 * info : 一般
                 * name : 旅游
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class TrafficBean {
                /**
                 * detail : 有降水，路面湿滑，刹车距离延长，事故易发期，注意车距，务必小心驾驶。
                 * info : 一般
                 * name : 交通
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class UltravioletBean {
                /**
                 * detail : 属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。
                 * info : 最弱
                 * name : 紫外线强度
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class UmbrellaBean {
                /**
                 * detail : 有降水，如果您要短时间外出的话可不必带雨伞。
                 * info : 带伞
                 * name : 雨伞
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class ObserveBean {
            /**
             * degree : 28
             * humidity : 87
             * precipitation : 0.0
             * pressure : 1006
             * update_time : 202009230045
             * weather : 晴
             * weather_code : 00
             * weather_short : 晴
             * wind_direction : 5
             * wind_power : 1
             */

            private String degree;
            private String humidity;
            private String precipitation;
            private String pressure;
            private String update_time;
            private String weather;
            private String weather_code;
            private String weather_short;
            private String wind_direction;
            private String wind_power;

            public String getDegree() {
                return degree;
            }

            public void setDegree(String degree) {
                this.degree = degree;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(String precipitation) {
                this.precipitation = precipitation;
            }

            public String getPressure() {
                return pressure;
            }

            public void setPressure(String pressure) {
                this.pressure = pressure;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getWeather_code() {
                return weather_code;
            }

            public void setWeather_code(String weather_code) {
                this.weather_code = weather_code;
            }

            public String getWeather_short() {
                return weather_short;
            }

            public void setWeather_short(String weather_short) {
                this.weather_short = weather_short;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_power() {
                return wind_power;
            }

            public void setWind_power(String wind_power) {
                this.wind_power = wind_power;
            }
        }

        public static class RiseBean {
            /**
             * 0 : {"sunrise":"06:16","sunset":"18:22","time":"20200923"}
             * 1 : {"sunrise":"06:16","sunset":"18:21","time":"20200924"}
             * 10 : {"sunrise":"06:19","sunset":"18:12","time":"20201003"}
             * 11 : {"sunrise":"06:19","sunset":"18:11","time":"20201004"}
             * 12 : {"sunrise":"06:20","sunset":"18:10","time":"20201005"}
             * 13 : {"sunrise":"06:20","sunset":"18:09","time":"20201006"}
             * 14 : {"sunrise":"06:20","sunset":"18:08","time":"20201007"}
             * 15 : {"sunrise":"","sunset":"","time":"20200922"}
             * 2 : {"sunrise":"06:16","sunset":"18:20","time":"20200925"}
             * 3 : {"sunrise":"06:16","sunset":"18:19","time":"20200926"}
             * 4 : {"sunrise":"06:17","sunset":"18:18","time":"20200927"}
             * 5 : {"sunrise":"06:17","sunset":"18:17","time":"20200928"}
             * 6 : {"sunrise":"06:17","sunset":"18:16","time":"20200929"}
             * 7 : {"sunrise":"06:18","sunset":"18:15","time":"20200930"}
             * 8 : {"sunrise":"06:18","sunset":"18:14","time":"20201001"}
             * 9 : {"sunrise":"06:18","sunset":"18:13","time":"20201002"}
             */

            @SerializedName("0")
            private _$0BeanX _$0;
            @SerializedName("1")
            private _$1BeanX _$1;
            @SerializedName("10")
            private _$10Bean _$10;
            @SerializedName("11")
            private _$11Bean _$11;
            @SerializedName("12")
            private _$12Bean _$12;
            @SerializedName("13")
            private _$13Bean _$13;
            @SerializedName("14")
            private _$14Bean _$14;
            @SerializedName("15")
            private _$15Bean _$15;
            @SerializedName("2")
            private _$2BeanX _$2;
            @SerializedName("3")
            private _$3BeanX _$3;
            @SerializedName("4")
            private _$4BeanX _$4;
            @SerializedName("5")
            private _$5BeanX _$5;
            @SerializedName("6")
            private _$6BeanX _$6;
            @SerializedName("7")
            private _$7BeanX _$7;
            @SerializedName("8")
            private _$8Bean _$8;
            @SerializedName("9")
            private _$9Bean _$9;

            public _$0BeanX get_$0() {
                return _$0;
            }

            public void set_$0(_$0BeanX _$0) {
                this._$0 = _$0;
            }

            public _$1BeanX get_$1() {
                return _$1;
            }

            public void set_$1(_$1BeanX _$1) {
                this._$1 = _$1;
            }

            public _$10Bean get_$10() {
                return _$10;
            }

            public void set_$10(_$10Bean _$10) {
                this._$10 = _$10;
            }

            public _$11Bean get_$11() {
                return _$11;
            }

            public void set_$11(_$11Bean _$11) {
                this._$11 = _$11;
            }

            public _$12Bean get_$12() {
                return _$12;
            }

            public void set_$12(_$12Bean _$12) {
                this._$12 = _$12;
            }

            public _$13Bean get_$13() {
                return _$13;
            }

            public void set_$13(_$13Bean _$13) {
                this._$13 = _$13;
            }

            public _$14Bean get_$14() {
                return _$14;
            }

            public void set_$14(_$14Bean _$14) {
                this._$14 = _$14;
            }

            public _$15Bean get_$15() {
                return _$15;
            }

            public void set_$15(_$15Bean _$15) {
                this._$15 = _$15;
            }

            public _$2BeanX get_$2() {
                return _$2;
            }

            public void set_$2(_$2BeanX _$2) {
                this._$2 = _$2;
            }

            public _$3BeanX get_$3() {
                return _$3;
            }

            public void set_$3(_$3BeanX _$3) {
                this._$3 = _$3;
            }

            public _$4BeanX get_$4() {
                return _$4;
            }

            public void set_$4(_$4BeanX _$4) {
                this._$4 = _$4;
            }

            public _$5BeanX get_$5() {
                return _$5;
            }

            public void set_$5(_$5BeanX _$5) {
                this._$5 = _$5;
            }

            public _$6BeanX get_$6() {
                return _$6;
            }

            public void set_$6(_$6BeanX _$6) {
                this._$6 = _$6;
            }

            public _$7BeanX get_$7() {
                return _$7;
            }

            public void set_$7(_$7BeanX _$7) {
                this._$7 = _$7;
            }

            public _$8Bean get_$8() {
                return _$8;
            }

            public void set_$8(_$8Bean _$8) {
                this._$8 = _$8;
            }

            public _$9Bean get_$9() {
                return _$9;
            }

            public void set_$9(_$9Bean _$9) {
                this._$9 = _$9;
            }

            public static class _$0BeanX {
                /**
                 * sunrise : 06:16
                 * sunset : 18:22
                 * time : 20200923
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$1BeanX {
                /**
                 * sunrise : 06:16
                 * sunset : 18:21
                 * time : 20200924
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$10Bean {
                /**
                 * sunrise : 06:19
                 * sunset : 18:12
                 * time : 20201003
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$11Bean {
                /**
                 * sunrise : 06:19
                 * sunset : 18:11
                 * time : 20201004
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$12Bean {
                /**
                 * sunrise : 06:20
                 * sunset : 18:10
                 * time : 20201005
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$13Bean {
                /**
                 * sunrise : 06:20
                 * sunset : 18:09
                 * time : 20201006
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$14Bean {
                /**
                 * sunrise : 06:20
                 * sunset : 18:08
                 * time : 20201007
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$15Bean {
                /**
                 * sunrise :
                 * sunset :
                 * time : 20200922
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$2BeanX {
                /**
                 * sunrise : 06:16
                 * sunset : 18:20
                 * time : 20200925
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$3BeanX {
                /**
                 * sunrise : 06:16
                 * sunset : 18:19
                 * time : 20200926
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$4BeanX {
                /**
                 * sunrise : 06:17
                 * sunset : 18:18
                 * time : 20200927
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$5BeanX {
                /**
                 * sunrise : 06:17
                 * sunset : 18:17
                 * time : 20200928
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$6BeanX {
                /**
                 * sunrise : 06:17
                 * sunset : 18:16
                 * time : 20200929
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$7BeanX {
                /**
                 * sunrise : 06:18
                 * sunset : 18:15
                 * time : 20200930
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$8Bean {
                /**
                 * sunrise : 06:18
                 * sunset : 18:14
                 * time : 20201001
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$9Bean {
                /**
                 * sunrise : 06:18
                 * sunset : 18:13
                 * time : 20201002
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }
        }

        public static class TipsBean {
            /**
             * observe : {"0":"你若安好，便是晴天~","1":"现在的温度比较舒适~"}
             */

            private ObserveBeanX observe;

            public ObserveBeanX getObserve() {
                return observe;
            }

            public void setObserve(ObserveBeanX observe) {
                this.observe = observe;
            }

            public static class ObserveBeanX {
                /**
                 * 0 : 你若安好，便是晴天~
                 * 1 : 现在的温度比较舒适~
                 */

                @SerializedName("0")
                private String _$0;
                @SerializedName("1")
                private String _$1;

                public String get_$0() {
                    return _$0;
                }

                public void set_$0(String _$0) {
                    this._$0 = _$0;
                }

                public String get_$1() {
                    return _$1;
                }

                public void set_$1(String _$1) {
                    this._$1 = _$1;
                }
            }
        }
    }
}