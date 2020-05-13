package com.example.mynavigation.Screens;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.mynavigation.Adapter.SuraListAdapter;
import com.example.mynavigation.Models.OyatData;
import com.example.mynavigation.Models.SuraData;
import com.example.mynavigation.R;


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
        final int oyatSize = getResources().getStringArray(getResources()
                .getIdentifier("fotiha_uzbekcha", "array", getActivity().getPackageName())).length;
        SuraData[] suralar = new SuraData[suraSize];
        OyatData[] oyatlar = new OyatData[oyatSize];
        for (int i = 0; i < suraSize; i++) {
            String[] tempOyatUzbek = getResources().getStringArray(getResources().getIdentifier("oyat_uzbekcha_" + i, "array", getActivity().getPackageName()));
            String[] tempOyatArab = getResources().getStringArray(getResources().getIdentifier("oyat_arab_" + i, "array", getActivity().getPackageName()));
            for (int j = 0; j < oyatSize; j++) {
                oyatlar[j] = new OyatData(tempOyatUzbek[j], tempOyatArab[j]);
            }
            suralar[i] = new SuraData(getResources().getStringArray(R.array.sura_titles)[i], String.valueOf(i + 1), oyatlar);
        }


        SuraListAdapter adapter = new SuraListAdapter(suralar);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        adapter.setListener(new SuraListAdapter.Listener() {
            @Override
            public void onClick(SuraData sura) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("suraKey", sura);
                Navigation.findNavController(getView()).navigate(R.id.action_suraListFragment_to_suraFragment, bundle);
            }
        });

        return recyclerView;


    }

}
