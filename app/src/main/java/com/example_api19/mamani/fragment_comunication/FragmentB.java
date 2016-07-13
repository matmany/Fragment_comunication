package com.example_api19.mamani.fragment_comunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mamani on 12/07/16.
 */
public class FragmentB extends Fragment {
    TextView textView;
    String data;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_frag_b,container,false);

        if(savedInstanceState == null)
        {

        }
        else
        {
            data = savedInstanceState.getString("msg");
            TextView myText = (TextView) view.findViewById(R.id.textView);
            myText.setText(data);
        }
        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("msg",data);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.textView);
    }

   public void  change_text(String data)
   {
       this.data=data;
       textView.setText(data);

   }


}
