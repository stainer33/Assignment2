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
public class ArmstrongFragment extends Fragment {


    public ArmstrongFragment() {
        // Required empty public constructor
    }

    Button check;
    TextView result;
    EditText input;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong, container, false);

        check = view.findViewById(R.id.btnCheck);
        result = view.findViewById(R.id.result);
        input = view.findViewById(R.id.Input);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n, r,temp,sum=0;

                n= Integer.parseInt( input.getText().toString());
                temp=n;
                while(temp>0 ) {
                    r = temp % 10;
                    sum = sum +( r*r*r);
                    temp=temp/10;
                }

                if(sum==n)
                {result.setText(n+" is armstrong");}
                else
                {result.setText(n+" is not armstrong");}
            }
        });

        return view;
    }

}
