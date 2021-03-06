package com.example.mynavigation.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynavigation.Models.SuraData;
import com.example.mynavigation.R;

public class SuraListAdapter extends RecyclerView.Adapter<SuraListAdapter.ViewHolder> {
    private SuraData[] suraMassiv;
    private Listener listener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.row_sura_list, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final CardView cardView = holder.cardView;
        TextView textView = cardView.findViewById(R.id.text1);
        textView.setText(suraMassiv[position].suraName);
        TextView textNumber = cardView.findViewById(R.id.imageIv);
        textNumber.setText(suraMassiv[position].suraNumber);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null){
                    listener.onClick(suraMassiv[position]);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return suraMassiv.length;
    }

    public interface Listener {
        void onClick(SuraData singleSura);
    }


    public SuraListAdapter(SuraData[] suraMassiv) {
        this.suraMassiv = suraMassiv;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;

        public ViewHolder(@NonNull CardView c) {
            super(c);
            cardView = c;
        }
    }
}