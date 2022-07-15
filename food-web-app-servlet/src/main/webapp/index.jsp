

<html>
<body>
<h2>Add MenuItem</h2>
<form action="new" method="post">
Menu id:<input type="number" name="menuid">

Item Name:<input type="text" name="itemName">

Select Status:<select name="items">
   <option value="available"	></option>
  <option value="available"	>available</option>
  <option value=" not - available"	>not available</option>
  </select>

price<input type="number" name="price">

cateogery<select name="cateogery">
   <option value="available"	></option>
  <option value="veg"	>veg</option>
  <option value=" non-veg"	>non-veg</option>
  </select>    
 <button type="submit">Enter</button>
 </form>
 <h2>Get all Items</h2>
 <form action="list" method="get">
  <button type="submit">Enter</button>
  </form>
  
 <h3>Delete Id</h3>
<form action="delete" method="get">
menu ID : <input type="number" name="menuid">
<button type="submit">Delete</button>    
  </form>
  
  <h3>search by name</h3>
  <form action="name" method="get">
Item Name : <input type="String" name="itemName">
<button type="submit">Delete</button>    
  </form>
  
</body>
</html>

