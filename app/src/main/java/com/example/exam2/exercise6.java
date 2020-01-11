package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class exercise6 extends AppCompatActivity {
    private CheckBox normal,bold,italic;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise6);
        final RadioButton black,red,blue,rb18,rb24,rb28;

        black=findViewById(R.id.rbBlack);
        red=findViewById(R.id.rbRed);
        blue=findViewById(R.id.rbBlue);
        rb18=findViewById(R.id.rb18);
        rb24=findViewById(R.id.rb24);
        rb28=findViewById(R.id.rb28);
        normal=findViewById(R.id.cbNormal);
        bold=findViewById(R.id.cbBold);
        italic=findViewById(R.id.cbItalic);
        final Switch on_off=findViewById(R.id.switch1);
        tv1= findViewById(R.id.tv1);

        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setTextColor(Color.BLACK);
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setTextColor(Color.parseColor("#ffff4444"));
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setTextColor(Color.parseColor("#ff006fff"));
            }
        });
        rb18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setTextSize(18);
            }
        });
        rb24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setTextSize(24);
            }
        });
        rb28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setTextSize(28);
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(normal.isChecked()){
                    normal.setClickable(false);
                }else{
                    normal.setClickable(true);
                }
                tv1.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                italic.setChecked(false);
                bold.setChecked(false);
            }
        });
        bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                normal.setChecked(false);
                normal.setClickable(true);
                select();

            }
        });
        italic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                normal.setChecked(false);
                normal.setClickable(true);
                select();
            }
        });
        on_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout cl=findViewById(R.id.ex6 );
                if(on_off.isChecked()){
                    cl.setBackgroundColor(Color.BLACK);

                }else {
                    cl.setBackgroundColor(Color.parseColor("#FFECDDC6"));
                }
            }
        });
    }
    private void select(){
        if (bold.isChecked() && italic.isChecked()){
            tv1.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
        }else if (bold.isChecked() && !italic.isChecked()){
            tv1.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        } else if (!bold.isChecked() && italic.isChecked()){
            tv1.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
        } else if (!bold.isChecked() && !italic.isChecked()){
            tv1.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
            normal.setChecked(true);
        }
    }
}