package com.example.android.chicagotourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<EventObject> {
    final int PAGE_COUNT = 4;
    private Context mContext;

    public EventAdapter(Context context, ArrayList<EventObject> events){
        super(context, 0, events);
        mContext = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        EventObject currentEventObject = getItem(position);

        TextView eventTitleView = (TextView) listItemView.findViewById(R.id.textView_title);
        eventTitleView.setText(currentEventObject.getName());

        TextView eventLocationView = (TextView) listItemView.findViewById(R.id.textView_location);
        eventLocationView.setText(currentEventObject.getLocation());

        ImageView eventImageView = (ImageView) listItemView.findViewById(R.id.textView_imageId);
        eventImageView.setImageResource(currentEventObject.getImageId());

        return listItemView;
    }

}


