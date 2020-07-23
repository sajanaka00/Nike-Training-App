package com.example.niketraining.listAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.R;
import com.example.niketraining.models.BusModel;
import com.example.niketraining.onItemClickCallback;

import java.util.ArrayList;
import java.util.List;

public class AchievementsAdapter extends RecyclerView.Adapter<AchievementsAdapter.ViewHolder>{

    private List<BusModel> busModels;
    private  onItemClickCallback onItemClickCallback;
    private Context context;

    public AchievementsAdapter(Context context, List<BusModel> busModels) {
        this.busModels = busModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_achivement_row, parent, false);
        AchievementsAdapter.ViewHolder vh = new AchievementsAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bustype.setText(busModels.get(position).getBusType());
        holder.root.setText(busModels.get(position).getRootName());
        holder.date.setText(busModels.get(position).getDate());

    }

    @Override
    public int getItemCount() {
        return busModels.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView bustype;
        TextView root;
        TextView date;

        public ViewHolder(View itemView) {
            super(itemView);
            bustype = (TextView) itemView.findViewById(R.id.busTypeLabel);
            root = (TextView) itemView.findViewById(R.id.rootLabel);
            date = (TextView) itemView.findViewById(R.id.dateVal);
        }

    }
}
