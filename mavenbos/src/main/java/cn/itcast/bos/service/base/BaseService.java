package cn.itcast.bos.service.base;

import javax.annotation.Resource;

import cn.itcast.bos.dao.GenericDAO;
import cn.itcast.bos.domain.user.User;

/*
 * ҵ������ ��ʵ��ҵ�����븴�ã�
 */
public abstract class BaseService {
	@Resource(name="userDAO")
	protected GenericDAO<User> userDAO;
}
