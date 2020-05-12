package com.example.mynavigation;

public class HomeMenuList {

        private String menuName;
        private int menuImage;


    public static final HomeMenuList[] menular = {
            new HomeMenuList("Намоз", R.drawable.namoz),
            new HomeMenuList("Суралар", R.drawable.sura),
            new HomeMenuList("Зикр ва Дуолар", R.drawable.duo),
            new HomeMenuList("Тасбех", R.drawable.tasbeh),
            new HomeMenuList("Тасбех", R.drawable.tasbeh),
            new HomeMenuList("Тасбех", R.drawable.tasbeh),
            new HomeMenuList("Тасбех", R.drawable.tasbeh),
            new HomeMenuList("Тасбех", R.drawable.tasbeh),
            new HomeMenuList("Шаходат", R.drawable.ic_islam)

    };

    public HomeMenuList(String menuName, int menuImage) {
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
