package controllers;

import play.mvc.*;

import java.util.concurrent.CompletableFuture;

public class HomeController extends Controller {

   public Result getDatasetAll(){

       return ok();

   }
   public Result getDatasetById(){

       return ok();
   }

    public CompletableFuture<Result> getDatasetById(){

        return ok();
    }

}
