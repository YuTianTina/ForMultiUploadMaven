package com.tina.formultiuploadmaven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tina.mylibrary.Full;
import com.tina.mylibrary.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Full.show();

    }
}
