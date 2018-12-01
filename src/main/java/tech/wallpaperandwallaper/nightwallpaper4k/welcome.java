package tech.wallpaperandwallaper.nightwallpaper4k;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import tech.wallpaperandwallaper.nightwallpaper4k.adapter.recycler_image_adapter;

import static tech.wallpaperandwallaper.nightwallpaper4k.databases.db.getImageArrayList;

public class welcome extends Activity {
    RecyclerView myRecycler;

    @Override
    protected void onCreate( Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        initView();
        initAdapter();

    }

    private void initAdapter() {

         recycler_image_adapter adapter = new recycler_image_adapter(this ,getImageArrayList());
        myRecycler.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        myRecycler.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));
        myRecycler.setItemAnimator(new DefaultItemAnimator());
        myRecycler.setLayoutManager(new GridLayoutManager(this,2 ));

        myRecycler.setAdapter(adapter);

//        myRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

    }

    private void initView() {

    myRecycler = (RecyclerView) findViewById(R.id.recycler);
    }

}
