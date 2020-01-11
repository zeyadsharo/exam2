package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Exercise3 extends AppCompatActivity {
 Button add;
 EditText num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_exercise3 );
        num1=findViewById( R.id.num1 );
        num2=findViewById( R.id.num2);
        result=findViewById( R.id.result );
        add=findViewById( R.id.add   );
        add.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.getText().clear();
                double x=0,y=0;
                if (!num1.getText().toString().matches("")&&!num2.getText().toString().matches(""))
                {
                     x=Double.parseDouble(num1.getText().toString());
                     y=Double.parseDouble(num2.getText().toString());
                     result.setText(x+y+"" );
                }
                else
                {
                    Toast.makeText( getApplicationContext(), "plase enter the valid number!!", Toast.LENGTH_SHORT ).show();
                    result.setText(" invalid" );
                }

            }
        } );
    }
}
