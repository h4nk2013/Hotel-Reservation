<%@taglib prefix="s" uri="/struts-tags" %>

<s:include value="/include/include.jsp" />
<s:if test="#session.user != null">
<div align="right">
	<table>
		<tr>
			<td><s:a action="LogoutAction" namespace="/secure">Logout</s:a></td>
		</tr>
		<tr><td><p><br/></p></td></tr>
		<tr><td><p><br/></p></td></tr>
	</table>
</div> 
</s:if>
<div align="center">
<TABLE WIDTH=40% BORDER=1 BORDERCOLOR="#aabbcc">
	<caption>Available Rooms</caption>
	<tr>
		<th>Room Number</th>
		<th>Room Type</th>
	</tr>
	<s:iterator value="rooms">
	<tr>
		<td>
			<s:a namespace="/secure" method="allocateRoom" action="RoomAction" >
				<s:param name="roomNumber" value="roomNumber"/><s:property value="roomNumber"/> Allocate
			</s:a>
		</td>
		<td>
			<s:property value="roomType"/>
		</td>
	</tr>	
	</s:iterator>
	<tr>
		<td align="center" colspan="2"><s:a action="BackAction" namespace="/">Back</s:a></td>
	</tr>
		
</TABLE>
</div>
<P STYLE="margin-bottom: 0cm"><BR>
</P>



</body>
</html>