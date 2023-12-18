	public static void athrisma(int numbera, int numberb, int operator) {
		Scanner input=new Scanner(System.in);
		
		while(operator!=1&&operator!=2&&operator!=3) {
			System.out.println("pick an operator  1=+,2=-,3=*");
			operator=input.nextInt();}
		
		switch(operator) {
		case 1:
		System.out.println(numbera+numberb);
		break;
		
		case 2:
			System.out.println(numbera-numberb);
		break;
	
		case 3:
			System.out.println(numbera*numberb);
		break;}
		
	}
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("number a?");
		int numbera;
		numbera=input.nextShort();
		
		System.out.println("number b?");
		int numberb;
		numberb=input.nextShort();
		
		System.out.println("pick an operator  1=+,2=-,3=*");
		int operator;
		operator=input.nextInt();
		
		athrisma(numbera ,numberb,operator);	
}
	


}