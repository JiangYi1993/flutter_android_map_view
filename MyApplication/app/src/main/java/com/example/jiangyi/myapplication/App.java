package com.example.jiangyi.myapplication;

import android.app.Activity;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

public class App extends Application implements ViewModelStoreOwner {
    ViewModelStore mAppViewModelStore;
    ViewModelProvider.Factory mFactory;

    @NonNull
    @Override
    public ViewModelStore getViewModelStore() {
        return mAppViewModelStore;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mAppViewModelStore = new ViewModelStore();
        //TODO 初始化地图引擎
    }

    public ViewModelProvider getAppViewModelProvider(Activity activity) {

        App app = (App) activity.getApplicationContext();
        return new ViewModelProvider(app.getViewModelStore(), app.getAppFactory(activity));
    }

    public ViewModelProvider.Factory getAppFactory(Activity activity) {
        if (mFactory != null) {
            mFactory =
                    ViewModelProvider.AndroidViewModelFactory.getInstance(activity.getApplication());
        }
        return mFactory;
    }

}
