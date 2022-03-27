package com.hibernet.crud;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernetDBConnect {
	
private static SessionFactory objSF;
  public static SessionFactory getSessionFactory()
  {
	  if(objSF==null)
	  {
	  
	  try {
		Configuration objcfg= new Configuration();
		  Properties objprop= new Properties();
		  objprop.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		  objprop.put(Environment.URL,"jdbc:msql://localhost:3306/m9_mumbai");
		  objprop.put(Environment.USER,"root");
		  objprop.put(Environment.PASS,"Amit@001");
		  objprop.put(Environment.DIALECT,"org.hibernete.dialect.MySql5Dialect");
		  objprop.put(Environment.SHOW_SQL,"true");
		  objprop.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
		  objprop.put(Environment.HBM2DDL_AUTO,"update");
		  
		  objcfg.setProperties(objprop);
		  objcfg.addAnnotatedClass(users.class);
		  
		  ServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder()
				  .applySettings(objcfg.getProperties()).build();
		  
		  System.out.println("Hibernet java config serviceregistry created");
		  objSF=objcfg.buildSessionFactory(serviceRegistry);
		  
		
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  }
	  return objSF;
  
  }

}
