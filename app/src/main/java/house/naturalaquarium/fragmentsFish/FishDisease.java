package house.naturalaquarium.fragmentsFish;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;

public class FishDisease extends Fragment {


    private View view;

    private static final int LAYOUT = R.layout.fragment_fishdisease1;


    public static FishDisease getInstance() {
        Bundle args = new Bundle();
        FishDisease fishDisease = new FishDisease();
        fishDisease.setArguments(args);

        return fishDisease;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}
