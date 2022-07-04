package com.bilgeadam.boost.controller;

import java.util.ArrayList;

import org.hibernate.Session;

import com.bilgeadam.boost.hibernate.CRUDable;
import com.bilgeadam.boost.model.UserEntity;

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

}
