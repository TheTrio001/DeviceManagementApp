package com.cg.devicemanagement.daoimpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.cg.devicemanagement.dao.DeviceManagementDAO;
import com.cg.devicemanagement.domain.Device;
import com.cg.devicemanagement.util.DBUtil;


public class DeviceManagementDAOImpl extends DBUtil implements DeviceManagementDAO{

	@Override
	public void save(Device device) {
		String sql =  "Insert into devices (device_type, problem, repaired) values (?,?,?)";
		PreparedStatement pstmt = prepareStatement(sql);
		try {
			pstmt.setString(1, device.getDevice_type());
			pstmt.setString(2, device.getProblem());
			pstmt.setString(3, device.getRepaired());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		closePrepareStatement();
		
	}

	@Override
	public List<Device> findAll() {
		String sql =  "Select * from devices";
		List<Device> devices = new ArrayList<>();
		PreparedStatement pstmt = prepareStatement(sql);
		try {
			ResultSet rs=pstmt.executeQuery();
			while (rs.next()) {
				Device device =new Device();
				device.setId(rs.getInt("id"));
				device.setDevice_type(rs.getString("device_type"));
				device.setProblem(rs.getString("problem"));
				device.setRepaired(rs.getString("repaired"));
				devices.add(device);
				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return devices;
		
	}

	@Override
	public void update(Device device) {
		String sql = "update devices set device_type=?,problem=?,repaired=? where id=?";
		PreparedStatement pstmt = prepareStatement(sql);
		System.out.println(pstmt);
		try {
			pstmt.setString(1, device.getDevice_type());
			pstmt.setString(2, device.getProblem());
			pstmt.setString(3, device.getRepaired());
			pstmt.setInt(4, device.getId());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		String sql = "delete from devices where id=?";
		PreparedStatement pstmt = prepareStatement(sql);
		try {
			pstmt.setInt(1,id);
			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
