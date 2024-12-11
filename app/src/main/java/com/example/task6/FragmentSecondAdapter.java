package com.example.task6;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FragmentSecondAdapter extends RecyclerView.Adapter<FragmentSecondAdapter.ViewHolder> {
    private List<Data> mList;

    public FragmentSecondAdapter(List<Data> mList) {
        this.mList = mList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_photo, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parent.getContext(), PhotoActivity.class);
                Data data = mList.get(viewHolder.getAdapterPosition());
                intent.putExtra("img",data.getImageId());
                intent.putExtra("title",data.getTitle());
                intent.putExtra("content",data.getContent());
                parent.getContext().startActivity(intent);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Data data = mList.get(position);
        holder.image.setImageResource(data.getImageId());
        holder.mTitle.setText(data.getTitle());
        holder.mContent.setText(data.getContent());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView image;
        private TextView mTitle;
        private TextView mContent;
        private View itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.siv_item_image);
            mTitle=itemView.findViewById(R.id.tv_title);
            mContent= itemView.findViewById(R.id.tv_content);
            this.itemView=itemView;
        }
    }
}
