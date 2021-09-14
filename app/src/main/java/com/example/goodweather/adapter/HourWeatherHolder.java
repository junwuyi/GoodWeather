package com.example.goodweather.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.example.goodweather.R;
import com.example.goodweather.bean.HourForecast;

import java.util.List;

/**
 * Created by SilenceDut on 16/10/21.
 */

public class HourWeatherHolder extends RecyclerView.Adapter<HourWeatherHolder.ViewHolder> {

    public Context context;
    private List<HourForecast> mHourForecastList;

    public HourWeatherHolder(Context context,List<HourForecast> hourForecastList) {
        this.context = context;
        mHourForecastList = hourForecastList;
    }

    public HourWeatherHolder(List<HourForecast> hourForecastList) {
        mHourForecastList = hourForecastList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item_hour_forecast, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.hourForecastView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                HourForecast hourForecast = mHourForecastList.get(position);
                Toast.makeText(v.getContext(), "you clicked view " + hourForecast.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.hourIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                HourForecast hourForecast = mHourForecastList.get(position);
                Toast.makeText(v.getContext(), "you clicked image " + hourForecast.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        HourForecast hourForecast = mHourForecastList.get(position);
        holder.hour.setText(hourForecast.getName());

        //https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/weather/day/02.png
        //String imgUrl = "https://mat1.gtimg.com/pingjs/ext2020/weather/pc/icon/currentweather/day/" + weather_code + ".png";
        //        Glide.with(this).load(imgUrl).into(dayIv);

        //holder.hourIcon.setImageResource(hourForecast.getImageId());

        //Glide.with().load(imgUrl).into(holder.hourIcon);


        //Glide.with(context).load(mHourForecastList.get(position).getImageId());


        Glide.with(context)
                .load(mHourForecastList.get(position).getImageId())
                .placeholder(R.drawable.sun00)
                .into(new SimpleTarget() {
                    @Override
                    public void onResourceReady(Object resource, GlideAnimation glideAnimation) {
                        holder.hourIcon.setImageDrawable((Drawable) resource);
                    }
                });




        holder.hourTemp.setText(hourForecast.getTemp());
    }

    @Override
    public int getItemCount() {
        return mHourForecastList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        View hourForecastView;


        TextView hour;
        ImageView hourIcon;
        TextView hourTemp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            hourForecastView = itemView;
            hour = itemView.findViewById(R.id.hour);
            hourIcon = itemView.findViewById(R.id.hour_icon);
            hourTemp = itemView.findViewById(R.id.hour_temp);
        }
    }
}
