package com.example.niketraining.listAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.listData.ListData_2args;
import com.example.niketraining.R;

public class ListAdapterB extends RecyclerView.Adapter<ListAdapterB.ViewHolder> {

    private ListData_2args[] listdata;

    // RecyclerView recyclerView;
    public ListAdapterB(ListData_2args[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ListAdapterB.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_browse, parent, false);
        ListAdapterB.ViewHolder viewHolder = new ListAdapterB.ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListAdapterB.ViewHolder holder, int position) {

        final ListData_2args myListData = listdata[position];
        holder.title.setText(listdata[position].getTitle());
        holder.image.setImageResource(listdata[position].getImgId());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Clicked on item: " + myListData.getTitle(),Toast.LENGTH_LONG).show();
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
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.image = (ImageView) itemView.findViewById(R.id.imageB);
            this.title = (TextView) itemView.findViewById(R.id.titleB);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayoutB);
        }
    }
}
