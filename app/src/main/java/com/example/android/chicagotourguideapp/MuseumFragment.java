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
public class MuseumFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static MuseumFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        MuseumFragment fragment = new MuseumFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_page, container, false);

        ArrayList<EventObject> events = new ArrayList<EventObject>();
        events.add(new EventObject("Field Museum of Natural History", "1400 S Lake Shore Dr\nChicago, IL 60605\n(312) 922-9410", R.drawable.field_museum));
        events.add(new EventObject("Art Institute of Chicago", "111 S Michigan Ave\nChicago, IL 60603\n(312) 443-3600", R.drawable.art_institute));
        events.add(new EventObject("Museum of Science and Industry", "5700 S Lake Shore Dr\nChicago, IL 60637\n(773) 684-1414", R.drawable.museum_science_industry));
        events.add(new EventObject("Shedd Aquarium", "1200 S Lake Shore Dr\nChicago, IL 60605\n(312) 939-2438", R.drawable.shedd_aquarium));
        events.add(new EventObject("Adler Planetarium", "1300 S Lake Shore Dr\nChicago, IL 60605\n(312) 922-7827", R.drawable.adler_planetarium));

        EventAdapter adapter = new EventAdapter(getActivity(), events);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
