package com.example.srava.dungeonii;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lagonl on 16/03/2016.
 */
public class message_fragment extends android.support.v4.app.Fragment{
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.message_layout, container, false);
        return rootview;
    }
}
