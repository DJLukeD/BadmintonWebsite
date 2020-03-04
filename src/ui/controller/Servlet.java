package ui.controller;

import domain.db.RacketDB;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")

public class Servlet extends HttpServlet {

    private RacketDB racketLijst = new RacketDB();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        request.setAttribute("minst", racketLijst.getMinstAantal());
        request.setAttribute("lijst", racketLijst.getList());

        RequestDispatcher view = request.getRequestDispatcher("overzicht.jsp");
        view.forward(request, response);
    }


}
