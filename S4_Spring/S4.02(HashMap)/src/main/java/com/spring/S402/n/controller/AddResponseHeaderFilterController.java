package com.spring.S402.n.controller;

//import java.io.IOException;

//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.server.ServerWebExchange;
//import org.springframework.web.server.WebFilterChain;
//
//import com.fasterxml.classmate.Filter;

//Nivell 3 (afegir capçalera en la resposta dels endpoints.)

//@Component
//public class AddResponseHeaderFilterController implements Filter {
//
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//
//		HttpServletRequest req = (HttpServletRequest) request;
//		HttpServletResponse res = (HttpServletResponse) response;
//
//		res.addHeader("IT-Academy-Exercise", "Simple-Service");
//		chain.doFilter(request, response);
//	}
//
//	@Override
//	public boolean include(Object element) {
//
//		return false;
//	}
//
//}

//@WebFilter("/*")
//@Component
//public class AddResponseHeaderFilterController implements Filter {
//	
//	public void init(FilterConfig filterConfig) throws ServletException {
//
//	}
//
//	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
//			throws IOException, ServletException {
//		HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
//		httpServletResponse.setHeader("IT-Academy-Exercise", "Simple-Service");
//		filterChain.doFilter(servletRequest, servletResponse);
//	}
//
//	@Override
//	public boolean include(Object element) {		
//		return false;
//	}
//} 

//	@WebFilter("/filter-response-header/*")
//@Component
//public class AddResponseHeaderFilterController implements Filter {
//
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//
//		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
//		httpServletResponse.setHeader("IT-Academy-Exercise", "Simple-Service");
//		chain.doFilter(request, response);
//	}
//
//	@Override
//	public boolean include(Object element) {
//
//		return false;
//	}
//}

//	@Component
//	public class AddResponseHeaderFilterController implements Filter {
//
//		public void doFilter(ServerWebExchange exchange, WebFilterChain chain) {
//			exchange.getResponse()
//			.getHeaders()
//			.add("IT-Academy-Exercise", "Simple-Service");
//			
//		}
//
//		@Override
//		public boolean include(Object element) {
//			
//			return false;
//		}
//		
//	}
