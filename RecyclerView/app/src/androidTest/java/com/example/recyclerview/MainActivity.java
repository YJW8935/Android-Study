package com.example.recyclerview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public abstract class MainActivity extends AppCompatActivity implements MyRecyclerAdapter.MyRecyclerViewClickListener {

    ArrayList<ItemData> dataList = new ArrayList<>();
    int[] oh = {};

    final MyRecyclerAdapter adapter = new MyRecyclerAdapter(dataList);
    static int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        for (int i=0; i<10; i++) {
            dataList.add(new ItemData(oh[i], "TITLE "+i, String.format("리사이클러뷰 %03d", i)));
        }

        recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(this);
    }

    @Override
    public void onItemClicked(int position) {
        Toast.makeText(getApplicationContext(), "Item : "+position, Toast.LENGTH_SHORT).show();
    }

    public void onTitleClicked(int position) {
        Toast.makeText(getApplicationContext(), "Title : "+position, Toast.LENGTH_SHORT).show();
    }

    public void onContentClicked(int position) {
        Toast.makeText(getApplicationContext(), "Content : "+position, Toast.LENGTH_SHORT).show();
    }

/*    @Override
    public void onImageViewClicked(int position) {
        Toast.makeText(getApplicationContext(), "Image : "+position, Toast.LENGTH_SHORT).show();
    }*/

    /*public void onItemLongClicked(int position) {
        adapter.remove(position);
        Toast.makeText(getApplicationContext(), dataList.get(position).getTitle()+" id removed", Toast.LENGTH_SHORT).show();
    }*/
}