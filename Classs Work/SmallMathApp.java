public class SmallMathApp {

        int numberOne = 10;
        int numberTwo = 2;
        
        public double operators(String symbol){

            double answer = 0;
                if (symbol.trim().equals("*")){
            answer = multiplyNumbers();
                }

             else if (symbol.trim().equals("/")){
            answer = divideNumbers();
                }
             else if (symbol.trim().equals("+")){
            answer = addNumbers();
                }
             else if (symbol.trim().equals("-")){
            answer = subtractNumbers();
                }
                else {
            throw new IllegalArgumentException(" Invalid Operator!!!");
                }
                    return answer;
        }
    
            public double multiplyNumbers() {
                double multiply = 0;
                        multiply = numberOne * numberTwo;
                return multiply;
            }
    
                public double addNumbers() {
                    double add = 0;
                        add = numberOne + numberTwo;
                    return add;
                }
    
        public double subtractNumbers() {
            double subtract = 0;
                    subtract = numberOne - numberTwo;
            return subtract;
        }
    
                        public double divideNumbers() {
                            double divide = 0;
                                divide = numberOne / numberTwo;
                            return divide;
                        }

}







