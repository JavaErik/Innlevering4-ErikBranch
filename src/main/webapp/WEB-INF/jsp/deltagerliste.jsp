<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="css/simple.css" />
    <title>Deltagerliste</title>
  </head>
  <body>
    <h2>Deltagerliste</h2>
    <p></p>
    <table>
      <tr>
        <th>Kjønn</th>
        <th>Navn</th>
        <th>Mobil</th>
      </tr>
      <c:if test="${empty deltagere}">
        <tr>
          <td colspan="3">Ingen deltagere</td>
        </tr>
      </c:if>
      <c:forEach items="${deltagere}" var="deltager">
        <tr>
          <td>
            <c:choose>
              <c:when test="${deltager.kjonn == 'kvinne'}">&#x2640;</c:when>
              <c:otherwise>&#x2642;</c:otherwise>
            </c:choose>
          </td>
          <td>${deltager.fornavn} ${deltager.etternavn}</td>
          <td>${deltager.mobilnummer}</td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>