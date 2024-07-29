package com.example.classactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Defining the Views
    EditText MSG1;
    Button Submit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        MSG1 = findViewById(R.id.editText1);
        Submit = findViewById(R.id.Submit);

        // Set OnClickListener for Submit button
        Submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.Submit) {
            // Get the text from EditText
            String message = MSG1.getText().toString();

            // Create an Intent to start MainActivity2
            Intent intent = new Intent(this, MainActivity2.class);

            // Put the message as an extra in the Intent
            intent.putExtra("message", message);

            // Start MainActivity2 with the Intent
            startActivity(intent);
        }
    }
}
