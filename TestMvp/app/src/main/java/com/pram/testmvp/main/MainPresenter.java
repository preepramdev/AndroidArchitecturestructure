package com.pram.testmvp.main;

import com.pram.testmvp.main.MainContract;
import com.pram.testmvp.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class MainPresenter implements MainContract.MainPresenter {

    private MainContract.MainView view;

    public MainPresenter(MainContract.MainView view) {
        this.view = view;
    }

    @Override
    public void getAllItems() {
        mockItems();
    }

    private void mockItems() {
        List<ItemModel> itemModels = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            String itemId = "id " + i;
            String itemContent = "content " + i;

            ItemModel itemModel = new ItemModel(itemId, itemContent);
            itemModels.add(itemModel);
        }

        view.showAllItems(itemModels);
    }
}
