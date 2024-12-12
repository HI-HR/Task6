package com.example.task6.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task6.Data;
import com.example.task6.R;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {
    List<Data> mList;

    public RvAdapter(List<Data> mList) {
        this.mList = mList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder holder = new ViewHolder(view);

        //holder.itemView.setBackgroundResource(R.drawable.selector_item);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(),"你点击了"+holder.title.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Data data = mList.get(position);
            holder.image.setImageResource(data.getImageId());
            holder.title.setText(data.getTitle());
            holder.content.setText(data.getContent());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }




    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;
        TextView content;
        View itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView=itemView;
            image = itemView.findViewById(R.id.iv_img);
            title = itemView.findViewById(R.id.tv_title);
            content = itemView.findViewById(R.id.tv_content);

        }
    }
}
