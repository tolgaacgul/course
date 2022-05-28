package CalismaAlani;

public class OutCls {
    public int a = 20;

    //inner class
    public static class InCls{
        public int a = 10;

        public void run(){
            int a = 1;
            System.out.println(a);
            System.out.println(this.a);
            //System.out.println(OutCls.this.a);
        }
    } // Inner class (InCls) ends

    public void run(){
        InCls in = new InCls();
        in.run();
    }

}
