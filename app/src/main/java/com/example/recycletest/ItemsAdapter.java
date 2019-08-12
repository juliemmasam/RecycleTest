package com.example.recycletest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemHolder > {
    private final Context mContext;
    private final List<IndMessage> mIndMessages;
    private final LayoutInflater mLayoutInflater;

    public ItemsAdapter(Context context, List<IndMessage> indMessages){
        mContext = context;
        mIndMessages = indMessages;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.individual_view, parent, false
        );

        return new ItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        holder.mNameView.setText("Emmanuel Julius");
        holder.mMessageView.setText("It was successful around here. Great a thing.");
    }

    @Override
    public int getItemCount() {
        return mIndMessages.size();
    }

    protected class ItemHolder extends RecyclerView.ViewHolder {

        public final TextView mNameView;
        public final TextView mMessageView;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);

            mNameView = itemView.findViewById(R.id.nameView);
            mMessageView = itemView.findViewById(R.id.messageView);
        }
    }
}
