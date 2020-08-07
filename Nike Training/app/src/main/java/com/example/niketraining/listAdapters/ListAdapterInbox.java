package com.example.niketraining.listAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.R;
import com.example.niketraining.listData.ListData_3textViews;

public class ListAdapterInbox extends RecyclerView.Adapter<ListAdapterInbox.ViewHolder> {

    private ListData_3textViews[] listdata;

    // RecyclerView recyclerView;
    public ListAdapterInbox(ListData_3textViews[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ListAdapterInbox.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_inbox, parent, false);
        ListAdapterInbox.ViewHolder viewHolder = new ListAdapterInbox.ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListAdapterInbox.ViewHolder holder, int position) {
        final ListData_3textViews myListData3args = listdata[position];
        holder.title.setText(listdata[position].getTitle());
        holder.description.setText(listdata[position].getDescription());
        holder.description2.setText(listdata[position].getDescription2());

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
        public TextView title;
        public TextView description;
        public TextView description2;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.title = (TextView) itemView.findViewById(R.id.titleI);
            this.description = (TextView) itemView.findViewById(R.id.descriptionI);
            this.description2 = (TextView) itemView.findViewById(R.id.descriptionI_2);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayoutI);
        }
    }
}