package com.jihadaziezi.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.richieokfiandy202102332.hotelapp202102332.R;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://asset.kompas.com/crops/LzpqeXAvyKBEjvpryZWInmemnTk=/9x0:576x378/750x500/data/photo/2022/09/13/63208dd2b9b0a.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}