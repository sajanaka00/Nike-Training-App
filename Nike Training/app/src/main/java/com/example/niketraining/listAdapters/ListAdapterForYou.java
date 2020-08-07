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
import com.example.niketraining.listData.ListData_1imgView_2textViews;

public class ListAdapterForYou extends RecyclerView.Adapter<ListAdapterForYou.ViewHolder> {

    private ListData_1imgView_2textViews[] listdata;

    // RecyclerView recyclerView;
    public ListAdapterForYou(ListData_1imgView_2textViews[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ListAdapterForYou.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_for_you, parent, false);
        ListAdapterForYou.ViewHolder viewHolder = new ListAdapterForYou.ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListAdapterForYou.ViewHolder holder, int position) {
        final ListData_1imgView_2textViews myListData3args = listdata[position];
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