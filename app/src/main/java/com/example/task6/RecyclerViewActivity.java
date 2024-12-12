package com.example.task6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task6.Adapter.RvAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRv;
    private List<Data> mList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initData();
        initView();
        initEvent();
    }

    private void initEvent() {
        mRv.setAdapter(new RvAdapter(mList));
        mRv.setLayoutManager(new LinearLayoutManager(RecyclerViewActivity.this));
        //mRv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
    }

    private void initData() {
        mList = new ArrayList<>();
        mList.add(new Data("2024红岩网校移动开发","24-软工-HHR:[动画表情]",R.drawable.image1));
        mList.add(new Data("美丽浪漫岛","HHR:[动画表情]",R.drawable.image2));
        mList.add(new Data("CQUPT","HHR:[动画表情]",R.drawable.image3));
        mList.add(new Data("2024红岩网校移动开发","24-软工-HHR:[动画表情]",R.drawable.image1));
        mList.add(new Data("美丽浪漫岛","HHR:[动画表情]",R.drawable.image2));
        mList.add(new Data("CQUPT","HHR:[动画表情]",R.drawable.image3));
        mList.add(new Data("2024红岩网校移动开发","24-软工-HHR:[动画表情]",R.drawable.image1));
        mList.add(new Data("美丽浪漫岛","HHR:[动画表情]",R.drawable.image2));
        mList.add(new Data("CQUPT","HHR:[动画表情]",R.drawable.image3));
        mList.add(new Data("2024红岩网校移动开发","24-软工-HHR:[动画表情]",R.drawable.image1));
        mList.add(new Data("美丽浪漫岛","HHR:[动画表情]",R.drawable.image2));
        mList.add(new Data("CQUPT","HHR:[动画表情]",R.drawable.image3));
        mList.add(new Data("2024红岩网校移动开发","24-软工-HHR:[动画表情]",R.drawable.image1));
        mList.add(new Data("2024红岩网校移动开发","24-软工-HHR:[动画表情]",R.drawable.image1));
        mList.add(new Data("美丽浪漫岛","HHR:[动画表情]",R.drawable.image2));
        mList.add(new Data("CQUPT","HHR:[动画表情]",R.drawable.image3));
        mList.add(new Data("2024红岩网校移动开发","24-软工-HHR:[动画表情]",R.drawable.image1));
        mList.add(new Data("美丽浪漫岛","HHR:[动画表情]",R.drawable.image2));
        mList.add(new Data("CQUPT","HHR:[动画表情]",R.drawable.image3));
        mList.add(new Data("2024红岩网校移动开发","24-软工-HHR:[动画表情]",R.drawable.image1));
        mList.add(new Data("美丽浪漫岛","HHR:[动画表情]",R.drawable.image2));
        mList.add(new Data("CQUPT","HHR:[动画表情]",R.drawable.image3));
        mList.add(new Data("2024红岩网校移动开发","24-软工-HHR:[动画表情]",R.drawable.image1));
        mList.add(new Data("美丽浪漫岛","HHR:[动画表情]",R.drawable.image2));
        mList.add(new Data("CQUPT","HHR:[动画表情]",R.drawable.image3));
    }

    private void initView() {
        mRv = findViewById(R.id.rv);

    }
}