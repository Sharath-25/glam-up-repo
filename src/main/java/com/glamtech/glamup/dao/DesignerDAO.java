package com.glamtech.glamup.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.glamtech.glamup.entity.DesignerEntity;
import com.glamtech.glamup.exception.DesignerDAOException;

@Repository
public interface DesignerDAO extends JpaRepository<DesignerEntity, Long> {

	String getEmail(@Param("loginEmail") String loginEmail) throws DesignerDAOException;

	String getEncodedPasswordByEmail(@Param("loginEmail") String loginEmail) throws DesignerDAOException;

	Integer getNoOfLoginAttemptByEmail(@Param("loginEmail") String loginEmail) throws DesignerDAOException;

	@Transactional
	@Modifying
	public void updateLoginAttemptByEmail(@Param("loginAttempt") int loginAttempt, @Param("loginEmail") String loginEmail)
			throws DesignerDAOException;

}
