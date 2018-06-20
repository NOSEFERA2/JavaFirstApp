package com.example.davidibarra.javafirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view){
        //Toast myToast = Toast.makeText(this, message, duration);
        Toast sampleToast = Toast.makeText(this, "This button does nothing!", Toast.LENGTH_LONG);
        sampleToast.show();
    }

    public void countMe (View view){
        //Get the textview
        TextView counter = (TextView) findViewById(R.id.counter);
        //Get the value of the text view.
        String countString = counter.getText().toString(); //toString is necessary to convert CharSequence to String
        //Convert value to a number and increment it.
        Integer count = Integer.parseInt(countString);
        count++;
        //Display the new value in the text view.
        counter.setText(count.toString());
    }
}
