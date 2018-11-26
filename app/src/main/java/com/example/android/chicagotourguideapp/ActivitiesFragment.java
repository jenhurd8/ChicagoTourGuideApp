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
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        mPage = getArguments().getInt(ARG_PAGE);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        TextView textView = new TextView(getActivity());
//        textView.setText(R.string.activities);
//        return textView;

        View rootView = inflater.inflate(R.layout.fragment_page, container, false);

        ArrayList<EventObject> events = new ArrayList<EventObject>();
        events.add(new EventObject("How do I learn design?", "November 19, 2018", "string"));
        events.add(new EventObject("Should you start freelancing?", "November 12, 2018", "string"));
        events.add(new EventObject("Why do I need to test my code?", "November 05, 2018", "string"));
        events.add(new EventObject("What’s it like to code for NASA?", "October 29, 2018", "string"));
        events.add(new EventObject("From librarian to developer", "October 22, 2018", "string"));
        events.add(new EventObject("How do you build a database?", "October 15, 2018", "string"));
        events.add(new EventObject("From musician to developer", "September 24, 2018", "string"));
        events.add(new EventObject("What's an Indie Hacker?", "September 17, 2018", "string"));

        EventAdapter adapter = new EventAdapter(getActivity(), events );

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        //return inflater.inflate(R.layout.fragment_page, container, false);
        return rootView;
    }

}
