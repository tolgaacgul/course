class Test {
    Test()
    {
        System.out.printf("1");
        new Test(10);
        System.out.printf("5");
    }
    Test(int temp)
    {
        System.out.printf("2");
        new Test(10, 20);
        System.out.printf("4");
    }
    Test(int data, int temp)
    {
        System.out.printf("3");

    }

    int testMetot(int i){
        System.out.println("\ni*i\t:" + i*i);
        return i*i;
    }

    public static void main(String[] args)
    {
        Test obj = new Test();
    }
}
