import java.util.Scanner;
public class stack{
     class Node{
     int data;
     Node next;
     Node (int data){
       this.data=data;
       }
     }
private Node head=null;
int size=0;     
public void push (int data){
  Node newNode=new Node(data);
  if(head==null){
    head = newNode;
    return;
    }
    if(newNode==null){
    System.out.println("Overflow");
    }
    newNode.next=head;
    head=newNode;
    size++;
    }
public void pop(){
    if(head==null){
    System.out.println("Stack is empty");
    return;}
    System.out.println("Popped element is" + head.data);
    head=head.next;
    size--;
    }
public void peek(){
    if(head==null){
    System.out.println("Stack is empty");
    return;
    }
    System.out.println(head.data);
    }
public void display(){
    Node temp=head;
    while(temp!=null){
    System.out.println(temp.data);
    temp=temp.next;
    }
   }
public static void main(String[] args){
    stack sl=new stack();
    Scanner in=new  Scanner(System.in);
    int ch=0,p=100;
    while(p>0){
    System.out.println("1.push \n2.pop \n3.peek \n4.display \n5.exit");
    System.out.println("Enter the choice:");
    ch=in.nextInt();
switch(ch)
{
 case 1:
        int d=in.nextInt();
        sl.push(d);
        break;
 case 2:
        sl.pop();
        break;
 case 3:                      
        sl.peek();
        break;
 case 4:                        
        sl.display();
        break;
 case 5:       
        p=0;
        break;
 default:
       System.out.println("Invalid");
       }
      } 
     }  
    } 