package cn.itcast.bos.service.impl.user;

import java.util.List;

import cn.itcast.bos.domain.user.User;
import cn.itcast.bos.service.base.BaseService;
import cn.itcast.bos.service.user.UserService;
import cn.itcast.bos.utils.MD5Utils;

public class UserServiceImpl extends BaseService implements UserService{

	@Override
	public User login(User user) {
		List<User> list = userDAO.findByNamedQuery("User.login",user.getUsername(), MD5Utils.md5(user.getPassword()));
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public void editPassword(User user) {
		// 如果修改用户所有内容，直接调用 update
		// 如果修改用户某个属性，先查询，再修改
		User exist = userDAO.findById(user.getId()); // 持久态
		exist.setPassword(MD5Utils.md5(user.getPassword()));
	}

}
