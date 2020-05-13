package com.example.mynavigation.Screens;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.mynavigation.Adapter.SuraAdapter2;
import com.example.mynavigation.Models.OyatData;
import com.example.mynavigation.Models.SuraData;
import com.example.mynavigation.R;


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


        SuraData sura = (SuraData) getArguments().getSerializable("suraKey");



        OyatData[] oyat = sura.suraOyat;

        SuraAdapter2 adapter = new SuraAdapter2(oyat);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return recyclerView;


    }
}
