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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "Tinne oyaase'ne"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michekses?"));
        words.add(new Word("I'm feeling good.", "Kuchi achit"));
        words.add(new Word("Are you coming?", "eenes' aa?"));
        words.add(new Word("Yes, I'm coming.", "hee' eenem"));
        words.add(new Word("I'm coming.", "eenem"));
        words.add(new Word ("Let's go.", "yoowutis"));
        words.add(new Word("Come here.", "enni'nem"));

        //Create an ArrayAdapter , who's data source is a list of Strings.
        WordAdapter adapter = new WordAdapter(this,words, R.color.category_phrases);

        //Find the listView object in the view hierarchy of the link activity.
        ListView listView = (ListView) findViewById(R.id.list);

        //Make the ListView use the link ArrayAdapter we have created above so that the
        //ListView will display list items for each word in the list of words.
        listView.setAdapter(adapter);
    }
}
