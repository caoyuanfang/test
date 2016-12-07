package com.LS.dao;

import java.util.List;

public interface BaseDao<T> {

	public void add(T t);

	public void delete(T t);

	public void update(T t);

	public T findById(Class<T> entityClass, int id);

	public List<T> executeQuery(String hql, String[] parameters);

	public List<T> executeQueryByPage(String hql, String[] parameters,
			int pageSize, int pageNow);
}
