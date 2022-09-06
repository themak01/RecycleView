package com.example.recycleview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.FriendViewHolder> {


    private  String[] data;
    public FriendAdapter(String[] data){
            this.data = data;
    }
    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class FriendViewHolder extends RecyclerView.ViewHolder{
        public FriendViewHolder (View itemView){
            super(itemView);
        }
    }
}
