package com.evergreen.arts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import comm.evergreen.goldwallpapers.R;

import com.evergreen.arts.adapter.WallpaperAdapter;

import java.util.ArrayList;


public class MainFragment extends Fragment {

    public static RecyclerView recyclerView;
    public static WallpaperAdapter recyclerAdapter;
    public static android.support.v7.widget.AppCompatTextView noWallpaper;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = v.findViewById(R.id.wallpaperList);
        noWallpaper =  v.findViewById(R.id.no_wallpaper) ;
        LinearLayout linearlayout = (LinearLayout)v.findViewById(R.id.unitads);
//        admob.admobBannerCall(getActivity(), linearlayout);
        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SplashActivity.data = null;
                SplashActivity.data = new ArrayList<>();
                SplashActivity.premiumData = null;
                SplashActivity.premiumData = new ArrayList<>();
                startActivity(new Intent(getActivity(), SplashActivity.class));
            }
        });
        setRecyclerView(getActivity());
        return v;
    }

    public static void setRecyclerView(Context activity) {
        SplashActivity splashScreen = new SplashActivity();

        if(splashScreen.data.size()>0) noWallpaper.setVisibility(View.GONE);
        else noWallpaper.setVisibility(View.VISIBLE);
        recyclerAdapter = new WallpaperAdapter(activity, splashScreen.data, false);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(activity,2));
    }

}
