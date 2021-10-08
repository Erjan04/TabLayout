package com.example.tablelayout.ui.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tablelayout.R;

import java.util.ArrayList;

public class FragmentAdapter extends RecyclerView.Adapter<FragmentAdapter.MyViewHolder> {

    private ArrayList<Model> list = new ArrayList<>();

    public void setList(ArrayList<Model> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.my_raw,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  FragmentAdapter.MyViewHolder holder, int position) {
    holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView;
        private final TextView name;
        private final TextView price;

        public MyViewHolder(@NonNull  View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.cryptoCoin);
            name = itemView.findViewById(R.id.nameCrypto);
            price = itemView.findViewById(R.id.priceSize);

        }
        @SuppressLint("SetTextI18n")
        public void onBind(Model model) {
            imageView.setImageResource(model.getImage());
            name.setText(model.getName());
            price.setText("USD" + model.getPrice());

        }
    }
}
