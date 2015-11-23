package com.jean;

/**
 * Created by stas on 18.07.15.
 */
public interface Constants {

    float KELVIN_VALUE = 273.15f;
    float MILLIBAR_VALUE = 1.33322368f;
    float CRITICAL_CHANGES = 3.1f;
    float MAX_TEMP_CHANGES = 11.5f;
    double PERCENT_CHANGES = 32.25f;

    String ID = "id";
    String APPID = "APPID";

    String CITY_PATH =  "city";
    String DAILY_PATH =  "daily";

    int MULTIPLIER = 1000;

    enum Location {UP, MIDDLE, DIP}
    enum Hungry {NOTEAT, WEAKLY, MODESTLY, ACTIVE} //new vers.
    String NIBBLE_DATA_TYPE = "nibbleDataType";


    String FISH_TYPE_PREDATOR = "PREDATOR";
    String FISH_TYPE_CALM = "CALM";
    


}
