package com.example.mynavigation.Models;

import java.io.Serializable;

public class SuraData implements Serializable {
    public String suraName;
    public String suraNumber;
    public OyatData[] suraOyat;

    public static final SuraData[] suralarnomi = {
            new SuraData("Фотиҳа сураси", "1", OyatData.fotiha),
            new SuraData("Фалақ сураси", "2", OyatData.fotiha),
            new SuraData("Нас сураси", "3", OyatData.fotiha)

    };


    public SuraData(String suraName, String suraNumber, OyatData[] suraOyat) {
        this.suraNumber = suraNumber;
        this.suraName = suraName;
        this.suraOyat = suraOyat;
    }

    public OyatData[] getSuraOyat() {
        return suraOyat;
    }

    public void setSuraOyat(OyatData[] suraOyat) {
        this.suraOyat = suraOyat;
    }

    public String getSuraName() {
        return suraName;
    }

    public void setSuraName(String suraName) {
        this.suraName = suraName;
    }

    public String getSuraNumber() {
        return suraNumber;
    }

    public void setSuraNumber(String suraNumber) {
        this.suraNumber = suraNumber;
    }
}
