package com.example.android.Telugu;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.Telugu.R;
import com.example.android.Telugu.Numbersobject;

import java.util.ArrayList;

public class NumbersAdaptor extends ArrayAdapter<Numbersobject> {
       private static final String LOG_TAG = NumbersAdaptor.class.getSimpleName();
       private int colorid;
    public NumbersAdaptor(Activity context, ArrayList<Numbersobject> androidFlavors) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidFlavors);
    }

       public NumbersAdaptor(Activity context, ArrayList<Numbersobject> androidFlavors, int category_numbers) {
           // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
           // the second argument is used when the ArrayAdapter is populating a single TextView.
           // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
           // going to use this second argument, so it can be any value. Here, we used 0.
           super(context, 0, androidFlavors);
           colorid=category_numbers;
       }


       @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
           View listItemView = convertView;
           if(listItemView == null) {
               listItemView = LayoutInflater.from(getContext()).inflate(
                       R.layout.list_item, parent, false);
           }
         Numbersobject currnum=getItem(position);
           TextView nameTextView = (TextView) listItemView.findViewById(R.id.text1);
           // Get the version name from the current AndroidFlavor object and
           // set this text on the name TextView
           nameTextView.setText(currnum.getEnglish());

           // Find the TextView in the list_item.xml layout with the ID version_number
           TextView numberTextView = (TextView) listItemView.findViewById(R.id.text2);
           // Get the version number from the current AndroidFlavor object and
           // set this text on the number TextView
           numberTextView.setText(currnum.getTelugu());
           ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_image_view);
           if (currnum.hasImage()) {
               // If an image is available, display the provided image based on the resource ID
               iconView.setImageResource(currnum.getimageid());
               // Make sure the view is visible
               iconView.setVisibility(View.VISIBLE);
           } else {
               // Otherwise hide the ImageView (set visibility to GONE)
               iconView.setVisibility(View.GONE);
           }
           final MediaPlayer m;
           m=MediaPlayer.create(listItemView.getContext(),currnum.getaudioid());
           listItemView.setOnClickListener(new View.OnClickListener(){

               @Override
               public void onClick(View v) {
                   m.start();
                   m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                       @Override
                       public void onCompletion(MediaPlayer mp) {
                           Toast.makeText(getContext(),"Done!",Toast.LENGTH_SHORT).show();
                       }
                   });
               }
           });

           View textContainer = listItemView.findViewById(R.id.textc);
           int color = ContextCompat.getColor(getContext(), colorid);
           textContainer.setBackgroundColor(color);
           return listItemView;
    }


}
