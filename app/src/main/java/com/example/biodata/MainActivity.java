package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonalamat(View view) {
        Uri uri = Uri.parse("geo:-6.740131,111.0280558,20");
        Intent b=new Intent(android.content.Intent.ACTION_VIEW, uri);
        startActivity(b);
    }

    public void buttonclick(View view) {
        Uri uri = Uri.parse("tel:088980117450");
        Intent a = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(a);
    }

    public void buttonemail(View view) {
        Intent d = new Intent(Intent.ACTION_SEND);
        d.setType("text/plain");
        d.putExtra(Intent.EXTRA_EMAIL, new String[] {"percobaan.thierry12@gmail.com"});
        startActivity(d);
    }
}