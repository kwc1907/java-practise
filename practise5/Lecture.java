package ����ҵ;
import java.util.*;
public class Lecture{
	String lecname; //�γ�����
	String grades; //�γ̳ɼ�
	public Lecture(String lecname, String grades)
	{
		this.lecname = lecname;
		this.grades = grades;
	}
	public String getlecname()
	{
		return lecname;
	}
	public String getgrades()
	{
		return grades;
	}
	public void entergrades(String grades)
	{
		this.grades = grades;
	}
}
	