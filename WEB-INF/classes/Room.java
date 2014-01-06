package com.struts2.learning;

public class Room{
	int roomNumber;
	String roomType, roomStatus;
	public Room(){
	}
	public Room(final int roomNumber, final String roomType, final String roomStatus){
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomStatus = roomStatus;
	}
	public void setRoomNumber(int roomNumber){
		this.roomNumber = roomNumber;
	}
	public int getRoomNumber(){
		return roomNumber;
	}
	public void setRoomType(String roomType){
		this.roomType = roomType;
	}
	public String getRoomType(){
		return roomType;
	}
	public void setRoomStatus(String roomStatus){
		this.roomStatus = roomStatus;
	}
	public String getRoomStatus(){
		return roomStatus;
	}
	public boolean equals(Object o){
		if(o instanceof Room){
			return ((Room)o).getRoomNumber() == (roomNumber);
		}
		else{
			return false;
		}
	}
	public String toString(){
		return "roomNumber = "+roomNumber+" roomType = "+roomType;
	}
}