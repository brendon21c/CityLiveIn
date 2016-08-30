package com.brendon.citylivein;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText personsName = (EditText) findViewById(R.id.persons_name); // This will identify their name
        final EditText personsCity = (EditText) findViewById(R.id.persons_city); // This will identify their city
        Button infoButton = (Button) findViewById(R.id.show_info); // Creates the button


        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = personsName.getText().toString();
                String city = personsCity.getText().toString();

                Toast.makeText(MainActivity.this, name + " lives in " + city, Toast.LENGTH_LONG).show();

                /*
                This next block is just to reset the fields after clicking the button
                */
                personsName.setText("");
                personsCity.setText("");


            }
        });






    }
}
