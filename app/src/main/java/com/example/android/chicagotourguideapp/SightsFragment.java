package com.example.android.chicagotourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SightsFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static SightsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        SightsFragment fragment = new SightsFragment();
        fragment.setArguments(args);
        return fragment;
    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        mPage = getArguments().getInt(ARG_PAGE);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_page, container, false);

        ArrayList<EventObject> events = new ArrayList<EventObject>();
        events.add(new EventObject("Navy Pier", "600 E Grand Ave\nChicago, IL 60611\n(312) 595-7437", R.drawable.field_museum));
        events.add(new EventObject("The Bean (Cloud Gate)", "201 E Randolph S\nChicago, IL 60602\n(312) 742-1168", R.drawable.art_institute));
        events.add(new EventObject("Buckingham Fountain", "301 S Columbus Dr\nChicago, IL 60605\n(312) 742-7529", R.drawable.museum_science_industry));
        events.add(new EventObject("Skydeck Chicago", "233 S Wacker Dr\nChicago, IL 60606\n(312) 875-9696", R.drawable.shedd_aquarium));
        events.add(new EventObject("Chicago Riverwalk", "Chicago Riverwalk\nChicago, IL 60601\n(877) 300-6746", R.drawable.adler_planetarium));

        EventAdapter adapter = new EventAdapter(getActivity(), events );

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
