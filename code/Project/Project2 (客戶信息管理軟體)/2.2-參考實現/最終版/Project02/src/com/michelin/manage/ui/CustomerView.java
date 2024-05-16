package com.michelin.manage.ui;

import java.awt.CardLayout;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import com.michelin.manage.bean.Customer;
import com.michelin.manage.service.CustomerList;
import com.michelin.manage.util.CMUtility;

/**
 * @Description CustomerView為主模組，負責選單的顯示與處理使用者操作
 * @author michelin
 * @date 2024年5月7日 下午10:57:08
 */
public class CustomerView {
	private CustomerList customerList = new CustomerList(10);
	
	public CustomerView(){
		Customer customer = new Customer("昆霖", '男', 23, "0905662218", "ccc44174@gmai.com");
		customerList.addCustomer(customer);
	}
	/**
	 * 
	 * @Description 顯示客戶信息管理軟體介面的方法
	 * @author michelin
	 * @date 2024年5月8日 上午2:04:07
	 */
	public void enterMainMenu() {
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("\n-----------------客戶信息管理軟件-----------------\n");
			System.out.println("                   1 添 加 客 戶");
			System.out.println("                   2 修 改 客 戶");
			System.out.println("                   3 刪 除 客 戶");
			System.out.println("                   4 客 戶 列 表");
			System.out.println("                   5 退       出\n");
			System.out.print("                   請選擇(1-5)：");
		
			char menu = CMUtility.readMenuSelection();
			switch (menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
//				System.out.println("退出");
				System.out.println("確認是否退出(Y/N): ");
				char isExit = CMUtility.readConfirmSelection();
				if (isExit == 'Y') {
					isFlag = false;
				}
			}
//			isFlag = false;
		}
	}
	/**
	 * 
	 * @Description 添加客戶的操作
	 * @author michelin
	 * @date 2024年5月8日 上午2:04:07
	 */
	private void addNewCustomer() {
//		System.out.println("添加客戶的操作");
		System.out.println("---------------------添加客戶---------------------");
		System.out.print("姓名：");
		String name = CMUtility.readString(10);
		System.out.print("性別：");
		char gender = CMUtility.readChar();
		System.out.print("年齡：");
		int age = CMUtility.readInt();
		System.out.print("電話：");
		String phone = CMUtility.readString(15);
		System.out.print("郵箱：");
		String email = CMUtility.readString(30);
		
		// 將上述數據封裝到物件中
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isSuccess = customerList.addCustomer(customer);
		if(isSuccess) {
			System.out.println("---------------------添加完成---------------------");
		}else {
			System.out.println("---------------------客戶目錄已滿,無法添加---------------------");
		}
	}
	/**
	 * 
	 * @Description 修改客戶的操作
	 * @author michelin
	 * @date 2024年5月8日 上午2:04:07
	 */
	private void modifyCustomer() {
//		System.out.println("修改客戶的操作");
		System.out.println("---------------------修改客戶---------------------");
		Customer cust = new Customer();
		int number;
		while(true) {
			System.out.print("請選擇待修改客戶編號(-1退出)：");
			number = CMUtility.readInt();
			
			if(number == -1) {
				return;
			}
			
			cust = customerList.getCustomer(number - 1);
			if (cust == null) {
				System.out.println("無法找到指定客戶！");
			} else {	// 找到了相應編號的客戶
				break;
			}
		}
		// 修改客戶信息
		System.out.println("姓名(" + cust.getName() + ")：");
		String name = CMUtility.readString(10, cust.getName());
		System.out.println("性別(" + cust.getGender() + ")：");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.println("年齡(" + cust.getAge() + ")：");
		int age = CMUtility.readInt(cust.getAge());
		System.out.println("電話(" + cust.getPhone() + ")：");
		String phone = CMUtility.readString(15, cust.getPhone());
		System.out.println("郵箱(" + cust.getEmail() + ")：");
		String email = CMUtility.readString(30, cust.getEmail());
		
		Customer newCust = new Customer(name, gender, age, phone, email);
		boolean isReplaced = customerList.replaceCustomer(number - 1, newCust);
		if (isReplaced) {
			System.out.println("---------------------修改完成---------------------");
		} else {
			System.out.println("----------無法找到指定客戶,修改失敗--------------");
		}
	}
	/**
	 * 
	 * @Description 刪除客戶的操作
	 * @author michelin
	 * @date 2024年5月8日 上午2:04:07
	 */
	private void deleteCustomer() {
//		System.out.println("刪除客戶的操作");
		System.out.println("---------------------刪除客戶---------------------");
		Customer cust = new Customer();
		int number;
		while(true) {
			System.out.print("請選擇待刪除客戶編號(-1退出)：");
			number = CMUtility.readInt();
			
			if(number == -1) {
				return;
			}
			
			cust = customerList.getCustomer(number - 1);
			if (cust == null) {
				System.out.println("無法找到指定客戶！");
			} else {	// 找到了相應編號的客戶
				break;
			}
		}
		// 找到了相應編號的客戶
		System.out.print("確認是否刪除(Y/N)：");
		char isDelete = CMUtility.readConfirmSelection();
		if (isDelete == 'Y') {
			boolean deleteSuccess = customerList.deleteCustomer(number - 1);
			if (deleteSuccess) {
				System.out.println("---------------------刪除完成---------------------");
			}else {
				System.out.println("----------無法找到指定客戶,刪除失敗--------------");
			}
		}
	}
	/**
	 * 
	 * @Description 顯示客戶列表的操作
	 * @author michelin
	 * @date 2024年5月8日 上午2:04:07
	 */
	private void listAllCustomers() {
//		System.out.println("顯示客戶列表的操作");
		System.out.println("---------------------------客戶列表---------------------------");
		int total = customerList.getTotal();
		if(total == 0) {
			System.out.println("沒有客戶記錄！");
		}else {
			System.out.println("編號\t姓名\t性別\t年齡\t電話\t\t郵箱");
			Customer[] custs = customerList.getAllCustomers();
			for(int i = 0; i < custs.length; i++) {
				Customer cust = custs[i];
				System.out.println((i + 1) + "\t" + cust.getName() + 
						"\t" + cust.getGender() + "\t" + cust.getAge() + 
						"\t" + cust.getPhone() + "\t" + cust.getEmail());
			}
		}
		System.out.println("-------------------------客戶列表完成-------------------------");
	}
	
	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
}
