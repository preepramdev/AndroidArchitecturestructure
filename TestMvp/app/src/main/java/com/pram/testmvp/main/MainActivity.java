package com.pram.testmvp.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pram.testmvp.R;
import com.pram.testmvp.adapter.ItemAdapter;
import com.pram.testmvp.model.ItemModel;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    private MainContract.MainPresenter presenter;

    private ItemAdapter itemAdapter;

    private RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemAdapter = new ItemAdapter(null);

        rvItems = findViewById(R.id.rv_items);

        rvItems.setLayoutManager(new LinearLayoutManager(this));
        rvItems.setHasFixedSize(true);
        rvItems.setAdapter(itemAdapter);

        presenter = new MainPresenter(this); // below initView
        presenter.getAllItems();
    }

    @Override
    public void showAllItems(List<ItemModel> itemModels) {
        itemAdapter.setItemModels(itemModels);
    }
}
