package com.example.tipo666.eteco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        ListView listView = (ListView) findViewById(R.id.lista);

        List<String> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            list.add(Integer.toString(i + 1));
        }
        listView.setAdapter(new ArrayAdapter<>(this, R.layout.activity_main6, list));

    }
}
