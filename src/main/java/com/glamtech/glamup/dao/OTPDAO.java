package com.glamtech.glamup.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.glamtech.glamup.entity.OTPEntity;

@Repository
public interface OTPDAO extends JpaRepository<OTPEntity, Long> {

	String verifyEmail(@Param("emailID") String email) throws Exception;

	String getOTPByEmail(@Param("emailID") String email) throws Exception;
}
