package primes.quadratic ;

import java.math.BigInteger ;

//import primes.erathostenes.Token;
public class Counter extends primes.Counter<Token> {
	

public Counter() {
		super(new Token());
		
		Token t = new Token();
		
		System.out.println("in new Counter : "+t.value2());
		
	}


public 	Token token() {
	return super.token();
}


public Token get() {
		this.token().Reset(this.value());
		this.set() ;
		
		return this.token() ;
}

}
