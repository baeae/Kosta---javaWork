package com.ws03.service;
/**
 * 고객과 계좌에 관련된 서비스
 * (Business Logic 을 처리하는 객체)
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ws03.dto.AccountDto;
import com.ws03.dto.InstallAccountDto;
import com.ws03.dto.LoanAccountDto;
import com.ws03.dto.SavingAccountDto;
import com.ws03.dto.UserDto;

public class BankServiceImpl implements BankService {
	
	List<UserDto> userList;
	List<AccountDto> accountList;
	
	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 * */
	public BankServiceImpl() {
		//배열 생성
		 userList = new ArrayList<UserDto>(); 
		 accountList = new ArrayList<AccountDto>(); 
		
		 /*
		// 각 배열방에 고객과 계좌를 생성한다.
		 //고객 4명
		 userList.add(new UserDto(100, "장희정", "8253jang@daum.net", "010-8875-8253", false));
		 userList.add(new UserDto(200, "이효리", "lee@daum.net", "010-2222-3333", false));
		 userList.add( new UserDto(300, "송중기", "song@naver.com", "010-5554-2222", false));
		 userList.add( new UserDto(400, "삼순이", "sam@daum.com", "010-2222-2222", false));
		 
		 
		 //계좌는 6개 정도
		 accountList.add(new AccountDto(1, "1111-11111", 1000000, 100) );
		 accountList.add( new AccountDto(2, "2222-22222", 250000, 100));
		 accountList.add( new AccountDto(3, "3333-33333", 350000, 100));
		 accountList.add( new AccountDto(4, "4444-44444", 150000, 200));
		 accountList.add( new AccountDto(5, "5555-55555", 250000, 200));
		 accountList.add( new AccountDto(6, "6666-66666", 350000, 300));
		 
		 System.out.println("---세팅완료!!----");
		 */
		 
		 //상속 후 고객 및 계좌
		 userList.add( new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false) );
		 userList.add( new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true) );
		 userList.add( new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false) );
			
		 accountList.add( new InstallAccountDto(20, "00200202002002", 1000, 111, 12, 10000) );
		 accountList.add( new SavingAccountDto(10, "00100101001001", 500, 111, 100) );
		 accountList.add( new LoanAccountDto(60, "00600606006006", 500, 333, "House") );
		 accountList.add( new LoanAccountDto(30, "00300303003003", 0, 111, "Building") );
		 accountList.add( new SavingAccountDto(70, "00700707007007", 500, 333, 200) );
		 accountList.add( new LoanAccountDto(50, "00500505005005", 200, 222, "Car") );
		 accountList.add( new SavingAccountDto(40, "00400404004004", 1000, 222, 50) );
		 
		 System.out.println("---세팅완료!!----");
		 
		}

	@Override
	public ArrayList<AccountDto> getAccountList(int userSeq) {
		ArrayList<AccountDto> searchAccountDtoList =  new ArrayList<> ();
		
		for(AccountDto dto : accountList) {
			if( dto.getUserSeq()  == userSeq) {
				searchAccountDtoList.add( dto );
			}
		}
		
		
		return searchAccountDtoList;
	}

	@Override
	public UserDto getUserDetail(int userSeq) {
		for(UserDto user : userList) {
			if(user.getUserSeq() == userSeq) {
				
				return user;
			}
		}
		
		return null;
	}

	@Override
	public ArrayList<AccountDto> getAccountList() {
		
		return new ArrayList <AccountDto> (accountList);
	}

	@Override
	public ArrayList<AccountDto> getAccountListSortByBalance() {
		ArrayList<AccountDto> shallowCopy = new ArrayList<AccountDto>(accountList);
		 Collections.sort(shallowCopy);

		return shallowCopy;
	}

	@Override
	public ArrayList<AccountDto> getAccountListSortByUserSeq() {
		ArrayList<AccountDto> shallowCopy = new ArrayList<AccountDto>(accountList);
		
		Collections.sort(shallowCopy , (a,b)->   b.getUserSeq()-a.getUserSeq() );
	
		
		return shallowCopy;
	}

	@Override
	public AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException {
		
		for(AccountDto dto : accountList) {
			if(dto.getUserSeq() == userSeq && dto.getAccountSeq() == accountSeq) {
				return dto;
			}
		}
		
		throw new UserAccountNotFoundException("사용자 또는 계좌를 찾을 수 없습니다.");
	}

	@Override
	public int withdraw(int userSeq, int accountSeq, int amount)
			throws BalanceLackException, UserAccountNotFoundException {
		
		AccountDto account = getUserAccount(userSeq, accountSeq);
		
		if(account.getBalance() < amount) {
			throw new BalanceLackException("잔액이 부족합니다.");
		}
		
		account.setBalance(account.getBalance() - amount);
		
		return account.getBalance();
}
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   
}









