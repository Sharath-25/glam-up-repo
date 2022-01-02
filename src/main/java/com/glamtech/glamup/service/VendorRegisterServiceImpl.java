package com.glamtech.glamup.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glamtech.glamup.dao.DesignerDAO;
import com.glamtech.glamup.dao.EventPlannerDAO;
import com.glamtech.glamup.dao.MakeupArtistDAO;
import com.glamtech.glamup.dao.PhotographerDAO;
import com.glamtech.glamup.dto.VendorRegisterDTO;
import com.glamtech.glamup.entity.DesignerEntity;
import com.glamtech.glamup.entity.EventPlannerEntity;
import com.glamtech.glamup.entity.MakeupArtistEntity;
import com.glamtech.glamup.entity.PhotographerEntity;
import com.glamtech.glamup.util.EntityProvider;
import com.glamtech.glamup.util.PasswordTransmitter;

@Service
public class VendorRegisterServiceImpl implements VendorRegisterService {

	private static final Logger logger = LogManager.getLogger(VendorRegisterServiceImpl.class);

	@Autowired
	private MakeupArtistDAO makeupArtistDAO;

	@Autowired
	private PhotographerDAO photographerDAO;

	@Autowired
	private EventPlannerDAO eventPlannerDAO;

	@Autowired
	private DesignerDAO designerDAO;

	@Autowired
	private PasswordTransmitter passwordTransmitter;

	@Autowired
	private EntityProvider entityProvider;

	public VendorRegisterServiceImpl() {
		logger.debug(this.getClass().getSimpleName() + " Bean created");
	}

	@Override
	public boolean saveVendorRegister(VendorRegisterDTO vendorRegisterDTO) {
		logger.info("Invoked saveVendorRegister() ");
		boolean flag = true;
		vendorRegisterDTO.setPassword(this.passwordTransmitter.encodePassword(vendorRegisterDTO.getPassword()));
		Object entity = this.entityProvider.getEntity(vendorRegisterDTO);
		try {
			switch (vendorRegisterDTO.getBusinessType()) {
			case MAKEUPARTIST:
				MakeupArtistEntity makeupArtistEntity = (MakeupArtistEntity) entity;
				this.makeupArtistDAO.save(makeupArtistEntity);
				logger.info("makeupArtistEntity is saved ");
				return flag;
			case PHOTOGRAPHER:
				PhotographerEntity photographerEntity = (PhotographerEntity) entity;
				this.photographerDAO.save(photographerEntity);
				logger.info("photographerEntity is saved ");
				return flag;
			case EVENTPLANNER:
				EventPlannerEntity eventPlannerEntity = (EventPlannerEntity) entity;
				this.eventPlannerDAO.save(eventPlannerEntity);
				logger.info("eventPlannerEntity is saved ");
				return flag;
			case DESIGNER:
				DesignerEntity designerEntity = (DesignerEntity) entity;
				this.designerDAO.save(designerEntity);
				logger.info("designerEntity is saved ");
				return flag;
			}
		} catch (Exception exception) {
			flag = false;
			logger.error(exception.getMessage());
		}
		return flag;
	}

}
