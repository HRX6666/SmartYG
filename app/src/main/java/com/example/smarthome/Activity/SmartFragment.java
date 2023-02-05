package com.example.smarthome.Activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smarthome.Adapter.AddSmartAdapter;
import com.example.smarthome.Adapter.AddSmartHelper;
import com.example.smarthome.R;

import java.util.ArrayList;

public class SmartFragment extends Fragment {
    RecyclerView addsmart;
    RecyclerView.Adapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.smart_fragment,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        addsmart=getActivity().findViewById(R.id.add_smart);
        super.onActivityCreated(savedInstanceState);
        recyclerView();
    }

    private void recyclerView() {
        addsmart.setHasFixedSize(true);
        addsmart.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        ArrayList<AddSmartHelper> addSmartHelpers=new ArrayList<>();
        addSmartHelpers.add(new AddSmartHelper(R.drawable.lights_smart,"灯光"));
        addSmartHelpers.add(new AddSmartHelper(R.drawable.air_condition_smart,"空调"));
        addSmartHelpers.add(new AddSmartHelper(R.drawable.curtain_smart,"窗帘"));
        addSmartHelpers.add(new AddSmartHelper(R.drawable.lock_smart,"智能门锁"));
        adapter=new AddSmartAdapter(addSmartHelpers);
        addsmart.setAdapter(adapter);


    }
}
