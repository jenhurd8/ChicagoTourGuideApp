package com.example.android.chicagotourguideapp;


import android.content.Context;
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
public class FoodFragment extends Fragment {
    public static final String ARG_PAGE = Resources.getSystem().getString(R.string.arg_page);

    private int mPage;

    public static FoodFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        FoodFragment fragment = new FoodFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_page, container, false);

        ArrayList<EventObject> events = new ArrayList<EventObject>();
        events.add(new EventObject(getResources().getString(R.string.giordanos_pizza), getString(R.string.giordano_address), R.drawable.pizza));
        events.add(new EventObject(getResources().getString(R.string.portillos), getString(R.string.portillo_address), R.drawable.portillos));
        events.add(new EventObject(getString(R.string.garrett), getString(R.string.garrett_address), R.drawable.garrett));
        events.add(new EventObject(getString(R.string.als), getString(R.string.als_address), R.drawable.alsbeef));
        events.add(new EventObject(getString(R.string.harry_caray), getString(R.string.harry_address), R.drawable.harry_steakhouse));

        EventAdapter adapter = new EventAdapter(getActivity(), events);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
