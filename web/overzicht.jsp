<%--
  Created by IntelliJ IDEA.
  User: Lukas
  Date: 24/02/2020
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
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
            <li><a href="overzicht.jsp">Overzicht</a></li>
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

        <tr>
            <td>Astrox</td>
            <td>6</td>
            <td>1020</td>
            <td>8.3</td>
        </tr>

        <tr>
            <td>Voltric</td>
            <td>3</td>
            <td>420</td>
            <td>10.5</td>
        </tr>

        <tr>
            <td>Nanoflare</td>
            <td>3</td>
            <td>480</td>
            <td>9</td>
        </tr>


        </tbody>
    </table>
</main>
<footer>
    <h3>Sporthal Diependal</h3>
    <address>

        <ul>
            <li>Lindeboomstraat 30, 3080 Tervuren</li>
            <li>02/767.75.25</li>
        </ul>
    </address>
    <h3>Sporthal GITO-Tervuren</h3>
    <address>
        <ul>
            <li>Pater Dupierreuxlaan 1B, 3080 Tervuren</li>
            <li>02/766.53.62</li>
        </ul>
    </address>
</footer>
</body>
</html>
