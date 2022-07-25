package com.bilgeadam.boost.controller;

import java.util.ArrayList;

import org.hibernate.Session;

import com.bilgeadam.boost.controller.model.CRUDable;
import com.bilgeadam.boost.model.UserEntity;

import jakarta.persistence.TypedQuery;

public class UserController implements CRUDable<UserEntity> {

	@Override
	public void create(UserEntity entity) {
		try {
			Session session = databaseConnectionViaHibernate();
			session.getTransaction().begin();
			session.persist(entity);
			session.getTransaction().commit();
			System.out.println("Successfull");
					
		} catch (Exception e) {
			System.out.println("Fail.");
		}
		
	}

	@Override
	public ArrayList<UserEntity> retrieve(UserEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}
	public ArrayList<UserEntity> findByEmail (String email) {
		Session session = databaseConnectionViaHibernate();
		String hql = "SELECT user FROM UserEntity as user where";
		TypedQuery<UserEntity> typedQuery = session.createQuery(hql,UserEntity.class);
		
		ArrayList<UserEntity> users = (ArrayList<UserEntity>) typedQuery.getResultList();
		return users;
	}

}
