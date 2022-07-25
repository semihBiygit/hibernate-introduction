package com.bilgeadam.boost;

import com.bilgeadam.boost.controller.UserController;
import com.bilgeadam.boost.model.UserEntity;
import com.bilgeadam.boost.view.UserView;

public class Test {
	public static void main(String[] args) {
		UserController userController = new UserController();
		UserView userView = new UserView();
		
		
		UserEntity user1 = new UserEntity("Semih", "Biygit");
		user1.setEmail("semih@biygit.com");
		System.out.println(user1);
		userController.create(user1);
		userView.show(user1);
	}
	
	
}
