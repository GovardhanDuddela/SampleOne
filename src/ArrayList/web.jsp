
<!DOCTYPE html>
<html>
<head>
<script>
 function validateForm(){
	 var x=document.forms["student"]["name"].value;
	 if (x==""){
		 alert("Name cannot be empty");
		 return false
	 }
	 var y=document.forms["student"]["fathername"].value;
	 if (y==""){
		 alert("Father Name cannot be empty");
		 return false
	 }
	 var z=document.forms["student"]["postaladdress"].value;
	 if (z==""){
		 alert("Postal Address cannot be empty");
		 return false
	 }
	 var a=document.forms["student"]["personaladdress"].value;
	 if (a==""){
		 alert("Personal Address cannot be empty");
		 return false
	 }
	 var b=document.forms["student"]["gender"].value;
	 if (b==""){
		 alert("Select a gender");
		 return false
	 }
	 var c=document.forms["student"]["city"].value;
	 if (c=="Nothing"){
		 alert("Select a city");
		 return false
	 }
	 var d=document.forms["student"]["course"].value;
	 if (d=="Nothing"){
		 alert("Select a course");
		 return false
	 }
	 var e=document.forms["student"]["state"].value;
	 if (e=="Nothing"){
		 alert("Select a state");
		 return false
	 }
	 var f=document.forms["student"]["email"].value;
	 if (f==""){
		 alert("Email cannot be empty");
		 return false
	 }
	 var g=document.forms["student"]["dob"].value;
	 if (g==""){
		 alert("DOB can't be empty");
		 return false
	 }

 }

</script>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
<style>
div {
background-color: aqua;
  width: 260px;
  margin: 0;
}
</style>
</head>
<body>
<div>
<form name="student" onsubmit="return validateForm()">
<h3 align="center">Student Registration Form</h3>
<table >
<tr >
  <th width="60" align="left"></th>
  <th width="300"></th>
<tr>
 <td>Name</td>
 <td><input type="text" name="name" /></td>
</tr>
<tr>
 <td>Father Name</td>
 <td><input type="text" name="fathername"/></td>
</tr>
<tr>
 <td>Postal Address</td>
 <td><input type="text" name="postaladdress"/></td>
</tr>
<tr>
 <td>Personal Address</td>
 <td><input type="text" name="personaladdress"/></td>
</tr>
<tr>
 <td>Gender </td>
 <td><input type="radio" name="gender" value="Male"/>Male
 <input type="radio" name="gender" value="Female"/>Female
 <input type="radio" name="gender" value="Other"/>Other
 </td>
</tr>
<tr>
 <td>City</td>
 <td><select name="city">
 <option value="Nothing">select..</option>
 <option value="Delhi">Delhi</option>
 <option value="Hyderabad">Hyderabad</option>
 <option value="Mumbai">Mumbai</option>
 <option value="Kolkata">Kolkata</option>
 <option value="Chennai">Chennai</option>
 <option value="Vijayawada">Vijayawada</option>
 </select></td>
</tr>
<tr>
 <td>Course</td>
 <td><select name="course">
 <option value="Nothing">select..</option>
 <option value="Java">Java</option>
 <option value="C">C</option>
 <option value="C++">C++</option>
 <option value="Python">Python</option>
 <option value="Ruby">Ruby</option>
 <option value="Fortran">Fortran</option>
 </select></td>
</tr>
<tr>
 <td>State</td>
 <td><select name="state">
 <option value="Nothing">select..</option>
 <option value="AP">Andhra Pradesh</option>
 <option value="TN">Tamil Nadu</option>
 <option value="KN">Karnataka</option>
 <option value="MH">Maharashtra</option>
 <option value="WB">West Bengal</option>
 <option value="TG">Telangana</option>
 </select></td>
</tr>
<tr>
 <td>Pin Code</td>
 <td><input type="number" name="pincode" pattern=[0-9]{6} required/></td>
</tr>
<tr>
 <td>EmailID</td>
 <td><input type="email" name="email"/></td>
</tr>
<tr>
 <td>DOB</td>
 <td><input type="date" name="dob"/></td>
</tr>
<tr>
 <td>Phone Number</td>
 <td><input type="number" name="phone" pattern=[0-9]{10} required/></td>
</tr>
<tr>
 <td><input type="reset" value="Reset"/></td>
 <td><input type="submit" value="Submit Form"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>