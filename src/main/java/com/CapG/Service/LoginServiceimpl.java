package com.CapG.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.CapG.Model.LoginPage;
import com.CapG.Repository.LoginRepository;

public class LoginServiceimpl implements LoginService
{
	
	@Autowired
	LoginRepository repo;
	
	public LoginPage login(String username,String password)
	{
		LoginPage login=repo.findByUsernameAndPassword(username,password);
		return login;
	}

}
