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
public class AreaFragment extends Fragment  {


    public AreaFragment() {
        // Required empty public constructor
    }

    Button btnCal;
    EditText radius;
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_area, container, false);

        btnCal=view.findViewById(R.id.btnCal);
        radius=view.findViewById(R.id.radius);
        result=view.findViewById(R.id.result);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int r = Integer.parseInt(radius.getText().toString());
                int res = (22*r*r)/7;
                result.setText(res+"");
            }
        });
        return view;

    }

}
