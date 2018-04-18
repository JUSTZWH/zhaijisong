package cn.itcast.bos.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

/*
 * ͨ��DAO��ƽӿ�
 * 
 * */
public interface GenericDAO<T> {
	/*
	 * ����
	 */
	public void save(T obj);
	
	/*
	 * �޸�
	 */
	public void update(T obj);
	
	/*
	 * ɾ��
	 */
	public void delete(T obj);
	
	/*
	 * ����id��ѯ
	 */
	public T findById(Serializable id);
	
	/*
	 * ��ѯ��������
	 */
	public List<T> findAll();
	
	/*
	 * ������ѯ
	 */
	public List<T> findByNamedQuery(String queryName,Object... values);//����hql��ѯ
	
	public List<T> findByCriteria(DetachedCriteria detachedCriteria);//�������������ѯ
}
