package maven.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import maven.demo.repository.ProductRepository;

@WebServlet(name = "ProductController", urlPatterns = { "/products" })
public class ProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Gson gson = new Gson();

        response.setContentType("application/json");
        response.getWriter().write(
            gson.toJson(
                ProductRepository.getProducts()
            )
        );
    }
}

