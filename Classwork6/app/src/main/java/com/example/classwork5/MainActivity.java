package com.example.classwork5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Items> myList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Items item1 = new Items("shia seeds" , 20, R.drawable.shia);
        Items item2 = new Items("ktan seeds" , 15, R.drawable.ktan);
        Items item3 = new Items("yakteen seeds" , 7.5, R.drawable.yakteen);
        Items item4 = new Items("rayhan seeds" , 19, R.drawable.rayhan);
        Items item5 = new Items("khardal seeds" , 25.4, R.drawable.khardal);

        myList.add(item1);
        myList.add(item2);
        myList.add(item3);
        myList.add(item4);
        myList.add(item5);


        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter( myList ,this);
        recycler.setAdapter(adapter);





    }
}