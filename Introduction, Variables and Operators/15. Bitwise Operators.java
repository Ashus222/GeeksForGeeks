class Geeks {
    static void bitWiseOp(int a, int b, int c) {

        int d = a ^ a;
        int e = c ^ b;
        int f = a & b;
        int g = c | (a^a);
        int h = ~ e ;
        
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
