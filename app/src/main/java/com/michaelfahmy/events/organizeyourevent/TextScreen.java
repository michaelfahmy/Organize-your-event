package com.michaelfahmy.events.organizeyourevent;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TextScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_screen);

        TextView txtView = (TextView) findViewById(R.id.text_view);

        Intent intent = getIntent();
        String stringName = intent.getStringExtra("key");
        Spanned txt = null;

        switch (stringName) {
            case "baker":
                txt = Html.fromHtml(getString(R.string.baker));
                break;
            case "ghrob":
                txt = Html.fromHtml(getString(R.string.ghrob));
                break;
            case "noom":
                txt = Html.fromHtml(getString(R.string.noom));
                break;
        }

        txtView.setText(txt);


    }

}
