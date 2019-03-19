package com.great.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.great.aop.MyLog;
import com.great.dao.TestDao;
import com.great.entity.Emp;
import com.great.util.ImageUtil;

@RequestMapping("/")
@Controller
public class HomeController {

	private InputStream imageStream;
	@Autowired TestDao dao;
	@Autowired HttpSession session;
	
	
	@RequestMapping("/hello.action")
	@MyLog(operation="hello")
	public String hello(){
		dao.addEmp(new Emp(null,"10000","张三","123456","1231",null,null,null,null,null,null));
		System.out.println("welcome!!!!");
		System.out.println(session.getAttribute("imageCode")+"验证码");
		if(session.getAttribute("imageCode")==null){
			dao.deleteEmp(4);
		};
		return "success";
	}
	
	@ResponseBody
	@RequestMapping(value="/creatImage.action",method={RequestMethod.GET,RequestMethod.POST})
	public void creatImage(HttpServletResponse response) {
		Map<String, BufferedImage> imageMap = ImageUtil.createImage();
		String code = imageMap.keySet().iterator().next();
		System.out.println(code);
		session.setAttribute("imageCode", code);
		BufferedImage image = imageMap.get(code);
		try {
			OutputStream os = response.getOutputStream();
			ImageIO.write(image, "jpeg", os);
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
/*	@RequestMapping("/login.action")
	@MyLog(operation="login")
	public @ResponseBody Users login(@RequestParam(value="user.username",required=false) String name,
			@RequestParam(value="user.password",required=false) String pwd){
		System.out.println("登录！！！！");
		return new Users();
		
	}*/

	public InputStream getImageStream() {
		return imageStream;
	}

	public void setImageStream(InputStream imageStream) {
		this.imageStream = imageStream;
	}

	
}
