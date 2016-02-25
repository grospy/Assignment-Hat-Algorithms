import java.util.Random;



public class Hat<T> {
	private T[] elements;
	private int N;
	private final int size = 4;
	private Object obj;
	
	public Hat() {
		elements = (T[]) new Object[size];
    }
	public void add(T t) {
	      elements[N++] = t;
	 }
	 @SuppressWarnings("unchecked")
	public T draw() {
		 obj = elements[new Random().nextInt(elements.length)];
		 for(int i = 0; i < N; i++){
			 if(obj.equals(elements[i])){
				 elements[i] = elements[--N];
			 }
		 }
		 return (T) obj;
	 }
	 public boolean isEmpty(){
		  return N == 0;
	 }
	 public int size(){
		return N; 
	 }
}
