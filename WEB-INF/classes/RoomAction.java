package com.struts2.learning;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Collection;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class RoomAction extends ActionSupport implements ModelDriven<Room>, Preparable{
	Collection rooms;
	Room room;
	public String getAvailableRooms(){
		RoomMasterDAO dao = new RoomMasterDAO();
		Collection rooms = dao.getAvailableRooms();
		setRooms(rooms);
		return SUCCESS;
	}
	public void setRooms(Collection rooms){
		this.rooms=rooms;
	}
	public Collection getRooms(){
		return rooms;
	}
	public String getOccupiedRooms(){
		RoomMasterDAO dao = new RoomMasterDAO();
		Collection rooms = dao.getOccupiedRooms();
		setRooms(rooms);
		return SUCCESS;
	}
	public void prepare(){
		room = new Room();
	}
	public Room getModel(){
		return room;
	}
	public void setRoom(Room room){
		this.room = room;
	}
	public Room getRoom(){
		return room;
	}
	public String allocateRoom(){
		RoomMasterDAO dao = new RoomMasterDAO();
		dao.allocateRoom(room);
		return "allocateRoom";
	}
	public String deallocateRoom(){
		RoomMasterDAO dao = new RoomMasterDAO();
		dao.deallocateRoom(room);
		return "deallocateRoom";
	}
}