package cn.itcast.bos.web.action.base;

import javax.annotation.Resource;

import cn.itcast.bos.service.user.UserService;

import com.opensymphony.xwork2.ActionSupport;

/*
 * ��������Action��ʵ�ִ��븴�ã�
 */
public abstract class BaseAction extends ActionSupport {
	@Resource(name="userService")
	protected UserService userService;
}
