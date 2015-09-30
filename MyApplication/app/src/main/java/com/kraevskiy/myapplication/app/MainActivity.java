package com.kraevskiy.myapplication.app;

import android.app.Activity;
import android.os.Environment;
import android.os.Bundle;
import android.util.Log;

import java.io.File;


public class MainActivity extends Activity {

    public final String STORAGE_TAG = "Storage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File storage = Environment.getDataDirectory();
        Log.d(STORAGE_TAG, storage.getPath());
    }
}
