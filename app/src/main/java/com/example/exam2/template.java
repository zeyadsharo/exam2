package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class template extends AppCompatActivity {
Bundle bundle;
TextView textView;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_template );
        textView=findViewById( R.id.textView11 );
        imageView=findViewById( R.id.imageView );
        bundle=getIntent().getExtras();
        if (bundle!=null) {
            String str = bundle.getString( "item" );
            textView.setText( str );
            if ( str.toLowerCase().equals(  "zeyad"))
            {
                imageView.setImageResource(R.drawable.web_hi_res_512 );

            }
        }

    }
}
