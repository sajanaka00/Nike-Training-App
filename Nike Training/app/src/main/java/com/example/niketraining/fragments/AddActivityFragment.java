package com.example.niketraining.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.niketraining.R;
import com.example.niketraining.TabAdapter;
import com.example.niketraining.listAdapters.ListAdapterAddActivity;
import com.example.niketraining.listAdapters.ListAdapterInbox;
import com.example.niketraining.listData.ListData_2textViews;
import com.example.niketraining.listData.ListData_3textViews;
import com.example.niketraining.tabLayouts.Contacts;
import com.example.niketraining.tabLayouts.Suggestions;
import com.google.android.material.tabs.TabLayout;

public class AddActivityFragment extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapterAddActivity adapter;

    ImageView imageView;

    ListData_2textViews[] listData2 = new ListData_2textViews[] {
            new ListData_2textViews("Activity Type","Select"),
            new ListData_2textViews("Date","Today / 05:56"),
            new ListData_2textViews("Duration","30:00"),
    };

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_activity, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewAddActivity);
        adapter = new ListAdapterAddActivity(listData2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

        imageView = view.findViewById(R.id.close);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainerAddActivity, new ActivityFragment());
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}