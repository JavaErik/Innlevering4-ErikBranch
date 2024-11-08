<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Logg inn</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Logg inn</h1>

    <c:if test="${not empty errorMessage}">
        <p class="error-message">${errorMessage}</p>
    </c:if>

    <form action="/loginn" method="get">
        <label for="mobil">Mobilnummer:</label>
        <input type="text" id="mobil" name="mobil" required>
        
        <label for="passord">Passord:</label>
        <input type="password" id="passord" name="passord" required>
        
        <button type="submit">Logg inn</button>
    </form>

    <style>
        .error-message {
            color: red;
            font-weight: bold;
        }
    </style>
</body>
</html>