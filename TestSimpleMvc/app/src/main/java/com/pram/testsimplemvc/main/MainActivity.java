package com.pram.testsimplemvc.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pram.testsimplemvc.R;
import com.pram.testsimplemvc.adapter.ItemAdapter;
import com.pram.testsimplemvc.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ItemModel> itemModels;

    private ItemAdapter itemAdapter;

    private RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemModels = new ArrayList<>();

        itemAdapter = new ItemAdapter(itemModels);

        rvItems = findViewById(R.id.rv_items);

        rvItems.setLayoutManager(new LinearLayoutManager(this));
        rvItems.setHasFixedSize(true);
        rvItems.setAdapter(itemAdapter);

        mockItems();
    }

    private void mockItems() {
        for (int i = 0; i <= 10; i++) {
            String itemId = "id " + i;
            String itemContent = "content " + i;

            ItemModel itemModel = new ItemModel(itemId, itemContent);
            itemModels.add(itemModel);
            itemAdapter.notifyDataSetChanged();
        }
    }
}
