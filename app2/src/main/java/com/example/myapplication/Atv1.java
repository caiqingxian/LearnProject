package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2018-5-10.
 */

public class Atv1 extends Activity {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atv);
        button=(Button) findViewById(R.id.as_button);
        textView=(TextView) findViewById(R.id.out_view);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
//        textView.setText(getIntent().getStringExtra("name"));
        Bundle bundle=getIntent().getExtras();
        textView.setText("sex:"+bundle.getString("sex")+"address:"+bundle.getString("address")+"age:"+bundle.getInt("age"));
        Toast toast=new Toast(Atv1.this);
        toast.makeText(Atv1.this,"sex:"+bundle.getString("sex")+"address:"+bundle.getString("address")+"age:"+bundle.getInt("age"),Toast.LENGTH_SHORT).show();
        System.out.println("~~"+getIntent().getStringExtra("name"));
    }
}
