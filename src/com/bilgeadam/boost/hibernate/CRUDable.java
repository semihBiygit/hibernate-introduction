package com.bilgeadam.boost.hibernate;

import java.util.ArrayList;

import org.hibernate.Session;

/**
 * C ==> CREATE (insert)
 * R ==> RETRIEVE
 * U ==> UPDATE
 * D ==> DELETE
 * @author semih
 *
 */
public interface CRUDable<T> {
	void create(T entity);
	
	ArrayList<T> retrieve(T entity);
	
	void update(T entity);
	
	void delete(T entity);
	
	default Session databaseConnectionViaHibernate() {
		return HibernateUtil.getSessionFactory().openSession();
	}
}
