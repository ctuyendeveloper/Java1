package De1;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<ConNguoi> cnguoi=new ArrayList<ConNguoi>();
        CauThu cthu1=new CauThu("Con cac",20,97);
        CauThu cthu2=new CauThu("Con cac2",25,92);
        ThuMon tmon=new ThuMon("Con cac3",18,99);
        cnguoi.add(cthu1);
        cnguoi.add(cthu2);
        cnguoi.add(tmon);
        int a = 1;
        for(int i=0; i < cnguoi.size(); i++)
        {
            System.out.printf("\nCau thu so %d", a);
            cnguoi.get(i).xuatThongTin();
            a++;
        }
    }
}
