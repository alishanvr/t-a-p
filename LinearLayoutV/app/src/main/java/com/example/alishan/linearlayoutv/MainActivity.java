package com.example.alishan.linearlayoutv;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView red_tv;
    TextView blue_tv;
    TextView green_tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red_tv = (TextView) findViewById(R.id.red_text_view);
        green_tv = (TextView) findViewById(R.id.green_text_view);
        blue_tv = (TextView) findViewById(R.id.blue_text_view);
    }

    public void red_tv_clicked(View view) {

        Toast.makeText(this, "You have clicked on RED Color Button.",
                Toast.LENGTH_SHORT).show();

    }

    public void green_tv_clicked(View view) {
        /*
        * In this example, I will get text from View instead of Hard Coding as in "red_tv_clicked"
        *
        * */

        TextView v = (TextView) view;

        Toast.makeText(this, "You have clicked on " + v.getText().toString() + " Button.",
                Toast.LENGTH_SHORT).show();
    }

    public void blue_tv_clicked(View view) {
        Toast.makeText(this, "You have clicked on Blue Color Button.", Toast.LENGTH_SHORT).show();
    }
}
