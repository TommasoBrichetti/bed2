package esercizioD2;

public class sim {

	public static void main(String[] args) {
		

	}
	

}

class Phone{
	int number;
	double credito;
	int[] call;
	
	Phone(int number){
		this.number =  number;
		this.credito = 5.00;
		this.call = new int[5];
	}
	
	int[] call(int number){
		
		for (int i = 0; i < call.length - 1; i++) {	
			call[i] = call[i+1];
		}
		call[5] = number;
		return this.call;
	}
	
	void getInfo() {
		System.out.println(""+this.number + " " + this.credito);
	}
	
}
