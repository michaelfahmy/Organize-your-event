package com.michaelfahmy.events.organizeyourevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Slawat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slawat);

        ArrayList<String> slawat = new ArrayList<>();
        slawat.add("صـلاة باكر");
        slawat.add("صـلاةالغروب");
        slawat.add("صـلاة النوم");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.text_row, slawat);

        ListView list = (ListView) findViewById(R.id.slawat_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Slawat.this, TextScreen.class);

                switch (position) {
                    case 0:
                        intent.putExtra("key", "baker");
                        break;
                    case 1:
                        intent.putExtra("key", "ghrob");
                        break;
                    case 2:
                        intent.putExtra("key", "noom");
                        break;
                }
                startActivity(intent);
            }
        });

    }
}
