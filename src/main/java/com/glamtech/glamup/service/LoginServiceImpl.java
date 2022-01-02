package com.glamtech.glamup.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glamtech.glamup.constant.Vendor;
import com.glamtech.glamup.dao.DesignerDAO;
import com.glamtech.glamup.dao.EventPlannerDAO;
import com.glamtech.glamup.dao.MakeupArtistDAO;
import com.glamtech.glamup.dao.PhotographerDAO;
import com.glamtech.glamup.dto.LoginDTO;
import com.glamtech.glamup.exception.DesignerDAOException;
import com.glamtech.glamup.exception.EventPlannerDAOException;
import com.glamtech.glamup.exception.MakeupArtistDAOException;
import com.glamtech.glamup.exception.PhotographerDAOException;
import com.glamtech.glamup.util.LoginVerifier;
import com.glamtech.glamup.util.PasswordTransmitter;

@Service
public class LoginServiceImpl implements LoginService {

	private static final Logger logger = LogManager.getLogger(LoginServiceImpl.class);

	@Autowired
	private PasswordTransmitter passwordTransmitter;

	@Autowired
	private MakeupArtistDAO makeupArtistDAO;

	@Autowired
	private PhotographerDAO photographerDAO;

	@Autowired
	private EventPlannerDAO eventPlannerDAO;

	@Autowired
	private DesignerDAO designerDAO;

	@Autowired
	private LoginVerifier loginVerifier;

	public LoginServiceImpl() {
		logger.info(this.getClass().getSimpleName() + " Bean Created");
	}

	@Override
	public boolean verifyLoginEmailByVendor(String loginEmail, Vendor vendor) {
		logger.debug("Invoked verifyLoginEmailByVendor()");
		String databaseEmail = null;
		try {
			switch (vendor) {
			case MAKEUPARTIST:
				databaseEmail = this.makeupArtistDAO.getEmail(loginEmail);
				return this.loginVerifier.verifyEmail(loginEmail, databaseEmail);

			case PHOTOGRAPHER:
				databaseEmail = this.photographerDAO.getEmail(loginEmail);
				return this.loginVerifier.verifyEmail(loginEmail, databaseEmail);

			case EVENTPLANNER:
				databaseEmail = this.eventPlannerDAO.getEmail(loginEmail);
				return this.loginVerifier.verifyEmail(loginEmail, databaseEmail);

			case DESIGNER:
				databaseEmail = this.designerDAO.getEmail(loginEmail);
				return this.loginVerifier.verifyEmail(loginEmail, databaseEmail);

			}
		} catch (MakeupArtistDAOException | PhotographerDAOException | EventPlannerDAOException
				| DesignerDAOException exception) {
			logger.error(exception.getMessage());
		}
		return false;
	}

	@Override
	public boolean verifyLoginPasswordByVendor(LoginDTO loginDTO) {
		logger.debug("Invoked verifyLoginPasswordByVendor()");
		String encodedPassword = null;
		try {
			switch (loginDTO.getVendorType()) {
			case MAKEUPARTIST:
				encodedPassword = this.makeupArtistDAO.getEncodedPasswordByEmail(loginDTO.getEmail());
				return this.passwordTransmitter.verifyEncodedPassword(loginDTO.getPassword(), encodedPassword);

			case PHOTOGRAPHER:
				encodedPassword = this.photographerDAO.getEncodedPasswordByEmail(loginDTO.getEmail());
				return this.passwordTransmitter.verifyEncodedPassword(loginDTO.getPassword(), encodedPassword);

			case EVENTPLANNER:
				encodedPassword = this.eventPlannerDAO.getEncodedPasswordByEmail(loginDTO.getEmail());
				return this.passwordTransmitter.verifyEncodedPassword(loginDTO.getPassword(), encodedPassword);

			case DESIGNER:
				encodedPassword = this.designerDAO.getEncodedPasswordByEmail(loginDTO.getEmail());
				return this.passwordTransmitter.verifyEncodedPassword(loginDTO.getPassword(), encodedPassword);

			}
		} catch (MakeupArtistDAOException | PhotographerDAOException | EventPlannerDAOException
				| DesignerDAOException exception) {
			logger.error(exception.getMessage());
		}
		return false;
	}

	@Override
	public boolean verifyLoginCountByVendor(String loginEmail, Vendor vendor) {
		logger.debug("Invoked verifyLoginCountByVendor()");
		int noOfLoginAttempt = 0;
		try {
			switch (vendor) {
			case MAKEUPARTIST:
				noOfLoginAttempt = this.makeupArtistDAO.getNoOfLoginAttemptByEmail(loginEmail);
				return this.loginVerifier.verifyLoginAttempt(noOfLoginAttempt);

			case PHOTOGRAPHER:
				noOfLoginAttempt = this.photographerDAO.getNoOfLoginAttemptByEmail(loginEmail);
				return this.loginVerifier.verifyLoginAttempt(noOfLoginAttempt);

			case EVENTPLANNER:
				noOfLoginAttempt = this.eventPlannerDAO.getNoOfLoginAttemptByEmail(loginEmail);
				return this.loginVerifier.verifyLoginAttempt(noOfLoginAttempt);

			case DESIGNER:
				noOfLoginAttempt = this.designerDAO.getNoOfLoginAttemptByEmail(loginEmail);
				return this.loginVerifier.verifyLoginAttempt(noOfLoginAttempt);

			}
		} catch (MakeupArtistDAOException | PhotographerDAOException | EventPlannerDAOException
				| DesignerDAOException exception) {
			logger.error(exception.getMessage());
		}
		return false;
	}

	@Override
	public void updateLoginAttempt(String loginEmail, Vendor vendor) {
		logger.debug("Invoked updateLoginAttempt()");
		Integer noOfLoginAttempt =null;
		System.out.println(noOfLoginAttempt);
		try {
			switch (vendor) {
			case MAKEUPARTIST:
				noOfLoginAttempt = this.makeupArtistDAO.getNoOfLoginAttemptByEmail(loginEmail);
				noOfLoginAttempt++;
				this.makeupArtistDAO.updateLoginAttemptByEmail(noOfLoginAttempt, loginEmail);
				break;
			case PHOTOGRAPHER:
				noOfLoginAttempt = this.photographerDAO.getNoOfLoginAttemptByEmail(loginEmail);
				noOfLoginAttempt++;
				this.photographerDAO.updateLoginAttemptByEmail(noOfLoginAttempt, loginEmail);
				break;
			case EVENTPLANNER:
				noOfLoginAttempt = this.eventPlannerDAO.getNoOfLoginAttemptByEmail(loginEmail);
				noOfLoginAttempt++;
				this.eventPlannerDAO.updateLoginAttemptByEmail(noOfLoginAttempt, loginEmail);
				break;
			case DESIGNER:
				noOfLoginAttempt = this.designerDAO.getNoOfLoginAttemptByEmail(loginEmail);
				noOfLoginAttempt++;
				this.designerDAO.updateLoginAttemptByEmail(noOfLoginAttempt, loginEmail);
				break;
			}

		} catch (MakeupArtistDAOException | PhotographerDAOException | EventPlannerDAOException
				| DesignerDAOException exception) {
			logger.error(exception.getMessage());
		}

	}

}
