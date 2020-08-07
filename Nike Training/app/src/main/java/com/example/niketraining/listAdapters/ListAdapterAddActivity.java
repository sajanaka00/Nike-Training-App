package com.example.niketraining.listAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.R;
import com.example.niketraining.listData.ListData_2textViews;

public class ListAdapterAddActivity extends RecyclerView.Adapter<ListAdapterAddActivity.ViewHolder> {

    private ListData_2textViews[] listdata;

    // RecyclerView recyclerView;
    public ListAdapterAddActivity(ListData_2textViews[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ListAdapterAddActivity.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_add_activity, parent, false);
        ListAdapterAddActivity.ViewHolder viewHolder = new ListAdapterAddActivity.ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListAdapterAddActivity.ViewHolder holder, int position) {
        final ListData_2textViews myListData2args = listdata[position];
        holder.title.setText(listdata[position].getTitle());
        holder.description.setText(listdata[position].getDescription());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Clicked on item: " + myListData2args.getTitle(),Toast.LENGTH_LONG).show();
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
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.title = (TextView) itemView.findViewById(R.id.titleAddActivity);
            this.description = (TextView) itemView.findViewById(R.id.descriptionAddActivity);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayoutAddActivity);
        }
    }
}
