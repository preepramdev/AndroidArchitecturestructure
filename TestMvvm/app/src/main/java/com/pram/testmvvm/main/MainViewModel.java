package com.pram.testmvvm.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.pram.testmvvm.model.ItemModel;

import java.util.List;

public class MainViewModel extends ViewModel {
    private MutableLiveData<List<ItemModel>> itemModels;
    private MainRepository mainRepository;

    public void init() {
        if (itemModels != null) {
            return;
        }
        mainRepository = MainRepository.getInstance();
        itemModels = mainRepository.getAllItems();
    }

    public LiveData<List<ItemModel>> getAllItems() {
        return itemModels;
    }
}
