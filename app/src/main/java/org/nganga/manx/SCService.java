package org.nganga.manx;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by nganga on 9/25/15.
 *
 */

//Retrofit is an open source library from Square which simplifies HTTP communication by turning remote
//Methods declared on the interface represent a single remote API endpoint.
//Annotations describe how the method maps to an HTTP request.
//The library makes downloading JSON or XML data from a web API straightforward.
//Once the data is downloaded, it is parsed into a Plain Old Java Object (POJO)
// which must be defined for each resource in the response


public interface SCService {

    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    public void getRecentTracks(@Query("created_at[from]") String date, Callback<List<Track>> cb);


}
