<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@include file="header.jsp" %>


<table cellspacing=1 cellpadding=3 align=center class=tableBorder2>
		<tr>
		<td height=25 valign=middle>
                  <img src="../images/Forum_nav.gif" align="middle">
                  <a href=index.jsp>���յ��������Ż�</a> ��
					<img border="0" src="../images/dog.gif" width="19" height="18">
					${user.username} ȷ�϶���
                </td>
                </tr>
		</table>
              <br>

		<form name="order" method="post" action="saveOrder"/>
		<table cellpadding="3" cellspacing="1" align="center" class="tableborder1" id="table1">
		<tr>
			<td valign="middle" colspan="2" align="center" height="25" background="../images/bg2.gif">
			<font color="#ffffff"><b>�û���Ϣ</b></font><input type="button" value="�޸�" onclick="javascript:window.location='userinfo.jsp';"></td>
		</tr>
		<tr>
			<td width="40%" class="tablebody2" align="right"><b>�û���</b>��</td>
			<td width="60%" class="tablebody1">${user.username }</td>
		</tr>
		<tr>
			<td class="tablebody2" align="right"><b>��ϵ��ַ</b>��</td>
			<td class="tablebody1">${user.province}ʡ${user.city}��${user.addressone}</td>
		</tr>
		<tr>
			<td class="tablebody2" align="right"><b>�ʱ�</b>��</td>
			<td class="tablebody1">${user.postcode}</td>
		</tr>
		<tr>
			<td class="tablebody2" align="right"><b>��ͥ�绰</b>��</td>
			<td class="tablebody1">${user.familyPhone }</td>
		</tr>
		<tr>
			<td class="tablebody2" align="right"><b>�칫�ҵ绰</b>��</td>
			<td class="tablebody1">${user.officePhone }</td>
		</tr>
		<tr>
			<td class="tablebody2" align="right"><b>�ֻ�</b>��</td>
			<td class="tablebody1">${user.telPhone }</td>
		</tr>
		<tr>
			<td class="tablebody2" align="right"><b>Email��ַ</b>��</td>
			<td class="tablebody1">${user.email}</td>
		</tr>
	</table>
<br>
<!--�ļ�β��ʼ-->
		<table cellpadding="3" cellspacing="1" align="center" class="tableborder1" id="table2">
		<tr>
			<td valign="middle" colspan="2" align="center" height="25" background="../images/bg2.gif">
			<font color="#FFFFFF"><b>���ʽ</b></font></td>
		</tr>
		<tr>
			<td width="40%" class="tablebody2" align="right">��</td>
			<td width="60%" class="tablebody1">
                          <select name="payway">
                            
		                          	<option value="2">�ʾֻ�� </option>
                          	
		                          	<option value="1">��������</option>
                          	
		                          	<option value="3">����ת��</option>
                          	
                          </select></td>
		</tr>
		</table>
		<br>
		<table cellpadding=3 cellspacing=1 align=center class=tableborder1 id="table3">
		<tr>
			<td valign=middle align=center height=25 background="../images/bg2.gif" colspan="5">
			<font color="#ffffff"><b>��Ʒ�����嵥</b></font><input type="button" value="�޸�" onclick="javascript:window.location='../shopcart.jsp';"></td>
		</tr>
          <c:forEach items="${sp.map}" var="m" varStatus="vs">      
		<tr>
			<td class=tablebody2 valign=middle align=center width="">${vs.index+1 }</td>
			<td class=tablebody1 valign=middle width="">&nbsp;&nbsp;<a href="productDetail.jsp?productid=2">${m.value.book.name }</a></td>
			<td class=tablebody2 valign=middle align=center width="">�۸�${m.value.book.price }</td>
			<td class=tablebody1 valign=middle align=center width="">������${ m.value.num}</td>
			<td class=tablebody2 valign=middle align=left width="">С�ƣ�&nbsp;&nbsp;��${m.value.book.price*m.value.num }</td>
		</tr>
         </c:forEach>       
		<tr>
			<td class=tablebody1 valign=middle align=center colspan="4">��</td>
			<td class=tablebody1 valign=middle align=left width="">�ϼƣ�<font color="#ff0000"><b>��${sp.cost}</b></font></td>
		</tr>
		        </table>
		        <p align="center">�����������϶�����Ϣ��ȷ������󣬵�� �� <a onclick="javascript:document.order.submit();" style="cursor:hand"><img src="../images/submit.gif"></a>
		</form>
</p>
<jsp:include page="footer.html"/>	
