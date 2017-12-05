package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ZMoffice on 12/5 0005.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int CityCode;
    private int provinceId;

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public int getCityCode() {
        return CityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityCode(int cityCode) {
        CityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
