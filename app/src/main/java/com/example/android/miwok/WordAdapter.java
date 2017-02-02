package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/01/25.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    /**Resource ID for the background color to this list of words*/
    private int mColorReosurceId;
    public WordAdapter(Activity context, ArrayList<Word> words, int ColorReosurceId){
    // Hear, we initialize the ArrayAdapter's internal storage for the context and the list.
    //the second argument is used when the ArrayAdapter is populating a single TextView.
        super(context,0,words);
        mColorReosurceId = ColorReosurceId;
}

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        // Get the AndroidFlavor object at this possition in the list
        Word currentWord = getItem(position);

        //Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwok_text_view = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the Version name from the current AndroidFlavor object and set this text on the nameText
        miwok_text_view.setText(currentWord.getmMiwokTranslation());

        //Find the TextView in the list_item.xml layout with the ID version_name
        TextView default_text_view = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the Version name from the current AndroidFlavor object and set this text on the nameText
        default_text_view.setText(currentWord.getmDefaultTranslation());

        //Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            //Set the ImageView to the resource specified in the current Word.
            imageView.setImageResource(currentWord.getmImageResourceId());

            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }else {
            //Otherwise hide the ImageView (SET VISIBILITY TO GONE)
              imageView.setVisibility(View.GONE);
        }
        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorReosurceId );
        //Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout
        return listItemView;

    }
}

