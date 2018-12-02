package com.example.android.chicagotourguideapp;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ActivitiesFragment extends Fragment {
    public static final String ARG_PAGE = Resources.getSystem().getString(R.string.arg_page);

    private int mPage;

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    public static ActivitiesFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        ActivitiesFragment fragment = new ActivitiesFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_page, container, false);

        ArrayList<EventObject> events = new ArrayList<EventObject>();
        events.add(new EventObject(getString(R.string.lincoln_park_zoo), getString(R.string.lincoln_park_zoo_address), R.drawable.lincoln_park_zoo));
        events.add(new EventObject(getString(R.string.north_ave_beach), getString(R.string.north_ave_beach_address), R.drawable.north_avenue_beach));
        events.add(new EventObject(getString(R.string.maggie_park), getString(R.string.maggie_park_address), R.drawable.maggie_daley_park));
        events.add(new EventObject(getString(R.string.chicago_first_lady_cruise), getString(R.string.chicago_first_lady_address), R.drawable.cruise));
        events.add(new EventObject(getString(R.string.bobbys_bike), getString(R.string.bobbys_bike_address), R.drawable.bobby_s_historic_neighborhoods));

        EventAdapter adapter = new EventAdapter(getActivity(), events);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
