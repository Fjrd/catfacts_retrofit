package service;

import domain.CatFact;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CatFactService {

    @GET("/facts/random")
    public Call<CatFact> getRandomCatFact();
}
