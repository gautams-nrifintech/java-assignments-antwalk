package assignments.jan30.assignment1.collectionofproducts;


import java.util.UUID;

class Product {
    private  String id;
    private  String name;
    private String category;

    private static String currentCategory = "";

    public Product(String ...products) {
        for (var p: products) {
            this.id = UUID.randomUUID().toString();
            this.name = p.strip().split(" ")[0];
            this.category = p.strip().split(" ")[1];
        }
    }

    public String getCategory() {
        return category;
    }

    public static void showCategoryWise(Product e) {

        if(!currentCategory.equalsIgnoreCase(e.getCategory())){
            currentCategory=e.getCategory();
            System.out.println("\n"+currentCategory.toUpperCase());
        }

        System.out.println(e);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}