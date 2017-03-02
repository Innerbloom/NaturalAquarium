package house.naturalaquarium.fragmentsPlants;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;

public class FragmentPlantsAlgae extends Fragment {

    private static final int LAYOUT = R.layout.plants_algae2;

    private View view;

    public static FragmentPlantsAlgae getInstance(){
        Bundle args = new Bundle();
        FragmentPlantsAlgae fragmentPlantsAlgae = new FragmentPlantsAlgae();
        fragmentPlantsAlgae.setArguments(args);

        return fragmentPlantsAlgae;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
