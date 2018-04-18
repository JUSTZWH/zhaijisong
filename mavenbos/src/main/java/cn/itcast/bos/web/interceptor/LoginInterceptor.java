package cn.itcast.bos.web.interceptor;

import org.aopalliance.intercept.Invocation;
import org.apache.struts2.ServletActionContext;

import cn.itcast.bos.domain.user.User;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/*
 * 自定义登陆拦截器
 */
public class LoginInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//从Session中获取用户信息
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user == null){
			//没有登陆
			//设置错误信息
			ActionSupport action = (ActionSupport) invocation.getAction();
			action.addActionError("您还未登陆或者长时间未使用，请重新登陆");
			return "login";//登陆页面
		}else{
			//已经登陆
			return invocation.invoke();
		}
	}

}
