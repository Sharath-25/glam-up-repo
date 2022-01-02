package com.glamtech.glamup.service;

import com.glamtech.glamup.constant.Vendor;
import com.glamtech.glamup.dto.LoginDTO;

public interface LoginService {
    
	boolean verifyLoginEmailByVendor(String loginEmail,Vendor vendor);
	
	boolean verifyLoginPasswordByVendor(LoginDTO  loginDTO);
	
	boolean verifyLoginCountByVendor(String loginEmail,Vendor vendor);
	
	void updateLoginAttempt(String loginEmail,Vendor vendor);
}
