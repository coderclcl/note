package com.model;

public class Student {
	
	int studentnum;
	String name;
	int Kor;
	int Eng;
	int Math;
	
	int total;
	double average;
	int rank;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int kor) {
		Kor = kor;
	}
	public int getEng() {
		return Eng;
	}
	public void setEng(int eng) {
		Eng = eng;
	}
	public int getMath() {
		return Math;
	}
	public void setMath(int math) {
		Math = math;
	}
	
	public int getStudentnum() {
		return studentnum;
	}
	public void setStudentnum(int studentnum) {
		this.studentnum = studentnum;
	}
	
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "[�л���ȣ : " + studentnum + ", �̸� : " + name + ", ���� : " + Kor + ", ���� : " + Eng + ", ���� : "
				+ Math + ", ���� : " + total + ", ��� : " + (String)String.format("%.2f",average) + ", ��� : " + rank + "]";
	}
	
	
	

}
