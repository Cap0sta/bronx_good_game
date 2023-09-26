package com.example.bronx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button pizza;

    Button reset;

    Switch flaszka;
    TextView kebab;

    Integer counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizza = findViewById(R.id.button);
        kebab = findViewById(R.id.textView);
        reset = findViewById(R.id.button2);
        flaszka = findViewById(R.id.switch1);

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(flaszka.isChecked()){
                    counter--;
                }
                else{
                    counter++;

                }
                kebab.setText("Punkty: " + counter);

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                kebab.setText("Punkty: " + counter);
            }
        });

        flaszka.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(flaszka.isChecked()){
                    pizza.setText("-1");



                }
                    else{
                        pizza.setText("+1");
                }

            }
        });

    }
}