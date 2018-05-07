package com.ut.lulyfan.studyproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ut.lulyfan.studyproject.util.AppExecutors;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppExecutors.appExecutors.mainThread().execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
    }
}
