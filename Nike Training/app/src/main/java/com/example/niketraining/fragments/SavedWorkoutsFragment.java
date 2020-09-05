package com.example.niketraining.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.niketraining.R;

public class SavedWorkoutsFragment extends Fragment {

    ImageView imageView;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_saved_workouts, container, false);

        imageView = view.findViewById(R.id.arrowBackwards);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainerSavedWorkouts, new WorkoutFragment());
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}