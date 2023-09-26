package com.example.tubes;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class HomeFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
     ImageView BTN1, BTN2, BTN3,BTN4,BTN5,BTN6,BTN7,Button1,Button2,Button3,Button4, Button5, Button7 ;
        Button1 = (ImageView) rootView.findViewById(R.id.button1);
        Button2 = (ImageView) rootView.findViewById(R.id.button2);
        Button3 = (ImageView) rootView.findViewById(R.id.button3);
        Button4 = (ImageView) rootView.findViewById(R.id.button4);
        Button5 = (ImageView) rootView.findViewById(R.id.button5);
        Button7 = (ImageView) rootView.findViewById(R.id.button7);
        BTN1 = (ImageView) rootView.findViewById(R.id.btn1);
        BTN2= (ImageView) rootView.findViewById(R.id.btn2);
        BTN3= (ImageView) rootView.findViewById(R.id.btn3);
        BTN4= (ImageView) rootView.findViewById(R.id.btn4);
        BTN5= (ImageView) rootView.findViewById(R.id.btn5);
        BTN6= (ImageView) rootView.findViewById(R.id.btn6);
        BTN7= (ImageView) rootView.findViewById(R.id.btn7);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),cagaralammorowali.class);
                startActivity(intent);
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),tuguperdamaian.class);
                startActivity(intent);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),tamannasional.class);
                startActivity(intent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),museum.class);
                startActivity(intent);
            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),danautambing.class);
                startActivity(intent);
            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),pulautogean.class);
                startActivity(intent);
            }
        });
       BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),cagaralammorowali.class);
                startActivity(intent);
            }
        });

        BTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),tuguperdamaian.class);
                startActivity(intent);
            }
        });
        BTN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),tamannasional.class);
                startActivity(intent);
            }
        });
        BTN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),museum.class);
                startActivity(intent);
            }
        });
        BTN5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),sourajaa.class);
                startActivity(intent);
            }
        });
        BTN6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),danauposo.class);
                startActivity(intent);
            }
        });
        BTN7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),pulautogean.class);
                startActivity(intent);
            }
        });
        return rootView;
    }}