package com.coolweather.android.gson;

public class Now {

    /**
     * cloud : 91
     * cond_code : 104
     * cond_txt : 阴
     * fl : 24
     * hum : 56
     * pcpn : 0.0
     * pres : 1005
     * tmp : 23
     * vis : 8
     * wind_deg : 73
     * wind_dir : 东北风
     * wind_sc : 1
     * wind_spd : 4
     */

    private String cond_txt;
    private String tmp;
    private String wind_dir;
    private String wind_sc;

    public String getCond_txt() {
        return cond_txt;
    }

    public void setCond_txt(String cond_txt) {
        this.cond_txt = cond_txt;
    }

    public String getTmp() {
        return tmp;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public String getWind_sc() {
        return wind_sc;
    }

    public void setWind_sc(String wind_sc) {
        this.wind_sc = wind_sc;
    }
}
