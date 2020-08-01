package com.example.niketraining.tabLayouts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.R;
import com.example.niketraining.listAdapters.ListAdapterF;
import com.example.niketraining.listData.ListData_1imgView_2textViews;

public class ForYou extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;

    private ListAdapterF adapter;
    private ListAdapterF adapter2;

    private View view;

    //recyclerView 1
    ListData_1imgView_2textViews[] listData3 = new ListData_1imgView_2textViews[] {
            new ListData_1imgView_2textViews("Go, Rest, Repeat","30 min, Beginner",R.drawable.for_you_1),
            new ListData_1imgView_2textViews("Quick-Hit Abs","15 min, Intermediate",R.drawable.for_you_2),
            new ListData_1imgView_2textViews("Extend Your Range","15 min, Beginner",R.drawable.for_you_3),
            new ListData_1imgView_2textViews("Essential Strength Yoga","23 min, Beginner",R.drawable.for_you_4),
            new ListData_1imgView_2textViews("The Quick Quarter","15 min, Intermediate",R.drawable.for_you_5),
    };

    //recyclerView 2
    ListData_1imgView_2textViews[] listData3_2 = new ListData_1imgView_2textViews[] {
            new ListData_1imgView_2textViews("Athlete Agility","29 min, Intermediate",R.drawable.for_you_6),
            new ListData_1imgView_2textViews("Wake-Up Warm-Up","11 min, Beginner",R.drawable.for_you_7),
            new ListData_1imgView_2textViews("Sunset Stretch","11 min, Beginner",R.drawable.for_you_8),
            new ListData_1imgView_2textViews("Strong Core & Cardio","30 min, Intermediate",R.drawable.for_you_9),
            new ListData_1imgView_2textViews("Cardio Kick","20 min, Beginner",R.drawable.for_you_10),
    };

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.tab_for_you, container, false);

        //recyclerView 1
        recyclerView = view.findViewById(R.id.recyclerViewF);
        adapter = new ListAdapterF(listData3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);

        //recyclerView 2
        recyclerView2 = view.findViewById(R.id.recyclerViewF2);
        adapter2 = new ListAdapterF(listData3_2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setAdapter(adapter2);

        return view;
    }
}