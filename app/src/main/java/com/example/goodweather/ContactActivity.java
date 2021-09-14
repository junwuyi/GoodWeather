package com.example.goodweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity_contact);

        Toolbar toolbar = findViewById(R.id.title);
        //主标题
        toolbar.setTitle("联系");
    }
}