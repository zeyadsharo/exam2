package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listview extends AppCompatActivity {
ListView listView;
EditText editText;
ArrayAdapter arrayAdapter;
ArrayList arrayList;
private Button add,remove,clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_listview );
        listView=findViewById( R.id.listview );
        add=findViewById( R.id.add );
        remove=findViewById( R.id.remove );
        clear=findViewById( R.id.clear );
        editText =findViewById( R.id.item );
        arrayList=new ArrayList(  );
        arrayAdapter=new ArrayAdapter( listview.this,android.R.layout.activity_list_item,
                android.R.id.text1,arrayList);
        add.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().isEmpty()) {
                    if (!arrayList.contains(editText.getText().toString())) {
                        arrayList.add( editText.getText().toString() );
                        listView.setAdapter( arrayAdapter );
                    }
                    else
                    {
                        Toast.makeText( listview.this, "the list  contains items ! try another name!!", Toast.LENGTH_SHORT ).show();
                    }
                }
                else
                {
                    Toast.makeText( listview.this, "edit text is empty", Toast.LENGTH_SHORT ).show();
                }
            }
        } );
        remove.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!editText.getText().toString().isEmpty()&&arrayList.size()>0) {
                    arrayList.remove( editText.getText().toString() );
                    listView.setAdapter( arrayAdapter );
                }
                else
                {
                    Toast.makeText( listview.this, "no value to remove", Toast.LENGTH_SHORT ).show();
                }

            }
        } );
        clear.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.clear();
                listView.setAdapter( arrayAdapter );
            }
        } );
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item= (String) listView.getItemAtPosition( position );

                Intent intent=new Intent( listview.this,template.class );
                intent.putExtra( "item",item );
                startActivity( intent );
            }
        } );




    }
}
