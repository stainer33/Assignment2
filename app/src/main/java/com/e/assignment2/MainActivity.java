package com.e.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e.assignment2.fragments.AreaFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

Button area, automorphing, armstrong, palindrome,SI,swapping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        area = findViewById(R.id.area);
        automorphing=findViewById(R.id.automorphing);
        armstrong=findViewById(R.id.Armstrong);
        palindrome=findViewById(R.id.palindrome);
        SI=findViewById(R.id.SI);
        swapping=findViewById(R.id.swapping);

        area.setOnClickListener(this);
        automorphing.setOnClickListener(this);
        armstrong.setOnClickListener(this);
        palindrome.setOnClickListener(this);
        SI.setOnClickListener(this);
        swapping.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        switch (v.getId())
        {
            case R.id.area:
                AreaFragment areaFragment=new AreaFragment();
                fragmentTransaction.replace(R.id.fragContainer,areaFragment);
                fragmentTransaction.commit();

        }
    }
}
