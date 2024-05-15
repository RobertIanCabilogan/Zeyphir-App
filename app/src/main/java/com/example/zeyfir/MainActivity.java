package com.example.zeyfir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton robert;
    ImageButton nicholai;
    ImageButton reinz;
    ImageButton ibniy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        robert = (ImageButton) findViewById(R.id.Robert);

        nicholai = (ImageButton) findViewById(R.id.nicholai);

        reinz = (ImageButton) findViewById(R.id.reinz);

        ibniy = (ImageButton) findViewById(R.id.ibniy);

        robert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, RobertsProfile.class);
                startActivity(intent);
            }
        });
        nicholai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, NicholaisProfile.class);
                startActivity(intent);
            }
        });
        reinz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ReinzProfile.class);
                startActivity(intent);
            }
        });
        ibniy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, IbniyProfile.class);
                startActivity(intent);
            }
        });
    }
}