package com.example.customadapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int[] imagId = {
            R.drawable.bird, R.drawable.cat, R.drawable.cow, R.drawable.dog,
            R.drawable.fish, R.drawable.penguin, R.drawable.sparrow
    };

    String[] itemName = {
            "Bird", "Cat", "Cow", "Dog", "Donkey", "Duck", "Elephant",
            "Fish", "Horse", "Mouse", "Owl", "Penguin", "Rabbit", "Sparrow"
    };

    String[] itemDesc = {
            "Bird description", "Cat description", "Cow description", "Dog description",
            "Donkey description", "Duck description", "Elephant description",
            "Fish description", "Horse description", "Mouse description",
            "Owl description", "Penguin description", "Rabbit description", "Sparrow description"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listviewrow adapter = new listviewrow(this, imagId, itemName, itemDesc);

        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = itemName[position];
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
