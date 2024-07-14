import java.util.*;
class NumberPattern{
  public static void main(String[]args){
   int num=4;
    int row,col;
    for(row=1;row<=num;row+=1){
      System.out.printf("\n");
      for(col=1;col<=row;col+=1)
        System.out.print(" " +col+" ");
      for(col=1;col<=(num*2)-(row*2);col+=1)
        System.out.print(" ");
      for(col=row;col>=1;col-=1)
         System.out.print(" "+col+" ");
    }
  }
}
      
