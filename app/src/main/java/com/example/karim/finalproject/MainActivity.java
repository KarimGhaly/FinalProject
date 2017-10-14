package com.example.karim.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainACtivityTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_pay);
        Toast.makeText(this, "Karim", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate: Edel Torres");
        Log.d(TAG, "onCreate: Zack Robinson");
    }
}
