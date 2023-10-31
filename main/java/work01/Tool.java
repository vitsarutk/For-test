
package work01;


public final class Tool {

    public Tool() {
    }
    public static double median(double d0,double d1,double d2){
        if(d0 <= d1 && d1 <= d2 || d1 <= d0 && d2 <= d1){
            return d1;
        }else if(d0 <= d2 && d2 <= d1 || d2 <= d0 && d1 <= d2){
            return d2;
        }else if(d1 <= d0 && d0 <= d2 || d2 <= d0 && d0 <= d1){
            return d0;
        }
        return d1; 
    }
    public static double compute(double d0,double d1,String operation){
        switch(operation){
            case "sum","add","plus":return d0+d1;
            case "difference","subtract","minus": return d0-d1;
            case "produc", "multiply","times": return d0*d1;
            case "division","by": return d0/d1;
           
        }
        throw new RuntimeException("Invalid Operatoion");
    }
    public static int digitProduct(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int product = 1;
        while (number > 1) {
            int mod = number % 10;
            if (mod > 1) product *= mod;
            number /= 10;
        }
        return product;
    }
}
