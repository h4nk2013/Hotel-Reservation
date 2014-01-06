<%@taglib prefix="s" uri="/struts-tags" %>
<s:include value="/include/include.jsp" />


<div align="center">
<TABLE WIDTH=60% BORDER=1 BORDERCOLOR="#aabbcc">
	<TR VALIGN=TOP>
		<TD WIDTH=50%>
			<s:a namespace="/general" action="RoomAction"><s:text name="app.home.checkAvailability" /></s:a>			

		</TD>
		<TD WIDTH=50%>
			<s:a namespace="/" action="LoginAction" method="input"><s:text name="app.login" /></s:a>
	
		</TD>
	</TR>
</TABLE>
</div>
<P STYLE="margin-bottom: 0cm"><BR>
</P>



</body>
</html>