//刷新验证码图片
function change(image) {
	//改变img的src即可，由于该URL并没有变化，因此追加动态参数伪装成变化的URL。
	image.src = "creatImage.action?date=" + new Date().getTime();
}
//语音
function doTTS(ttsText){

	var ttsDiv = document.getElementById('bdtts_div_id');

	var ttsAudio = document.getElementById('tts_autio_id');


	ttsDiv.removeChild(ttsAudio);

	var au1 = '<audio id="tts_autio_id" autoplay="autoplay">';

	var sss = '<source id="tts_source_id" src="http://tts.baidu.com/text2audio?lan=zh&ie=UTF-8&spd=9&text='+ttsText+'" type="audio/mpeg">';

	var eee = '<embed id="tts_embed_id" height="0" width="0" src="">';

	var au2 = '</audio>';

	ttsDiv.innerHTML = au1 + sss + eee + au2;

	

	ttsAudio = document.getElementById('tts_autio_id');

	

	ttsAudio.play();

}

$(function() {
	//表单
	layui.use('form', function() {
		var form = layui.form;
		var $ = layui.jquery;
		// 自定义验证规则
		form.verify({
			
			loginpass : [ /^[\S]{6,12}$/, '密码必须6到12位，且不能出现空格' ],
			checkcode : function(value) {
				if (value.length < 4) {
					return '验证码长度为4';
				}
			}
		});
		  
		 // 登录监听提交
		  form.on('submit(login)', function(data){
		    layer.msg(JSON.stringify(data.field));
		    $.ajax({
				type:"POST",
				url:"login.action",
				data:data.field,
				dataType:"json",
				async:true,
				success:function(data){
					var info = data;
					alert(info.message);
					// 根据返回值设置提示信息
					if (info.success) {
						//  验证通过，设置提示信息并移除错误样式
						alert(info.message);
						layer.msg(info.message);
					} else {
						// 验证失败，设置提示信息并添加错误样式
						layer.msg(info.message);
						doTTS(info.message);
					}
				},
				error:function(msg){
					alert("访问错误");
				}
			});
		    return false;
		  });
		});
});
	

	
	
