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
import com.example.niketraining.listData.ListData_3args;

public class ForYou extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapterF adapter;
    private View view;

    ListData_3args[] listData3 = new ListData_3args[] {
            new ListData_3args("30 min, Beginner", R.drawable.for_you_1,"Go, Rest, Repeat"),
            new ListData_3args("15 min, Intermediate", R.drawable.for_you_2,"Quick-Hit Abs"),
            new ListData_3args("15 min, Beginner", R.drawable.for_you_3,"Extend Your Range"),
            new ListData_3args("23 min, Beginner", R.drawable.for_you_4,"Essential Strength Yoga"),
            new ListData_3args("15 min, Intermediate", R.drawable.for_you_5,"The Quick Quarter"),
    };

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.tab_for_you, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewF);
        adapter = new ListAdapterF(listData3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
