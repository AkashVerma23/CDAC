package gen;

interface ArithmeticOperations<T> { // T means Type in which we can include int ,short,long,double,float,byte.
	T add(T a, T b);
	T subtract(T a, T b); // 2 arguments in each
	T multiply(T a, T b);
	T divide(T a, T b);
}



class Calculator<T extends Number > implements ArithmeticOperations<T>  {
	
	public Integer add1(Integer a, Integer b) { 
		return a+b;	
	}
	
	public Integer subtract1(Integer a, Integer b) {
		return a-b;	
	}
	
	public Integer multiply1(Integer a, Integer b) {
		return a*b;	
	}
	
	public Integer divide1(Integer a, Integer b) {
		if(b==0) {
			throw new ArithmeticException("Division by zero is not allowed");
		}
		return a/b;		
	}
	
	
	public Double add2(Double a, Double b) {
        return a + b;
    }

    public Double subtract2(Double a, Double b) {
        return a - b;
    }

    public Double multiply2(Double a, Double b) {
        return a * b;
    }

    public Double divide2(Double a, Double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

	@Override
	public T add(T a, T b) {					//method ko override karna hota hai interface me
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("This method is not implemented");
	}

	@Override
	public T subtract(T a, T b) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("This method is not implemented");
	}

	@Override
	public T multiply(T a, T b) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("This method is not implemented");
	}

	@Override
	public T divide(T a, T b) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("This method is not implemented");
	}
	
}


public class Program{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator<Integer> cal = new Calculator<>();
		
		System.out.println(cal.add1(10,20));
		System.out.println(cal.divide1(20,10));
		
		
		
		
		Calculator<Double> cal1 = new Calculator<>();
		System.out.println(cal1.add2(10.5, 5.5));
		System.out.println(cal1.multiply2(2.5, 4.0));
		
		
	}

}
