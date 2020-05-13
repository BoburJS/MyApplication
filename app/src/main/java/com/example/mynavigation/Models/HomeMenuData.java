package com.example.mynavigation.Models;

import com.example.mynavigation.R;

public class HomeMenuData {

        private String menuName;
        private int menuImage;


    public static final HomeMenuData[] menular = {
            new HomeMenuData("Намоз", R.drawable.namoz),
            new HomeMenuData("Суралар", R.drawable.sura),
            new HomeMenuData("Зикр ва Дуолар", R.drawable.duo),
            new HomeMenuData("Тасбех", R.drawable.tasbeh),
            new HomeMenuData("Тасбех", R.drawable.tasbeh),
            new HomeMenuData("Тасбех", R.drawable.tasbeh),
            new HomeMenuData("Тасбех", R.drawable.tasbeh),
            new HomeMenuData("Тасбех", R.drawable.tasbeh),
            new HomeMenuData("Шаходат", R.drawable.ic_islam)

    };

    public HomeMenuData(String menuName, int menuImage) {
        this.menuName = menuName;
        this.menuImage = menuImage;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(int menuImage) {
        this.menuImage = menuImage;
    }
}
