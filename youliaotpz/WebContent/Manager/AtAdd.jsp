<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<s:form action="ManageAtActionadd.action" method="post" enctype="multipart/form-data">
			<table id="tianjia">
				<tr>
					<td>
					<s:select name="channel.id" list="channelList" listKey="id" listValue="name"></s:select>
					</td>

				</tr>
				
				<tr>
					<td>图集标题:</td>
					<td><s:textfield name="atlas.title"></s:textfield></td>
				</tr>
				<tr>
					<td>图集说明:</td>
					<td><s:textarea name="atlas.context"></s:textarea></td>
				</tr>
				<tr>
					<td><input type="button" onclick="tianjia()" value="上传多个图片"></td>
				</tr>
				<tr>
					<td><input type="file" name="pictures"><textarea name="expain"></textarea></td>
				</tr>
				<tr>
					<td>上传图片: <s:submit></s:submit></td>
				</tr>

			</table>


		</s:form>
	</div>
	<script type="text/javascript">
		function tianjia() {
			document.getElementById("tianjia").innerHTML += '<tr><td><input type="file" name="pictures"><textarea name="expain"></textarea></td></tr>';
		}
	</script>
</body>
</html>