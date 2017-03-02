package house.naturalaquarium.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;

import house.naturalaquarium.fragmentsPlants.FragmentPlants;
import house.naturalaquarium.fragmentsPlants.FragmentPlantsAlgae;
import house.naturalaquarium.fragmentsPlants.FragmentsPlantsDisease;

public class TabFragmentAdapterPlants extends FragmentStatePagerAdapter {

    //Create massive
    private String[] tabs;
    private FragmentTransaction fTrans;

    public TabFragmentAdapterPlants(FragmentManager fm) {
        super(fm);

        //Create tabs
        tabs = new String[]{
                "Растения",
                "Болезни растений",
                "Водоросли"
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

        switch (position) {
            case 0:
                return FragmentPlants.getInstance();
            case 1:
                return FragmentsPlantsDisease.getInstance();
            case 2:
                return FragmentPlantsAlgae.getInstance();
        }

        return null;
    }

    //табс в ширину !!
    @Override
    public int getCount() {
        return tabs.length;
    }
}
