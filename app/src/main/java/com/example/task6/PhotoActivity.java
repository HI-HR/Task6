package com.example.task6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PhotoActivity extends AppCompatActivity {
    private ImageView mImage;
    private TextView mTitle;
    private TextView mContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        initView();
        initEvent();
    }

    private void initEvent() {
        Intent intent = getIntent();
        mImage.setImageResource(intent.getIntExtra("img",0));
        mTitle.setText(intent.getStringExtra("title"));
        mContent.setText(intent.getStringExtra("content"));
    }

    private void initView() {
        mImage=findViewById(R.id.siv_item_image);
        mTitle=findViewById(R.id.tv_title);
        mContent=findViewById(R.id.tv_content);

    }
}