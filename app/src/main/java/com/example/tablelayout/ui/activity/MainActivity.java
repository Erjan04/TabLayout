package com.example.tablelayout.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.tablelayout.R;
import com.example.tablelayout.ui.adapter.ViewPagerAdapter;
import com.example.tablelayout.ui.fragment.FragmentFirst;
import com.example.tablelayout.ui.fragment.FragmentSwitch;
import com.example.tablelayout.ui.fragment.FragmentTime;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private ViewPagerAdapter adapter;
    private ArrayList<Fragment> list = new ArrayList<>();
    private TabLayout tabLayout;
    private String[] titles = {"EXCHANGE","DATE & TIME","MORE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initId();
        createList();
        initViewPager();

    }
    private void initId() {
        viewPager2 = findViewById(R.id.listVp);
        tabLayout = findViewById(R.id.tabLayout_tb);
    }
    private void createList() {
    list.add(new FragmentFirst());
    list.add(new FragmentSwitch());
    list.add(new FragmentTime());
    }
    private void initViewPager() {
    adapter = new ViewPagerAdapter(this);
    adapter.setFragmentList(list);
    viewPager2.setAdapter(adapter);
    new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
        @Override
        public void onConfigureTab(@NonNull  TabLayout.Tab tab, int position) {
        tab.setText(titles[position]);
        }
    }).attach();
    }




}