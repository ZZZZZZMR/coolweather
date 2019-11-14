package com.coolweather.android.gson;

public class Forecast {
    /**
     * cond_code_d : 104
     * cond_code_n : 305
     * cond_txt_d : 阴
     * cond_txt_n : 小雨
     * date : 2019-06-05
     * hum : 57
     * pcpn : 0.0
     * pop : 0
     * pres : 1003
     * sr : 04:46
     * ss : 19:40
     * tmp_max : 28
     * tmp_min : 19
     * uv_index : 2
     * vis : 24
     * wind_deg : 204
     * wind_dir : 西南风
     * wind_sc : 1-2
     * wind_spd : 8
     */

    private String cond_txt_d;
    private String date;
    private String tmp_max;
    private String tmp_min;

    public String getCond_txt_d() {
        return cond_txt_d;
    }

    public void setCond_txt_d(String cond_txt_d) {
        this.cond_txt_d = cond_txt_d;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTmp_max() {
        return tmp_max;
    }

    public void setTmp_max(String tmp_max) {
        this.tmp_max = tmp_max;
    }

    public String getTmp_min() {
        return tmp_min;
    }

    public void setTmp_min(String tmp_min) {
        this.tmp_min = tmp_min;
    }
}
