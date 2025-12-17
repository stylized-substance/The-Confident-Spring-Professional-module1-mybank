package org.stylizedsubstance.mybank.web;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.stylizedsubstance.mybank.model.Transaction;
import org.stylizedsubstance.mybank.context.Application;

import java.io.IOException;
import java.util.List;

public class MyBankServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (request.getRequestURI().equalsIgnoreCase("/transactions")) {
            response.setContentType("application/json; charset=UTF8");
            List<Transaction> transactions = Application.transactionService.findAll();
            response.getWriter().print(Application.objectMapper.writeValueAsString(transactions));
        }
    }
}
