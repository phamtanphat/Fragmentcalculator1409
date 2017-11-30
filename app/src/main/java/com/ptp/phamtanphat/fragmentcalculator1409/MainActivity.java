package com.ptp.phamtanphat.fragmentcalculator1409;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SendData{

    TextView txtmain;
    int ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtmain = findViewById(R.id.textviewketqua);
    }

    @Override
    public void ReciveData(int value) {
        txtmain.setText(String.valueOf(value));
        ketqua = value;
        Fragment_Tru fragment_tru = (Fragment_Tru) getFragmentManager().findFragmentById(R.id.fragmenttru);
        fragment_tru.btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketqua--;
                txtmain.setText(ketqua +"");
            }
        });
    }
}
