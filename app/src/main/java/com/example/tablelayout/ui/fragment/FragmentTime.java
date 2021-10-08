
package com.example.tablelayout.ui.fragment;

import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.tablelayout.R;


public class FragmentTime extends Fragment {

    private ImageView imageView;
    private SwitchCompat switchCompat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_time, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initId(view);
        switchLogic();
    }
    private void switchLogic() {
        switchCompat.setOnClickListener(v ->{
            if (switchCompat.isChecked()){
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image));
            }else {
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.baby));

            }

        });
    }

    private void initId(View view) {
        switchCompat = view.findViewById(R.id.switchButton);
        imageView = view.findViewById(R.id.iv_view);
    }
}