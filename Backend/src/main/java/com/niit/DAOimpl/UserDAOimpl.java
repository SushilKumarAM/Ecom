package com.niit.DAOimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.UserDAO;
import com.niit.model.User;

@Repository("UserDAO")
@Transactional
public class UserDAOimpl implements UserDAO 
{
	
	@Autowired
	   SessionFactory sessionFactory;
	 public List<User> getAllUserDetails() 
	 {
	       
	       Session sf =sessionFactory.openSession();
	       sf.beginTransaction();
	       Query query = sf.createQuery("from User");
	       List<User> list=query.list();
	       System.out.println(list);
	       sf.getTransaction().commit();
	       return list;

     }
	 
	 public User getUserDetail(String id) {
	       
		   	User c=(User)sessionFactory.openSession().get(User.class, id);
		       
		       return c;
		   }

		   public void updateUserDetail(User obj) {
		       
		       
		   }

		   public boolean addUser(User user) {
				try
				{
				sessionFactory.getCurrentSession().saveOrUpdate(user);
				return true;
				}
				catch(Exception e)
				{
					System.out.println("Exception arised"+e);
				return false;
				}
			}
			public void deleteUser(User entity) {
				
			}
	 
	 	 
}
