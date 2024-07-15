import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        int existing = ob.nextInt();
        int new_users = ob.nextInt();
        System.out.println(existing+new_users);
    }
}