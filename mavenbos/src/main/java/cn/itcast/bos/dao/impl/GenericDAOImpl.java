package cn.itcast.bos.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.bos.dao.GenericDAO;

/*
 * 通用DAO实现
 */
public class GenericDAOImpl<T> extends HibernateDaoSupport implements GenericDAO<T> {

	
	private String className;

	public GenericDAOImpl(String className){
		this.className = className;
	}
	
	@Override
	public void save(T obj) {
		//this.getSession();//使用原始hibernate编程方式
		//this.getHibernateTemplate();//使用Spring提供模板工具类
		this.getHibernateTemplate().save(obj);
	}

	@Override
	public void update(T obj) {
		this.getHibernateTemplate().update(obj);
	}

	@Override
	public void delete(T obj) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(obj);
	}

	@Override
	public T findById(Serializable id) {
		// TODO Auto-generated method stub
		Class<?> clazz = null;
		try {
			clazz = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T) this.getHibernateTemplate().get(clazz, id);
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from "+className);//注意加空格！
	}

	@Override
	public List<T> findByNamedQuery(String queryName, Object... values) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByNamedQuery(queryName,values);
	}

	@Override
	public List<T> findByCriteria(DetachedCriteria detachedCriteria) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByCriteria(detachedCriteria);
	}

}
