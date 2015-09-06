package com.example.neobyte.infoukm3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by neobyte on 9/6/2015.
 */
public class ObjectsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.friendsview, container, false);


        // Defined Array values to show in ListView
        String[] Objects = new String[] { "Apple",
                "Orange","Grapes","Dog","Cat","Rat","Ants","Books","Lion","Tiger",
                "Monkey","Water","Air","Sun","Rain","Orange","Grapes","Dog","Cat","Rat",
                "Ants","Books","Lion","Tiger","Monkey","Water","Air","Sun","Rain","Orange",
                "Grapes","Dog","Cat","Rat","Ants","Books","Lion","Tiger","Monkey","Water","Air",
                "Sun","Rain"
        };

        ListView simpleList = (ListView)view.findViewById(R.id.id_test_listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, Objects);

        // Assign adapter to ListView
        simpleList.setAdapter(adapter);

        return view;
    }
}
