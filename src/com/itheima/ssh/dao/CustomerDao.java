package com.itheima.ssh.dao;

import com.itheima.ssh.domain.Customer;

import java.util.List;

/**
 * 客户管理的DAO层的接口
 * @author jt
 *
 */
public interface CustomerDao {

	void save(Customer customer);

    List<Customer> findAll();
}
