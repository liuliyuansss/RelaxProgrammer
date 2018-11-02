<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2018/10/30
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>ss</h1>
<h1>${r}</h1>
<h1>${ee}</h1>
<table>
  <c:forEach items="${Category1}" var="category" >
    <c:if test="${category.parent_id == 0}">
      <tr>
        <td>
          <h2><a href="">${category.name}</a></h2>
        </td>
      </tr>
      <c:forEach items="${Category1}" var="category1">
        <c:if test="${category1.parent_id == category.id}">
          <tr>
            <td></td>
            <td>
              <h3><a href="">${category1.name}</a></h3>
            </td>

          </tr>
          <tr>
            <td></td><td></td>
            <c:forEach items="${Category1}" var="category2">
              <c:if test="${category1.id == category2.parent_id}">
                <td><h4><a href="">${category2.name}</a></h4>&nbsp;&nbsp;</td>
              </c:if>
            </c:forEach>
          </tr>
        </c:if>
      </c:forEach>
    </c:if>
  </c:forEach>
</table>
</body>
</html>
