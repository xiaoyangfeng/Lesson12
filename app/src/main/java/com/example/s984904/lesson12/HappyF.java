package com.example.s984904.lesson12;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 984904 on 12/10/2015.
 */
public class HappyF extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View happyView=inflater.inflate(R.layout.happylayout,container,false);
        return happyView;
    }
}
