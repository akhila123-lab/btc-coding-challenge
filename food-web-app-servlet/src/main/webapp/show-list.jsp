<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="true"%>
<!DOCTYPE html>
<html>

<body>
   <!-- <h2 >"hello"+ ${menuItemsName}</h2> -->
  <%=request.getAttribute("listItems") %> 
  
  <%=request.getAttribute("menuItemsName") %> 
</body>
</html>