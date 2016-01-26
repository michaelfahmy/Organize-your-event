package com.michaelfahmy.events.organizeyourevent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class DayOne extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.day, container, false);


        ArrayList<Item> items = new ArrayList<>(15);
        items.add(new Item("Hnt7rk", "08:00 AM", "10:30 AM"));
        items.add(new Item("Hnt3rf", "10:30 AM", "11:30 AM"));
        items.add(new Item("Introduction", "11:30 AM", "12:00 PM"));
        items.add(new Item("Estlm 2odtk", "12:00 PM", "12:30 PM"));
        items.add(new Item("Enzl esm3 klma 7lwa", "12:30 PM", "02:00 PM"));
        items.add(new Item("Water Games", "02:00 PM", "03:00 PM"));
        items.add(new Item("Lunch Time", "03:00 PM", "04:00 PM"));
        items.add(new Item("Pool (Girls)", "04:00 PM", "05:00 PM"));
        items.add(new Item("Pool (Guys)", "05:00 PM", "06:00 PM"));
        items.add(new Item("Rest", "06:00 PM", "07:00 PM"));
        items.add(new Item("Yalla Nsaly", "07:00 PM", "07:30 PM"));
        items.add(new Item("EL Kenz", "07:30 PM", "09:00 PM"));
        items.add(new Item("Dinner Time", "09:00 PM", "10:00 PM"));
        items.add(new Item("Bible workshop", "10:00 PM", "11:00 PM"));
        items.add(new Item("7afla tanakoryaaaa", "11:00 PM", "12:30 AM"));



        ListAdapter adapter = new ListAdapter(getContext(), R.layout.item, items);


        ListView list = (ListView) view.findViewById(R.id.day_list);
        list.setAdapter(adapter);

        return view;
    }

}
