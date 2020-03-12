package ui.controller;

import domain.db.RacketDB;
import domain.model.Racket;

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

        String merk = request.getParameter("merk");
        String aantalFromParameter = request.getParameter("aantal");
        int aantal = Integer.parseInt(aantalFromParameter);
        String bespanningFromParameter = request.getParameter("bespanning");
        double bespanning = Double.parseDouble(bespanningFromParameter);
        String prijsFromParameter = request.getParameter("prijs");
        double prijs = Double.parseDouble(prijsFromParameter);


            Racket racket = new Racket(merk, aantal, bespanning, prijs);
            racketLijst.voegToe(racket);
            request.setAttribute("racket", racket);
            request.setAttribute("minst", racketLijst.getMinstAantal());
            request.setAttribute("lijst", racketLijst.getList());



        RequestDispatcher view = request.getRequestDispatcher("overzicht.jsp");
        view.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        request.setAttribute("minst", racketLijst.getMinstAantal());
        request.setAttribute("lijst", racketLijst.getList());

        RequestDispatcher view = request.getRequestDispatcher("overzicht.jsp");
        view.forward(request, response);
    }


}
