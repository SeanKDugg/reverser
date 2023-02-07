package com.owasp.reverser.ui.challenges;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Challenge_1_Model extends ViewModel {

    private final MutableLiveData<String> mText;

    public Challenge_1_Model() {
        mText = new MutableLiveData<>();
        mText.setValue("The key to pass this challenge is to determine the firstname and lastname of the person who signed this APK.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}