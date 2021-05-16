package java大作业;

import java.io.*;
public class Student implements Serializable{
	private String no;   //账号
	private String password;   //密码
	private int information;
    private int ID;	     
    private String name;
	public Student(String accounts,String pw,int num) {   //
		no=new String(accounts);
		password=new String(pw);
		information=(num>0?num:0);
	}
	public int getinformation() {  //获取学生信息
		return information;
	}
	public int inputID(int num) {   //获取学号
		
		return ID;
	}       
        public String inputName(String num1) {   //获取学生姓名
		return name;
	}
	public boolean setPassword(String pw) {     //修改密码
		password=new String(pw);
		return true;
	}
	public boolean check(String accounts,String pw) {     //核对密码
		if(no.equals(accounts)&&password.equals(pw))
			return true;
		else
			return false;	
	}	
    int Add(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}