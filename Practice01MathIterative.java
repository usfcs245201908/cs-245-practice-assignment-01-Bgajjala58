class Practice01MathIterative  implements Practice01Math{

public int fib (int n){

 int first = 0; //First number 
 int second = 1; // Second number 
 int x = 1; // Last number

 if(n<0){
 
 	throw new ArithmeticException("not valid");  
 
 }
 
 for(int i = 0; i<n; i++){
 	
 		first = second; //
 		second = x; //
 		x = first + second; //
 		
 	}

 	return first;

	
}

public int fact (int n){
	int fact =1;

	if(n<0){
	 
	 	throw new ArithmeticException("not valid");  
	 
	 }
	 
	for(int i = 1; i<=n; i++){
		fact*=i;
	}

	return fact;
}



}