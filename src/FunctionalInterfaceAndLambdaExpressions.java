/* Java - 8
 * 
 * Functional Interface has ONLY 1 abstract method
 * Meaning that the interface implementation will only have 1 behavior
 * FI ex: java.lang.Runnable,
 *           java.util.Comparator,
 *           java.util.Callable,
 *           java.io.FileFilter
 * 
 * A FI can have multiple default methods but ONLY 1 abstract method
 *
 * Lambda expressions can represent instance of a FI
 *           
 */
public class FunctionalInterfaceAndLambdaExpressions {

       public static void main(String[] input) {
              System.out.println("before java 8 implementation class  = " + suareRootWithImpl(9));
              System.out.println("before java 8 anonymous implementation = " + suareRootWithAnoymsImp(9));
              System.out.println("before java 8 anonymous implementation = " + squareRootJava8LambdaExpressionWithType(9));
              System.out.println("java 8 lamdba expresson = " + squareRootJava8LambdaExpression(9));
              System.out.println("java 8 Block lamdba expresson = " + squareRootJava8BlockLambdaExpression(9));
              System.out.println("java 8 lamdba expresson as argument = " + squareRootJava8LambdaAsArgument(9));
       }

       private static double suareRootWithImpl(int in) {
              SquareRootImpl squareRootImpl = new SquareRootImpl();
              return squareRootImpl.findSquareRoot(in);
       }

       private static double suareRootWithAnoymsImp(int in) {

              SquareRoot squareRoot = new SquareRoot() {

                     @Override
                     public double findSquareRoot(int n) {
                            return Math.sqrt(n);
                     }
              };

              return squareRoot.findSquareRoot(in);
       }

       private static double squareRootJava8LambdaExpression(int in) {

              SquareRoot squareRoot = (n) -> (Math.sqrt(n));
              return squareRoot.findSquareRoot(in);
       }

       private static double squareRootJava8LambdaExpressionWithType(int in) {

              SquareRoot squareRoot = (int n) -> (Math.sqrt(n));
              return squareRoot.findSquareRoot(in);
       }

       private static double squareRootJava8BlockLambdaExpression(int in) {

              SquareRoot squareRoot = (n) -> {
                     double result = Math.sqrt(n);
                     return result;
              };

              return squareRoot.findSquareRoot(in);
       }

       private static double squareRootJava8LambdaAsArgument(int i) {
              SquareRoot squareRoot = (n) -> (Math.sqrt(n));
              return displayData(squareRoot, i);

       }

       private static double displayData(SquareRoot squareRoot, int i) {
              return squareRoot.findSquareRoot(9);

       }

}

class SquareRootImpl implements SquareRoot {

       @Override
       public double findSquareRoot(int n) {
              return Math.sqrt(n);
       }

}
