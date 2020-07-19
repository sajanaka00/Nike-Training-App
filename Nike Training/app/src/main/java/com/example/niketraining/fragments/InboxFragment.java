package com.example.niketraining.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.niketraining.R;
import com.example.niketraining.listAdapters.ListAdapterI;
import com.example.niketraining.listData.ListData_3args_noImg;

public class InboxFragment extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapterI adapter;
    private View view;

    ListData_3args_noImg[] listData3 = new ListData_3args_noImg[] {
            new ListData_3args_noImg("JANE MCLEAN","accepted your friend request","1m ago"),
            new ListData_3args_noImg("KELLY ROWENA","commented on your post","5m ago"),
            new ListData_3args_noImg("CLAUDIA BROOK","cheered your post","2d ago"),
            new ListData_3args_noImg("KELLY ROWENA","accepted your friend request","2d ago"),
    };

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_inbox, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewI);
        adapter = new ListAdapterI(listData3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

        return view;
    }
}