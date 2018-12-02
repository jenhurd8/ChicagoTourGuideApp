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
public class SightsFragment extends Fragment {
    public static final String ARG_PAGE = Resources.getSystem().getString(R.string.arg_page);

    private int mPage;

    public static SightsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        SightsFragment fragment = new SightsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_page, container, false);

        ArrayList<EventObject> events = new ArrayList<EventObject>();
        events.add(new EventObject(getString(R.string.navy_pier), getString(R.string.navy_pier_address), R.drawable.navy_pier));
        events.add(new EventObject(getString(R.string.bean), getString(R.string.bean_address), R.drawable.the_bean));
        events.add(new EventObject(getString(R.string.buckingham), getString(R.string.buckingham_address), R.drawable.fountain));
        events.add(new EventObject(getString(R.string.skydeck), getString(R.string.skydeck_address), R.drawable.skydeck));
        events.add(new EventObject(getString(R.string.riverwalk), getString(R.string.riverwalk_address), R.drawable.riverwalk));

        EventAdapter adapter = new EventAdapter(getActivity(), events);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
