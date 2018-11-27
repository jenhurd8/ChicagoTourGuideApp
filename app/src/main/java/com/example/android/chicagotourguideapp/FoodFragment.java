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
public class FoodFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static FoodFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        FoodFragment fragment = new FoodFragment();
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
        events.add(new EventObject("Giordano's Pizza", "130 E Randolph St\nChicago, IL 60601\n(312) 616-1200", R.drawable.field_museum));
        events.add(new EventObject("Portillo's Hot Dogs", "100 W Ontario St\nChicago, IL 60654\n(312) 587-8910", R.drawable.art_institute));
        events.add(new EventObject("Garrett Popcorn Shops", "625 Michigan Avenue\nChicago, IL 60611\n(888) 476-7267", R.drawable.museum_science_industry));
        events.add(new EventObject("Al's Beef", "69 W Ontario St\nChicago, IL 60654\n(312) 943-3222", R.drawable.shedd_aquarium));
        events.add(new EventObject("Harry Caray's Italian Steakhouse", "33 W Kinzie St\nChicago, IL 60654\n(312) 828-0966", R.drawable.adler_planetarium));

        EventAdapter adapter = new EventAdapter(getActivity(), events );

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
