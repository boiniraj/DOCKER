<%@ page isELIgnored="false"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix="frm"%>

<frm:form modelAttribute="emp">

<table align="center" bgcolor="cyan">
<h2 align="center">Registration form</h2>
<tr>
<td>Employee Name<td>
<td><frm:input path="ename"/><td>
</tr>

<tr>
<td>Employee Job<td>
<td><frm:input  path="job"/><td>
</tr>

<tr>
<td>Employee Mgr<td>
<td><frm:input path="mgr"/><td>
</tr>


<tr>
<td>Employee Hiredate<td>
<td><frm:input  path="hiredate"/><td>
</tr>

<tr>
<td>Employee Salary<td>
<td><frm:input  path="sal"/><td>
</tr>


<tr>
<td>Employee Comm<td>
<td><frm:input path="comm"/><td>
</tr>



<tr>
<td>Employee Dept<td>
<td><frm:input path="deptno"/><td>
</tr>



<tr>

<td><input type="submit" value="Register"/></td>

<td><input type="reset" value="Cancel"/></td>

</tr>
</table>
</frm:form>