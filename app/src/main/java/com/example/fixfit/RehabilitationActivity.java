package com.example.fixfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fixfit.Adapter.WorkoutAdapter;
import com.example.fixfit.Model.WorkoutModel;

import java.util.ArrayList;

public class RehabilitationActivity extends AppCompatActivity{

    private RecyclerView waist_recyclerview;
    private RecyclerView knee_recyclerview;
    private RecyclerView.LayoutManager layoutManager;

    ArrayList<WorkoutModel> waistList = new ArrayList<>();
    ArrayList<WorkoutModel> kneeList = new ArrayList<>();
    ArrayList<Integer> waistCodeList = new ArrayList<>();
    ArrayList<Integer> kneeCodeList = new ArrayList<>();

    int[] waist_img = {R.drawable.waist_1, R.drawable.waist_2, R.drawable.waist_3};
    String[] waist_txt = {"등 들어올리기", "지면 누르기", "상체 일으키기"};

    int[] knee_img = {R.drawable.knee_1};
    String[] knee_txt = {"앉아서 다리펴기"};

    WorkoutAdapter waist_adapter;
    WorkoutAdapter knee_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rehabilitation);

        waist_recyclerview = (RecyclerView) findViewById(R.id.waist_recyclerview);
        waist_recyclerview.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        waist_recyclerview.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)); // 가로

        knee_recyclerview = (RecyclerView) findViewById(R.id.knee_recyclerview);
        knee_recyclerview.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        knee_recyclerview.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)); // 가로


        for (int i = 0; i < waist_img.length; i++) {
            waistList.add(new WorkoutModel(waist_img[i], waist_txt[i]));
            waistCodeList.add(1000 + i);
        }
        waist_adapter = new WorkoutAdapter(waistList, waistCodeList);
        waist_recyclerview.setAdapter(waist_adapter);

        for (int i = 0; i < knee_img.length; i++) {
            kneeList.add(new WorkoutModel(knee_img[i], knee_txt[i]));
            kneeCodeList.add(2000 + i);
        }
        knee_adapter = new WorkoutAdapter(kneeList, kneeCodeList);
        knee_recyclerview.setAdapter(knee_adapter);
    }
}