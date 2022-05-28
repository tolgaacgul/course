package CalismaAlani;

public class Main {
    public static void main(String[] args){
        // OutCls out = new OutCls();
        // out.run();

        // başka sınıftan iç sınıfa ulaşmak
        // OutCls out = new OutCls();
        //OutCls.InCls in = out.new InCls();
        //in.run();

        // OutCls.InCls ev;

         //Integer[] a = {123,234,5,3,4};
         //Character[] b = {'d','3', 'd', 'f'};

        //GenericMethods.sum(a,b);

        // NESTED sınıf örnekleri
        Nested nested = new Nested();
        nested.run();
        nested.sum(3, 4, 1, 4, 3.2);

    }
}
