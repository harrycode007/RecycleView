package com.example.hariharan.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Fruit> fruitNameList;
    private RecyclerView.Adapter fruitAdapter;

    @BindView(R.id.rv_fruits_list_view)
    RecyclerView fruitRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        fruitAdapter = new FruitAdapter(setFruit());
        fruitRecyclerView.setAdapter(fruitAdapter);
    }

    public ArrayList<Fruit> setFruit() {
        fruitNameList = new ArrayList<>();
        fruitNameList.add(new Fruit("Apple", R.drawable.apple));
        fruitNameList.add(new Fruit("Banana", R.drawable.banana));
        fruitNameList.add(new Fruit("Blueberries", R.drawable.blueberries));
        fruitNameList.add(new Fruit("Cherries", R.drawable.cherries));
        fruitNameList.add(new Fruit("Grapes", R.drawable.grapes));
        fruitNameList.add(new Fruit("Lemon", R.drawable.lemon));
        fruitNameList.add(new Fruit("Orange", R.drawable.orange));
        fruitNameList.add(new Fruit("Peach", R.drawable.peach));
        fruitNameList.add(new Fruit("Pear", R.drawable.pear));
        fruitNameList.add(new Fruit("Pineapple", R.drawable.pineapple));
        fruitNameList.add(new Fruit("Pomegranate", R.drawable.pomegranate));
        fruitNameList.add(new Fruit("Raspberry", R.drawable.raspberry));
        fruitNameList.add(new Fruit("Strawberry", R.drawable.strawberry));
        fruitNameList.add(new Fruit("Watermelon", R.drawable.watermelon));

        return fruitNameList;
       }


   }

