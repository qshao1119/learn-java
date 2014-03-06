package src.learn.java;

class Array{
	private int temp[] = null ; // 
	private int foot = 0;
	public Array(int len){
		if(len>0){
		this.temp = new int[len] ;}
		else {
			this.temp = new int[1];
		}		
	}
	public boolean add(int i){
		if(this.foot < this.temp.length){
			this.temp[this.foot] = i ;
			this.foot++ ;
			return true ;
		}else{
			return false ;
		}
	}
	public int[] getArray(){
		return this.temp ;
	}
}

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Array arr = new Array();
        
        System.out.println(arr.add(33));
       
	}
	
	public static void print(int i[]){

}
