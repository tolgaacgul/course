package CalismaAlani;

public class Nested {
    private int number = 12;

    public void run(){
        System.out.println(number);
        Inner inner = new Inner();
        inner.run();
        System.out.println(number);
    }

    int sum(int... number){
        int toplam = 0;
        for(int i : number){
            toplam += i;
        }
        System.out.println("Sum metodu: " + toplam);
        return toplam;
    }
    double sum(double... numbers){
        double toplam = 0.0;
        for(double i : numbers){
            toplam += i;
        }
        System.out.println("Sum metodu: " + toplam);
        return toplam;
    }

    public class Inner{
        public void run(){
            number ++;
        }
    }


}
