package house.naturalaquarium.fragmentsPlants;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;

public class FragmentsPlantsDisease extends Fragment {

    private static final int LAYOUT = R.layout.plants_disease2;

    private View view;

    public static FragmentsPlantsDisease getInstance(){
        Bundle args = new Bundle();
        FragmentsPlantsDisease fragmentPlantsDisease = new FragmentsPlantsDisease();
        fragmentPlantsDisease.setArguments(args);

        return fragmentPlantsDisease;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}
