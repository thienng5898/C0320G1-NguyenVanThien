package model;

public class Product {
    private  int id ;
    private String nameProduct ;
    private String descriptionProduct ;
    private String producer ;

    public Product() {
    }

    public Product(int id, String nameProduct, String descriptionProduct, String producer) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
