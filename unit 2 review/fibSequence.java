class fibSequence {

    public static void main (String[]args) {
        int n1=0;
        int n2=1;
        int tot=0;

        int i=0;
        
        while (i<4000000) {
            i=n1+n2;
            
            if (i<4000000) {

                n1=n2;
                n2=i;

                if (i%2==0) tot=tot+i;

                System.out.print (i+" ");

            }

        }
        System.out.println ("");
        System.out.println (tot);

    }

}