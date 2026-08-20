package com.ws03.service;

import java.util.ArrayList;

import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;

public interface BankService {
	
	public ArrayList<AccountDto> getAccountList(int userSeq);
	public UserDto getUserDetail(int userSeq);
	public ArrayList<AccountDto> getAccountList();
	public ArrayList<AccountDto> getAccountListSortByBalance();
	public ArrayList<AccountDto> getAccountListSortByUserSeq();
	
	
}
