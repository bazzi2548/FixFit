package com.example.fixfit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragHome extends Fragment {
    ImageButton btn1, btn2, btn3, btn4;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_home, container, false);
        btn1 = (ImageButton) view.findViewById(R.id.btn1);
        btn2 = (ImageButton) view.findViewById(R.id.btn2);
        btn3 = (ImageButton) view.findViewById(R.id.btn3);
        btn4 = (ImageButton) view.findViewById(R.id.btn4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 액티비티 나오게 하셔야해욥
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 액티비티 나오게 하셔야해욥
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 액티비티 나오게 하셔야해욥
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 액티비티 나오게 하셔야해욥
            }
        });


        return view;
    }
}
