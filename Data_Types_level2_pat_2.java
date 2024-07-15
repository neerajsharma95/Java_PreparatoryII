// You are using Java
import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        double b = obj.nextDouble();
        boolean c = obj.nextBoolean();
        char d = obj.next().charAt(0);
        obj.nextLine();
        String e = obj.nextLine();
       
        System.out.println("Integer value ="+a+"\nDouble value = "+b+"\nBoolean value = "+c+"\nchar value = "+d+"\nString value = "+e);
    }
}