//package com.tourist.dao;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.tourist.entity.User;
//
//@Repository
//@Transactional
//public class UserDao {
//
//	@Autowired
//	private SessionFactory sessionFactory;
//
//	private Session getSession() {
//		return sessionFactory.getCurrentSession();
//	}
//
//	public void save(User user) {
//		getSession().save(user);
//	}
//
//	public void delete(User user) {
//		getSession().delete(user);
//	}
//
//	@SuppressWarnings("unchecked")
//	public List getAll() {
//		return getSession().createQuery("from User").list();
//	}
//
//	public User getByEmail(String name) {
//		return (User) getSession().createQuery("from User where user_name = :name").setParameter("userName", name)
//				.uniqueResult();
//	}
//
//	public User getById(long id) {
//		return (User) getSession().load(User.class, id);
//	}
//
//	public void update(User user) {
//		getSession().update(user);
//	}
//
//}
