public class Runner{
 interface partnerA{
  public abstract void Print_Quotient(float a, float b);
 }
 //How to merge
 //lambda notation
 //how to use Github and more specifcally Gitkraken
 interface partnerB{
  public abstract boolean Perfect_Square(float a);
 }
 public static void main(String[]args){
  partnerA pA = (a,b)-> {
   System.out.printf("'%.3f'%n",a/b);
  };
  pA.Print_Quotient(5f, 3f);
  partnerB pB = (a)->{
      return (a == (Math.sqrt(a)*Math.sqrt(a)));
  };
        System.out.println(pB.Perfect_Square(4f));
 }
}