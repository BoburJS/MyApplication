package com.example.mynavigation.Screens;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mynavigation.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TasbehFragment extends Fragment implements View.OnClickListener {

    private int counter = 0;
    private int counterTotal = 33;
    private int countJami = 0;
    private View view;
    private RelativeLayout relativeLayout;
    private TextView count, totalCount, jami;
    private ImageView buttonImage, touch, refresh;
    private CheckBox checkBox;
    private MediaPlayer clickmp3, resclickmp3;
    private Toolbar toolbar;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tasbeh, container, false);
        toolbar = view.findViewById(R.id.toolbar_tasbeh);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.homeFragment);
            }
        });
        Window window = getActivity().getWindow();
        window.setStatusBarColor(getResources().getColor(R.color.toolbarColor));

        relativeLayout = view.findViewById(R.id.relativeLayout);
        touch = view.findViewById(R.id.touch);
        buttonImage = view.findViewById(R.id.button_Image);
        clickmp3 = MediaPlayer.create(getContext(), R.raw.click);
        resclickmp3 = MediaPlayer.create(getContext(), R.raw.resetcount);
        count = view.findViewById(R.id.count);
        totalCount = view.findViewById(R.id.totalCount);
        refresh = view.findViewById(R.id.refresh);
        checkBox = view.findViewById(R.id.sound);
        jami = view.findViewById(R.id.jami);


        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                count.setText(String.valueOf(counter));
            }
        });

        relativeLayout.setOnClickListener(this);
        buttonImage.setOnClickListener(this);
        totalCount.setText(String.valueOf(counterTotal));
        count.setText(String.valueOf(counter));


        return view;

    }

    @Override
    public void onClick(View v) {
        countJami++;
        jami.setText("Jami: " + String.valueOf(countJami));
        if (counter == counterTotal) {
            touch.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.shake2));
            buttonImage.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.shake2));
            counter = 1;
            if (counter == 1) {

                reSoundSwitcher(checkBox.isChecked());
                count.setText(String.valueOf(counter));
            }
        } else {
            counter++;
            soundSwitcher(checkBox.isChecked());
            touch.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.shake));
            buttonImage.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.shake));
            count.setText(String.valueOf(counter));
        }
    }

    private void soundSwitcher(boolean isCheck) {

        Log.d("LOG", String.valueOf(checkBox.isChecked()));
        if (isCheck) {
            clickmp3.pause();
        } else {
            clickmp3.start();
        }

    }

    private void reSoundSwitcher(boolean isCheck) {
        if (isCheck) {
            resclickmp3.pause();
        } else {
            resclickmp3.start();
        }
    }


}


