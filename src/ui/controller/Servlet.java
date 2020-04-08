package ui.controller;

import domain.db.RacketDB;
import domain.model.Racket;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;

@WebServlet("/Servlet")

public class Servlet extends HttpServlet {

    private RacketDB racketLijst = new RacketDB();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        processRequest(request, response);

        /* request.setAttribute("minst", racketLijst.getMinstAantal());
        request.setAttribute("lijst", racketLijst.getList());

        RequestDispatcher view = request.getRequestDispatcher("overzicht.jsp");
        view.forward(request, response); */
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        processRequest(request, response);
        /* String merk = request.getParameter("merk");
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
        view.forward(request, response); */

    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String command = "home";
        if (request.getParameter("command") != null) {
            command = request.getParameter("command");
        }

        String destination;
        switch (command) {
            case "home":
                destination = home(request, response);
                break;
            case "overzicht":
                destination = overview(request, response);
                break;
            case "add":
                destination = add(request, response);
                break;
            case "delete":
                destination = delete(request, response);
                break;
            case "zoek":
                destination = zoek(request, response);
                break;
            default:
                destination = home(request, response);
        }

        request.getRequestDispatcher(destination).forward(request, response);
    }

    private String home(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("minst", racketLijst.getMinstAantal());
        return "index.jsp";
    }

    private String overview(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("lijst", racketLijst.getAlle());
        request.setAttribute("minst", racketLijst.getMinstAantal());
        return "overzicht.jsp";
    }

    private String add(HttpServletRequest request, HttpServletResponse response) {
        String merk = request.getParameter("merk");
        String aantal = request.getParameter("aantal");
        String bespanning = request.getParameter("bespanning");
        String prijs = request.getParameter("prijs");

        if (merk != null && aantal != null && bespanning != null && prijs != null) {
            Racket r = new Racket(merk, Integer.parseInt(aantal), Double.parseDouble(bespanning), Double.parseDouble(prijs));
            racketLijst.voegToe(r);
            request.setAttribute("minst", racketLijst.getMinstAantal());
            request.setAttribute("lijst", racketLijst.getList());
            return "overzicht.jsp";
        }
        return "voegToe.jsp";
    }

    private String delete(HttpServletRequest request, HttpServletResponse response){
        String merk = request.getParameter("merk");

        request.setAttribute("merk", merk);
        return "bevestiging.jsp";
    }

    private String zoek(HttpServletRequest request, HttpServletResponse response){
        String merk = request.getParameter("merk");
        String destination = "";
        if(merk == null || merk.trim().isEmpty()){
            destination = "nietGevonden.jsp";
        }else {
            Racket racket = racketLijst.getRacket(merk);
            if(racket == null){
                destination = "nietGevonden.jsp";
            }else {
                destination = "gevonden.jsp";
                request.setAttribute("racket", racket);
            }
        }
        return destination;
    }


}



