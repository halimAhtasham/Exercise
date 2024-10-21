        package SecondPackage;

        public class Cal {
            public double a, b;

            public double add() {
                return a + b;
            }

            public double subtract() {
                return a - b;
            }

            public double multiply() {
                if (a != 0 && b != 0) {
                    return a * b;
                } else {
                    System.out.println("Multiplication Error(a or b is zero)");
                    return 0;
                }
            }

            public double divide() {
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("b should not be zero.");
                    return 0;
                }
            }

            public double modulus() {
                if (b != 0) {
                    return a % b;
                } else {
                    System.out.println("b should not be zero.");
                    return 0;
                }
            }
        }
