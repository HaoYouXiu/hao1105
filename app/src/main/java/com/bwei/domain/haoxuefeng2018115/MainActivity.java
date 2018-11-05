package com.bwei.domain.haoxuefeng2018115;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取boolar对象
        mToolbar = findViewById(R.id.toolbar);

        //一定要写在第一行
        setSupportActionBar(mToolbar);

        //设置是否显示主题
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        //设置标题
        getSupportActionBar().setTitle("title");
        mToolbar.setTitleTextColor(Color.BLUE);
        //设置子标题极其颜色
        mToolbar.setSubtitle("课时作业");
        mToolbar.setSubtitleTextColor(Color.BLUE);
        //设置是否显示左侧按钮
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //初始化加菜单menu添中
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //每次显示都调用
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    //菜单被选中的时候调用
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    //关闭时调用
    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
    }
    //打开调用
    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }
}
