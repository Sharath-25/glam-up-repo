package com.glamtech.glamup.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.glamtech.glamup.dto.VendorRegisterDTO;
import com.glamtech.glamup.entity.DesignerEntity;
import com.glamtech.glamup.entity.EventPlannerEntity;
import com.glamtech.glamup.entity.MakeupArtistEntity;
import com.glamtech.glamup.entity.PhotographerEntity;

@Component
public class EntityProvider {

	private static final Logger logger = LogManager.getLogger(EntityProvider.class);

	public EntityProvider() {
		super();
		logger.debug(this.getClass().getSimpleName() + " Object created");
	}

	public Object getEntity(VendorRegisterDTO vendorRegisterDTO) {
		logger.info("Invoked getEntity()");
		switch (vendorRegisterDTO.getBusinessType()) {
		case MAKEUPARTIST:
			MakeupArtistEntity makeupArtistEntity = new MakeupArtistEntity();
			makeupArtistEntity.setNoOfLoginAttempt(0);
			BeanUtils.copyProperties(vendorRegisterDTO, makeupArtistEntity);
			return makeupArtistEntity;

		case PHOTOGRAPHER:
			PhotographerEntity photographerEntity = new PhotographerEntity();
			photographerEntity.setNoOfLoginAttempt(0);
			BeanUtils.copyProperties(vendorRegisterDTO, photographerEntity);
			return photographerEntity;

		case EVENTPLANNER:
			EventPlannerEntity eventPlannerEntity = new EventPlannerEntity();
			eventPlannerEntity.setNoOfLoginAttempt(0);
			BeanUtils.copyProperties(vendorRegisterDTO, eventPlannerEntity);
			return eventPlannerEntity;

		case DESIGNER:
			DesignerEntity designerEntity = new DesignerEntity();
			designerEntity.setNoOfLoginAttempt(0);
			BeanUtils.copyProperties(vendorRegisterDTO, designerEntity);
			return designerEntity;

		}

		return null;

	}

}
