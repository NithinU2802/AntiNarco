package com.example.antinarco.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.antinarco.Affect;
import com.example.antinarco.Arugument;
import com.example.antinarco.databinding.FragmentHomeBinding;
import com.example.antinarco.hospital;
import com.example.antinarco.nasha;
import com.example.antinarco.penalty;
import com.example.antinarco.prevention;

public class HomeFragment extends Fragment {
     public TextView setname,setmail;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        final ImageView pen=binding.penality;
        pen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), penalty.class);
                view.getContext().startActivity(intent);
                getActivity();

            }
        });
        final ImageView affect=binding.affects;
        affect.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), Affect.class);
                view.getContext().startActivity(intent);
                getActivity();

            }
        });
//        final ImageView argu=binding.argu;
//        argu.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), Arugument.class);
//                view.getContext().startActivity(intent);
//                getActivity();
//
//            }
//        });
//        final ImageView preven=binding.preven;
//        preven.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), prevention.class);
//                view.getContext().startActivity(intent);
//                getActivity();
//
//            }
//        });
        final ImageView nasha=binding.nasha;
        nasha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), nasha.class);
                view.getContext().startActivity(intent);
                getActivity();

            }
        });
        final ImageView hosp=binding.hosp;
        hosp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), hospital.class);
                view.getContext().startActivity(intent);
                getActivity();

            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}