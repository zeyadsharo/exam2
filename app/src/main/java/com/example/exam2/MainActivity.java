package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button exercise3,exercise5 ,exercise6,exercise7,testb,intenta;
   Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        exercise3=findViewById( R.id.exercise3 );
        exercise5=findViewById( R.id.exercise5 );
        exercise6=findViewById( R.id.exercise6 );
        exercise7=findViewById( R.id.exercise7 );
        intenta=findViewById( R.id.intenta );
        testb=findViewById( R.id.testb );

        exercise3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,Exercise3.class);
                startActivity( intent );
            }
        } );
        exercise5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,Exercise5.class);
                startActivity( intent );
            }
        } );
        exercise6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,exercise6.class);
                startActivity( intent );
            }
        } );
        exercise7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,exercise7.class);
                intent.putExtra( "name","Main Activity" );
                startActivityForResult(intent,13 );
            }
        } );
        testb.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,testb.class);
                startActivity( intent );
            }
        } );
        intenta.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,intentactivity.class);
                startActivity( intent );
            }
        } );
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 13) {
            if(resultCode == Activity.RESULT_OK){
                String result=data.getStringExtra("result");
                Toast.makeText( this, result, Toast.LENGTH_SHORT ).show();
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText( this, "canceled", Toast.LENGTH_SHORT ).show();
            }
        }
    }

}
