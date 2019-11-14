package com.coolweather.android.gson;

public class Basic {

    /**
     * cid : CN101110102
     * location : 长安
     * parent_city : 西安
     * admin_area : 陕西
     * cnty : 中国
     * lat : 34.15709686
     * lon : 108.94158173
     * tz : +8.00
     */

    private String cid;
    private String location;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
