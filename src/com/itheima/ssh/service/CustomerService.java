package com.itheima.ssh.service;

import com.itheima.ssh.domain.Customer;

import java.util.List;

/**
 * 客户管理的业务层的接口
 * @author jt
 *
 */
public interface CustomerService {

	void save(Customer customer);
	List<Customer> findAll();

}
