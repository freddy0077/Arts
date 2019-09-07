package com.evergreen.arts;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.evergreen.arts.adapter.FavoritesAdapter;
import com.evergreen.arts.config.admob;

import comm.evergreen.goldwallpapers.R;

/**
 * Created by evergreen on 17/01/2017.
 */

public class FavoritesFragment extends Fragment {

    public static RecyclerView recyclerView;
    public static FavoritesAdapter favoritesAdapter;
    public static android.support.v7.widget.AppCompatTextView noFavorite;
    public FavoritesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_favorites, container, false);
        LinearLayout linearlayout = (LinearLayout)v.findViewById(R.id.unitads);
        admob.admobBannerCall(getActivity(), linearlayout);
        recyclerView = v.findViewById(R.id.wallpaperList);
        noFavorite = (android.support.v7.widget.AppCompatTextView) v.findViewById(R.id.no_favorite) ;
        getAllFavoritesDataUrl();
        setRecyclerView(getActivity());
        return v;
    }

    public void getAllFavoritesDataUrl(){
        MainActivity.favoriteData.clear();
        SplashActivity splashScreen = new SplashActivity();
        for(int i = 0;i<splashScreen.data.size();i++ ){
            if(MainActivity.listFavorites.contains(splashScreen.data.get(i).wallURL))
                MainActivity.favoriteData.add(splashScreen.data.get(i));
        }
    }
    public static void setRecyclerView(Context context) {
        if(MainActivity.favoriteData.size()>0) noFavorite.setVisibility(View.GONE);
        else noFavorite.setVisibility(View.VISIBLE);
        favoritesAdapter = new FavoritesAdapter(context, MainActivity.favoriteData);
        recyclerView.setAdapter(favoritesAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(context,2));
    }

}
