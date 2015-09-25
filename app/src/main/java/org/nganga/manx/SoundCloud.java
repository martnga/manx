package org.nganga.manx;

import retrofit.RestAdapter;

/**
 * Created by nganga on 9/25/15.
 */

//RestAdapter is the class that transforms an API interface into an object which actually makes network requests.
//To use our SCService we create a RestAdapter and then use it to create a real instance of the interface.

public class SoundCloud {


    final static RestAdapter REST_ADAPTER = new RestAdapter.Builder().setEndpoint(Config.API_URL).build();
    final static SCService SC_SERVICE = REST_ADAPTER.create(SCService.class);

    public static SCService getService() {
        return SC_SERVICE;
    }

}
