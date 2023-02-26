package com.heka.mvvmstatemanagesample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //would be change every rotation change , it couldn't provide stable state data
       // DateTimeGenerator dateTimeGenerator = new DateTimeGenerator();
        //with ViewModel, we provide stable state data, it not effects to rotation change.
        DateTimeGenerator dateTimeGenerator = new ViewModelProvider(this).get(DateTimeGenerator.class);
        String data = dateTimeGenerator.getData();

        TextView tvDateTime = findViewById(R.id.tvDateTime);
        tvDateTime.setText(data);
    }
}