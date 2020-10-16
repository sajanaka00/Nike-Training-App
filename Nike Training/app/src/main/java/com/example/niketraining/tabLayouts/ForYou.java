package com.example.niketraining.tabLayouts;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.R;
import com.example.niketraining.callback.GridItemClickListener;
import com.example.niketraining.fragments.AddFriendsBtnFragment;
import com.example.niketraining.fragments.ForYouImg1Fragment;
import com.example.niketraining.listAdapters.ListAdapterForYou;
import com.example.niketraining.listData.ListData_1imgView_2textViews;

import java.util.ArrayList;
import java.util.List;

public class ForYou extends Fragment implements GridItemClickListener {

    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private List<ListData_1imgView_2textViews> pickForYou;
    private List<ListData_1imgView_2textViews> newWorkout;
    private ListAdapterForYou adapter;
    private ListAdapterForYou adapter2;
    private View view;


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.tab_for_you, container, false);
        setData();


//        imageView = view.findViewById(R.id.for_you_1);
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.fragmentContainerQuickQuarter, new ForYouImg1Fragment());
//                fragmentTransaction.commit();
//            }
//        });

        return view;
    }

    @Override
    public void onItemClick(Object object) {

        Fragment fragment = new ForYouImg1Fragment();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack(ForYouImg1Fragment.TAG);
        fragmentTransaction.replace(R.id.fragmentContainerWorkout, fragment, ForYouImg1Fragment.TAG);
        fragmentTransaction.commit();

    }

    private void setData(){
        List<ListData_1imgView_2textViews> pickForYou = new ArrayList<>();
        List<ListData_1imgView_2textViews> newWorkout = new ArrayList<>();

        ListData_1imgView_2textViews object1 = new ListData_1imgView_2textViews();
        object1.setDescription("Go, Rest, Repeat,30 min, Beginner");
        object1.setImgId(R.drawable.for_you_1);

        ListData_1imgView_2textViews object2 = new ListData_1imgView_2textViews();
        object2.setDescription("Quick-Hit Abs,15 min, Intermediate");
        object2.setImgId(R.drawable.for_you_2);

        ListData_1imgView_2textViews object3 = new ListData_1imgView_2textViews();
        object3.setDescription("Extend Your Range,15 min, Beginner");
        object3.setImgId(R.drawable.for_you_3);

        ListData_1imgView_2textViews object4 = new ListData_1imgView_2textViews();
        object4.setDescription("Essential Strength Yoga,23 min, Beginner");
        object4.setImgId(R.drawable.for_you_4);

        ListData_1imgView_2textViews object5 = new ListData_1imgView_2textViews();
        object5.setDescription("he Quick Quarter,15 min, Intermediate");
        object5.setImgId(R.drawable.for_you_5);


        ListData_1imgView_2textViews object6 = new ListData_1imgView_2textViews();
        object6.setDescription("Go, Rest, Repeat,30 min, Beginner");
        object6.setImgId(R.drawable.for_you_6);

        ListData_1imgView_2textViews object7 = new ListData_1imgView_2textViews();
        object7.setDescription("Quick-Hit Abs,15 min, Intermediate");
        object7.setImgId(R.drawable.for_you_7);

        ListData_1imgView_2textViews object8 = new ListData_1imgView_2textViews();
        object8.setDescription("Extend Your Range,15 min, Beginner");
        object8.setImgId(R.drawable.for_you_8);

        ListData_1imgView_2textViews object9 = new ListData_1imgView_2textViews();
        object9.setDescription("Essential Strength Yoga,23 min, Beginner");
        object9.setImgId(R.drawable.for_you_9);

        ListData_1imgView_2textViews object10 = new ListData_1imgView_2textViews();
        object10.setDescription("he Quick Quarter,15 min, Intermediate");
        object10.setImgId(R.drawable.for_you_10);

        pickForYou.add(object1);
        pickForYou.add(object2);
        pickForYou.add(object3);
        pickForYou.add(object4);
        pickForYou.add(object5);

        newWorkout.add(object6);
        newWorkout.add(object7);
        newWorkout.add(object8);
        newWorkout.add(object9);
        newWorkout.add(object10);
        // recyclerView 1
        recyclerView = view.findViewById(R.id.recyclerViewF);
        adapter = new ListAdapterForYou(pickForYou, ForYou.this,getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);

        // recyclerView 2
        recyclerView2 = view.findViewById(R.id.recyclerViewF2);
        adapter2 = new ListAdapterForYou(newWorkout,ForYou.this,getActivity());
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setAdapter(adapter2);

    }
}