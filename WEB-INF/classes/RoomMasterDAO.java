package com.struts2.learning;


import java.sql.*;
import java.util.*;
public class RoomMasterDAO extends BaseDAO{
	public Collection getAvailableRooms(){
		Vector rooms = new Vector();
		try{
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(" select roomno, typename, roomstatus from roommaster, roomtypemaster where roomstatus='A' and roommaster.typeid = roomtypemaster.typeid");
			while(rs.next()){
				Room room = new Room();
				room.setRoomNumber(rs.getInt(1));
				room.setRoomType(rs.getString(2));
				room.setRoomStatus(rs.getString(3));
				rooms.add(room);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return rooms;
	}
	public Collection getOccupiedRooms(){
		Vector rooms = new Vector();
		try{
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(" select roomno, typename, roomstatus from roommaster, roomtypemaster where roomstatus='O' and roommaster.typeid = roomtypemaster.typeid");
			while(rs.next()){
				Room room = new Room();
				room.setRoomNumber(rs.getInt(1));
				room.setRoomType(rs.getString(2));
				room.setRoomStatus(rs.getString(3));
				rooms.add(room);
			}
			closeConnection();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return rooms;
	}
	public boolean allocateRoom(Room room){
		int i = 0;
		Connection con = null;
		try{
			con = getConnection();
			PreparedStatement pstmt = con.prepareStatement("update RoomMaster set RoomStatus='O' where RoomNo=?");
			pstmt.setInt(1,room.getRoomNumber());
			i = pstmt.executeUpdate();
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				if(con != null)
					closeConnection();
			}
			catch(Exception e){
				System.out.println(e);
			}
			if( i== 0)
				return false;
			else
				return true;
		}
	}
	public boolean deallocateRoom(Room room){
		int i =0;
		Connection con = null;
		try{
			con = getConnection();
			PreparedStatement pstmt = con.prepareStatement("update RoomMaster set RoomStatus='A' where RoomNo=?");
			pstmt.setInt(1,room.getRoomNumber());
			i = pstmt.executeUpdate();
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				if(con != null)
					closeConnection();
			}
			catch(Exception e){
				System.out.println(e);
			}
			if(i == 0)
				return false;
			else
				return true;
		}
	}
};