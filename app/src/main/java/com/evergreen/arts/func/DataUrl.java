package com.evergreen.arts.func;

/**
 * Created by evergreen on 17/01/2017.
 */

public class DataUrl {
    public String wallName;
    public String wallURL;
    public String wallSite;
    public String wallSiteUrl;
    public int wallIndex;
    public boolean premium = false;

    public DataUrl() {
    }

    public String getWallName() {
        return wallName;
    }

    public void setWallName(String wallName) {
        this.wallName = wallName;
    }

    public String getWallURL() {
        return wallURL;
    }

    public void setWallURL(String wallURL) {
        this.wallURL = wallURL;
    }

    public String getWallSite() {
        return wallSite;
    }

    public void setWallSite(String wallSite) {
        this.wallSite = wallSite;
    }

    public String getWallSiteUrl() {
        return wallSiteUrl;
    }

    public void setWallSiteUrl(String wallSiteUrl) {
        this.wallSiteUrl = wallSiteUrl;
    }

    public int getWallIndex() {
        return wallIndex;
    }

    public void setWallIndex(int wallIndex) {
        this.wallIndex = wallIndex;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
