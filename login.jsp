<%@taglib prefix="s" uri="/struts-tags" %>
<s:include value="/include/include.jsp" />
<div align="center">
<TABLE WIDTH=20% BORDER=0 BORDERCOLOR="#aabbcc">
	<TR VALIGN=TOP>
		<TH colspan="2">
			<s:text name="app.loginPage.title" />
		</TH>
	</TR>
	<TR VALIGN=TOP>
		<TD colspan="2">
		</TD>
	</TR>
</TABLE>
<s:actionerror />
<s:form method="POST" action="LoginAction!authenticate" namespace="/" validate="true" >
	<s:textfield key="app.username" name="username" required="true" />
	<s:password key="app.password" name="password" required="true" />
	<s:submit key="app.submit" name="submit" />
</s:form>

	



</div>
<P STYLE="margin-bottom: 0cm"><BR>
</P>



</body>
</html>