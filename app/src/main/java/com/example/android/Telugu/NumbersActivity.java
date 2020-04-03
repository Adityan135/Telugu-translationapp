package com.example.android.Telugu;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.Telugu.NumbersAdaptor;
import com.example.android.Telugu.Numbersobject;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Numbersobject> numbers=new ArrayList<Numbersobject>();
        numbers.add(new Numbersobject("English:one","Telugu:okati",R.drawable.number_one,R.raw.one));
        numbers.add(new Numbersobject("English:two","Telugu:rendu",R.drawable.number_two, R.raw.two));
        numbers.add(new Numbersobject("English:three","Telugu:moodu",R.drawable.number_three, R.raw.three));
        numbers.add(new Numbersobject("English:four","Telugu:nalugu",R.drawable.number_four, R.raw.four));
        numbers.add(new Numbersobject("English:five","Telugu:aidu",R.drawable.number_five, R.raw.five));
        numbers.add(new Numbersobject("English:six","Telugu:aaru",R.drawable.number_six, R.raw.six));
        numbers.add(new Numbersobject("English:seven","Telugu:aedu",R.drawable.number_seven, R.raw.seven));
        numbers.add(new Numbersobject("English:eight","Telugu:enimidi",R.drawable.number_eight, R.raw.eight));
        numbers.add(new Numbersobject("English:nine","Telugu:tommidi",R.drawable.number_nine, R.raw.nine));
        numbers.add(new Numbersobject("English:ten","Telugu:padi",R.drawable.number_ten, R.raw.ten));

        final NumbersAdaptor numlist=new NumbersAdaptor(this,numbers,R.color.category_numbers);
        ListView listview=(ListView) findViewById(R.id.list_array);
        listview.setAdapter(numlist);


    }



}
