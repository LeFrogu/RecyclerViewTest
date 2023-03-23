package com.example.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Mail_Adapter extends RecyclerView.Adapter<Mail_Adapter.ViewHolder> {
    ArrayList<MailModel> mailModel;
    Context context;
    public Mail_Adapter(Context context, ArrayList<MailModel> mailModel){
        this.context = context;
        this.mailModel = mailModel;
    }
    @NonNull
    @Override
    public Mail_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.mail_recycler_view, parent, false);
        return new Mail_Adapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull Mail_Adapter.ViewHolder holder, int position) {
        holder.mailHeader.setText(mailModel.get(position).mailHeader);
        holder.mailInfo.setText(mailModel.get(position).mailHeader);
        holder.image.setImageResource(mailModel.get(position).image);
    }

    @Override
    public int getItemCount() {
        return mailModel.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView mailHeader, mailInfo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView);
            mailHeader = itemView.findViewById(R.id.mailHeader);
            mailInfo = itemView.findViewById(R.id.mailInfo);
        }
    }
}
