package com.example.smarthome.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import com.example.smarthome.R;

public class AdjustTheLights extends AppCompatActivity {
    Toolbar lights_tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjust_the_lights);
        lights_tb=findViewById(R.id.lights_tb);
        lights_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initmodel();
        inithome();
    }

    private void initmodel() {
        ArrayAdapter starAdapter_model= ArrayAdapter.createFromResource(getApplicationContext(),R.array.choose_lights_model, android.R.layout.simple_spinner_item);
        Spinner sp_dropdown=findViewById(R.id.lights_choose_model);
        starAdapter_model.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_dropdown.setPrompt("请选择模式");
        sp_dropdown.setAdapter(starAdapter_model);
        sp_dropdown.setSelection(0);
        sp_dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position1, long id) {
          }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {

          }
      });
    }

    private void inithome() {
        ArrayAdapter starAdapter_home=ArrayAdapter.createFromResource(getApplicationContext(),R.array.choose_home, android.R.layout.simple_spinner_item);
        Spinner sp_dropdown=findViewById(R.id.lights_choose_home);
        sp_dropdown.setPrompt("请选择房间");
        sp_dropdown.setAdapter(starAdapter_home);
        sp_dropdown.setSelection(0);
        sp_dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position2, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

}