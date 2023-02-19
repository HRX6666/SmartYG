package com.example.smarthome.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;

import com.example.smarthome.R;

public class SmokeAlarm extends AppCompatActivity {
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoke_alarm);
        vibrator = (Vibrator) SmokeAlarm.this.getSystemService(SmokeAlarm.VIBRATOR_SERVICE);
    }
}