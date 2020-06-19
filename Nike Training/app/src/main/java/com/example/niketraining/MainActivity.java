package com.example.niketraining;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.niketraining.fragments.HistoryTab;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.example.niketraining.fragments.ActivityFragment;
import com.example.niketraining.fragments.FeedFragment;
import com.example.niketraining.fragments.InboxFragment;
import com.example.niketraining.fragments.WorkoutFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new HistoryTab(), "History");
        //adapter.addFragment(new Tab2Fragment(), "Tab 2");
        //adapter.addFragment(new Tab3Fragment(), "Tab 3");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FeedFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;

            switch (menuItem.getItemId()) {
                case R.id.feed:
                    selectedFragment = new FeedFragment();
                    break;
                case R.id.activity:
                    selectedFragment = new ActivityFragment();
                    break;
                case R.id.workout:
                    selectedFragment = new WorkoutFragment();
                    break;
                case R.id.inbox:
                    selectedFragment = new InboxFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.container, selectedFragment).commit();

            return true;
        }
    };
}