package com.example.android.stuttgart;

/**
 * Creating the class Location
 */

public class Location {

    private String mName;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Location(String vName, String vDescription, int imageResourceId) {
        mName = vName;
        mDescription = vDescription;
        mImageResourceId = imageResourceId;
    }

    public Location(String vName, String vDescription) {
        mName = vName;
        mDescription = vDescription;
    }


    /**
     * Get the name of the Android version
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the Android version number
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
