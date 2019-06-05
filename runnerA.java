public class runnerA{
	public static void main(String[]args){
        partnerA pA = (a,b)-> {
            System.out.printf("'%.3f'%n",a/b);
        };
        pA.Print_Quotient(5f, 3f);
	}
}