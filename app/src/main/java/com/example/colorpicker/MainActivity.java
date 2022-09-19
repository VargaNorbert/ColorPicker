package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar s_red,s_green,s_blue;
    private TextView red,green,blue,color;

    private int piros=0,zold=0,kek=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){

        s_red=findViewById(R.id.s_red);
        s_green=findViewById(R.id.s_green);
        s_blue=findViewById(R.id.s_blue);

        red= findViewById(R.id.red);
        green= findViewById(R.id.green);
        blue= findViewById(R.id.blue);

    }
}