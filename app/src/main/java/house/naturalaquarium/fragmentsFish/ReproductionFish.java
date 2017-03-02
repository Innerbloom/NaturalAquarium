package house.naturalaquarium.fragmentsFish;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import house.naturalaquarium.R;

public class ReproductionFish extends Fragment {

    private View view;

    private static final int LAYOUT = R.layout.fragment_reproductionfish1;


    public static ReproductionFish getInstance() {
        Bundle args = new Bundle();
        ReproductionFish reproductionFish = new ReproductionFish();
        reproductionFish.setArguments(args);

        return reproductionFish;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}