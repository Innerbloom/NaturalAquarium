package house.naturalaquarium.fragmentsPlants;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;


public class FragmentPlants extends Fragment {

    private static final int LAYOUT = R.layout.fragments_plants2;

    private View view;

    public static FragmentPlants getInstance(){
        Bundle args = new Bundle();
        FragmentPlants fragmentPlants = new FragmentPlants();
        fragmentPlants.setArguments(args);

        return fragmentPlants;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}

