package boletin22;

public class Boletin22 {
    public static void main(String[] args) {
        
        int[][] num = {{3,4,2}, {1,2,1}, {3,0,1}};
	int y, x;
	int cont = 0;
 
	for(y = 0;y < num.length;y++){
	    for(x = 0;x < num[y].length;x++){
	        System.out.print(num[y][x]);
	    }
 
	}
        
    }
    
}
