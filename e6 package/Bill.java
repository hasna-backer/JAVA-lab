import java.util.* ;
interface BillGen{
	int calculate( ) ;
}
class ProductB implements BillGen {
	String name ;
	int prod_id,quantity,unit_price,total;
	ProductB ( ){}
	ProductB( String n,int p,int q,int u){
		name=n ; 
		prod_id=p ;
		quantity=q ;
		unit_price=u ;
	}
	public int calculate( ) {
		total=quantity*unit_price;
		return total;
	}
}
public class b1 {
	public static void main(String args[]){
		ProductB order[][] ;//2D ARRAY OBJECT
		System.out.println (" Enter no. of orders : " ) ;
		Scanner sc = new Scanner ( System.in ) ;
		int n = sc.nextInt ( ) ;
		order = new ProductB[n][ ] ;//INSTANTIATION OF n OBJECTS FOR ORDERS
		for ( int i = 0 ; i < n ; i++){
			System.out.print(" Enter no. of Products : " ) ;
			int m = sc.nextInt ( ) ;
			order[i] = new ProductB[m] ;//NO OF COLUMNS
			for (int j = 0 ; j < m; j++ ){
				System.out.print (" Enter Product " + (j+1) + " Name : " ) ;
				String a = sc.next ( ) ;
				System.out.print(" Enter Product ID: " ) ;
				int b = sc.nextInt ( ) ;
				System.out.print (" Enter Product Quantity : " ) ;
				int c = sc . nextInt ( ) ;
				System.out.print (" Enter Product Unit Price : " ) ;
				int d = sc .nextInt ( ) ;
				ProductB pb = new ProductB ( a , b , c , d ) ;
				order [i][j]=pb ;
				order [i][j].total=order[i][j].calculate();
			}
		}
		for(int i = 0 ; i < n ; i++){
			int sum = 0 ;
			System.out.println("Order No : " + ( i +1) ) ;
			Date date=java.util.Calendar.getInstance() . getTime ( ) ;
			System.out.println( date ) ;

			System.out.println("__________________________________________________________________________________________");
			 System.out.println("Product ID "+"\t "+" Name"+"\t      "+"Quantity"+"\t    "+"Unit Price"+"\t       "+"Total ");
			System.out.println ( ) ;
			System.out.println("__________________________________________________________________________________________");
			for(int j=0;j<order[i].length;j++){
			
			
			
			
				System.out.printf("   "+order[i][j].prod_id+"\t\t   "+order[i][j].name+"\t "+order[i][j].quantity+"\t\t"+order[i][j].unit_price+"\t\t  "+order[i][j].total);
				System.out.println ( ) ;
			}
			System.out.println("___________________________________________________________________________________________");
			for ( int k=0; k<order [i] . length ; k++)
				sum = sum + order[i] [k] . total ;
			System.out.println (" Net Amount : " + sum) ;
			System.out.println("___________________________________________________________________________________________");
			}
		}
}
