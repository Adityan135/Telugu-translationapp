package com.example.android.Telugu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.Telugu.NumbersAdaptor;
import com.example.android.Telugu.Numbersobject;
import com.example.android.Telugu.R;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Numbersobject> numbers=new ArrayList<Numbersobject>();
        numbers.add(new Numbersobject("English:Where are you going?","Telugu:Nuvvu ekkadiki veltunnavu?", R.raw.phrase1));
        numbers.add(new Numbersobject("English:What is your name?","Telugu:Nee peru enti?", R.raw.phrase2));
        numbers.add(new Numbersobject("English:My name is...","Telugu:Naa peru...", R.raw.phrase3));
        numbers.add(new Numbersobject("English:How are you feeling?","Telugu:Nee Anubhuti ela undi? ", R.raw.phrase4));
        numbers.add(new Numbersobject("English:I’m feeling good.","Telugu:Nenu Bagunnanu", R.raw.phrase5));
        numbers.add(new Numbersobject("English:Are you coming?","Telugu:Nuvvu vastunnava?", R.raw.phrase6));
        numbers.add(new Numbersobject("English:Yes, I’m coming.","Telugu:Avunu vastunnanu", R.raw.phrase7));
        numbers.add(new Numbersobject("English:I’m coming.","Telugu:Vastunnanu", R.raw.phrase8));
        numbers.add(new Numbersobject("English:Let’s go.","Telugu:Pada veldam", R.raw.phrase9));
        numbers.add(new Numbersobject("English:Come here.","Telugu:Ikkadiki raa", R.raw.phrase10));

        NumbersAdaptor numlist=new NumbersAdaptor(this,numbers, R.color.category_phrases);
        ListView listview=(ListView) findViewById(R.id.list_array);
        listview.setAdapter(numlist);
    }
}
