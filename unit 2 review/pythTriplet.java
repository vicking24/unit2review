class pythTriplet {
    public static void main (String[]args){
        int a=1, b=1000, c;
        int pro=0;

        while (a<=1000){
            while (b>a&&b>1) {
                c=1000-a-b;
                if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
                    pro=a*b*c;
                    System.out.println ("a"+a+" b"+b+" c"+c);
                    System.out.println ("Product: "+pro);
                }
                b--;
                //System.out.print ("c"+c);
                //System.out.println("");
                //System.out.print (b+" ");

            }
            b=1000;
            //System.out.println("");
            //System.out.println (a);

            a++;
        }

    }

}