package com.example.exam2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class listviewp2 extends AppCompatActivity {
    ListView listView;

    String mTitle[] = {"Facebook", "Youtube",  "Instagram", "telegram"};
    String mDescription[] = {"Facebook Description","Youtube Description", "Instagram Description","telegram Description"};
    int images[] = {R.drawable.facebook, R.drawable.youtube,R.drawable.instagram,R.drawable.telegram};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_listviewp2 );

        listView = findViewById( R.id.ewrw );
        MyAdapter adapter = new MyAdapter( this, mTitle, mDescription, images );
        listView.setAdapter( adapter );


        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText( listviewp2.this, "Facebook Description",
                            Toast.LENGTH_SHORT ).show();
                }
                if (position == 1) {
                    Toast.makeText( listviewp2.this, "Whatsapp Description",
                            Toast.LENGTH_SHORT ).show();
                }
            }
        } );











    }


    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super( c, R.layout.activity_row, R.id.textView1, title );
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService
                    ( Context.LAYOUT_INFLATER_SERVICE );
            View row = layoutInflater.inflate( R.layout.activity_row, parent, false );

            ImageView images = row.findViewById( R.id.image );
            TextView myTitle = row.findViewById( R.id.textView1 );
            TextView myDescription = row.findViewById( R.id.textView2 );

            images.setImageResource( rImgs[position] );
            myTitle.setText( rTitle[position] );
            myDescription.setText( rDescription[position] );

            return row;
        }
    }
}
