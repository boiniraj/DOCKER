<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page isELIgnored="false" %>

<c:choose>
<c:when test="${!empty empData }">
<h1 style="color:red;text-align:center">Employee Report</h1>
<table border="1" align="center" border="cyan" padding="5px">
<tr style="bgcolor:yellow;text:center;">
<th>EmpNo</th> 
<th>Ename</th>
<th>Job</th>
<th>Mgr</th>
<th>HireDate</th>
<th>Sal</th>
<th>Comm</th>
<th>DeptNo</th>
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

</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">Employee Data Not Found</h1>
</c:otherwise>
</c:choose>