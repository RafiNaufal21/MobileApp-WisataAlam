package com.example.tubes;

import static com.example.tubes.R.id.lv_list;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;


public class MainActivity2 extends AppCompatActivity {
    private String[] datadescription;
    private TypedArray dataPhoto;
    private HeroAdapter adapter;
    private ArrayList<Hero> heroes;
    private String[] dataName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new HeroAdapter(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);
        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int Position, long id) {
                if (Position == 0){
                    startActivity(new Intent(MainActivity2.this, museum.class));
                }
                else if( Position == 1 ){
                    startActivity(new Intent(MainActivity2.this, tamannasional.class));
                }
                else if( Position == 2 ){
                    startActivity(new Intent(MainActivity2.this, sourajaa.class));
                }
                else if( Position == 3 ){
                    startActivity(new Intent(MainActivity2.this, cagaralammorowali.class));
                }
                else if( Position == 4 ){
                    startActivity(new Intent(MainActivity2.this, tuguperdamaian.class));
                }
                else if( Position == 5 ){
                    startActivity(new Intent(MainActivity2.this, danauposo.class));
                }
                else if( Position == 6 ){
                    startActivity(new Intent(MainActivity2.this, danautambing.class));
                }
                else if( Position == 7 ){
                    startActivity(new Intent(MainActivity2.this, pulautogean.class));
                }
            }
        });
    }
    private void prepare() {
        dataName =
                getResources().getStringArray(R.array.data_name);
        datadescription =
                getResources().getStringArray(R.array.data_description);
        dataPhoto =
                getResources().obtainTypedArray(R.array.data_photo);
    }
    private void addItem() {
        heroes = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            Hero hero = new Hero ();
            hero.setPhoto(dataPhoto.getResourceId(i, -1));
            hero.setName(dataName[i]);
            hero.setDescription(datadescription[i]);
            heroes.add(hero);
        }
        adapter.setHeroes(heroes);
    }
}