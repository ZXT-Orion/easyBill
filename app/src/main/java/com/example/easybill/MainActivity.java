package com.example.easybill;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        Fragment homeFragment = new fragment_home();
//        addFragment(homeFragment);

        List<Fragment> fragmentList=new ArrayList<>();
        fragmentList.add(new fragment_home());
        fragmentList.add(new fragment_home());
        fragmentList.add(new fragment_home());

        ViewpagerAdpter viewpagerAdpter= new ViewpagerAdpter(getSupportFragmentManager(),fragmentList);
        ViewPager viewPager =  findViewById(R.id.view_pager);
        viewPager.setAdapter(viewpagerAdpter);
//
//        // 设置按钮点击事件监听器来切换ViewPager页面
//        findViewById(R.id.).setOnClickListener(v -> viewPager.setCurrentItem(0));

    }

//        private void addFragment(Fragment fragment) {
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.home_fragment_container, fragment);
//        transaction.commit();
//    }
}