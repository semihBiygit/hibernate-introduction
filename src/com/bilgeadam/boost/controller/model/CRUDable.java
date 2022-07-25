package com.bilgeadam.boost.controller.model;

import java.util.ArrayList;

import org.hibernate.Session;

import com.bilgeadam.boost.hibernate.HibernateUtil;

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
