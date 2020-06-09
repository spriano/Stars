package it.start.stars;

public class TriangoloCapovolto {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=i)
				    System.out.print("* "); //2 caratteri * e spazio
				else
					System.out.print("  "); //due spazi
				
			}
			System.out.println("");
	    }

	}

}
