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
import com.example.niketraining.listData.ListData_2imgViews_1textView;

public class ListAdapterContacts extends RecyclerView.Adapter<ListAdapterContacts.ViewHolder> {

    private ListData_2imgViews_1textView[] listdata;

    // RecyclerView recyclerView;
    public ListAdapterContacts(ListData_2imgViews_1textView[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ListAdapterContacts.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_contacts, parent, false);
        ListAdapterContacts.ViewHolder viewHolder = new ListAdapterContacts.ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListAdapterContacts.ViewHolder holder, int position) {
        final ListData_2imgViews_1textView myListData3args = listdata[position];

        holder.image.setImageResource(listdata[position].getImgId());
        holder.title.setText(listdata[position].getTitle());
        holder.image2.setImageResource(listdata[position].getImgId2());

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
        public ImageView image2;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.image = (ImageView) itemView.findViewById(R.id.imageContacts);
            this.title = (TextView) itemView.findViewById(R.id.titleContacts);
            this.image2 = (ImageView) itemView.findViewById(R.id.addContact);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayoutContacts);
        }
    }
}
