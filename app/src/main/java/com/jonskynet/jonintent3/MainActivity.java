package com.jonskynet.jonintent3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton mapButton;
    ImageButton mapButton2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapButton = (ImageButton) findViewById(R.id.imageButton2);
        mapButton2 = (ImageButton) findViewById(R.id.imageButton3);

        mapButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    String geoURI = "geo:40.730610,-73.935242?z=12";
                    Uri geo = Uri.parse(geoURI);
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, geo);
                    if (mapIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(mapIntent);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        mapButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    String geoURI = "geo:41.606487, 2.613965?z=12";
                    Uri geo = Uri.parse(geoURI);
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, geo);
                    if (mapIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(mapIntent);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}





