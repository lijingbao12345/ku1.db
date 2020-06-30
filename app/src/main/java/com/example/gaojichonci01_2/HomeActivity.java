package com.example.gaojichonci01_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import adapter.VpAdapter;
import fragment.HomeFragment;
import fragment.MyFragment;

public class HomeActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager vp;
    private TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        initToolbar();
        initTab();
    }

    private void initTab() {
        final ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new MyFragment());
        tab.setupWithViewPager(vp);
        final VpAdapter vpAdapter = new VpAdapter(getSupportFragmentManager(), fragments);
        vp.setAdapter(vpAdapter);
        tab.getTabAt(0).setText("首页");
        tab.getTabAt(1).setText("我的");
    }

    private void initToolbar() {
        setSupportActionBar(toolbar);
        toolbar.setTitle("标题");
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        vp = (ViewPager) findViewById(R.id.vp);
        tab = (TabLayout) findViewById(R.id.tab);
    }
}
