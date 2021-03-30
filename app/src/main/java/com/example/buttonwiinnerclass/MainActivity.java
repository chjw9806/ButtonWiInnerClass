package com.example.buttonwiinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mButton1, mButton2;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mTextView1 = findViewById(R.id.textView1);

        mButton1.setOnClickListener(new MyOnClichListner());
        mButton2.setOnClickListener(new MyOnClichListner());
    }

    class MyOnClichListner implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button1:
                    mTextView1.setText("You clicked jw's Button!");
                    break;
                case R.id.button2:
                    mTextView1.setText("You clicked 2nd Button!");
                    break;
                default:
                    break;
            }
        }
    }
}
