package com.example.niketraining.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.niketraining.R;
import com.example.niketraining.TabAdapter;
import com.example.niketraining.tabLayouts.Contacts;
import com.example.niketraining.tabLayouts.Suggestions;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class AddFriendsFragment extends Fragment {

    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_friends, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getActivity().getSupportFragmentManager());

        adapter.addFragment(new Suggestions(), "Suggestions");
        adapter.addFragment(new Contacts(), "Contacts");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        imageView = view.findViewById(R.id.arrowBackwards);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainerAddFriends, new FeedFragment());
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}