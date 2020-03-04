<%@ page import="domain.model.Racket" %>

<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="nl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Home - BC Tervuren</title>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<header>
    <a href="index.jsp"> <img src="img/Logores.png" alt="BC Tervuren - logo"></a>
    <h1>BC Tervuren</h1>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="bestel.jsp">Bestel</a></li>
            <li><a href="Servlet">Overzicht</a></li>
        </ul>
    </nav>
</header>
<main>
    <h2> Uw bestelde rackets zijn</h2>
    <table>
        <thead>
        <tr>
            <th>Merk</th>
            <th>Aantal</th>
            <th>Prijs (in EURO)</th>
            <th>Bespanning (in kg)</th>
        </tr>
        </thead>
        <tbody>
        <%
            ArrayList<Racket> rackets = (ArrayList<Racket>) request.getAttribute("lijst");

            for (Racket r : rackets) {
                if (r != null) {

        %>
        <tr>
            <td><%=r.getNaam()%>
            </td>
            <td><%=r.getAantal()%>
            </td>
            <td><%=r.getTotaalPrijs()%>
            </td>
            <td><%=r.getAantalKiloBespanning()%>
            </td>
        </tr>
        <%
                }
            }
        %>


        </tbody>

    </table>
    <p>Het merk van rackets die het minst in stock zijn, is <strong><%=request.getAttribute("minst")%> </strong>.
    </p>
</main>
<footer>
    <article>
        <h3>Sporthal Diependal</h3>
        <address>

            <ul>
                <li>Lindeboomstraat 30, 3080 Tervuren</li>
                <li>02/767.75.25</li>
            </ul>
        </address>
    </article>
    <article>
        <h3>Sporthal GITO-Tervuren</h3>
        <address>
            <ul>
                <li>Pater Dupierreuxlaan 1B, 3080 Tervuren</li>
                <li>02/766.53.62</li>
            </ul>
        </address>
    </article>
</footer>
</body>
</html>
