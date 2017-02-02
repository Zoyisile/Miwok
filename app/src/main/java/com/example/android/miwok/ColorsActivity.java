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
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "wetetti", R.drawable.color_red));
        words.add(new Word("mustard yellow","chiwiite", R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow", "topiise", R.drawable.color_dusty_yellow));
        words.add(new Word("green", "chokokki", R.drawable.color_green));
        words.add(new Word("brown", "takaakki", R.drawable.color_brown));
        words.add(new Word("gray", "topoppi", R.drawable.color_gray));
        words.add(new Word("black", "kululli",R.drawable.color_black));
        words.add(new Word("white", "kulelli", R.drawable.color_white));

        //Create an ArrayAdapter , who's data source is a list of Strings.
        WordAdapter adapter = new WordAdapter(this,words, R.color.category_colors);

        //Find the listView object in the view hierarchy of the link activity.
        ListView listView = (ListView) findViewById(R.id.list);

        //Make the ListView use the link ArrayAdapter we have created above so that the
        //ListView will display list items for each word in the list of words.
        listView.setAdapter(adapter);
    }
}