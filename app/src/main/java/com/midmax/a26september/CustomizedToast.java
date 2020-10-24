package com.midmax.a26september;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class CustomizedToast extends AppCompatActivity {

    Button top,center;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customized_toast);
        top=findViewById(R.id.TopToast);
        center=findViewById(R.id.centerToast);
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater layoutInflater=getLayoutInflater();
                View layout=layoutInflater.inflate(R.layout.top_toast_layout,(ViewGroup) findViewById(R.id.top));
                Toast toast=new Toast(getApplicationContext());
                toast.setGravity(Gravity.TOP,0,0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
            }
        });
        center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater layoutInflater=getLayoutInflater();
                View layout=layoutInflater.inflate(R.layout.center_toast_layout,(ViewGroup) findViewById(R.id.center));
                Toast toast=new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
            }
        });
    }
}