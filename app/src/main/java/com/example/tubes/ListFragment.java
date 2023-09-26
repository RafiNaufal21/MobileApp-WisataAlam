package com.example.tubes;


import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class ListFragment extends Fragment {
    public ListFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // sy pake layout activity_sosial yg sy sudah pakai kemarin di ListView ku, jadi kamu kayaknya pake fragment_layout
        View v = inflater.inflate(R.layout.fragment_list, container, false);
        ListView listview =(ListView) v.findViewById(R.id.lv_list); //lv_list : panggil id yg ba muat listview

        final String[] dataName = getResources().getStringArray(R.array.data_name);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(v.getContext(), R.layout.item_card, R.id.txt_name, dataName); // item_sosial: isinya tampilan listview (gambar, judul, desc) yang kamu tampilkan secara berulang || txt_name id judulnya
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity().getApplicationContext(), dataName[i], Toast.LENGTH_SHORT).show();
                if(i==0){
                    Intent intent = new Intent(view.getContext(), museum.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(), "Museum Sulawesi Tengah", Toast.LENGTH_SHORT).show();
                }
                if(i==1){
                    Intent intent = new Intent(view.getContext(), tamannasional.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(), "Taman Nasional Lore Lindu", Toast.LENGTH_SHORT).show();
                }
                if(i==2){
                    Intent intent = new Intent(view.getContext(), sourajaa.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(), "Souraja", Toast.LENGTH_SHORT).show();
                }
                if(i==3){
                    Intent intent = new Intent(view.getContext(), cagaralammorowali.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(), "Cagar alam morowali", Toast.LENGTH_SHORT).show();
                }
                if(i==4){
                    Intent intent = new Intent(view.getContext(), tuguperdamaian.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(), "Tugu Perdamaian", Toast.LENGTH_SHORT).show();
                }
                if(i==5){
                    Intent intent = new Intent(view.getContext(), danauposo.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(), "Danau Poso", Toast.LENGTH_SHORT).show();
                }
                if(i==6){
                    Intent intent = new Intent(view.getContext(), danautambing.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(), "Danau Tambing", Toast.LENGTH_SHORT).show();
                }
                if(i==7){
                    Intent intent = new Intent(view.getContext(), pulautogean.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(), "Pulau Togeans", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return v;


    }
}