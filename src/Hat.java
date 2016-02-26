import java.util.Arrays;
import java.util.Random;



public class Hat<T> {
	private Object[] elements;
	private int N;
	private Object obj;
	
	public Hat() {
		elements = new Object[3];
		N = 0;
    }

	public void add(T t) {
	      if (N < elements.length) {
	          elements[N] = t;
	       } else {
	    	   int newIncreasedCapacity = elements.length * 2; // snippet from http://www.javamadesoeasy.com/2015/02/arraylist-custom-implementation.html
	    	    elements = Arrays.copyOf(elements, newIncreasedCapacity); //snippet from http://www.javamadesoeasy.com/2015/02/arraylist-custom-implementation.html
	    	    elements[N] = t;
	       }
	       ++N;
	 }
	
	public T draw() {
		Object removedElement=elements[new Random().nextInt(elements.length)];
	    for(int i=0;i< N;i++){
	       elements[i]=elements[i+1];
	    }
	    N--;
	   
	    return (T) removedElement;
	 }
	 public boolean isEmpty(){
		  return N == 0;
	 }
	 public int size(){
		return N; 
	 }
}
