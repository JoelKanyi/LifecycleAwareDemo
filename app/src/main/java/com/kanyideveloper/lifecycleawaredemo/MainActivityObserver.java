package com.kanyideveloper.lifecycleawaredemo;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

//Lifecycle Observer
public class MainActivityObserver implements LifecycleObserver {

    private static final String TAG = "MainActivityObserver";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateObserver(){
        Log.i(TAG, "onCreateObserver: Observer onCreate");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartObserver(){
        Log.i(TAG, "onStartObserver: Observer onStart");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResumeObserver(){
        Log.i(TAG, "onResumeObserver: Observer onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPauseObserver(){
        Log.i(TAG, "onPauseObserver: Observer onPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroyObserver(){
        Log.i(TAG, "onDestroyObserver: Observer onDestroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopObserver(){
        Log.i(TAG, "onStopObserver: Observer onStop");
    }
}
