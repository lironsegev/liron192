package com.example.lironsegev.liron192;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button btn2;
    Button btn3;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    LinearLayout liron;
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);
        rb4=(RadioButton)findViewById(R.id.rb4);
        liron=(LinearLayout)findViewById(R.id.liron);
        rg= (RadioGroup)findViewById(R.id.rg);
    }

    public void btn3(View view) {
        if(view.getId()==R.id.btn3){
            rg.clearCheck();
            liron.setBackgroundColor(Color.WHITE);
        }
    }

    public void btn2(View view) {
        if(rb2.isChecked())liron.setBackgroundColor(Color.RED);
        if(rb3.isChecked())liron.setBackgroundColor(Color.GREEN);
        if(rb4.isChecked())liron.setBackgroundColor(Color.YELLOW);

    }
}
