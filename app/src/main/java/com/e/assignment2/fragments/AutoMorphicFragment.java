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
public class AutoMorphicFragment extends Fragment {


    public AutoMorphicFragment() {
        // Required empty public constructor
    }


    Button check;
    TextView result;
    EditText input;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_auto_morphic, container, false);


        check = view.findViewById(R.id.btnCheck);
        result = view.findViewById(R.id.result);
        input = view.findViewById(R.id.Input);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(input.getText().toString())%10;
                int square = Integer.parseInt(input.getText().toString())*Integer.parseInt(input.getText().toString());
                int num2 =square%10;
               if( num1==num2)
               {
                   result.setText(input.getText().toString() +" is automorphic");
               }
               else
               {
                   result.setText(input.getText().toString() +" is not automorphic");
               }
            }
        });
        return view;
    }

}
