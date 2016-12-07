<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>有聊图片网</title>
<link rel="shortcut icon" href="./images/liao3.jpg" />
<link rel="stylesheet" type="text/css" href="./css/atlas.css">
<link rel="stylesheet" type="text/css" href="./css/quanju.css">
<script type="text/javascript" src="./js/jquery.min.js"></script>
<script type="text/javascript" src="./js/jquery.SuperSlide.2.1.1.js"></script>
</head>
<body>
	<jsp:include page="head.jsp" />
	<div class="main">
		<div class="leftMain">
			<div class="article">
				<div id="atlasinfo">
					<h3>
						<s:property value="atlas.title" />
					</h3>
					<br /> <span><s:property value="atlas.context" /></span>
				</div>
				<!-- 广告位：图片上方广告 -->
				<script type="text/javascript">
					BAIDU_CLB_SLOT_ID = "973515";
				</script>
				<script type="text/javascript" src="http://cbjs.baidu.com/js/o.js"></script>
				<div id="play">
					<ul class="img_ul">
						<s:iterator value="atlas.pictures" id="number" status="index">
							<li><a class="img_a"><img
									src="<s:property value='uri[#index.index]'/>"></a></li>
						</s:iterator>
					</ul>
					<a href="javascript:void(0)" class="prev_a change_a" title="上一张">
						<span></span>
					</a> <a href="javascript:void(0)" class="next_a change_a" title="下一张">
						<span style="display: inline;"></span>
					</a>
				</div>
				<div id="pictureinfo">
					<span>123123</span>
				</div>
				<div class="img_hd">
					<ul class=" clearfix">
						<s:iterator value="atlas.pictures" id="number" status="index">
							<li><a class="img_a"><img
									src="<s:property value='uri[#index.index]'/>"
									onclick="imgs_load(this)"></a></li>
						</s:iterator>
					</ul>
					<a class="bottom_a prev_a" style="opacity: 0.7;"></a> <a
						class="bottom_a next_a" style="opacity: 0.7;"></a>
				</div>
			</div>
			<div id="tujixiagg">
				<div id="leftgg">
					<!-- 广告位：图集下方1 -->
					<script type="text/javascript">
						BAIDU_CLB_SLOT_ID = "973517";
					</script>
					<script type="text/javascript" src="http://cbjs.baidu.com/js/o.js"></script>
				</div>
				<div id="rightgg">
					<!-- 广告位：图集下方2 -->
					<script type="text/javascript">
						BAIDU_CLB_SLOT_ID = "973518";
					</script>
					<script type="text/javascript" src="http://cbjs.baidu.com/js/o.js"></script>
				</div>
			</div>
		</div>
		<div class="rightMain">
			<jsp:include page="right.jsp" />
		</div>
	</div>
	<jsp:include page="foot.jsp" />
</body>
<script>
	var i = 0; //图片标识
	var img_num = $(".img_ul").children("li").length; //图片个数
	$(".img_ul li").hide(); //初始化图片	
	play();
	$(function() {
		$(".img_hd ul").css("width",
				($(".img_hd ul li").outerWidth(true)) * img_num); //设置ul的长度

		$(".bottom_a").css("opacity", 0.7); //初始化底部a透明度
		//$("#play").css("height",$("#play .img_ul").height());
		if (!window.XMLHttpRequest) {//对ie6设置a的位置
			$(".change_a").css("height", $(".change_a").parent().height());
		}
		$(".change_a").focus(function() {
			this.blur();
		});
		$(".bottom_a").hover(function() {//底部a经过事件
			$(this).css("opacity", 1);
		}, function() {
			$(this).css("opacity", 0.7);
		});
		$(".change_a").hover(function() {//箭头显示事件
			$(this).children("span").show();
		}, function() {
			$(this).children("span").hide();
		});
		$(".img_hd ul li").click(function() {
			i = $(this).index();
			play();
		});
		$(".prev_a").click(function() {
			//i+=img_num;
			i--;
			//i=i%img_num;
			i = (i < 0 ? 0 : i);
			play();
		});
		$(".next_a").click(function() {
			i++;
			//i=i%img_num;
			i = (i > (img_num - 1) ? (img_num - 1) : i);
			play();
		});
	});
	function play() {//动画移动	
		var img = new Image(); //图片预加载
		img.onload = function() {
			img_load(img, $(".img_ul").children("li").eq(i).find("img"))
		};
		img.src = $(".img_ul").children("li").eq(i).find("img").attr("src");
		//$(".img_ul").children("li").eq(i).find("img").(img_load($(".img_ul").children("li").eq(i).find("img")));

		$(".img_hd ul").children("li").eq(i).addClass("on").siblings()
				.removeClass("on");
		if (img_num > 7) {//大于7个的时候进行移动
			if (i < img_num - 3) { //前3个
				$(".img_hd ul")
						.animate(
								{
									"marginLeft" : (-($(".img_hd ul li")
											.outerWidth() + 4) * (i - 3 < 0 ? 0
											: (i - 3)))
								});
			} else if (i >= img_num - 3) {//后3个
				$(".img_hd ul")
						.animate(
								{
									"marginLeft" : (-($(".img_hd ul li")
											.outerWidth() + 4) * (img_num - 7))
								});
			}
		}
		if (!window.XMLHttpRequest) {//对ie6设置a的位置
			$(".change_a").css("height", $(".change_a").parent().height());
		}
	}
	function img_load(img_id, now_imgid) {//大图片加载设置 （img_id 新建的img,now_imgid当前图片）

		if (img_id.width / img_id.height > 1) {
			if (img_id.width >= $("#play").width())
				$(now_imgid).width($("#play").width());
		} else {
			if (img_id.height >= 500)
				$(now_imgid).height(500);
		}
		$(".img_ul").children("li").eq(i).show().siblings("li").hide(); //大小确定后进行显示
	}
	function imgs_load(img_id) {//小图片加载设置
		if (img_id.width >= $(".img_hd ul li").width()) {
			img_id.width = 80
		}
		;
		//if(img_id.height>=$(".img_hd ul li").height()) {img_id.height=$(".img_hd ul li").height();}
	}
</script>
</html>