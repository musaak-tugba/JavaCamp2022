public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus", 3000, 3,"siyah" );
/*
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus");
        product.setPrice(5000); */


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());



    }
}