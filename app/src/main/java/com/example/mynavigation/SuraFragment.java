package com.example.mynavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SuraFragment extends Fragment {

    public SuraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_sura, container, false);


        SuraNamesMassiv sura = (SuraNamesMassiv) getArguments().getSerializable("suraKey");



        SuralarMassivParent[] oyat = sura.suraOyat;

        SuraAdapter2 adapter = new SuraAdapter2(oyat);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return recyclerView;


    }
}
