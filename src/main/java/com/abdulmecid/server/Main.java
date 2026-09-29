package com.abdulmecid.server;
import com.sun.net.httpserver.*;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
            server.setExecutor(null); 

            server.createContext("/", exchange -> {
                System.out.println(exchange.getRequestMethod());
                System.out.println(exchange.getRequestBody());
                System.out.println(exchange.getRequestHeaders());
                System.out.println(exchange.getRequestURI());
                exchange.sendResponseHeaders(200, 0);
                exchange.close();
            });
            server.start();

            System.out.println("Server started on port 8080");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

