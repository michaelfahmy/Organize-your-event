package com.michaelfahmy.events.organizeyourevent;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Michael Fahmy on 08/30/2015.
 */
public class ListAdapter extends ArrayAdapter<Item> {

    private Context context;

    public ListAdapter(Context context, int resource, List<Item> objects) {
        super(context, resource, objects);
        this.context = context;
    }

    class ViewHolder {
        TextView title;
        TextView time;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item, parent, false);

            holder = new ViewHolder();
            holder.title = (TextView) convertView.findViewById(R.id.title);
            holder.time = (TextView) convertView.findViewById(R.id.time);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Item item = getItem(position);
        holder.title.setText(item.getTitle());
        holder.time.setText(item.getTime());

        return convertView;
    }
}
