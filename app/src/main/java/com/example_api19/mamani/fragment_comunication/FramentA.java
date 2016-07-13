package com.example_api19.mamani.fragment_comunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by mamani on 12/07/16.
 */

public class FramentA extends Fragment implements View.OnClickListener {
    Comunicator comunicator;
    Button button;
    int counter=0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState == null)
        {
            counter=0;
        }
        else
        {
            counter=savedInstanceState.getInt("counter",0);
            //comunicator.respond("Pressed :"+ counter+"Times");
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_frag_a,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);

    }

    @Override
    public void onClick(View view) {
        counter++;
        comunicator.respond("Pressed :"+ counter+"Times");
    }

    public void setComunicator(Comunicator c)
    {
        comunicator=c;
    }


    public interface Comunicator {

        public void respond(String data);

    }

}
