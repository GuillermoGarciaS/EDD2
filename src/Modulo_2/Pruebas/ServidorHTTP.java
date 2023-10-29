package Modulo_2.Pruebas;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

public class ServidorHTTP {

    public static void main(String[] args) throws IOException {

        final int puerto = 9009;

        HttpServer httpd = HttpServer.create(new InetSocketAddress(puerto), 0);

        HttpContext ctx = httpd.createContext("/");
        ctx.setHandler(ServidorHTTP::gestionarSolicitud);

        httpd.start();

    }

    private static void gestionarSolicitud(HttpExchange exchange) throws IOException {

            final int codigoDeRespuesta = 200;
            String contenido = "Respuesta desde el servidor HTTP";

            exchange.sendResponseHeaders(codigoDeRespuesta, contenido.getBytes().length);

            OutputStream os = exchange.getResponseBody();

            os.write(contenido.getBytes());
            os.close();
        }

}