package com.example.exam2;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Exercise5 extends AppCompatActivity {
    private Button toast,dialog,clear;
    private EditText editText;
    AlertDialog.Builder alert,getAlert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise5);
        toast=findViewById(R.id.button);
        dialog=findViewById(R.id.button2);
        clear=findViewById(R.id.button4);
        editText=findViewById(R.id.editText);
        getAlert=new AlertDialog.Builder( this );
        alert = new AlertDialog.Builder(this);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"the value of edit text: "+editText.getText(),Toast.LENGTH_LONG).show();

            }
        });

        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.setTitle("My Dialog Message");
                alert.setMessage("Do you want me to clear the EditText?");
                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Delete the message
                        editText.getText().clear();
                    }
                })
                        // A null listener allows the button to dismiss the dialog and take no further action.
                        .setNegativeButton("no", null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    editText.getText().clear();




            }
        });

    }
}