package com.pram.testmvp.main;

import com.pram.testmvp.model.ItemModel;

import java.util.List;

public interface MainContract {
    interface MainView {
        void showAllItems(List<ItemModel> itemModels);
    }

    interface MainPresenter {
        void getAllItems();
    }
}
