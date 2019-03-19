<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href=<%=path + "/css/layui.css" %> media="all">
<script type="text/javascript" src=<%=path + "/js/jquery-3.3.1.js"%>></script>
<script type="text/javascript" src=<%=path + "/js/layui.js" %>></script>
<script type="text/javascript" src=<%=path + "/js/index.js" %>></script>
</head>
<body>
<body style="text-align:center;" >
<!--登录 -->
	<div align=center>
	<h1 style="margin-top: 3%;color: #1E9FFF;font-size: 70px; ">联通网上营业厅</h1>
	
	<!-- 登录界面 -->
	<div class="login" style="width: 500px;" id="login">
		<form class="layui-form layui-form-pane" lay-filter="login" id="form_login" >
			<div class="layui-form-item" style="margin-top: 20px;">
				<label class="layui-form-label">用户名</label>
				<div class="layui-input-block">
					<input type="text" name="user.username" lay-verify="name" lay-verType="tips"
						autocomplete="off" placeholder="请输入用户名" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">密码</label>
				<div class="layui-input-block">
					<input type="password" name="user.password" autocomplete="off" lay-verify="loginpass" lay-verType="tips"
						placeholder="请输入密码" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">验证码</label>
				<div class="layui-input-block ">
					<input type="text" name="verifyCode" autocomplete="off"
						lay-verify="checkcode" lay-verType="tips" placeholder="请输入验证码"
						class="layui-input">
				</div>
				<div class="layui-input-block " align="left">
					<img src="creatImage.action" alt="验证码" id="image" onclick="change(this);" title="点击更换"/> 
				</div>
			</div>
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn layui-btn-normal" lay-submit=""
						lay-filter="login">登录</button>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" class="layui-btn layui-btn-normal" value="注册" id="btn_reg"></input>
				</div>
				
			</div>
			
		</form>
	</div>
	</div>
		<div id="bdtts_div_id">

			<audio id="tts_autio_id" autoplay="autoplay">

				<source id="tts_source_id" src="http://tts.baidu.com/text2audio?lan=zh&ie=UTF-8&spd=4&text=播报内容" type="audio/mpeg">

				<embed id="tts_embed_id" height="0" width="0" src="">

			</audio>

		</div>
	
</body>
</html>