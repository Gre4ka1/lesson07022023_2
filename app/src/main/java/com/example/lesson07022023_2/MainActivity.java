package com.example.lesson07022023_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lesson07022023_2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }
}