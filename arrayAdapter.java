package com.example.classactivity2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

    // Defining the Views

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);

        String[] months = {"January", "February", "March", "April",
                "May", "June", "July",  "August", "September", "October",
                "November", "December"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, months);
        ListView listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View v, int
                    position, long id) {
                Intent intent=new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("v1", String.valueOf(position));
                startActivity(intent);
            }
        });

    }
}