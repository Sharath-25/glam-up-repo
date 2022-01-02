package com.glamtech.glamup.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.glamtech.glamup.entity.MakeupArtistEntity;
import com.glamtech.glamup.exception.MakeupArtistDAOException;

@Repository
public interface MakeupArtistDAO extends JpaRepository<MakeupArtistEntity, Long> {

	String getEmail(@Param("loginEmail") String loginEmail) throws MakeupArtistDAOException;

	String getEncodedPasswordByEmail(@Param("loginEmail") String loginEmail) throws MakeupArtistDAOException;

	Integer getNoOfLoginAttemptByEmail(@Param("loginEmail") String loginEmail) throws MakeupArtistDAOException;

	@Transactional
	@Modifying
	public void updateLoginAttemptByEmail(@Param("loginAttempt") int loginAttempt, @Param("loginEmail") String loginEmail)
			throws MakeupArtistDAOException;

}
