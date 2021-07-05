package com.cg.devicemanagement.dao;
import java.util.List;

import com.cg.devicemanagement.domain.Device;
/**
 * This will perform all the CRUD Operations on Device Management
 * @author Anuj Jadon
 */
public interface DeviceManagementDAO {
		/**
		 * This save method will save the provided device details
		 * @param device to be saved
		 */
		public void save(Device device);
		/**
		 * This findAll method will return all the devices that needs repairement
		 * @return list of devices if found otherwise null
		 */
		public List<Device> findAll();
		/**
		 * This update method will update device info when repairement will be done
		 * @param devices to be updated
		 */
		public void update(Device device);
		/**
		 * This delete method will remove the devices after repair is done
		 * @param id to the device to be removed
		 */
		public void delete(int id);
}


