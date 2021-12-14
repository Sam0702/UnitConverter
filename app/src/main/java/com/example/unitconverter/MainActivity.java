package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextNumber);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "The button is clicked", Toast.LENGTH_SHORT).show(); //pop up message
                String s  = editText.getText().toString(); //Getting editText Value as a String
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg; //Formula to convert kg to pound
                textView.setText("The corresponding value in Pound is " + pound);


            }
        });

    }
}