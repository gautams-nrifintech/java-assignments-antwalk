package assignments.jan28.assignment1.collection;

/*
        AUTHOR: GAUTAM CHANDRA SAHA
        DATE & TIME: 28/01/23 AT 4:28 PM ON Sat
*/

import java.util.ArrayList;

class CRUDArray<T> {
    ArrayList<T> arrayList;

    public CRUDArray() {
        arrayList = new ArrayList<>();
    }

    public void insert(T empNo) {
        arrayList.add(empNo);
    }

    public void display() {
        System.out.println(arrayList);
    }

    public void search(T empNo) {
        if (arrayList.contains(empNo))
            System.out.println("Id found at index " + arrayList.indexOf(empNo));
        else
            System.out.println("Id does not exists");
    }

    public void delete(T empNo) {
        if (arrayList.remove(empNo))
            System.out.println("Id deleted suucessfully");
        else
            System.out.println("Id does not exist");

    }

    public void update(T empNo) {

        if (arrayList.contains(empNo)) {
            T newId = (T) Tester.GET.next();
            arrayList.set(arrayList.indexOf(empNo), newId);
            System.out.println("Id updated from " + empNo + " to " + newId);
        } else {
            System.out.println("Id does not exist");
        }

    }
}
