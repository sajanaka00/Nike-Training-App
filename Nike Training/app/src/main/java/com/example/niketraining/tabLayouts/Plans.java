package com.example.niketraining.tabLayouts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.niketraining.listAdapters.ListAdapterPlans;
import com.example.niketraining.listData.ListData_1imgView_2textViews;
import com.example.niketraining.R;

import java.util.ArrayList;
import java.util.List;

public class Plans extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapterPlans adapter;
    private View view;

    List<ListData_1imgView_2textViews> listData3;

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.tab_plans, container, false);

        setData();
        recyclerView = view.findViewById(R.id.recyclerViewP);
//        adapter = new ListAdapterPlans(listData3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void setData(){
        listData3 = new ArrayList<>();

        ListData_1imgView_2textViews object = new ListData_1imgView_2textViews();
        object.setImgId(R.drawable.plan_1);
        object.setDescription("Kick it off with four weeks of guided, well-balanced workouts to get you fit.");
        object.setTitle("Claudia Brook");

        ListData_1imgView_2textViews object1 = new ListData_1imgView_2textViews();
        object1.setImgId(R.drawable.plan_2);
        object1.setDescription("Get lean and fit over six weeks with a balanced plan that builds endurance");
        object1.setTitle("Claudia Brook");

        ListData_1imgView_2textViews object2 = new ListData_1imgView_2textViews();
        object2.setImgId(R.drawable.plan_3);
        object2.setDescription("Push your strength and improve muscle tone over four weeks-all without weights.");
        object2.setTitle("Claudia Brook");

        listData3.add(object);
        listData3.add(object1);
        listData3.add(object2);

    }
}