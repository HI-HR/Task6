package com.example.task6;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class Vp2 extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager2 mVp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vp2);
        initView();
        ArrayList<FragmentInterface> mFragments= new ArrayList<>();
        mFragments.add(new FragmentInterface() {
            @Override
            public Fragment back() {
                return new FirstFragment();
            }
        });

        mFragments.add(new FragmentInterface() {
            @Override
            public Fragment back() {
                return new SecondFragment();
            }
        });
        mFragments.add(new FragmentInterface() {
            @Override
            public Fragment back() {
                return new ThirdFragment();
            }
        });

        mVp2.setAdapter(new Vp2Adapter(this,mFragments));

        new TabLayoutMediator(mTabLayout, mVp2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if (position==0){
                    tab.setText("聊天");
                }
                else if (position==1){
                    tab.setText("图片");
                }else {
                    tab.setText("CQUPT");
                }
            }
        }).attach();



    }

    private void initView() {
        mVp2=findViewById(R.id.vp2);
        mTabLayout=findViewById(R.id.tab_tablayout);
    }
}