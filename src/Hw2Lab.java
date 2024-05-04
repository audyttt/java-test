public class Hw2Lab {
    public static void main(String[] args) {
        int a = 4;
        int b = 12;
        int c = 9;

        Double result = quadraticEquation(a,b,c);
        if(result==null){
            System.out.println("There is no real roots for x");
        }else{           
                System.out.println("a value for x:" +result);           
        }

    }
    public static Double quadraticEquation(int a, int b, int c) {
        Double val =0.0;
        if ((b*b - (4 * a * c)) < 0) {
            return null;
        } else {
            val = (-b + Math.sqrt((b*b - 4 * a * c))) / 2 * a;
    
        }
        return val;
    }
}
