package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {

        long var1 = 10;
        long var2 = 20L;
//        long var3 = 10000000000;  //컴파일러는 리터럴 값을 int로 간주하기 때문에 리터럴 뒤에 long을 표시해야함
        long var4 = 10000000000L;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var4 = " + var4);
    }
}
