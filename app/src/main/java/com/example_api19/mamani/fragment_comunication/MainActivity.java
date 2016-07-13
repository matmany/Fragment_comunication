package com.example_api19.mamani.fragment_comunication;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Comunicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
    }

    @Override
    public void respond(String data) {
        android.app.FragmentManager manager = getFragmentManager();
        FragmentB f2 = (FragmentB) manager.findFragmentById(R.id.fragment2);
        f2.change_text(data);
    }
}
