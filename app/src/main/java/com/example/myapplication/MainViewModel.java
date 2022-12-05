package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<String> mText;
    private final MutableLiveData<String> mInt;

    public MainViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("메인 뷰 모델이다 !!");

        mInt = new MutableLiveData<>();
        mInt.setValue("0");
    }

    public void sendMassage(String str) {
        mText.setValue(str);
    }

    public void sendInt(String integer) {
        mInt.setValue(integer);
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getInt() {
        return mInt;
    }
}