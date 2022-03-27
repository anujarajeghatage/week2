package com.hibernet.crud;

import org.hibernate.Session;

public class MainApp {

	public static void main(String[] args) 
	{
		Session obj_Session = HibernetDBConnect.getSessionFactory().openSession();
		
		//CRUD
		//satep01:retrive
		users users=new users();
		obj_Session.beginTransaction();
		users=obj_Session.get(users.getClass(),2);
		obj_Session.save(users);
		obj_Session.getTransaction().commit();
		System.out.println(users);
		
		
		//satep01:update
				/*users users=new users();
				obj_Session.beginTransaction();
				users=obj_Session.get(users.getClass(),2);
				user.setusername("abc");
				obj_Session.save(users);
				obj_Session.getTransaction().commit();
				System.out.println(users);*/
	}
}

