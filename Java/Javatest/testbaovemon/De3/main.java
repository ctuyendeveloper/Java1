package De3;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<Xe> xe=new ArrayList<Xe>();
        Xehoi xh1=new Xehoi("Ford",120,40);
        Xehoi xh2=new Xehoi("VinFast",100,60);
        Xetai xt=new Xetai("Xe tai to",70,130);
        xe.add(xh1);
        xe.add(xh2);
        xe.add(xt);
        int a = 1;
        for(int i=0; i < xe.size(); i++)
        {
            System.out.print("\n+---------+");
            System.out.printf("\n+ Xe so %d +", a);
            System.out.print("\n+---------+");
            xe.get(i).xuatThongTin();
            a++;
        }
    }
}