<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova Banda</title>
</head>
<body>
    <div align="center">
        <h2>Nova Banda</h2>
        <form:form action="save" method="post" modelAttribute="banda">
            <table style="border-collapse: separate; border-spacing: 10px;">
                <tr>
                    <td>Nome: </td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>genero: </td>
                    <td><form:input path="genero" /></td>
                </tr>
               
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
    </div>
</body>
</html>