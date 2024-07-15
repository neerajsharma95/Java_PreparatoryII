import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        double weight = obj.nextDouble();
        obj.nextLine();
        String name = obj.nextLine();
        
        System.out.println("Name : "+name+"\nAge : "+age+"\nWeight : "+weight+"kg");
        
    }
}