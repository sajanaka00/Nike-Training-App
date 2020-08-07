package com.example.niketraining.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.niketraining.R;
import com.example.niketraining.listAdapters.ListAdapterInbox;
import com.example.niketraining.listData.ListData_3textViews;

public class InboxFragment extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapterInbox adapter;
    private View view;

    ListData_3textViews[] listData3 = new ListData_3textViews[] {
            new ListData_3textViews("JANE MCLEAN","accepted your friend request","1m ago"),
            new ListData_3textViews("KELLY ROWENA","commented on your post","5m ago"),
            new ListData_3textViews("CLAUDIA BROOK","cheered your post","2d ago"),
            new ListData_3textViews("KELLY ROWENA","accepted your friend request","2d ago"),
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
        adapter = new ListAdapterInbox(listData3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

        return view;
    }
}