package controllers;

//import spiffyUrlManipulator;

import models.Id;

public class ServerController {
    private String rootURL = "http://zipcode.rocks:8085";

    private static ServerController svr = new ServerController();

    private ServerController() {}
    //private constructor which makes this a singleton as no one can make an instance anywhere but within this class
    //common design pattern to make the controllers singletons where there's only one handling stuff; also common to have try catch on private constructor as we don't want the program to run if it doesn't get instantiated
    //everything that is static belongs in memory from the beginning;

    public static ServerController shared() {
        return svr;
    }

    public String idGet() {
        // url -> /ids/
        // send the server a get with url
        // return json from server
        return null;
    }
    public String idPost(Id id) {
        // url -> /ids/
        // create json from Id
        // request
        // reply
        // return json
        return null;
    }
    public String idPut(Id id) {
        // url -> /ids/
        return null;
    }


}

// ServerController.shared.doGet()