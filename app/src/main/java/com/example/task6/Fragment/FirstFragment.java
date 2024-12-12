package com.example.task6.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task6.Adapter.RvAdapter;
import com.example.task6.Data;
import com.example.task6.R;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private RecyclerView mRv;
    private ArrayList<Data> mList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        initView(view);
        initData();
        mRv.setAdapter(new RvAdapter(mList));
        mRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
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
        mList.add(new Data("2024红岩网校移动开发","24-软工-HHR:[动画表情]",R.drawable.image1));
    }

    private void initView(View view) {
        mRv=view.findViewById(R.id.rv1);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
