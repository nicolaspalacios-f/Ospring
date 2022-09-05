package edu.escuelaing.arep.app;

public class HttpServerController {
    public static void main(String[] args) {
        HttpServer server = HttpServer.getInstance();
        try {
            RunRequestMapping.run();
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
