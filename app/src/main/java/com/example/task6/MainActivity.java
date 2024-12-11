package com.example.task6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button mBtnRecyclerView;
    private Button mBtnVp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }



    private void initEvent() {
        mBtnRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnVp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Vp2.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        mBtnRecyclerView=findViewById(R.id.btn_main_rv);
        mBtnVp2=findViewById(R.id.btn_main_VP2);
    }
}