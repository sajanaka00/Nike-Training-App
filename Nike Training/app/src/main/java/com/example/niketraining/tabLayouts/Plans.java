package com.example.niketraining.tabLayouts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.niketraining.listAdapters.ListAdapterP;
import com.example.niketraining.listData.ListData_3args;
import com.example.niketraining.R;

public class Plans extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapterP adapter;
    private View view;

    ListData_3args[] listData3 = new ListData_3args[] {
            new ListData_3args("Kick it off with four weeks of guided, well-balanced workouts to get you fit.", R.drawable.plan_1,"START UP"),
            new ListData_3args("Get lean and fit over six weeks with a balanced plan that builds endurance.", R.drawable.plan_2,"LEAN FIT"),
            new ListData_3args("Push your strength and improve muscle tone over four weeks-all without weights.", R.drawable.plan_3,"BODYWEIGHT ONLY "),
            new ListData_3args("Build full-body strength with a focus on weight training over 8 weeks.", R.drawable.plan_4,"GYM STRONG"),
    };

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.tab_plans, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewP);
        adapter = new ListAdapterP(listData3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}