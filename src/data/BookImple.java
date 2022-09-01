package data;

import java.util.ArrayList;
import java.util.List;

public class BookImple {
    public static void main(String[] args) {

        //creating an array arrayList object
        List<Book> arrayList = new ArrayList();

        Book book1 = new Book("java1","aman1",4785623785L,880.6);
        Book book2 = new Book("java2","aman2",4785623785L,780.6);
        Book book3 = new Book("java3","aman3",4785623785L,580.6);
        Book book4 = new Book("java4","aman4",4785623785L,870.6);
        Book book5 = new Book("java5","aman5",4785623785L,889.6);
        Book book6 = new Book("java6","aman6",4785623785L,820.67);
        Book book7 = new Book("java7","aman7",4785623785L,480.6);
        Book book8 = new Book("java8","aman8",4785623785L,670.6);
        Book book9 = new Book("java9","aman9",4785623785L,810.6);
        Book book10 = new Book("java10","aman10",4785623785L,610.6);

        arrayList.add(book1);
        arrayList.add(book2);
        arrayList.add(book3);
        arrayList.add(book4);
        arrayList.add(book5);
        arrayList.add(book6);
        arrayList.add(book7);
        arrayList.add(book8);
        arrayList.add(book9);
        arrayList.add(book10);
        System.out.println("\n Before Sorting \n");
        for (Book objects: arrayList) {
            System.out.println("objects = " + objects);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size() - 1 - i; j++) {
                if(arrayList.get(j).getPrice() > arrayList.get(j + 1).getPrice()){
                    Book tempVariable = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j + 1));
                    arrayList.set(j + 1,tempVariable);
                }
            }
        }
        System.out.println("\n After Sorting \n");
        for (Book objects: arrayList) {
            System.out.println("objects = " + objects);
        }
    }
}
