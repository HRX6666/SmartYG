package com.example.smarthome.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.smarthome.R;

public class AdustTheCurtain extends AppCompatActivity {
    Toolbar curtain_tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adust_the_curtain);
        curtain_tb=findViewById(R.id.curtain_tb);
        initDropdown1();
        initDropdown2();
    }

    private void initDropdown1() {
        ArrayAdapter starAdapter1= ArrayAdapter.createFromResource(getApplicationContext(), R.array.choose_home, android.R.layout.simple_spinner_item);
        Spinner sp_dropdown=findViewById(R.id.curtain_choose_home);
        starAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp_dropdown.setAdapter(starAdapter1);
//        sp_dropdown.setSelection(0);
        sp_dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int arg1, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }




    //对下拉模式列表框初始化
    private void initDropdown2() {
        ArrayAdapter starAdapter2= ArrayAdapter.createFromResource(getApplicationContext(), R.array.choose_curtain_model, android.R.layout.simple_spinner_item);
        Spinner sp_dropdown=findViewById(R.id.curtain_choose_model);
        starAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_dropdown.setAdapter(starAdapter2);
        sp_dropdown.setSelection(0);
        sp_dropdown.setPrompt("请选择模式");
        sp_dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int arg2, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

}