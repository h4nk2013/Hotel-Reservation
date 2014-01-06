<%@taglib prefix="s" uri="/struts-tags" %>
<s:include value="/include/include.jsp" />



<div align="right"><table><tr><td><s:a action="LogoutAction" namespace="/secure">Logout</s:a></td></tr>
<tr><td><p><br/></p></td></tr>
<tr><td><p><br/></p></td></tr>
</table></div> 

<div align="center">
<TABLE WIDTH=40% BORDER=1 BORDERCOLOR="#aabbcc">
<caption>Occupied Rooms</caption>
<tr>
<th>Room Number</th>
<th>Room Type</th>
</tr>
	<s:iterator value="rooms">
<tr>
<td>
	<s:a namespace="/secure" action="RoomAction" method="deallocateRoom" >
		<s:param name="roomNumber" value="roomNumber"/><s:property value="roomNumber"/> De-Allocate
	</s:a>
</td>
<td>
	<s:property value="roomType"/> 
</td>
</tr>	
	</s:iterator>
<tr>
<td colspan="2" align="center">
<s:a action="BackAction" namespace="/">Back</s:a>
</td>
</tr>
</TABLE>
</div>
<P STYLE="margin-bottom: 0cm"><BR>
</P>
</body>
</html>