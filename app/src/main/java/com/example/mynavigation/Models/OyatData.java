package com.example.mynavigation.Models;

import java.io.Serializable;

public class OyatData implements Serializable
{
    public String suraArab;
    public String suraDefault;


    public static final OyatData[] fotiha = {
            new OyatData("بِسْمِ ٱللَّهِ ٱلرَّحْمَٰنِ ٱلرَّحِيمِ",
                    "Бисмилл`аҳир роҳм`анир роҳ`ийм"),
            new OyatData(" ٱلْحَمْدُ لِلَّهِ رَبِّ ٱلْعَٰلَمِينَ",
                    "Ал ҳамдулилл`аҳи роббил ъ`алам`ийн. "),
            new OyatData("ٱلرَّحْمَٰنِ ٱلرَّحِيمِ",
                    "Ар-роҳм`анир роҳ`ийм. "),
            new OyatData("مَٰلِكِ يَوْمِ ٱلدِّينِ",
                    "М`алики явмидд`ийн. "),
            new OyatData("إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ",
                    "Ийй`ака наъбуду ва ийй`ака настаъ`ийн. "),
            new OyatData("ٱهْدِنَا ٱلصِّرَٰطَ ٱلْمُسْتَقِيمَ",
                    "Иҳдинас сир`отол мустақ`ийм."),
            new OyatData(" صِرَٰطَ ٱلَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ ٱلْمَغْضُوبِ عَلَيْهِمْ وَلَا ٱلضَّآلِّينَ",
                    "Сир`отоллаз`ийна анъамта ъалайҳим ғойрил мағз`уби ъалайҳим\n" +
                            "валазз``олл`ийн.")
    };


    public OyatData(String suraArab, String suraDefault) {
        this.suraArab = suraArab;
        this.suraDefault = suraDefault;
    }


    public String getSuraArab() {
        return suraArab;
    }

    public void setSuraArab(String suraArab) {
        this.suraArab = suraArab;
    }

    public String getSuraDefault() {
        return suraDefault;
    }

    public void setSuraDefault(String suraDefault) {
        this.suraDefault = suraDefault;
    }
}
