<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
    <head><title>Sort Numbers</title></head>
    <body >
        <h1>Sorting the Numbers</h1>
        <div style="color: red">${exception}</div>
        <form action="/sort" method="POST">
            <table>
                <tr>
                    <td><label>Enter Numbers to Sort</label></td>
                    <td> <input type="text" name="sortingRequest" placeholder="eg. 4,1,7,0"/></td>
                    <td><input type="submit" value="Sort" /></td></tr>
            </table>
        </form>
         <table >
            <tr>
                <td>Given Input to Sort     : </td>
                <td>${input}</td>
            </tr>

            <tr>
                <td>Sorted Output           : </td>
                <td>${output}</td>
            </tr>
            <tr>
                <td>Time taken to sort in ms: </td>
                <td>${timeTaken}</td>
            </tr>
            <tr>
                <td>Position changed [number (number of positions changed)] :</td>
                <td>${positionChanged}</td>
            </tr>
        </table>
    </body>

</html>
