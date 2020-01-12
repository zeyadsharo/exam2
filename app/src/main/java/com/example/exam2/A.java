package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class A extends AppCompatActivity {
    private   ListView listView;
    private String names[]={"Zeyad","Ali","Ahmed","Omer"};;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_a );
        listView=findViewById( R.id.listA );
        MyAdpter d=new MyAdpter( this,12,names );

        listView.setAdapter( d );
    }
    class MyAdpter extends ArrayAdapter<String> {
        String names[];

        public MyAdpter(@NonNull Context context, int resource,String names[]) {
            super( context, R.layout.activity_b,R.id.text34, names );
            this.names=names;
        }



        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View myLayout = inflater.inflate(R.layout.activity_b, parent, false);
            TextView textView=myLayout.findViewById( R.id.text34 );
            textView.setText( this.names[position]);
            return myLayout;
        }
    }

}

