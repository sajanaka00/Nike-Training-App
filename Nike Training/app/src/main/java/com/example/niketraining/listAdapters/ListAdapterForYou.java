package com.example.niketraining.listAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.R;
import com.example.niketraining.callback.GridItemClickListener;
import com.example.niketraining.listData.ListData_1imgView_1textView;
import com.example.niketraining.listData.ListData_1imgView_2textViews;

import java.util.List;

public class ListAdapterForYou extends RecyclerView.Adapter<ListAdapterForYou.ViewHolder> {

    private List<ListData_1imgView_2textViews> listdata;
    private GridItemClickListener gridItemClickListener;
    Context context;

    public ListAdapterForYou(List<ListData_1imgView_2textViews> listdata,GridItemClickListener gridItemClickListener,Context context) {
        this.listdata = listdata;
        this.gridItemClickListener = gridItemClickListener;
        this.context = context;
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
        final ListData_1imgView_2textViews list = listdata.get(position);
        holder.title.setText(listdata.get(position).getTitle());
        holder.description.setText(listdata.get(position).getDescription());
        holder.image.setImageResource(listdata.get(position).getImgId());

//        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(),"Clicked on item: " + list.getDescription(),Toast.LENGTH_LONG).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView image;
        public TextView title;
        public TextView description;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.image = (ImageView) itemView.findViewById(R.id.imageForYou);
            this.title = (TextView) itemView.findViewById(R.id.titleForYou);
            this.description = (TextView) itemView.findViewById(R.id.descriptionForYou);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayoutForYou);
            relativeLayout.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            ListData_1imgView_2textViews model = listdata.get(position);
            gridItemClickListener.onItemClick(model);

            if (model != null) {
                gridItemClickListener.onItemClick(model);
            }
        }
    }
}