package com.care.bank_dto;

import org.springframework.stereotype.Component;

@Component
public class BankDTO {
	private int money;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
