package com.androidakbar.dz_4_2_2_and;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Sample> listSamples;
    private SampleAdapter sampleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar appToolbar = findViewById(R.id.app_toolbar);
        appToolbar.setTitle(R.string.name_dz);
        appToolbar.setTitleTextColor(getResources().getColor(R.color.colorPrimaryText));

        listSamples = new ArrayList<>();
        setSamples();

        sampleAdapter = new SampleAdapter(this, listSamples);

        ListView lstView = findViewById(R.id.lv_container);

        lstView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Sample sample = sampleAdapter.getItem(i);
                Toast.makeText(MainActivity.this, "Title: " + sample.getTitle() + "  Category: " + sample.getCategory(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        lstView.setAdapter(sampleAdapter);

    }

    private void setSamples() {

        listSamples.add(new Sample(getResources().getString(R.string.title_dz_1_1_1), getResources().getString(R.string.category_dz_1_1), getResources().getDrawable(R.mipmap.ic_app_1_1_1), false));
        listSamples.add(new Sample(getResources().getString(R.string.title_dz_1_1_2), getResources().getString(R.string.category_dz_1_1), getResources().getDrawable(R.mipmap.ic_app_1_1_2), false));

        listSamples.add(new Sample(getResources().getString(R.string.title_dz_1_2_1), getResources().getString(R.string.category_dz_1_2), getResources().getDrawable(R.mipmap.ic_app_1_2_1), false));
        listSamples.add(new Sample(getResources().getString(R.string.title_dz_1_2_2), getResources().getString(R.string.category_dz_1_2), getResources().getDrawable(R.mipmap.ic_app_1_2_2), false));

        listSamples.add(new Sample(getResources().getString(R.string.title_dz_1_3_1), getResources().getString(R.string.category_dz_1_3), getResources().getDrawable(R.mipmap.ic_app_1_3_1), false));

        listSamples.add(new Sample(getResources().getString(R.string.title_dz_2_1_1), getResources().getString(R.string.category_dz_2_1), getResources().getDrawable(R.mipmap.ic_app_2_1_1), false));
        listSamples.add(new Sample(getResources().getString(R.string.title_dz_2_1_2), getResources().getString(R.string.category_dz_2_1), getResources().getDrawable(R.mipmap.ic_app_2_1_2), false));
        listSamples.add(new Sample(getResources().getString(R.string.title_dz_2_1_3), getResources().getString(R.string.category_dz_2_1), getResources().getDrawable(R.mipmap.ic_app_2_1_3), false));

        listSamples.add(new Sample(getResources().getString(R.string.title_dz_2_2_1), getResources().getString(R.string.category_dz_2_2), getResources().getDrawable(R.mipmap.ic_app_2_2_1), false));
        listSamples.add(new Sample(getResources().getString(R.string.title_dz_2_2_2), getResources().getString(R.string.category_dz_2_2), getResources().getDrawable(R.mipmap.ic_app_2_2_2), false));

        listSamples.add(new Sample(getResources().getString(R.string.title_dz_3_1_1), getResources().getString(R.string.category_dz_3_1), getResources().getDrawable(R.mipmap.ic_app_3_1_1), false));
        listSamples.add(new Sample(getResources().getString(R.string.title_dz_3_1_2), getResources().getString(R.string.category_dz_3_1), getResources().getDrawable(R.mipmap.ic_app_3_1_2), false));

        listSamples.add(new Sample(getResources().getString(R.string.title_dz_3_2_1), getResources().getString(R.string.category_dz_3_2), getResources().getDrawable(R.mipmap.ic_app_3_2_1), false));
        listSamples.add(new Sample(getResources().getString(R.string.title_dz_3_2_2), getResources().getString(R.string.category_dz_3_2), getResources().getDrawable(R.mipmap.ic_app_3_2_2), false));

        listSamples.add(new Sample(getResources().getString(R.string.title_dz_3_3_1), getResources().getString(R.string.category_dz_3_3), getResources().getDrawable(R.mipmap.ic_app_3_3_1), false));
        listSamples.add(new Sample(getResources().getString(R.string.title_dz_3_3_2), getResources().getString(R.string.category_dz_3_3), getResources().getDrawable(R.mipmap.ic_app_3_3_2), false));

        listSamples.add(new Sample(getResources().getString(R.string.title_dz_3_4_1), getResources().getString(R.string.category_dz_3_4), getResources().getDrawable(R.mipmap.ic_app_3_4_1), false));
        listSamples.add(new Sample(getResources().getString(R.string.title_dz_3_4_2), getResources().getString(R.string.category_dz_3_4), getResources().getDrawable(R.mipmap.ic_app_3_4_2), false));

        listSamples.add(new Sample(getResources().getString(R.string.title_dz_4_1_1), getResources().getString(R.string.category_dz_4_1), getResources().getDrawable(R.mipmap.ic_app_4_1_1), false));
        listSamples.add(new Sample(getResources().getString(R.string.title_dz_4_1_2), getResources().getString(R.string.category_dz_4_1), getResources().getDrawable(R.mipmap.ic_app_4_1_2), false));

        listSamples.add(new Sample(getResources().getString(R.string.title_dz_4_2_1), getResources().getString(R.string.category_dz_4_2), getResources().getDrawable(R.mipmap.ic_app_4_2_1), false));
        listSamples.add(new Sample(getResources().getString(R.string.title_dz_4_2_2), getResources().getString(R.string.category_dz_4_2), getResources().getDrawable(R.mipmap.ic_app_4_2_2), false));
    }

}