import java.util.*;
public class Eleva {
	public static void main (String [] args) {
		int w, v[][] = new int[4][4];
		v[0][0] = 2;
		w=v[0][0];
		
		for(int i=0;i<4;i++ ) {
			for(int j=0;j<4;j++) {
				if(i==0 && j==0) {
					v[0][0] = 2;
				} else {
					v[i][j] = w*2;
					w = v[i][j];
				}
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(" "+v[i][j]);
			}
			System.out.println("");
		}
	}
}
