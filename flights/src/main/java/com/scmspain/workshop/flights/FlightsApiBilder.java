package com.scmspain.workshop.flights;

import retrofit.RestAdapter;

public class FlightsApiBilder {
  static public FlightsApi  getFlightsApi(String endpoint) {
    RestAdapter restAdapter = new RestAdapter.Builder()
        .setEndpoint(endpoint)
        .build();
    return restAdapter.create(FlightsApi.class);
  }
}
