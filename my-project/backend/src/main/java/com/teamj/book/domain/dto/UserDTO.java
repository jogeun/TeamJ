package com.teamj.book.domain.dto;

public class UserDTO {

    private int userNo;
    private String userName;

    public UserDTO(){

    }
    public UserDTO(int userNo, String userName){
        this.userNo = userNo;
        this.userName = userName;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
