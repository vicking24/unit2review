class squares {

    public static void main  (String[]args) {
        int tot1=0;
        int tot2=0;
        int diff;

        for (int i=1; i<=100; i++) {
            //System.out.print (i+" ");
            tot1 =tot1+ (int)(Math.pow(i,2));
            

        }
        System.out.println ("");
        System.out.println ("sum of squares: " +tot1);
        
        
        for (int k=1; k<=100; k++) {
        //System.out.print (k+" ");
        tot2=tot2+k;
       
        } 
        tot2=(int)(Math.pow(tot2,2));
        
        System.out.println ("");
        System.out.println ("squares of sum: "+tot2);
        
        diff=tot2-tot1;
        System.out.println ("");
        System.out.println ("the difference: "+diff);
    }

}