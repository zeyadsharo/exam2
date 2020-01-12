package com.example.exam2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class exercise7 extends AppCompatActivity {
    private EditText editText;
    private SeekBar seekBar;
    private RadioButton r1,r2;
    private TextView textView;
    private Button change;
    Bundle bundle;
    Intent returnIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_exercise7 );
        editText=findViewById( R.id.edittext1 );
        seekBar=findViewById( R.id.seekBar );
        r1=findViewById( R.id.radioButton );
        r2=findViewById( R.id.radioButton2 );
        textView=findViewById( R.id.textView5 );
        change=findViewById( R.id.change);
        textView.setText( editText.getText().toString() );
        seekBar.setMax( 60 );
        seekBar.setBackgroundColor( Color.GREEN );
        seekBar.setProgress( 10 );
        textView.setTextSize( 10 );
        r1.setChecked( true );

        bundle=getIntent().getExtras();

        returnIntent = new Intent();
        returnIntent.putExtra("result","exercise7");
        setResult(Activity.RESULT_OK,returnIntent);
       // finish();
        //if you want to cancel requset
       // returnIntent = new Intent();
       // setResult(Activity.RESULT_CANCELED, returnIntent);
       // finish();

       editText.setText( getIntent().getStringExtra( "name" ) );

        textView.setText( editText.getText().toString() );
        editText.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                textView.setText( editText.getText().toString() );
            }
        } );
        seekBar.setOnSeekBarChangeListener( new SeekBar.OnSeekBarChangeListener() {
             @Override
             public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                 textView.setTextSize( seekBar.getProgress() );
             }

             @Override
             public void onStartTrackingTouch(SeekBar seekBar) {

             }

             @Override
             public void onStopTrackingTouch(SeekBar seekBar) {

             }
         } );
        change.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setChange();
            }
        } );
    }


    public  void setChange()
    {
        if (r1.isChecked())
        {
            r2.setChecked( true );
            r1.setChecked( false );
        }
        else
        {
            r2.setChecked( false );
            r1.setChecked( true );
        }
    }
}
