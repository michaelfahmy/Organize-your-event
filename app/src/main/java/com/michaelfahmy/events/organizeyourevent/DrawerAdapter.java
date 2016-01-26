package com.michaelfahmy.events.organizeyourevent;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Michael Fahmy on 09/03/2015.
 */

public class DrawerAdapter extends RecyclerView.Adapter<DrawerAdapter.ViewHolder> {

    private static final int HEADER = 0;
    private static final int ITEM = 1;

    private String[] titles;
    private int[] icons;
    Context context;

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView icon;
        TextView txt;
        Context c;

        public ViewHolder(View itemView, Context c) {
            super(itemView);
            this.c = c;
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
            icon = (ImageView) itemView.findViewById(R.id.rowIcon);
            txt = (TextView) itemView.findViewById(R.id.rowText);
        }

        @Override
        public void onClick(View v) {
            switch (getAdapterPosition()) {
                case 0:
                    c.startActivity(new Intent(c, Slawat.class));
                    break;
                case 1:
                    c.startActivity(new Intent(c, Slawat.class));
                    break;
            }
        }
    }


    public DrawerAdapter(Context context, String[] titles, int[] icons) {
        this.context = context;
        this.titles = titles;
        this.icons = icons;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.drawer_row, parent, false);
        return new ViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        if (i < titles.length) {
            holder.icon.setImageResource(icons[i]);
            holder.txt.setText(titles[i]);
        }
    }

    @Override
    public int getItemCount() {
        return titles.length + 1;
    }
}
