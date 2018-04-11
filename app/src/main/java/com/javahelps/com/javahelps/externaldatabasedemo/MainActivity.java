package com.javahelps.com.javahelps.externaldatabasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create the Person objects
        Person john = new Person("John","12-20-1998","Male");
        Person steve = new Person("Steve","08-03-1987","Male");

        //Add the Person objects to an ArrayList
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(john);
        peopleList.add(steve);

        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }
}




