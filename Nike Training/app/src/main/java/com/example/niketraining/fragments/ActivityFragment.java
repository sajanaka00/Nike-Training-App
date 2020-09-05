package com.example.niketraining.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.niketraining.R;
import com.example.niketraining.TabAdapter;
import com.example.niketraining.tabLayouts.Achievements;
import com.example.niketraining.tabLayouts.History;
import com.google.android.material.tabs.TabLayout;

public class ActivityFragment extends Fragment {

    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_activity, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getActivity().getSupportFragmentManager());

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        imageView = view.findViewById(R.id.add);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainerActivity, new AddActivityFragment());
                fragmentTransaction.commit();
            }
        });

        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        TabAdapter adapter = new TabAdapter(getChildFragmentManager());

        adapter.addFragment(new History(), "History");
        adapter.addFragment(new Achievements(), "Achievements");

        viewPager.setAdapter(adapter);
    }
}