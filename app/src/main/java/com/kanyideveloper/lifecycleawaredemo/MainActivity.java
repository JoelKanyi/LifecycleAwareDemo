package com.kanyideveloper.lifecycleawaredemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


//LifecycleOwner
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "onCreate: Owner onCreate");
        setContentView(R.layout.activity_main);

        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onStart() {

        Log.i(TAG, "onStart: Owner onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "onResume: Owner onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause: Owner onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {

        Log.i(TAG, "onDestroy: Owner onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onStop() {

        Log.i(TAG, "onStop: Owner onStop");
        super.onStop();
    }
}