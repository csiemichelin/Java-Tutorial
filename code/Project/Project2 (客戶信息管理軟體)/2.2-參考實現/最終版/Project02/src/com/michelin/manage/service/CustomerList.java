package com.michelin.manage.service;

import com.michelin.manage.bean.Customer;
/**
 * @Description CustomerList為Customer物件的管理模組，
 *              內部以陣列管理一組Customer物件，
 *              並提供相應的新增、修改、刪除和遍歷方法，
 *              供CustomerView調用
 * @author michelin
 * @date 2024年5月7日 下午10:57:08
 */
public class CustomerList {
	private Customer[] customers;	// 用來保存客戶物件的陣列
	private int total = 0;	// 紀錄已保存客戶物件的數量
	
	/**
	 * 用來初始化customers陣列的建構子
	 * @param totalCustomer: 指定陣列的長度
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	/**
	 * 
	 * @Description 將指定的客戶添加到陣列中
	 * @author michelin
	 * @date 2024年5月8日 上午1:19:26
	 * @param customer
	 * @return true: 添加成功, false: 添加失敗
	 */
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length) {
			return false;
		}
//		customers[total] = customer;
//		total++;
		// 或
		customers[total++] = customer;
		return true;
	}
	/**
	 * 
	 * @Description 修改指定索引位置的客戶信息
	 * @author michelin
	 * @date 2024年5月8日 上午1:22:11
	 * @param index
	 * @param cust
	 * @return true: 修改成功, false: 修改失敗
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if(index < 0 || index >= total) {
			return false;
		}
		customers[index] = cust;
		return true;
	}
	/**
	 * 
	 * @Description 刪除指定索引位置的客戶
	 * @author michelin
	 * @date 2024年5月8日 上午1:27:28
	 * @param index
	 * @return true: 刪除成功, false: 刪除失敗
	 */
	public boolean deleteCustomer(int index) {
		if(index < 0 || index >= total) {
			return false;
		}
		// 江刪除後面的元素往前填入
		for(int i = index; i < total - 1; i++) {
			customers[i] = customers[i + 1];
		}
		// 最後有數據的元素需要置空
//		customers[total - 1] = null;
//		total--;
		// 或
		customers[--total] = null;
		return true;
	}
	/**
	 * 
	 * @Description 獲取所有客戶信息
	 * @author michelin
	 * @date 2024年5月8日 上午1:53:51
	 * @return
	 */
	public Customer[] getAllCustomers() {
//		return customers; 	// 會有null的不需要
		Customer[] custs = new Customer[total];
		for(int i = 0; i < total; i++) {
			custs[i] = customers[i];
		}
		return custs;
	}
	/**
	 * 
	 * @Description 獲取指定索引位置上的客戶
	 * @author michelin
	 * @date 2024年5月8日 上午1:57:16
	 * @param index
	 * @return 如果找到了元素，則回傳, 如果沒有找到，則回傳null
	 */
	public Customer getCustomer(int index) {
		if(index < 0 || index >= total) {
			return null;
		}
		return customers[index];
	}
	/**
	 * 
	 * @Description 獲取儲存的客戶數量
	 * @author michelin
	 * @date 2024年5月8日 上午1:58:47
	 * @return
	 */
	public int getTotal() {
		return total;
//		return customers.length;	// 錯誤的
	}
}
