<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Registration Page</title>
</head>
<body>
<form action="process.jsp">
<input type="text" name="uname" value="Name" onclick="this.value="/><br/>
<input type="text" name="uemail" value="EmailId" onclick="this.value="/><br/>
<input  type="password" name="unpass" value="Password" onclick="this.value="/><br/>
<input type="submit" value="register"></input>
</form>

</body>
</html>