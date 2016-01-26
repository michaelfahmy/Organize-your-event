package com.michaelfahmy.events.organizeyourevent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Michael Fahmy on 08/26/2015.
 */
public class DayThree extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.day, container, false);


        ArrayList<Item> items = new ArrayList<>(7);
        items.add(new Item("Es7a w Fooo2", "08:00 AM", "08:30 AM"));
        items.add(new Item("Yalla nsaly", "08:30 AM", "09:00 AM"));
        items.add(new Item("Breakfast Time", "09:00 AM", "10:00 AM"));
        items.add(new Item("Lem 7agtk w Slm 2odtk", "10:00 AM", "10:30 AM"));
        items.add(new Item("Surpriseeeee", "10:30 AM", "11:30 AM"));
        items.add(new Item("Klma bgd", "11:30 AM", "12:00 PM"));
        items.add(new Item("Hnmshy", "12:00 PM", "12:30 PM"));



        ListAdapter adapter = new ListAdapter(getContext(), R.layout.item, items);


        ListView list = (ListView) view.findViewById(R.id.day_list);
        list.setAdapter(adapter);

        return view;
    }

}
