import domain.CatFact;
import retrofit2.Call;
import service.CatFactCallBack;
import service.CatFactService;
import service.CatFactServiceGenerator;

public class Main {

    public static void main(String[] args) {
        CatFactService catFactService
                = CatFactServiceGenerator
                .createService(CatFactService.class);

        Call<CatFact> callAsync = catFactService.getRandomCatFact();
        callAsync.enqueue(new CatFactCallBack());

    }
}
