package com.example.android.chicagotourguideapp;


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
    public static final String ARG_PAGE = "ARG_PAGE";

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
        events.add(new EventObject("Lincoln Park Zoo", "2001 N Clark St\nChicago, IL 60614\n(312) 742-2000", R.drawable.lincoln_park_zoo));
        events.add(new EventObject("North Avenue Beach", "1600 N Lake Shore Dr\nChicago, IL 60613\n(773) 363-2223", R.drawable.north_avenue_beach));
        events.add(new EventObject("Maggie Daley Park", "337 E Randolph St\nChicago, IL 60601\n(312) 552-3000", R.drawable.maggie_daley_park));
        events.add(new EventObject("Chicago's First Lady Cruises", "112 E Upper Wacker Dr\nChicago, IL 60601\n(847) 358-1330", R.drawable.cruise));
        events.add(new EventObject("Bobby's Bike Hike", "540 N Lake Shore Dr\nChicago, IL 60611\n(312) 245-9300", R.drawable.bobby_s_historic_neighborhoods));

        EventAdapter adapter = new EventAdapter(getActivity(), events);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
