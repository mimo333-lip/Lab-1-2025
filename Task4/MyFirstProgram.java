class MyFirstClass {
	public static void main(String[] s) {
           MySecondClass o;
           o = new MySecondClass(0,0);
    int i, j;
    for (i = 1; i <= 8; i++) {
        for(j = 1; j <= 8; j++) {
                o.setFirstNumber(i);
                o.setSecondNumber(j);
            System.out.print(o.multiply());
            System.out.print(" ");
        }
        System.out.println();
    }
	}
}
class MySecondClass{
    private int FirstNumber;
    private int SecondNumber;


    public MySecondClass(int firstNunber,int secondNumber){
    this.SecondNumber = secondNumber;
    this.FirstNumber = firstNunber;
}

public int getFirstNumber(){
    return FirstNumber;
}
public int getSecondNumber(){
    return SecondNumber;
}

public void setFirstNumber( int firstNumber){
    this.FirstNumber = firstNumber;
}
public void setSecondNumber( int secondNumber){
    this.SecondNumber = secondNumber;
}

public int multiply(){
    return FirstNumber*SecondNumber ; 
}
}