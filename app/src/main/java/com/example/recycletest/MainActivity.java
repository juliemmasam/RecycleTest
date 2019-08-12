package com.example.recycletest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeDisplayContent();
    }

    private void initializeDisplayContent(){
        final RecyclerView recyclerView = findViewById(R.id.recyclerView);
        // The linear layout manager constructor needs the context as input parameter
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);


        List<IndMessage> indMessages = IndMessage.getInstance().getIndMessages();

        final ItemsAdapter itemsAdapter = new ItemsAdapter(this,  indMessages);
        recyclerView.setAdapter(itemsAdapter);
    }
}
