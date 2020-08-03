package com.raihana.directoryapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.raihana.directoryapp.DirectoryDetailActivity;
import com.raihana.directoryapp.R;
import com.raihana.directoryapp.model.DirectoryModel;

import java.nio.file.DirectoryIteratorException;
import java.util.ArrayList;
import java.util.List;

public class DirectoryAdapter extends RecyclerView.Adapter<DirectoryAdapter.MyViewHolder> {

    //4. Declaration
    Context mcontext;
    List<DirectoryModel> mData;

    //5.Constructor
    public DirectoryAdapter(List<DirectoryModel> list, Context mcontext) {
        this.mcontext = mcontext;
        mData = list;
    }

    public DirectoryAdapter(List<DirectoryModel> list) {
    }

    public void setmData(List<DirectoryModel> mData) {
        this.mData = mData;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.items_directory, parent, false);
        MyViewHolder vh = new DirectoryAdapter.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        final DirectoryModel model = mData.get(i);
        holder.tv_title.setText(mData.get(i).getTitle());
        holder.tv_caption.setText(mData.get(i).getCaption());
        holder.tv_date.setText(mData.get(i).getDate());
        holder.lay_header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(mcontext, DirectoryDetailActivity.class);
                intent.putExtra("title",model.getTitle());
                intent.putExtra("date",model.getDate());
                intent.putExtra("caption",model.getCaption());
                mcontext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        //8. fill in itemView
        private RelativeLayout lay_header;
        private TextView tv_title, tv_date, tv_caption;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            lay_header = itemView.findViewById(R.id.lay_header);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_date = itemView.findViewById(R.id.tv_date);
            tv_caption = itemView.findViewById(R.id.tv_caption);
        }
    }
}
