package com.example.buttonwiinnerclass;

import android.view.View;

public class MyOnClichListner implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClichListner(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextView1.setText("You clicked jw's Button!");

    }
}
