package com.example.smarthome.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import com.example.smarthome.R;

public class AdjustTheAirCondition extends AppCompatActivity {
            Toolbar air_tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjust_the_air_condition);
        air_tb=findViewById(R.id.air_tb);
        air_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        inithome();
        initwindspeed();
        initmodle();
    }

    private void initmodle() {
        ArrayAdapter starAdapter_airmodel = ArrayAdapter.createFromResource(getApplicationContext(), R.array.choose_aircondition_modle, android.R.layout.simple_spinner_item);
        Spinner sp_dropdown = findViewById(R.id.air_choose_model);
        starAdapter_airmodel.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_dropdown.setPrompt("请选择房间");
        sp_dropdown.setAdapter(starAdapter_airmodel);
        sp_dropdown.setSelection(0);
        sp_dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parenAt, View view, int arg3, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void initwindspeed() {
        ArrayAdapter starAdapter_airwindspeed = ArrayAdapter.createFromResource(getApplicationContext(), R.array.choose_wind_speed, android.R.layout.simple_spinner_item);
        Spinner sp_dropdown = findViewById(R.id.air_choose_windspeed);
        starAdapter_airwindspeed.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_dropdown.setPrompt("请选择房间");
        sp_dropdown.setAdapter(starAdapter_airwindspeed);
        sp_dropdown.setSelection(0);
        sp_dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parenAt, View view, int arg2, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void inithome() {
        ArrayAdapter starAdapter_airhome = ArrayAdapter.createFromResource(getApplicationContext(), R.array.choose_home, android.R.layout.simple_spinner_item);
        Spinner sp_dropdown = findViewById(R.id.air_choose_home);
        sp_dropdown.setDropDownVerticalOffset(android.R.layout.simple_spinner_dropdown_item);
        sp_dropdown.setPrompt("请选择房间");
        sp_dropdown.setAdapter(starAdapter_airhome);
        sp_dropdown.setSelection(0);
        sp_dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parenAt, View view, int arg1, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}