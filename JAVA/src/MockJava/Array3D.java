package MockJava;

public class Array3D {
	
	    public static void main(String[] args) {

	        int[][][] arr = {
	            { {1, 2}, {3, 4} },
	            { {5, 6}, {7, 8} }
	        };

	        for (int i = 0; i < arr.length; i++) {              // 1st dimension
	            for (int j = 0; j < arr[i].length; j++) {       // 2nd dimension
	                for (int k = 0; k < arr[i][j].length; k++) { // 3rd dimension
	                    System.out.print(arr[i][j][k] + " ");
	                }
	                System.out.println();
	            }
	            System.out.println();
	        }
	    }
	}