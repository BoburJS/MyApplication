package com.example.mynavigation;

import java.io.Serializable;

public class SuraNamesMassiv implements Serializable {
    String suraName;
    String suraNumber;
    SuralarMassivParent[] suraOyat;

    public static final SuraNamesMassiv[] suralarnomi = {
            new SuraNamesMassiv("Фотиҳа сураси", "1", SuralarMassivParent.fotiha),
            new SuraNamesMassiv("Фалақ сураси", "2", SuralarMassivParent.fotiha),
            new SuraNamesMassiv("Нас сураси", "3", SuralarMassivParent.fotiha)

    };


    public SuraNamesMassiv(String suraName, String suraNumber, SuralarMassivParent[] suraOyat) {
        this.suraNumber = suraNumber;
        this.suraName = suraName;
        this.suraOyat = suraOyat;
    }

    public SuralarMassivParent[] getSuraOyat() {
        return suraOyat;
    }

    public void setSuraOyat(SuralarMassivParent[] suraOyat) {
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
