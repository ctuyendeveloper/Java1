package LAB7;

public class vuong extends ChuNhat {
	vuong(double canh){
		this.cd=canh;
		this.cr=canh;
	}
	String xuat() {
		return "Canh: "+cd+"\nDien tich: "+getDienTich()+" Chu vi: "+getchuvi();
		}
}
