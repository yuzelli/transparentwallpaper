package com.example.yuzelli.transparentwallpaper.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.yuzelli.transparentwallpaper.R;
import com.example.yuzelli.transparentwallpaper.base.BaseActivity;
import com.example.yuzelli.transparentwallpaper.bean.MVBean;

import java.util.ArrayList;
import java.util.List;

public class WallListActivity extends BaseActivity {
    private ListView lv_yuansheng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wall_list);
        initView();
    }

    private void initView() {
        List<MVBean> mvLists = new ArrayList<>();
        mvLists.add(new MVBean("告白气球","gaobaiqiqiu.mp4",R.drawable.ic_gaobaiqiqiu));
        mvLists.add(new MVBean("玉生烟","yushengyan.mp4",R.drawable.ic_yushengyan));
        mvLists.add(new MVBean("听妈妈的话","yushengyan.mp4",R.drawable.ic_yushengyan));
        lv_yuansheng  = (ListView) this.findViewById(R.id.lv_yuansheng);

    }
}
