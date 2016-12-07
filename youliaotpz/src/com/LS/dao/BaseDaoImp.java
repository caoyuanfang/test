package com.LS.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDaoImp<T> implements BaseDao<T> {

	@Resource
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(T t) {
		getSession().save(t);
	}

	@Override
	public void delete(T t) {
		getSession().delete(t);
	}

	@Override
	public void update(T t) {
		getSession().update(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T findById(Class<T> entityClass, int id) {
		return (T) getSession().get(entityClass, id);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<T> executeQuery(String hql, String[] parameters) {
		List list = null;

		Query query = getSession().createQuery(hql);
		// 先判断是否有参数要绑定
		if (parameters != null && parameters.length > 0) {
			for (int i = 0; i < parameters.length; i++) {
				query.setString(i, parameters[i]);
			}
		}
		list = query.list();

		return list;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<T> executeQueryByPage(String hql, String[] parameters,
			int pageSize, int pageNow) {
		List list = null;

		Query query = getSession().createQuery(hql);
		// 先判断是否有参数要绑定
		if (parameters != null && parameters.length > 0) {
			for (int i = 0; i < parameters.length; i++) {
				query.setString(i, parameters[i]);
			}
		}
		query.setFirstResult((pageNow - 1) * pageSize).setMaxResults(pageSize);

		list = query.list();

		return list;
	}

}
