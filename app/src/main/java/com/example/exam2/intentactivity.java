package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class intentactivity extends AppCompatActivity {
ImageButton home,call,sms;
Button search;
Intent intent;
EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_intentactivity );
        home=findViewById( R.id.home );
        call=findViewById( R.id.call );
        sms=findViewById( R.id.sms );
        search=findViewById( R.id.search );
        ed1=findViewById( R.id.textsearch );
        home.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        } );
        call.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent( Intent.ACTION_VIEW,Uri.parse("tel:006011111111"));
                startActivity( intent );

            }
        } );
        sms.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent( Intent.ACTION_VIEW,Uri.parse( "sms:123456789" ) );
                startActivity( intent );
            }
        } );
        search.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q="+ed1.getText().toString()));
                startActivity( intent );
            }
        } );
    }
}
