package com.e.assignment2.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.e.assignment2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InterestFragment extends Fragment {


    public InterestFragment() {
        // Required empty public constructor
    }

    EditText prinicple, time, rate;
    Button calculate;
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_interest, container, false);

        prinicple=view.findViewById(R.id.principle);
        time=view.findViewById(R.id.time);
        rate =view.findViewById(R.id.rate);
        calculate=view.findViewById(R.id.btnCal);
        result=view.findViewById(R.id.result);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float p, t, r,i;
                p= Float.parseFloat(prinicple.getText().toString());
                t= Float.parseFloat(time.getText().toString());
                r= Float.parseFloat(rate.getText().toString());

                i=(p*t*r)/100;
                result.setText("The simple ineterest: "+i);
            }
        });
        return view;
    }

}
