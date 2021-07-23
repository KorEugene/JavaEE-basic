package ru.geekbrains.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.converter.JSONConverter;
import ru.geekbrains.factory.Factory;
import ru.geekbrains.model.Product;
import ru.geekbrains.model.ProductTitle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet(name = "ProductList", urlPatterns = "/product_list")
public class ProductListServlet extends HttpServlet {

    private static final Random RANDOM = new Random();
    private static final Logger logger = LoggerFactory.getLogger(ProductListServlet.class);
    private static final int PRODUCTS_COUNT = 10;

    private final JSONConverter converter = Factory.getJSONConverter();

    // http://localhost:8080/jee_webapp/product_list
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Product list Get request");

        List<String> products = new ArrayList<>();

        ProductTitle[] titles = ProductTitle.values();

        for (int i = 0; i < PRODUCTS_COUNT; i++) {
            products.add(converter.convertToJSON(new Product(i + 1, titles[i].getTitle(), RANDOM.nextInt(1000))));
        }

        req.setAttribute("products", products);
        req.getRequestDispatcher("/list.jsp").forward(req, resp);

    }
}
