<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet" type="text/css" href="./css/head.css" />
<div class="header">
	<div class="title">
		<div id="bg_imge"></div>
		<span>有聊图片站</span>
	</div>
	<div class="nav">
		<ul>
			<li class="item hover"><a href="./index1.html">首页</a></li>
			<s:iterator value="ChannelList" id="number" status="index">
				<li class="item"><a
					href="./list_<s:property value='#number.id'/>.html"><s:property
							value='#number.name' /></a></li>
			</s:iterator>
		</ul>
	</div>
</div>
<div id="guanggao">
	<!-- 广告位：导航栏下方广告 -->
	<script type="text/javascript">
		BAIDU_CLB_SLOT_ID = "973326";
	</script>
	<script type="text/javascript" src="http://cbjs.baidu.com/js/o.js"></script>
</div>
