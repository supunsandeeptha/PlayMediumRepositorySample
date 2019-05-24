package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;



public class HomeController extends Controller{



    public Result index() {
        return ok();
    }

    //addbook method




    public Result sendName(){

        JsonNode body = request().body().asJson();

        String name = body.get("name").asText();

        System.out.println("Server has received the name " + name);

        return ok(Json.toJson("Your name is //// this is from server " + name));

    }


}
















