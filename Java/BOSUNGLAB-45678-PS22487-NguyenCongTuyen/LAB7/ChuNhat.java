package LAB7;

public class ChuNhat {
	double cd,cr;
	ChuNhat(){
		
	}
	ChuNhat( double cd,double cr){
		this.cd=cd;
		this.cr=cr;
	}
	double getchuvi() {
		return (cd+cr)*2;
	}
	double getDienTich(){
		return cd*cr;
	}
	String xuat() {
		return "Chieu dai: "+cd+ " Chieu rong: "+cr+"\nChu vi:"+getchuvi()+" Dien tich:"+getDienTich();
	}
}
