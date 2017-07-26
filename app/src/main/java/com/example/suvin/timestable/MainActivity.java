package com.example.suvin.timestable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView ListTables;



    public void generatestimetable(int timestable){

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.toString(i * timestable));


        }
        ArrayAdapter<String> adpater = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        ListTables.setAdapter(adpater);



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final SeekBar TimesTableSeekBar = (SeekBar) findViewById(R.id.TimesTableSeekBar);
        ListTables = (ListView) findViewById(R.id.ListTables);

        TimesTableSeekBar.setMax(20);
        TimesTableSeekBar.setProgress(1);
        TimesTableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                int min = 1;
                int timestable=1;
                if (min < progress) {

                    TimesTableSeekBar.setProgress(progress);
                    timestable=min;

                } else {

                    TimesTableSeekBar.setProgress(min);
                    timestable=progress;
                }
                generatestimetable(timestable);
                Log.i("The Progress is", Integer.toString(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        generatestimetable(10);


    }
}
