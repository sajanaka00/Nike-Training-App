package com.example.niketraining.tabLayouts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.listData.ListData_2args;
import com.example.niketraining.R;
import com.example.niketraining.listAdapters.ListAdapterB;

public class Browse extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapterB adapter;
    private View view;

    ListData_2args[] listData2 = new ListData_2args[] {
            new ListData_2args(R.drawable.browse_1, "Muscle Group"),
            new ListData_2args(R.drawable.browse_2,"Workout Focus"),
            new ListData_2args(R.drawable.browse_3,"Equipment"),
    };

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.tab_browse, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewB);
        adapter = new ListAdapterB(listData2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
