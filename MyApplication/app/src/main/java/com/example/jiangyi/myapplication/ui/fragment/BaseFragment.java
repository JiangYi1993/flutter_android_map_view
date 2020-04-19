package com.example.jiangyi.myapplication.ui.fragment;

import android.content.Context;
import android.os.Bundle;

import com.example.jiangyi.myapplication.MainActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class BaseFragment extends Fragment {

    private ViewModelProvider mFragmentProvider;
    private ViewModelProvider mActivityProvider;
    private MainActivity mActivity;

    public ViewModelProvider getFragmentProvider(Fragment fragment) {
        if (mFragmentProvider == null) {
            mFragmentProvider = new ViewModelProvider(fragment);
        }
        return mFragmentProvider;
    }

    public ViewModelProvider getAcitvityProvider() {
        if (mActivityProvider == null) {
            mActivityProvider = new ViewModelProvider(mActivity);
        }
        return mActivityProvider;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mActivity = (MainActivity) context;
    }
}
