package com.example.mynavigation;

import java.io.Serializable;

public class SuralarMassivParent implements Serializable
{
    public String suraArab;
    public String suraDefault;


    public static final SuralarMassivParent[] fotiha = {
            new SuralarMassivParent("بِسْمِ ٱللَّهِ ٱلرَّحْمَٰنِ ٱلرَّحِيمِ",
                    "Бисмилл`аҳир роҳм`анир роҳ`ийм"),
            new SuralarMassivParent(" ٱلْحَمْدُ لِلَّهِ رَبِّ ٱلْعَٰلَمِينَ",
                    "Ал ҳамдулилл`аҳи роббил ъ`алам`ийн. "),
            new SuralarMassivParent("ٱلرَّحْمَٰنِ ٱلرَّحِيمِ",
                    "Ар-роҳм`анир роҳ`ийм. "),
            new SuralarMassivParent("مَٰلِكِ يَوْمِ ٱلدِّينِ",
                    "М`алики явмидд`ийн. "),
            new SuralarMassivParent("إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ",
                    "Ийй`ака наъбуду ва ийй`ака настаъ`ийн. "),
            new SuralarMassivParent("ٱهْدِنَا ٱلصِّرَٰطَ ٱلْمُسْتَقِيمَ",
                    "Иҳдинас сир`отол мустақ`ийм."),
            new SuralarMassivParent(" صِرَٰطَ ٱلَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ ٱلْمَغْضُوبِ عَلَيْهِمْ وَلَا ٱلضَّآلِّينَ",
                    "Сир`отоллаз`ийна анъамта ъалайҳим ғойрил мағз`уби ъалайҳим\n" +
                            "валазз``олл`ийн.")
    };


    public SuralarMassivParent(String suraArab, String suraDefault) {
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
