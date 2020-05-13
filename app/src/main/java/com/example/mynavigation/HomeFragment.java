package com.example.mynavigation;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    @Override
    public void onResume() {
        getActivity().findViewById(R.id.nav_view).setVisibility(View.VISIBLE);
        super.onResume();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        //RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_home, container, false);
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Window window = getActivity().getWindow();
        window.setStatusBarColor(getResources().getColor(R.color.eeee));
        final String[] homeMenuName = new String[HomeMenuList.menular.length];
        for (int i = 0; i < homeMenuName.length; i++) {
            homeMenuName[i] = HomeMenuList.menular[i].getMenuName();
        }
        int[] homeMenuImage = new int[HomeMenuList.menular.length];
        for (int i = 0; i < homeMenuName.length; i++) {
            homeMenuImage[i] = HomeMenuList.menular[i].getMenuImage();
        }

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.menu_recycler);

        HomeMenuAdapter homeMenuAdapter = new HomeMenuAdapter(homeMenuName, homeMenuImage);
        recyclerView.setAdapter(homeMenuAdapter);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        homeMenuAdapter.setListener(new HomeMenuAdapter.Listener() {
            @Override
            public void onClick(int position) {

                switch (position) {
                    case 1:
                        Bundle bundle = new Bundle();
                        bundle.putString("keyMenuPositionClick", homeMenuName[position]);
                        Navigation.findNavController(getView()).navigate(R.id.action_homeFragment_to_suraListFragment, bundle);
                        getActivity().findViewById(R.id.nav_view).setVisibility(View.GONE);
                        return;
                    case 3:
                        Bundle bundleTasbeh = new Bundle();
                        bundleTasbeh.putString("keyMenuPositionClick", homeMenuName[position]);
                        Navigation.findNavController(getView()).navigate(R.id.action_homeFragment_to_tasbehFragment, bundleTasbeh);
                        getActivity().findViewById(R.id.nav_view).setVisibility(View.GONE);
                        return;
                }
            }
        });

        return view;
    }
}
