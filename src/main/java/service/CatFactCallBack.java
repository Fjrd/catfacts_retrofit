package service;

import domain.CatFact;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CatFactCallBack implements Callback<CatFact> {


    public void onResponse(Call<CatFact> call, Response<CatFact> response) {
        System.out.println(response.body().getText());
    }

    public void onFailure(Call<CatFact> call, Throwable throwable) {
        System.out.println(throwable);

    }
}
