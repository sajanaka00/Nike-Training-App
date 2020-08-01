package com.example.niketraining.tabLayouts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.R;
import com.example.niketraining.listAdapters.ListAdapterContacts;
import com.example.niketraining.listAdapters.ListAdapterContacts2;
import com.example.niketraining.listData.ListData_1imgView_2textViews;
import com.example.niketraining.listData.ListData_2imgViews_1textView;

public class Contacts extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;

    private ListAdapterContacts adapter;
    private ListAdapterContacts2 adapter2;

    private View view;

    ListData_2imgViews_1textView[] listData_2imgViews_1textViews = new ListData_2imgViews_1textView[] {
            new ListData_2imgViews_1textView(R.drawable.user_img, "Jane Mclean", R.drawable.vector_add),
            new ListData_2imgViews_1textView(R.drawable.user_img, "Kelly Rowena", R.drawable.vector_add),
    };

    ListData_1imgView_2textViews[] listData_1imgView_2textViews = new ListData_1imgView_2textViews[] {
            new ListData_1imgView_2textViews("Claudia Brook", "claudia@gmail.com", R.drawable.user_img),
            new ListData_1imgView_2textViews("Claudia Brook", "claudia123@gmail.com", R.drawable.user_img),
            new ListData_1imgView_2textViews("Jane Mclean", "janemc@yahoo.com", R.drawable.user_img),
    };

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.tab_contacts, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewContacts);
        adapter = new ListAdapterContacts(listData_2imgViews_1textViews);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        recyclerView2 = view.findViewById(R.id.recyclerViewContacts2);
        adapter2 = new ListAdapterContacts2(listData_1imgView_2textViews);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView2.setAdapter(adapter2);

        return view;
    }
}