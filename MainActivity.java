package com.fmu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] Marcas = {"Fiat", "Ford", "GM", "Honda", "Kia", "Toyota"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.ListMarcas);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, Marcas);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tmp = (TextView) view;
                String Value = list.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), Value, Toast.LENGTH_SHORT).show();
            }
        });
        list.setAdapter(mAdapter);
    }
 }
