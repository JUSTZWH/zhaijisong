package cn.itcast.bos.web.action.user;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.bos.domain.user.User;
import cn.itcast.bos.web.action.base.BaseAction;

/*
 * 用户管理
 */
public class UserAction extends BaseAction implements ModelDriven<User>{

	//模型驱动
	private User user = new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	//业务方法--修改用户新密码
	public String editpassword(){
		//model封装用户新密码
		User loginUser = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		user.setId(loginUser.getId());
		
		//调用业务层
		try{
			userService.editPassword(user);
			//修改成功
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", "success");
			map.put("msg", "修改密码成功");
			ActionContext.getContext().put("map", map);
		}catch(Exception e){
			//修改失败
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", "failure");
			map.put("msg", "修改密码失败，" + e.getMessage());
			ActionContext.getContext().put("map", map);
		}
		return "editpasswordSUCCESS";
	}
}
