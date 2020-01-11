package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class testb extends AppCompatActivity {
RadioButton r25,r20,r15;
SeekBar seekBar2;
Button inc,dec;
Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_testb );
        r25=findViewById( R.id.radioButton25 );
        r15=findViewById( R.id.radioButton15 );
        r20=findViewById( R.id.radioButton20 );
        seekBar2=findViewById( R.id.seekBar2 );
        inc=findViewById( R.id.inc );
        dec=findViewById( R.id.dec );
        aSwitch=findViewById( R.id.switch2 );
        seekBar2.setMax( 25 );
        r20.setChecked( true);
        seekBar2.setProgress( 20 );


        r25.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar2.setProgress( 25 );
            }
        } );
        r20.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar2.setProgress( 20 );
            }
        } );
        r15.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar2.setProgress( 15 );
            }
        } );
        inc.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r15.isChecked())
                {
                    seekBar2.setProgress( 20 );
                    r20.setChecked( true );
                }
                else
                {
                    if (r20.isChecked())
                    {
                        seekBar2.setProgress( 25 );
                        r25.setChecked( true );
                    }
                }
            }
        } );
        dec.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r25.isChecked())
                {
                    seekBar2.setProgress( 20 );
                    r20.setChecked( true );
                }
                else
                {
                    if (r20.isChecked())
                    {
                        seekBar2.setProgress( 15 );
                        r15.setChecked( true );
                    }
                }
            }
        } );
        aSwitch.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
            }
        } );

    }


    public  void check()
    {
        ConstraintLayout con=findViewById( R.id.temp );
        if ( aSwitch.isChecked())
        {
            con.setBackgroundColor( Color.LTGRAY );
            inc.setClickable( true );
            dec.setClickable( true );
            r25.setClickable( true );
            r20.setClickable( true );
            r15.setClickable( true );
        }
        else
        {
            con.setBackgroundColor( Color.WHITE );
            inc.setClickable( false );
            dec.setClickable( false );
            r25.setClickable( false );
            r20.setClickable( false );
            r15.setClickable( false );

        }
    }
}
