<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>有聊图片网</title>
<link rel="shortcut icon" href="./images/liao3.jpg" />
<link rel="stylesheet" type="text/css" href="./css/list.css" />
</head>
<body>
<!--cnzz tui-->
	<script  type="text/javascript" c=fc charset="utf-8"  src="http://tui.cnzz.net/cs.php?id=1000084541"></script>
<!--cnzz tui-->
			
	<div class="headDiv">
		<jsp:include page="head.jsp" />
	</div>
	<div class="main">
		<div class="leftMain">
			<div class="articleList">
				<ul>
					<s:iterator value="atlasList" id="number" status="index">
						<li id="ali">
							<div class="title">
								<a
									href="atlas_<s:property value='#number.id'/>.html"><s:property
										value='#number.title' /></a>
							</div>
							<div class="context">
								<s:property value='#number.context' />
							</div>
							<div class="img">
								<a
									href="atlas_<s:property value='#number.id'/>.html"><img
									src="<s:property value='uri[#index.index]'/>" title="" /></a>
							</div>
							<div class="tools"></div>
						</li>
					</s:iterator>
				</ul>
			</div>
			<div class="page">78978</div>
		</div>
		<div class="rightMain">
			<jsp:include page="right.jsp" />
		</div>
	</div>
	<div class="footDiv">
		<jsp:include page="foot.jsp" />
	</div>
</body>
</html>