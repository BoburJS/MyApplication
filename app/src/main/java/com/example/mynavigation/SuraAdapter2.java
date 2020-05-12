package com.example.mynavigation;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

class SuraAdapter2 extends RecyclerView.Adapter<SuraAdapter2.ViewHolder> {
    private SuralarMassivParent[] oyat;

    public SuraAdapter2(SuralarMassivParent[] oyat) {
        this.oyat = oyat;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.row_sura, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final CardView cardView = holder.cardView;

        TextView textArab = cardView.findViewById(R.id.oyatArab);
        textArab.setText(oyat[position].suraArab);

        TextView textDefault = cardView.findViewById(R.id.oyatDefault);
        textDefault.setText(oyat[position].suraDefault);
    }

    @Override
    public int getItemCount() {
        return oyat.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;

        public ViewHolder(@NonNull CardView c) {
            super(c);
            cardView = c;
        }
    }
}
