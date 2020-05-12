package com.example.mynavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SuraListFragment extends Fragment {

    public SuraListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_sura_list, container, false);

        final int suraSize = getResources().getStringArray(R.array.sura_titles).length;
        SuraNamesMassiv[] suralar = new SuraNamesMassiv[suraSize];
        for (int i = 0; i < suraSize; i++) {
            suralar[i] = new SuraNamesMassiv(getResources().getStringArray(R.array.sura_titles)[i], String.valueOf(i + 1), SuralarMassivParent.fotiha);
        }


        SuraListAdapter adapter = new SuraListAdapter(suralar);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        adapter.setListener(new SuraListAdapter.Listener() {
            @Override
            public void onClick(SuraNamesMassiv sura) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("suraKey", sura);
                Navigation.findNavController(getView()).navigate(R.id.action_suraListFragment_to_suraFragment, bundle);
            }
        });

        return recyclerView;


    }

}
