package com.example.yura.fragmentcontextmenu;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        MyFragment myfragment = new MyFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, myfragment).commit();
    }

}
