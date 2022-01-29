package com.CapG.Controller;

import java.util.Objects;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.CapG.Model.LoginPage;
import com.CapG.Service.LoginService;
import com.CapG.Service.LoginServiceimpl;

@RestController

public class LoginRestController
{
	@Autowired
	LoginService Service;
	
	@GetMapping("/login")
		public ResponseEntity createLogin(@Validated @RequestBody LoginPage login)
		{
		LoginPage lg=Service.login(login.getUsername(), login.getPassword());
		
		if(Objects.nonNull(lg))
		{
			return ResponseEntity.ok().body("Login successfully");
		}
		else
		{
			return ResponseEntity.ok().body("Incorrect username or password");
			
		}
			
		}
		
		/*@PutMapping("/forgot/{oldPassword}/{newPassword}")
		public boolean forgotPassword(@PathVariable String oldPassword, @PathVariable String newPassword) 
		{

			return dao.forgotPassword(oldPassword, newPassword);
		}*/


}
