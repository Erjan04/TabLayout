package com.example.tablelayout.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tablelayout.R;
import com.example.tablelayout.ui.adapter.FragmentAdapter;
import com.example.tablelayout.ui.adapter.Model;

import java.util.ArrayList;

public class FragmentFirst extends Fragment {

    private RecyclerView recyclerView;
    private FragmentAdapter adapter = new FragmentAdapter();
    private ArrayList<Model> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initId(view);
    }


    private void initId(View view) {
        recyclerView = view.findViewById(R.id.rvFragment);
        adapter = new FragmentAdapter();
        adapter.setList(list);
        recyclerView.setAdapter(adapter);
    }
    private void createList() {
        list = new ArrayList<>();
        list.add(new Model(R.drawable.xvc,"V-Coin",1.00));
        list.add(new Model(R.drawable.bitcoin,"B-Coin",4.00));
        list.add(new Model(R.drawable.usd,"Label",0.00));
        list.add(new Model(R.drawable.start,"S-Coin",6.00));
        list.add(new Model(R.drawable.usdt,"T-Coin",0.00));
        list.add(new Model(R.drawable.zrx,"S-Coin",40.00));
        list.add(new Model(R.drawable.bitcoin,"Label",119.0));
        list.add(new Model(R.drawable.usd,"Label",0.00));
        list.add(new Model(R.drawable.start,"Label",500.0));
        list.add(new Model(R.drawable.usdt,"Label",0.00));
    }

}