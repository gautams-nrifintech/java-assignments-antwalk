package assignments.Jan24.assignment1.abstractclass;

/*
        AUTHOR: GAUTAM CHANDRA SAHA
        DATE & TIME: 26/01/23 AT 4:39 PM ON Thu
*/


class Tester {
    public static void main(String[] args) {

        Bank a = new BankA();
        a.setBalance(100);
        System.out.println(a.getBalance());

        Bank b = new BankB();
        b.setBalance(150);
        System.out.println(b.getBalance());

        Bank c = new BankC();
        c.setBalance(200);
        System.out.println(c.getBalance());

    }
}
