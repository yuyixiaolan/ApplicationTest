import java.util.Scanner;
public class Coverage {
    public static void main(String[] args){
        System.out.println("start main function:path a...");
        int A=0,B=0,X=0;
        Scanner s = new Scanner(System.in);

        System.out.println("输入A：");  A = s.nextInt();
        System.out.println("输入B=");  B = s.nextInt();
        System.out.println("输入X=");  X = s.nextInt();
        s.close();

        if (A>1 && B==0) {
            X=X/A;
            System.out.println("path c");
        } else {
            System.out.println("path b");  
            }

        if (A==2 || X>1) {
            X=X+1;
            System.out.println("path e");
        } else {
            System.out.println("path d");  
            }
            
        System.out.println("end main function.");
    }
}