package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import irdc.ex03_09.R;


public class EX03_09 extends Activity {

    @Override

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
    }
    public void onclick(View v){
        Intent intent=new Intent();
        intent.setClass(EX03_09.this, EX03_09_1.class);
        startActivity(intent);
        EX03_09.this.finish();
    }
}

