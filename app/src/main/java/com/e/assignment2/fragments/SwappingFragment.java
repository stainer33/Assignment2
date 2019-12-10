package com.e.assignment2.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.e.assignment2.R;


public class SwappingFragment extends Fragment {


    public SwappingFragment() {
        // Required empty public constructor
    }

    Button swap;
    EditText num1, num2;
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swapping, container, false);

        swap = view.findViewById(R.id.btnSwap);
        num1 = view.findViewById(R.id.num1);
        num2 = view.findViewById(R.id.num2);
        result = view.findViewById(R.id.result);

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second;
                first= Integer.parseInt(num1.getText().toString());
                second= Integer.parseInt(num2.getText().toString());

                first = first - second;
                second = first + second;
                first = second - first;

                result.setText("Before Swap: 1st number= "+num1.getText().toString()+" 2nd number= "+num2.getText().toString()+"\n");
                result.setText("Before Swap: 1st number= "+first+" 2nd number= "+second);

            }
        });
        return view;
    }


}
