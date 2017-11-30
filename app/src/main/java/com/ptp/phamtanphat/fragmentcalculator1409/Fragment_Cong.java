package com.ptp.phamtanphat.fragmentcalculator1409;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by KhoaPhamPC on 30/11/2017.
 */

public class Fragment_Cong extends Fragment {

    View view;
    Button btncong;
    SendData sendData;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_cong,container,false);
        btncong = view.findViewById(R.id.buttoncong);
        sendData = (SendData) getActivity();

        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtmain = getActivity().findViewById(R.id.textviewketqua);
                int value = Integer.parseInt(txtmain.getText().toString());
                value++;
                sendData.ReciveData(value);
            }
        });
        return view;
    }
}
