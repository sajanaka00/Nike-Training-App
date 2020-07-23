package com.example.niketraining.listAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.R;
import com.example.niketraining.listData.ListData_3args;

public class ListAdapterF extends RecyclerView.Adapter<ListAdapterF.ViewHolder> {

    private ListData_3args[] listdata;

    // RecyclerView recyclerView;
    public ListAdapterF(ListData_3args[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ListAdapterF.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_for_you, parent, false);
        ListAdapterF.ViewHolder viewHolder = new ListAdapterF.ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListAdapterF.ViewHolder holder, int position) {
        final ListData_3args myListData3args = listdata[position];
        holder.title.setText(listdata[position].getTitle());
        holder.description.setText(listdata[position].getDescription());

        holder.image.setImageResource(listdata[position].getImgId());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Clicked on item: " + myListData3args.getTitle(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView title;
        public TextView description;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.image = (ImageView) itemView.findViewById(R.id.imageF);
            this.title = (TextView) itemView.findViewById(R.id.titleF);
            this.description = (TextView) itemView.findViewById(R.id.descriptionF);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayoutF);
        }
    }
}