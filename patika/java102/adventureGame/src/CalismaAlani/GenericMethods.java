package CalismaAlani;

public class GenericMethods {

    public static <T, U> void sum(T[] t, U[] u){
        System.out.println("\n\n");
        for(T singleT : t){
            System.out.print(singleT);
        }
        System.out.println("\n\n");

        for(U singleU : u){
            System.out.println(singleU);
        }
    }


}
