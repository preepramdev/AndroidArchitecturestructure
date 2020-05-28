package com.pram.testmvvm.main;

import androidx.lifecycle.MutableLiveData;

import com.pram.testmvvm.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class MainRepository {

    private static MainRepository instance;

    private List<ItemModel> dataSet = new ArrayList<>();

    public static MainRepository getInstance() {
        if (instance == null) {
            instance = new MainRepository();
        }
        return instance;
    }

    public MutableLiveData<List<ItemModel>> getAllItems() {
        mockItems();

        MutableLiveData<List<ItemModel>> data = new MutableLiveData<>();
        data.setValue(dataSet);
        return data;
    }

    private void mockItems() {
        for (int i = 0; i <= 10; i++) {
            String itemId = "id " + i;
            String itemContent = "content " + i;

            ItemModel itemModel = new ItemModel(itemId, itemContent);
            dataSet.add(itemModel);
        }
    }
}
