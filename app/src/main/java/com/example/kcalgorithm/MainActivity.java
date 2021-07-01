package com.example.kcalgorithm;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("更改Ui");
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("sss","==>>onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("sss","==>>onResume");
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

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("sss","==>>onNewIntent");
    }
}