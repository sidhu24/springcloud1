package com.payments.app.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	
	@GetMapping("/getDetails")
	public User getUserDetails() {
		User user = getUser();
		
		return user;
		
	}
	
	/*
	 * @GetMapping("/") public String getDetails() {
	 * 
	 * return "index"; }
	 */
	
	private User getUser() {
		
		User user = new User();
		user.setUserId("456y");
        user.setUsername("userName");
		
		
		Transaction transaction = new Transaction();
		transaction.setTransactionId("rittiuo");
		transaction.setTransactionDate("201924");
		transaction.setTransactionName("netbill");
		
		Account account= new Account();
		account.setAccountName("XYZ");
		account.setAccountNo("343243");
		account.setAmount(5000);
		
		List<Card> cardList = new ArrayList<>();
		Card card = new Card();
		card.setCardName("creditcard");
		card.setCardNo("12323232");
		card.setStartDate("aug2024");
		card.setEndDate("dec2026");
		cardList.add(card);
		
		account.setCards(cardList);
		user.setAccount(account);
		user.setTransaction(transaction);		
		user.setAddress(getAddress());
		return user;	
		
	}
	
	private Address getAddress() {
		
		Address address = new Address();
		address.setAddressline("marathahalli");
		address.setCity("bangalore");
		address.setName("998990");
		address.setState("Karnataka");
		
		return address;
	}
}
