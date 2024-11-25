package com.example.drowernavdev.ui.bookingcheck;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookingcheckViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BookingcheckViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}