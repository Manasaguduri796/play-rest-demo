package controllers;

import play.mvc.*;

public class HomeController extends Controller {

    public Result welcome( String name){
        return ok(name);
    }

}
