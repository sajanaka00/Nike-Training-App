package com.example.niketraining;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.niketraining.fragments.ActivityFragment;
import com.example.niketraining.fragments.FeedFragment;
import com.example.niketraining.fragments.InboxFragment;
import com.example.niketraining.fragments.WorkoutFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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