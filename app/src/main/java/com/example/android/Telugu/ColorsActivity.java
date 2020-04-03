package com.example.android.Telugu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.Telugu.R;
import com.example.android.Telugu.NumbersAdaptor;
import com.example.android.Telugu.Numbersobject;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Numbersobject> numbers=new ArrayList<Numbersobject>();
        numbers.add(new Numbersobject("English:Red","Telugu:Yerupu",R.drawable.color_red, R.raw.red));
        numbers.add(new Numbersobject("English:Blue","Telugu:Neelam",R.drawable.color_blue, R.raw.blue));
        numbers.add(new Numbersobject("English:Yellow","Telugu:Pasupu",R.drawable.color_dusty_yellow, R.raw.yellow));
        numbers.add(new Numbersobject("English:Green","Telugu:Aakupacha",R.drawable.color_green, R.raw.green));
        numbers.add(new Numbersobject("English:Black","Telugu:Nalupu",R.drawable.color_black, R.raw.black));
        numbers.add(new Numbersobject("English:White","Telugu:Telupu",R.drawable.color_white, R.raw.white));
        numbers.add(new Numbersobject("English:Brown","Telugu:Godhuma Rangu",R.drawable.color_brown, R.raw.brown));
        numbers.add(new Numbersobject("English:Orange","Telugu:Kaashaayam",R.drawable.color_orange, R.raw.orange));
        numbers.add(new Numbersobject("English:Pink","Telugu:Gulabi",R.drawable.color_pink, R.raw.pink));
        numbers.add(new Numbersobject("English:Violet","Telugu:Vaankaaya",R.drawable.color_blue, R.raw.violet));

        NumbersAdaptor numlist=new NumbersAdaptor(this,numbers, R.color.category_colors);
        ListView listview=(ListView) findViewById(R.id.list_array);
        listview.setAdapter(numlist);
    }
}
