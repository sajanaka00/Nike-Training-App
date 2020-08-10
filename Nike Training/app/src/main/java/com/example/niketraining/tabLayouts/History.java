package com.example.niketraining.tabLayouts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.niketraining.fragments.SelectFragment;
import com.example.niketraining.listAdapters.ListAdapterHistory;
import com.example.niketraining.listData.ListData_1imgView_2textViews;
import com.example.niketraining.R;

public class History extends Fragment implements View.OnClickListener {
    public static final String TAG = History.class.getSimpleName();

    private RecyclerView recyclerView;
    private ListAdapterHistory adapter;
    private View view;
    private RelativeLayout ntcLayout;

    ListData_1imgView_2textViews[] listDatum3args = new ListData_1imgView_2textViews[] {
            new ListData_1imgView_2textViews("Runner Cool Down", "Fri, 19 Apr \t  1:15", R.drawable.history),
    };

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tab_history, container, false);

        ntcLayout = view.findViewById(R.id.ntcLayout);
        recyclerView = view.findViewById(R.id.recyclerViewH);
        adapter = new ListAdapterHistory(listDatum3args);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        ntcLayout.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ntcLayout :

                SelectFragment selectFragment = SelectFragment.newInstance();
                FragmentTransaction ft = (getActivity().getSupportFragmentManager().beginTransaction());
                ft.addToBackStack(History.TAG);
                ft.replace(R.id.container, selectFragment, SelectFragment.TAG).commit();

                break;
        }
    }
}