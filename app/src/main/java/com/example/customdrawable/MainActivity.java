package com.example.customdrawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll=findViewById(R.id.myMainLayout);

        EditText et = new EditText(this);
        Button btn = new Button(this);
        LinearLayout.LayoutParams etParas=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        et.setLayoutParams(etParas);
        btn.setLayoutParams(etParas);
        btn.setOnClickListener(e->{et.setText("Hello");});
        btn.setText("click me");
        ll.addView(et);
        ll.addView(btn);
    }
}