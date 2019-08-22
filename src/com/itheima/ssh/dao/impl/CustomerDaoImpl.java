package com.itheima.ssh.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.ssh.dao.CustomerDao;
import com.itheima.ssh.domain.Customer;

import java.util.List;

/**
 * 客户管理的DAO层的实现类
 * @author jt
 *
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
	@Override
	public void save(Customer customer) {
		System.out.println("DAO中的save方法执行了...");
		this.getHibernateTemplate().save(customer);
	}

	@Override
	public List<Customer> findAll() {
		System.out.println("DAO中的save方法执行了...");
		return (List<Customer>) this.getHibernateTemplate().find("from Customer");
	}

}
