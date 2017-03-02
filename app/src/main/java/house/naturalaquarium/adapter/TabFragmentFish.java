package house.naturalaquarium.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import house.naturalaquarium.fragmentsFish.AquaFish;
import house.naturalaquarium.fragmentsFish.FishDisease;
import house.naturalaquarium.fragmentsFish.ReproductionFish;


public class TabFragmentFish extends FragmentPagerAdapter{

    //Создаем массив табс
    private String[] tabs;

    public TabFragmentFish(FragmentManager fm) {
        super(fm);

        //Создаем Табы !!! с названиями Таб1 итд...
        tabs = new String[]{
                "Аквариумные рыбы",
                "Размножение и разведение",
                "Болезни рыб и их лечение"
        };
    }

    //Получение позиции Табов что б передать их в свитч
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }


    //Переключение между фрагменами с помощью позиции 0,1,2
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return AquaFish.getInstance();
            case 1:
                return ReproductionFish.getInstance();
            case 2:
                return FishDisease.getInstance();
        }

        return null;
    }


    //табс в ширину !!
    @Override
    public int getCount() {
        return tabs.length;
    }
}
