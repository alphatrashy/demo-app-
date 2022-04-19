package com.example.meme_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    int[] pics= {R.drawable.imga,R.drawable.imgb};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=(ImageView) findViewById(R.id.picture);
    }
    public void change(View view){
        Random rand= new Random();
        int rand_int= rand.nextInt(2);
        image.setImageResource(pics[rand_int]);

    }
}