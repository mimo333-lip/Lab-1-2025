package myfirstpackage;

public class MySecondClass{
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