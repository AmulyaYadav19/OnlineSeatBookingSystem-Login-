package com.CapG.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CapG.Model.LoginPage;

public interface LoginRepository extends JpaRepository<LoginPage, Integer>
{
	LoginPage findByUsernameAndPassword(String username,String password);


}



