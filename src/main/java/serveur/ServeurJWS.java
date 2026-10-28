package serveur;

import jakarta.xml.ws.Endpoint;
import service.Calculatrice;

public class ServeurJWS {

    public static void main(String[] args) {

        Endpoint.publish(
                "http://localhost:8080/calculatrice",
                new Calculatrice()
        );

        System.out.println("Service SOAP lancé...");
        System.out.println("WSDL : http://localhost:8080/calculatrice?wsdl");
    }
}