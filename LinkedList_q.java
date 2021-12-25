package LinkedList_q;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_q {
    public static void main(String[] args) 
    {
         Scanner in_naem = new Scanner(System.in);
         Scanner in_id = new Scanner(System.in);
        LinkedList<String> linkList_name = new LinkedList<>();
        LinkedList<String> linkList_id = new LinkedList<>();
        for(int a = 0 ;a<4;a++)
        {
            System.out.print("Enter the name : ");
              linkList_name.add(in_naem.next());
            System.out.print("Enter the ID : ");
              linkList_id.add(in_id.next());
        }
        for (int i = 0; i < linkList_id.size(); i++)
        {
            System.out.println( i +" ;  ID   _"+linkList_id.get(i)+"_    Name :"+ linkList_name.get(i));
        
           linkList_name.remove(0);
           linkList_id.remove(0);
            
        
         }
    }
}
