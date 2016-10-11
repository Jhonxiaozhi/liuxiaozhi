package com.oneofive.ui.activity;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.alibaba.fastjson.JSONObject;
import com.oneofive.R;
import com.oneofive.api.Resource;
import com.oneofive.ui.adapter.MainPagerAdapter;
import com.oneofive.ui.adapter.ProductsAdapter;
import com.oneofive.ui.fragment.ProductsFragment;


public class MainActivity extends AppCompatActivity {
    private Button btnTest;
    private ProductsFragment productFragment=new ProductsFragment();
    private ProductsFragment productFragment1=new ProductsFragment();
    private ProductsFragment productFragment2=new ProductsFragment();
    private ProductsFragment productFragment3=new ProductsFragment();
    private Fragment[] fragments = new Fragment[]{productFragment, productFragment1, productFragment2,
            productFragment3};
     private  ViewPager viewPager;
    MainPagerAdapter mainPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_content);
//        initView();
        setupViewPager(0);
    }

    private void initFragment() {
    }
    private void setupViewPager(int toPage) {
        viewPager = (ViewPager) findViewById(R.id.mainContentViewPager);
        viewPager.setOffscreenPageLimit(3);
        mainPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        mainPagerAdapter.setFragments(fragments);
        viewPager.setAdapter(mainPagerAdapter);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
//                imgBtns[position].setImageResource(btnPressedImg[position]);
//                imgBtns[recordedPosition].setImageResource(btnIdleImg[recordedPosition]);
//                recordedPosition = position;
//                invalidCustomMenu(position);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
        if(toPage != -1)
            viewPager.setCurrentItem(toPage, true);
    }
    private void initView() {
//      final   Resource resource=new Resource("A6926404156020","BC17D013-CAAD-FA3C-BAF6-99F39B496BB5","");
//        btnTest =(Button)findViewById(R.id.button);
//        btnTest.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        JSONObject property = new JSONObject();
//                        property.put("username", "apicloud");
//                        property.put("password", "apicloud");
//                        property.put("email", "apicloud@id.apicloud.com");
//
//                        JSONObject json = resource.createUser(property);
//                        Log.e("MainActivity",json.toString());
//                    }
//                }).start();
//            }
//        });
    }
}
