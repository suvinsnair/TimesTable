package com.example.suvin.timestable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar TimesTableSeekBar = (SeekBar)findViewById(R.id.TimesTableSeekBar);
        TimesTableSeekBar.setMax(20);
        TimesTableSeekBar.setProgress(1);
        TimesTableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                int min=1;
                if(min<progress){

                    TimesTableSeekBar.setProgress(progress);

                }
                else{

                    TimesTableSeekBar.setProgress(min);
                }
                Log.i("The Progress is" , Integer.toString(progress));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
