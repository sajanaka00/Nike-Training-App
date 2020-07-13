package com.example.niketraining.tabLayouts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.niketraining.listAdapters.ListAdapterH;
import com.example.niketraining.listData.ListData_3args;
import com.example.niketraining.R;

public class History extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapterH adapter;
    private View view;

    ListData_3args[] listDatum3args = new ListData_3args[] {
            new ListData_3args("Fri, 19 Apr \t  1:15", R.drawable.history, "Runner Cool Down"),
    };

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.tab_history, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewH);
        adapter = new ListAdapterH(listDatum3args);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}