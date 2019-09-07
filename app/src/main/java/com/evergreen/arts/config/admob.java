package com.evergreen.arts.config;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.app.Activity;
import android.widget.LinearLayout;

public class admob {

	public static int mCount = 0;
    public static InterstitialAd mInterstitialAd;

	public static void admobBannerCall(Activity acitivty , final LinearLayout linerlayout){
		
        AdView adView = new AdView(acitivty);
//        adView.setAdUnitId(SettingsClasse.admBanner);
//        adView.setAdSize(AdSize.SMART_BANNER);
//        AdRequest.Builder builder = new AdRequest.Builder();
//        adView.loadAd(builder.build());
//        linerlayout.setVisibility(View.GONE);
//        linerlayout.addView(adView);
//        adView.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                super.onAdLoaded();
//                linerlayout.setVisibility(View.GONE);
//            }
//        });

	}

	public static void initialInterstitial(Activity activity){
//        mInterstitialAd = new InterstitialAd(activity);
//        mInterstitialAd.setAdUnitId(SettingsClasse.Interstitial);
//        mInterstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdClosed() {
//                requestNewInterstitial();
//            }
//        });
//        requestNewInterstitial();
    }

    public static void requestNewInterstitial() {
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mInterstitialAd.loadAd(adRequest);
    }

    public static void showInterstitial(boolean count){
//	    if(count){
//	        mCount++;
//	        if(SettingsClasse.interstitialFrequence == mCount) {
//                if (mInterstitialAd.isLoaded()) {
//                    mInterstitialAd.show();
//                    mCount=0;
//                }else mCount--;
//            }
//        } else if (mInterstitialAd.isLoaded()) mInterstitialAd.show();
    }
}
