package cn.itcast.bos.service.base;

import javax.annotation.Resource;

import cn.itcast.bos.dao.GenericDAO;
import cn.itcast.bos.domain.user.User;

/*
 * 业务层抽象 （实现业务层代码复用）
 */
public abstract class BaseService {
	@Resource(name="userDAO")
	protected GenericDAO<User> userDAO;
}
