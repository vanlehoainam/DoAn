package Model;

import java.util.Arrays;

public class Quanao {
	private int ID_QA, SoLuong;
	private String Ten_QA, Size, MoTa;
	private byte[] anhsp;
	private double GiaBan;
	

	public Quanao(int iD_QA, int soLuong, String ten_QA, String size, String moTa, byte[] anhsp, double giaBan) {
		super();
		ID_QA = iD_QA;
		SoLuong = soLuong;
		Ten_QA = ten_QA;
		Size = size;
		MoTa = moTa;
		this.anhsp = anhsp;
		GiaBan = giaBan;
	}
	public Quanao() {
		super();
	}
	public int getID_QA() {
		return ID_QA;
	}
	public void setID_QA(int iD_QA) {
		ID_QA = iD_QA;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public String getTen_QA() {
		return Ten_QA;
	}
	public void setTen_QA(String ten_QA) {
		Ten_QA = ten_QA;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public String getMoTa() {
		return MoTa;
	}
	public void setMoTa(String moTa) {
		MoTa = moTa;
	}
	public byte[] getAnhsp() {
		return anhsp;
	}
	public void setAnhsp(byte[] anhsp) {
		this.anhsp = anhsp;
	}
	public double getGiaBan() {
		return GiaBan;
	}
	public void setGiaBan(double giaBan) {
		GiaBan = giaBan;
	}
	@Override
	public String toString() {
		return "Quanao [ID_QA=" + ID_QA + ", SoLuong=" + SoLuong + ", Ten_QA=" + Ten_QA + ", Size=" + Size + ", MoTa="
				+ MoTa + ", anhsp=" + Arrays.toString(anhsp) + ", GiaBan=" + GiaBan + "]";
	}

	
	
}