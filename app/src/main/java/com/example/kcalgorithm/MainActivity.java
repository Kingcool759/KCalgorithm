package com.example.kcalgorithm;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("sss","==>>onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("sss","==>>onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("sss","==>>onDestroy");
    }
}