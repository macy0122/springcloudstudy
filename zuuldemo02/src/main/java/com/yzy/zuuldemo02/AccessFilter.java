package com.yzy.zuuldemo02;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @title:
 * @description:
 * @package: com.yzy.zuuldemo02.AccessFilter.java
 * @author: yzy
 * @date: 2019-10-25 16:01:27
 * @version: v1.0
 */
@Log
@Component
public class AccessFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		log.info("request.getMethod():---->" + request.getMethod());
		String token = request.getParameter("token");
		if (null == token) {
			context.setResponseStatusCode(401);
			context.setSendZuulResponse(false);
			context.setResponseBody("can not find a token");
			return null;
		}
		log.info("token is ok");
		return null;
	}
}
