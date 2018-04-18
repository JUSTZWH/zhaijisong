package cn.itcast.bos.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

/*
 * 通用DAO设计接口
 * 
 * */
public interface GenericDAO<T> {
	/*
	 * 保存
	 */
	public void save(T obj);
	
	/*
	 * 修改
	 */
	public void update(T obj);
	
	/*
	 * 删除
	 */
	public void delete(T obj);
	
	/*
	 * 根据id查询
	 */
	public T findById(Serializable id);
	
	/*
	 * 查询所有数据
	 */
	public List<T> findAll();
	
	/*
	 * 条件查询
	 */
	public List<T> findByNamedQuery(String queryName,Object... values);//根据hql查询
	
	public List<T> findByCriteria(DetachedCriteria detachedCriteria);//面向对象条件查询
}
