package com.ptp.phamtanphat.fragmentcalculator1409;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by KhoaPhamPC on 30/11/2017.
 */

public class Fragment_Tru extends Fragment {

    View view;
    Button btntru;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tru,container,false);
        btntru = view.findViewById(R.id.buttontru);
        return view;
    }

}
