package com.example.android.miwok;

/**
 * Created by admin on 2017/01/24.
 * {@Link Word} represents a vocabulary word that the user wants to learn
 * It containd a defualt translation and a  Miwork translation for that word.
 */

public class Word {
    //Default translation for the word.
    private String mDefaultTranslation;

    // Miwork translation for the word.
    private String mMiwokTranslation;

    /**Image resource ID for the word*/
    private int mImageResourceId = No_IMAGE_PROVIDED;

    /** no image state*/
    private static final int No_IMAGE_PROVIDED = -1;

    // Now we build the constructor

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    // Now we build the constructor
    // imageResourceID is the drawable resource ID for the image associated with word.
    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the default translation for the word
     */
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

        /**
          * Returns whether or not there is an image for this word.
          */
        public boolean hasImage(){
          return mImageResourceId != No_IMAGE_PROVIDED;


    }

  }


