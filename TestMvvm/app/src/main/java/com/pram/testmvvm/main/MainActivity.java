package com.pram.testmvvm.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pram.testmvvm.R;
import com.pram.testmvvm.adapter.ItemAdapter;
import com.pram.testmvvm.model.ItemModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mainViewModel;

    private ItemAdapter itemAdapter;

    private RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.init();
        mainViewModel.getAllItems().observe(this, new Observer<List<ItemModel>>() {
            @Override
            public void onChanged(List<ItemModel> itemModels) {
                itemAdapter.notifyDataSetChanged();
            }
        });

        itemAdapter = new ItemAdapter(mainViewModel.getAllItems().getValue());

        rvItems = findViewById(R.id.rv_items);

        rvItems.setLayoutManager(new LinearLayoutManager(this));
        rvItems.setHasFixedSize(true);
        rvItems.setAdapter(itemAdapter);
    }
}
