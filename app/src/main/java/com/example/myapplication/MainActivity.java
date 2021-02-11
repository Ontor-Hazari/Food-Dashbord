package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyvaleview,secondrecycalerview;
    String[] fooditeam,w_fooditeam;
   int[] foodicon = {R.drawable.burgar,R.drawable.hotdog,R.drawable.pizza,R.drawable.popcron,R.drawable.plater};

    int[] w_foodicon = {R.drawable.w_cake,R.drawable.w_coffe,R.drawable.w_drinks,R.drawable.w_icecream,R.drawable.w_juice};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        fooditeam = getResources().getStringArray(R.array.food);
        w_fooditeam = getResources().getStringArray(R.array.w_food);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        recyvaleview = (RecyclerView)findViewById(R.id.recyvaleview);
        MyAdapter adapter = new MyAdapter(MainActivity.this,foodicon,fooditeam);
        recyvaleview.setLayoutManager(layoutManager);
        recyvaleview.setHasFixedSize(true);
        recyvaleview.setAdapter(adapter);


       secondrecycalerview = (RecyclerView) findViewById(R.id.secondrecycalerview);
        Adapter iteam = new Adapter(MainActivity.this,w_foodicon,w_fooditeam);
        secondrecycalerview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
       secondrecycalerview.setAdapter(iteam);





    }
}