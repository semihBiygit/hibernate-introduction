package com.bilgeadam.boost.view;

import com.bilgeadam.boost.controller.view.Showable;
import com.bilgeadam.boost.model.UserEntity;

public class UserView implements Showable<UserEntity> {

	@Override
	public void show(UserEntity entity) {
		
	System.out.println(entity.toString());		
	}

}
