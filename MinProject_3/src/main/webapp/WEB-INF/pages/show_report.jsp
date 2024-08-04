<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page isELIgnored="false" %>

<c:choose>
<c:when test="${!empty empData }">
<h1 style="color:red;text-align:center">Employee Report</h1>
<table border="1" align="center" >
<tr style="background:yellow;text:center; Padding:5px">
<th>EmpNo</th> 
<th>Ename</th>
<th>Job</th>
<th>Mgr</th>
<th>HireDate</th>
<th>Sal</th>
<th>Comm</th>
<th>DeptNo</th>
<th>Options</th>
</tr>
<c:forEach var="emp" items="${empData}">
<tr style="color:blue">
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.job}</td>
<td>${emp.mgr}</td>
<td><fmt:formatDate value="${emp.hiredate}" pattern="yyyy-MM-dd"/></td>
<td>${emp.sal}</td>
<td>${emp.comm}</td>
<td>${emp.deptno}</td>
<td><a href="edit?no=${emp.empno }">Edit</a> <a href="delete?no=${emp.empno}" onclick="return confirm('Do you want delete the Employee')">delete</a>    </td>

</tr>






</c:forEach>
</table>
<h2 style="color:green;text-align:center">${resultMsg}</h2>

     <h2 style="text-align:center"><a href="register"  ><button style="color:white; background:green">Add Employee</button></a></h2>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">Employee Data Not Found</h1>
</c:otherwise>
</c:choose>