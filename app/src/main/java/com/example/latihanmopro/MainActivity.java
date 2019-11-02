package com.example.latihanmopro;



import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.latihanmopro.Helper.LocaleHelper;

import java.util.ArrayList;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity{

    RecyclerView rvCategory;
    private ArrayList<Product> list, list2;
    TextView tvNama, tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(ProductData.getListData());
        list2 = new ArrayList<>();
        list2.addAll(ProductData.getListData2());


//        tvNama = findViewById(R.id.tv_item_name);
//        tvDesc = findViewById(R.id.tv_item_desc);
//        Paper.init(this);
//         String language = Paper.book().read("language");
//         updateView((String)Paper.book().read("language"));


        showRecyclerList();
    }
    public void updateView(String language) {
        Context context = LocaleHelper.setLocale(this , language);
        Resources resource = context.getResources();
//        tvNama.setText(resource.getString(R.string.nama_produk));
//        tvDesc.setText(resource.getString(R.string.deskripsi_produk));

    }
    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager (this));
        ListProductAdapter listProductAdapter = new ListProductAdapter(this);
        listProductAdapter.setListProduct(list);
        rvCategory.setAdapter(listProductAdapter);
    }

    private void showRecyclerList2(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListProductAdapter listProductAdapter = new ListProductAdapter(this);
        listProductAdapter.setListProduct(list2);
        rvCategory.setAdapter(listProductAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile:
                Intent i = new Intent (MainActivity.this, ProfileActivity.class);
                startActivity(i);
                break;

            case R.id.change_language:
                showRecyclerList2();
                break;

            case R.id.eng:
                showRecyclerList();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase,"in"));
    }
}
