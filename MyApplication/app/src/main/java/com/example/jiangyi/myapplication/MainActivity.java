package com.example.jiangyi.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jiangyi.myapplication.viewmodel.AcitviyModel;

public class MainActivity extends BaseActivity {

    ViewModel mMainActivityModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainActivityModel = getActivityViewModelProvider(this).get(AcitviyModel.class);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.test);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        FlutterActivity.createDefaultIntent(MainActivity.this)
                );


            }
        });

    }
}
