package com.debin.makeupdemo.viewmodelFactory;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.debin.makeupdemo.viewmodel.MakeUpViewModel;

public class MakeUpViewModelFactory implements ViewModelProvider.Factory {

    private String value;

    public MakeUpViewModelFactory(String value) {
        this.value = value;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new MakeUpViewModel(value);
    }
}
