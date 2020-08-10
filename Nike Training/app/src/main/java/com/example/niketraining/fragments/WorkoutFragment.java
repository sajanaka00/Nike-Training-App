package com.example.niketraining.fragments;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.niketraining.R;
import com.example.niketraining.TabAdapter;
import com.example.niketraining.tabLayouts.Achievements;
import com.example.niketraining.tabLayouts.History;
import com.google.android.material.tabs.TabLayout;

import com.example.niketraining.tabLayouts.Browse;
import com.example.niketraining.tabLayouts.Collections;
import com.example.niketraining.tabLayouts.ForYou;
import com.example.niketraining.tabLayouts.Plans;


public class WorkoutFragment extends Fragment {

    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    TextView textView;
    Typeface font;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_workout, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getActivity().getSupportFragmentManager());

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        textView = view.findViewById(R.id.bookmark);
        font = Typeface.createFromAsset(getActivity().getAssets(), "fontawesome-webfont.ttf");

        textView.setTypeface(font);

        return view;

    }

    private void setupViewPager(ViewPager viewPager) {
        TabAdapter adapter = new TabAdapter(getChildFragmentManager());
        adapter.addFragment(new ForYou(), "For You");
        adapter.addFragment(new Browse(), "Browse");
        adapter.addFragment(new Collections(),"Collections");
        adapter.addFragment(new Plans(),"Plans");
        viewPager.setAdapter(adapter);

    }

}