package com.example.smarthome.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smarthome.R;

import java.util.ArrayList;

public class AddSmartAdapter extends RecyclerView.Adapter <AddSmartAdapter.AddSmartHolder>{
    ArrayList<AddSmartHelper> addSmartHelpers;

    public AddSmartAdapter(ArrayList<AddSmartHelper> addSmartHelpers) {
        this.addSmartHelpers = addSmartHelpers;
    }

    @NonNull
    @Override
    public AddSmartHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.add_smart,parent,false);
        AddSmartHolder addSmartHolder=new AddSmartHolder(view);
        return addSmartHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AddSmartHolder holder, int position) {
        AddSmartHelper addSmartHelper=addSmartHelpers.get(position);
        holder.imageView.setImageResource(addSmartHelper.getImage());
        holder.title.setText(addSmartHelper.getTitle());

    }

    @Override
    public int getItemCount() {



        return addSmartHelpers.size();
    }

    public static class AddSmartHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView title;
        public AddSmartHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.add_im);
            title=itemView.findViewById(R.id.add_tv);
        }
    }
}
