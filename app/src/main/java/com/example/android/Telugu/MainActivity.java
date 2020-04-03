/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.Telugu;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.Telugu.ColorsActivity;
import com.example.android.Telugu.FamilyActivity;
import com.example.android.Telugu.NumbersActivity;
import com.example.android.Telugu.R;
import com.example.android.Telugu.PhrasesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        TextView numbers=(TextView)(findViewById(R.id.numbers));
        TextView family=(TextView) (findViewById(R.id.family));
        TextView colors=(TextView) (findViewById(R.id.colors));
        TextView phrases=(TextView) (findViewById(R.id.phrases));
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i);
            }

        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(i);
            }
        });
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(i);
            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(i);
            }
        });

    }

    /*public void opennumbers(View view) {
        Intent i=new Intent(this,NumbersActivity.class);
        startActivity(i);
    }

    public void openfamily(View view) {
        Intent i=new Intent(this,FamilyActivity.class);
        startActivity(i);
    }

    public void opencolor(View view) {
        Intent i=new Intent(this,ColorsActivity.class);
        startActivity(i);
    }

    public void openphrases(View view) {
        Intent i=new Intent(this,PhrasesActivity.class);
        startActivity(i);
    }*/


}
