package com.example.fragmentlifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate called");

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragment_container_view, MyFragment.class, null)
                    .commit();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.d(TAG, "onSaveInstanceState called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy called");
    }
}