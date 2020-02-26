<%--
  Created by IntelliJ IDEA.
  User: Lukas
  Date: 24/02/2020
  Time: 16:19
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
    <div id="inspringen">
        <div action="#">
            <h2>Bestel hier je rackets.</h2>
            <p>
                <label for="merk">Merk*</label>
                <input id="merk" type="text" name="merk" required>
            </p>
            <p>
                <label for="aantal">Aantal (tussen 1-10)*:</label>
                <input type="number" id="aantal" name="aantal" min="1" max="10" required>
            </p>

            <p>
                <label for="prijs">Prijs*</label>
                <input id="prijs" type="number" min="0"name="prijs" required>
            </p>

            <p>
                <label for="bespanning">Bespanning</label>
                <input id="bespanning" type="number" step="any" min="0" name="bespanning">
            </p>

            <ul id="knoppen">
                <li id="reset">
                    <input type="reset" value="Reset">
                </li>
                <li>
                    <input type="submit" value="Verzend">
                </li>
            </ul>
            </form>
        </div>
    </div>
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
