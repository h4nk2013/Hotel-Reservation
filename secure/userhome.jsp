<%@taglib prefix="s" uri="/struts-tags"%>
<s:include value="/include/include.jsp" />


<div align="right">
	<table><tr><td><s:a action="LogoutAction" namespace="/secure">Logout</s:a></td></tr>
	<tr><td><p><br/></p></td></tr>
	<tr><td><p><br/></p></td></tr>
	</table>
</div> 


<div align="center">Welcome to user home
<p />User : <s:property value="#session.user.username" />
<p />Select a menu to continue
<p />
<ul>
	<li>
		<s:a namespace="/general" action="RoomAction">Check Room Availability</s:a>
	</li>
	<li>
		<s:a namespace="/general" action="RoomAction">Allocate Room</s:a>
	</li>
	<li>
		<s:a action="RoomAction" namespace="/secure" method="getOccupiedRooms">De-allocate Rooms</s:a>
	</li>	
</ul>
</div>
<P STYLE="margin-bottom: 0cm"><BR>
</P>



</body>
</html>