package org.nganga.manx;

import com.google.gson.annotations.SerializedName;

//        Notice the @SerializedName annotations on each field and the gson import.
//        The Gson library is an open source library from Google that serializes and deserializes Java objects to (and from) JSON.
//        Above, it’ll take the JSON fetched and map it to the object’s fields,
//        otherwise you would have to write a lot more code to grab the data from JSON and create a Track object with it.
//        This is why we don’t use any setters in the class, Gson will set the fields automatically when a Track object is created.

/**
 * Created by nganga on 9/25/15.
 */
public class Track  {

    @SerializedName("title")
    private String mTitle;

    @SerializedName("id")
    private int mID;

    @SerializedName("stream_url")
    private String mStreamURL;

    @SerializedName("artwork_url")
    private String mArtworkURL;

    public String  getTitle(){
        return mTitle;
    }

    public int getID(){
        return mID;
    }

    public String getStreamURL(){
        return mStreamURL;
    }

    public String getArtworkURL(){
        return mArtworkURL;
    }
}
