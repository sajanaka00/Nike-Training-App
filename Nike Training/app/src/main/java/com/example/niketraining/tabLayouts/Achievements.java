package com.example.niketraining.tabLayouts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.niketraining.R;
import com.example.niketraining.listAdapters.AchievementsAdapter;
import com.example.niketraining.models.BusModel;

import java.util.ArrayList;

public class Achievements extends Fragment {

    private ArrayList<BusModel> busModels = new ArrayList<>();
    private AchievementsAdapter achievementsAdapter;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_achievements, container, false);

        setData();

        achievementsAdapter = new AchievementsAdapter(getActivity(),busModels);
        recyclerView = view.findViewById(R.id.achievementsRecycleView);
        recyclerView.setAdapter(achievementsAdapter);
        return view;
    }

    private void setData(){
        BusModel busModel1 = new BusModel();
        busModel1.setBusType("Super Luxury");
        busModel1.setRootName("Route : ex 100");
        busModel1.setDate("2020-10-12");

        BusModel busModel2 = new BusModel();
        busModel2.setBusType("Luxury");
        busModel2.setRootName("Route : ex 7876");
        busModel2.setDate("2020-07-02");

        BusModel busModel3 = new BusModel();
        busModel3.setBusType("Super Luxury");
        busModel3.setRootName("Route : ex 7654");
        busModel3.setDate("2020-11-22");

        busModels.add(busModel1);
        busModels.add(busModel2);
        busModels.add(busModel3);
    }
}