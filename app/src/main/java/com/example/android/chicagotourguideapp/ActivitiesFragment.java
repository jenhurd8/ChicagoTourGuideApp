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
        events.add(new EventObject("Field Museum of Natural History", "1400 S Lake Shore Dr\nChicago, IL 60605\n(312) 922-9410", R.drawable.the_bean));
        events.add(new EventObject("Art Institute of Chicago", "111 S Michigan Ave\nChicago, IL 60603\n(312) 443-3600", R.drawable.the_bean));
        events.add(new EventObject("Museum of Science and Industry", "5700 S Lake Shore Dr\nChicago, IL 60637\n(773) 684-1414", R.drawable.the_bean));
        events.add(new EventObject("Shedd Aquarium", "1200 S Lake Shore Dr\nChicago, IL 60605\n(312) 939-2438", R.drawable.the_bean));
        events.add(new EventObject("Adler Planetarium", "1300 S Lake Shore Dr\nChicago, IL 60605\n(312) 922-7827", R.drawable.the_bean));
        events.add(new EventObject("How do you build a database?", "October 15, 2018", R.drawable.the_bean));
        events.add(new EventObject("From musician to developer", "September 24, 2018", R.drawable.the_bean));
        events.add(new EventObject("What's an Indie Hacker?", "September 17, 2018", R.drawable.the_bean));

        EventAdapter adapter = new EventAdapter(getActivity(), events );

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        //return inflater.inflate(R.layout.fragment_page, container, false);
        return rootView;
    }

}
