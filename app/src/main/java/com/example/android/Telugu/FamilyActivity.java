package com.example.android.Telugu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.Telugu.NumbersAdaptor;
import com.example.android.Telugu.Numbersobject;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Numbersobject> numbers=new ArrayList<Numbersobject>();
        numbers.add(new Numbersobject("English:Father","Telugu:Nanna",R.drawable.family_father, R.raw.father));
        numbers.add(new Numbersobject("English:Mother","Telugu:Amma",R.drawable.family_mother, R.raw.mother));
        numbers.add(new Numbersobject("English:Son","Telugu:koduku",R.drawable.family_son, R.raw.son));
        numbers.add(new Numbersobject("English:Daughter","Telugu:kuturu",R.drawable.family_daughter, R.raw.daughter));
        numbers.add(new Numbersobject("English:Older brother","Telugu:Annaya",R.drawable.family_older_brother, R.raw.bro));
        numbers.add(new Numbersobject("English:Younger brother","Telugu:Thammudu",R.drawable.family_younger_brother, R.raw.bro2));
        numbers.add(new Numbersobject("English:Older Sister","Telugu:Akka",R.drawable.family_older_sister, R.raw.sis));
        numbers.add(new Numbersobject("English:Younger Sister","Telugu:Chelli",R.drawable.family_younger_sister, R.raw.sis2));
        numbers.add(new Numbersobject("English:GrandMother","Telugu:Nainamma",R.drawable.family_grandmother, R.raw.grand));
        numbers.add(new Numbersobject("English:GrandFather","Telugu:Tatayya",R.drawable.family_grandfather, R.raw.grand2));
        NumbersAdaptor numlist=new NumbersAdaptor(this,numbers, R.color.category_family);
        ListView listview=(ListView) findViewById(R.id.list_array);
        listview.setAdapter(numlist);
    }
}
