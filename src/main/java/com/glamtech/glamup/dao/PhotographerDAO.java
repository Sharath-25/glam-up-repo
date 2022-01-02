package com.glamtech.glamup.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.glamtech.glamup.entity.PhotographerEntity;
import com.glamtech.glamup.exception.PhotographerDAOException;

@Repository
public interface PhotographerDAO extends JpaRepository<PhotographerEntity, Long>{

	String getEmail(@Param("loginEmail") String loginEmail) throws PhotographerDAOException;
	
	String getEncodedPasswordByEmail(@Param("loginEmail") String loginEmail) throws PhotographerDAOException;
	
	Integer getNoOfLoginAttemptByEmail(@Param("loginEmail") String loginEmail) throws PhotographerDAOException;

	@Transactional
	@Modifying
	public void updateLoginAttemptByEmail(@Param("loginAttempt") int loginAttempt, @Param("loginEmail") String loginEmail)
			throws PhotographerDAOException;

}
