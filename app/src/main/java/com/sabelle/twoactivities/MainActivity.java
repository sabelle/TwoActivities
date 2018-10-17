package com.sabelle.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle; //importing Intent
import android.view.View;
import android.widget.Button;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("data", "real data");
                startActivity(intent);
            }
        });
        Timber.plant(new Timber.DebugTree());
        Timber.d("onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Timber.d("onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Timber.d("onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Timber.d("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Timber.d("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Timber.d("onRestart");
    }
}
