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

public class ListAdapterContacts2 extends RecyclerView.Adapter<ListAdapterContacts2.ViewHolder>{

    private ListData_1imgView_2textViews[] listdata;

    // RecyclerView recyclerView;
    public ListAdapterContacts2(ListData_1imgView_2textViews[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ListAdapterContacts2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_contacts2, parent, false);
        ListAdapterContacts2.ViewHolder viewHolder = new ListAdapterContacts2.ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListAdapterContacts2.ViewHolder holder, int position) {
        final ListData_1imgView_2textViews myListData3args = listdata[position];

        holder.image.setImageResource(listdata[position].getImgId());
        holder.title.setText(listdata[position].getTitle());
        holder.description.setText(listdata[position].getDescription());

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
            this.image = (ImageView) itemView.findViewById(R.id.imageContacts2);
            this.title = (TextView) itemView.findViewById(R.id.titleContacts2);
            this.description = (TextView) itemView.findViewById(R.id.descriptionContacts2);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayoutContacts);
        }
    }
}
