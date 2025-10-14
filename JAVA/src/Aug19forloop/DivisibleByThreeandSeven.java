package Aug19forloop;

class DivisibleByThreeandSeven {
	public static void main(String[]args){
        int sn=1;
        int ln=50;
        int count=0;
        for(int i=sn;i<=ln;i++){
            if(i%3==0 && i%7==0){
                count++;
            }
           
        }
         System.out.print("Premium Batches : "+count);
    }

}
