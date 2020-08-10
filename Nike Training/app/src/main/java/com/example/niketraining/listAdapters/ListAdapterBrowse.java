package com.example.niketraining.listAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.listData.ListData_1imgView_1textView;
import com.example.niketraining.R;

public class ListAdapterBrowse extends RecyclerView.Adapter<ListAdapterBrowse.ViewHolder> {

    private ListData_1imgView_1textView[] listdata;

    // RecyclerView recyclerView;
    public ListAdapterBrowse(ListData_1imgView_1textView[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ListAdapterBrowse.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_browse, parent, false);
        ListAdapterBrowse.ViewHolder viewHolder = new ListAdapterBrowse.ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListAdapterBrowse.ViewHolder holder, int position) {
        final ListData_1imgView_1textView myListData = listdata[position];
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
            this.image = (ImageView) itemView.findViewById(R.id.imageBrowse);
            this.title = (TextView) itemView.findViewById(R.id.titleBrowse);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayoutBrowse);
        }
    }
}