package com.shshop.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shshop.mapper.UserMapper;
import com.shshop.service.AuthenticatorService;

@WebServlet("/indextest/*")
public class LoginLoadServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		PrintWriter out =response.getWriter();
		
		AuthenticatorService user = new AuthenticatorService();
		boolean result = user.canLogin(email, password);
		if(result = true ){
			System.out.println("데이터일치");
		}else{
			System.out.println("아이디 또는 비밀번호 잘못입력하셨습니다 다시 확인해주세요");
		}
		
		response.setContentType("text/plain");
		response.getWriter().write(password);
	}
	public void test(){
		System.out.println("아따맘마");
		//sadfasdfasdfasdfsa
	}
	

}
