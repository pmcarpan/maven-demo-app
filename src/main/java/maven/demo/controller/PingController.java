package maven.demo.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(name = "PingController", urlPatterns = { "/ping" })
public class PingController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> data = Map.of("ping", "pong");
        
        Gson gson = new Gson();

        response.setContentType("application/json");
        response.getWriter().write(gson.toJson(data));
    }
}
