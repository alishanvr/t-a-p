package com.example.alishan.linearlayout_h;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void not_implemented(View view) {
        Toast.makeText(this, "Sorry! Currently not implemented!", Toast.LENGTH_SHORT).show();
    }
}
