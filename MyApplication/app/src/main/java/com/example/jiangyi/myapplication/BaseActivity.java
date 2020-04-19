package com.example.jiangyi.myapplication;

import android.os.Bundle;

import com.example.jiangyi.myapplication.viewmodel.ApplicationViewModel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class BaseActivity extends AppCompatActivity {
    ViewModelProvider mActivityProvider;
    ViewModel mApplicationViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApplicationViewModel = getAppViewModelProvider().get(ApplicationViewModel.class);
    }

    protected ViewModelProvider getActivityViewModelProvider(AppCompatActivity activity) {
        if (mActivityProvider == null) {
            mActivityProvider = new ViewModelProvider(activity);
        }
        return mActivityProvider;
    }

    public ViewModelProvider getAppViewModelProvider() {
        App application = (App) getApplicationContext();
        return application.getAppViewModelProvider(this);
    }
}
