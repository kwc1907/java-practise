package java����ҵ;

import java.io.*;
public class Student implements Serializable{
	private String no;   //�˺�
	private String password;   //����
	private int information;
    private int ID;	     
    private String name;
	public Student(String accounts,String pw,int num) {   //
		no=new String(accounts);
		password=new String(pw);
		information=(num>0?num:0);
	}
	public int getinformation() {  //��ȡѧ����Ϣ
		return information;
	}
	public int inputID(int num) {   //��ȡѧ��
		
		return ID;
	}       
        public String inputName(String num1) {   //��ȡѧ������
		return name;
	}
	public boolean setPassword(String pw) {     //�޸�����
		password=new String(pw);
		return true;
	}
	public boolean check(String accounts,String pw) {     //�˶�����
		if(no.equals(accounts)&&password.equals(pw))
			return true;
		else
			return false;	
	}	
    int Add(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}