package com.example.niketraining.tabLayouts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.R;
import com.example.niketraining.listAdapters.ListAdapterC;
import com.example.niketraining.listData.ListData_3args;

public class Collections extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapterC adapter;
    private View view;

    ListData_3args[] listData3 = new ListData_3args[] {
            new ListData_3args("12 Workouts, All levels", R.drawable.collection_1,"Best of Abs, Arms and Glutes"),
            new ListData_3args("8 Workouts, All levels", R.drawable.collection_2,"Get Leaner Strong Abs"),
            new ListData_3args("6 Workouts, All levels", R.drawable.collection_3,"Get Strong to Get Toned"),
    };

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.tab_collections, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewC);
        adapter = new ListAdapterC(listData3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);

        return view;
    }

}
