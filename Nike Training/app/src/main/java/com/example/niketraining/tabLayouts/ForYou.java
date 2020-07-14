package com.example.niketraining.tabLayouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.niketraining.R;
import com.example.niketraining.MainRecyclerAdapter;
import com.example.niketraining.Section;

import java.util.ArrayList;
import java.util.List;

public class ForYou extends Fragment {

    private static final String TAG = "ForYou";
    List<Section> sectionList = new ArrayList<>();
    RecyclerView mainRecyclerView;

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tab_for_you, container, false);

        initData();

        mainRecyclerView = view.findViewById(R.id.mainRecyclerView);
        MainRecyclerAdapter mainRecyclerAdapter = new MainRecyclerAdapter(sectionList);
        mainRecyclerView.setAdapter(mainRecyclerAdapter);

        return view;
    }

    private void initData() {

        String sectionOneName = "Top Picks For You";
        List<String> sectionOneItems = new ArrayList<>();
        sectionOneItems.add("Go, Rest, Repeat");
        sectionOneItems.add("30 min, Beginner");
        sectionOneItems.add("Endgame");

        String sectionTwoName = "New Workouts";
        List<String> sectionTwoItems = new ArrayList<>();
        sectionTwoItems.add("Pirates of the Caribbean");
        sectionTwoItems.add("King Kong");
        sectionTwoItems.add("Life of Pie");

        sectionList.add(new Section(sectionOneName, sectionOneItems));
        sectionList.add(new Section(sectionTwoName, sectionTwoItems));

        Log.d(TAG, "initData: " + sectionList);
    }
}