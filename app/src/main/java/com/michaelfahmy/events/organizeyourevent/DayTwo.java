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
public class DayTwo extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.day, container, false);


        ArrayList<Item> items = new ArrayList<>(15);
        items.add(new Item("Es7a w Fooo2", "08:00 AM", "08:30 AM"));
        items.add(new Item("Yalla nsaly", "08:30 AM", "09:00 AM"));
        items.add(new Item("Breakfast Time", "09:00 AM", "10:00 AM"));
        items.add(new Item("Bible workshop", "10:00 AM", "11:00 AM"));
        items.add(new Item("Marketing", "11:00 AM", "02:00 PM"));
        items.add(new Item("Nadwa", "02:00 PM", "03:00 PM"));
        items.add(new Item("Lunch Time", "03:00 PM", "04:00 PM"));
        items.add(new Item("Pool (Guys)", "04:00 PM", "05:00 PM"));
        items.add(new Item("Pool (Girls)", "05:00 PM", "06:00 PM"));
        items.add(new Item("Color Fight", "06:00 PM", "07:00 PM"));
        items.add(new Item("Rest", "07:00 PM", "08:00 PM"));
        items.add(new Item("Yalla nsaly", "08:00 PM", "08:30 PM"));
        items.add(new Item("Workshop", "08:30 PM", "09:30 PM"));
        items.add(new Item("Dinner Time", "09:30 PM", "10:00 PM"));
        items.add(new Item("Summer Time", "10:00 PM", "12:30 AM"));



        ListAdapter adapter = new ListAdapter(getContext(), R.layout.item, items);


        ListView list = (ListView) view.findViewById(R.id.day_list);
        list.setAdapter(adapter);

        return view;
    }

}
