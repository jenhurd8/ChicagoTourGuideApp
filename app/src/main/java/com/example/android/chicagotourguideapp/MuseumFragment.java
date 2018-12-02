package com.example.android.chicagotourguideapp;


import android.content.res.Resources;
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
    public static final String ARG_PAGE = Resources.getSystem().getString(R.string.arg_page);

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
        events.add(new EventObject(getString(R.string.field_museum), getString(R.string.field_museum_address), R.drawable.field_museum));
        events.add(new EventObject(getString(R.string.art_institute), getString(R.string.art_institute_address), R.drawable.art_institute));
        events.add(new EventObject(getString(R.string.museum_science), getString(R.string.museum_science_address), R.drawable.museum_science_industry));
        events.add(new EventObject(getString(R.string.shedd_aquarium), getString(R.string.shedd_address), R.drawable.shedd_aquarium));
        events.add(new EventObject(getString(R.string.adler_planetarium), getString(R.string.adler_address), R.drawable.adler_planetarium));

        EventAdapter adapter = new EventAdapter(getActivity(), events);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
