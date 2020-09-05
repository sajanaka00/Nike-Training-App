package com.example.niketraining.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.niketraining.R;

import java.util.ArrayList;
import java.util.Arrays;

public class AddActivityFragment extends Fragment {

    ImageView imageView;
    Spinner spinner;

    String[] sports_array = {"Select", "American Football", "Baseball/ Softball", "Basketball", "Boxing/ Martial Arts",
            "Circuit Training", "Cycling", "Football", "Golf", "Gym", "HIIT/ Crossfit", "Hiking", "NTC Live Classes",
            "Pilates/ Barre", "Running", "Sport", "Studio", "Swimming", "Tennis", "Training with Weights", "Yoga"};

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_activity, container, false);

        imageView = view.findViewById(R.id.close);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainerAddActivity, new ActivityFragment());
                fragmentTransaction.commit();
            }
        });

        spinner = view.findViewById(R.id.sportSpinner);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(sports_array));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(), R.layout.style_spinner, arrayList);
        spinner.setAdapter(arrayAdapter);

        return view;
    }
}