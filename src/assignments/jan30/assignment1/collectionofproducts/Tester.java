package assignments.jan30.assignment1.collectionofproducts;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Tester {

    public static void main(String[] args) {


        List<Product> laptops = Arrays.asList(
                new Product("hp laptop"),
                new Product("acer laptop"),
                new Product("samsung laptop"));

        List<Product> phones = Arrays.asList(
                new Product("hp phone"),
                new Product("acer phone"),
                new Product("samsung phone"));

        List<Product> cameras = Arrays.asList(
                new Product("hp camera"),
                new Product("acer camera"),
                new Product("samsung camera"));

        List<List<Product>> finalList = List.of(laptops,phones,cameras);

        finalList.stream()
                .flatMap(Collection::stream)
                .forEach(Product::showCategoryWise);
    }
}

/*

OUTPUT:

LAPTOP
Product{id='6292a60d-9e1f-4690-bbd7-f5c03cfdee20', name='hp'}
Product{id='96f38f89-aad5-4607-b61e-7815a46b2f3d', name='acer'}
Product{id='0550c7fa-7def-41ba-b019-20807b23ff1c', name='samsung'}

PHONE
Product{id='5c9ef23f-46f5-483d-92a5-822effaa4c13', name='hp'}
Product{id='b1e41ebc-c963-4a5c-bfbf-eaa73d1ca6ef', name='acer'}
Product{id='591d1882-5afc-460b-8d53-9da2f527c3f3', name='samsung'}

CAMERA
Product{id='cd66a778-0030-4d1b-a989-f361f06e98c1', name='hp'}
Product{id='c41622eb-63f4-4426-b47c-164defc627ea', name='acer'}
Product{id='6a983e45-89fa-44ba-a5f8-5bb4c66602cf', name='samsung'}
 */
