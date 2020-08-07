package com.example.niketraining.tabLayouts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.listData.ListData_1imgView_1textView;
import com.example.niketraining.R;
import com.example.niketraining.listAdapters.ListAdapterBrowse;

public class Browse extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapterBrowse adapter;
    private View view;

    ListData_1imgView_1textView[] listData2 = new ListData_1imgView_1textView[] {
            new ListData_1imgView_1textView("Muscle Group", R.drawable.browse_1),
            new ListData_1imgView_1textView("Workout Focus", R.drawable.browse_2),
            new ListData_1imgView_1textView("Equipment", R.drawable.browse_3),
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
        adapter = new ListAdapterBrowse(listData2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
