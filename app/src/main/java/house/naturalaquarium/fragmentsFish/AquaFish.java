package house.naturalaquarium.fragmentsFish;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import house.naturalaquarium.R;
import house.naturalaquarium.fragmentsPlants.FragmentPlants;


public class AquaFish extends Fragment {

    private static final int LAYOUT = R.layout.fragment_aquafish1;

    private View view;

    public static AquaFish getInstance() {
        Bundle args = new Bundle();
        AquaFish aquaFish = new AquaFish();
        aquaFish.setArguments(args);

        return aquaFish;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

}
