package controllers;


import play.libs.Json;
import play.mvc.*;
import services.DatasetService;

import javax.inject.Inject;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class HomeController extends Controller {
    private DatasetService datasetService;

    @Inject
    public HomeController(DatasetService datasetService) {
        this.datasetService = datasetService;
    }

    public Result getDatasetAll(){
        Map<String,Object> datasetget = datasetService.getAll();
        int statusCode = (int) datasetget.get("responseCode");
        return statusCode == 404 ? notFound(Json.toJson(datasetget)) : ok(Json.toJson(datasetget));
    }
    public Result getDatasetById(String id){
        Map<String,Object> datasetgetbyid = datasetService.getById(id);
        int statusCode = (int) datasetgetbyid.get("responseCode");
        return statusCode == 404 ? notFound(Json.toJson(datasetgetbyid)) : ok(Json.toJson(datasetgetbyid));
    }
}
