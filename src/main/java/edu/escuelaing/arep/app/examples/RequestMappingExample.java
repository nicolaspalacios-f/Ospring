package edu.escuelaing.arep.app.examples;

import edu.escuelaing.arep.app.anotaciones.RequestMapping;

public class RequestMappingExample {

    @RequestMapping("/index")
    public static String index() {
        return "<html><body><h1>Bienvenido al index</h1> <br/><center></center></body></html>";
    }

    @RequestMapping("/profe5")
    public static String profe5() {
        return "<html><body><h1>Un 5 Fijo Profe</h1> <br/><center><img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSdxE8_Ko2Qi7wqZpbb_0i0rwN3ohmNXHqoUOMOl2A9w&s\"</center></body></html>";
    }
}
