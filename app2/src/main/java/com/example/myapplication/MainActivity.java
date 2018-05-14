package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.logging.Logger;

import static com.example.myapplication.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
   private Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        button = (Button) findViewById(R.id.button_as);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent demo=new Intent();
                demo.setClass(MainActivity.this,Atv1.class);
               // demo.putExtra("name","jack");
                Bundle bundle=new Bundle();
                bundle.putString("name","Tom");
                bundle.putString("sex","男");
                bundle.putString("address","福州");
                bundle.putInt("age",18);
                demo.putExtras(bundle);
                startActivity(demo);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("=======onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("======onResume");
        System.out.println("2222");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("======onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.print("===onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("====onRestart");
    }

}
