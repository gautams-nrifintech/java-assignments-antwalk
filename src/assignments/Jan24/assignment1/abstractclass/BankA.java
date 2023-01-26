package assignments.Jan24.assignment1.abstractclass;

/*
        AUTHOR: GAUTAM CHANDRA SAHA
        DATE & TIME: 26/01/23 AT 4:39 PM ON Thu
*/


class BankA extends Bank {

    @Override
    public float getBalance() {
        System.out.println("balance in bank A");
        return this.balance;
    }
}
