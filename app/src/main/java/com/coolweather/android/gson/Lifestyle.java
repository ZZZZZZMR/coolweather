package com.coolweather.android.gson;

public class Lifestyle {
    /**
     * type : ptfc
     * brf : 很差
     * txt : 有降水，能见度很低，交通气象条件很差，车辆行驶缓慢，尽量减少出行。
     */

    private String type;
    private String brf;
    private String txt;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrf() {
        return brf;
    }

    public void setBrf(String brf) {
        this.brf = brf;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
