package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    private SeekBar s_red,s_green,s_blue;
    private TextView red;
    private TextView green;
    private TextView blue;
    private TextView color;

    private int piros=0,zold=0,kek=0;
    String szoveg="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        s_red.setOnSeekBarChangeListener(this);
        s_green.setOnSeekBarChangeListener(this);
        s_blue.setOnSeekBarChangeListener(this);
    }


    private void init(){

        s_red=findViewById(R.id.s_red);
        s_green=findViewById(R.id.s_green);
        s_blue=findViewById(R.id.s_blue);

        red= findViewById(R.id.red);
        green= findViewById(R.id.green);
        blue= findViewById(R.id.blue);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        switch (seekBar.getId()){
            case R.id.s_red:
                piros=i;
                szoveg=String.format("Piros: %d",i);
                red.setText(szoveg);
                break;
            case R.id.s_green:
                zold=i;
                szoveg=String.format("Zöld: %d",i);
                green.setText(szoveg);
                break;
            case R.id.s_blue:
                kek=i;
                szoveg=String.format("Kék: %d",i);
                blue.setText(szoveg);
                break;

        }

        color.setBackgroundColor(Color.rgb(piros,zold,kek));

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}