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
public class PalindromeFragment extends Fragment {


    public PalindromeFragment() {
        // Required empty public constructor
    }

Button check;
    EditText input;
    TextView result;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_palindrome, container, false);

        input=view.findViewById(R.id.

                InputPal);
        check=view.findViewById(R.id.btnCheck);
        result=view.findViewById(R.id.result);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n, r,q,temp,sum=0;

                        n= Integer.parseInt( input.getText().toString());
                temp=n;
                        while(temp>0 ) {
                            r = temp % 10;
                            sum = sum * 10 + r;
                            temp=temp/10;
                        }

                       if(sum==n)
                        {result.setText(n+" is palindrome");}
                        else
                        {result.setText(n+" is not palindrome");}
            }
        });
        return  view;
    }

}
