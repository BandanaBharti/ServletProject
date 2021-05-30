<%@page import="bean.RegisterDao2"%>  
<jsp:useBean id="obj" class="bean.User"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
int status=RegisterDao2.register(obj);  
if(status>0)  
out.print("You are successfully registered");  
  
%>  