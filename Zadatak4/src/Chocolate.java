public class Chocolate extends Product{
    public int packageWeight;

    public Chocolate (String productName, String barCode, double basicPrice, int packageWeight){
        this.productName = productName;
        this.barCode = barCode;
        this.basicPrice = basicPrice;
        this.packageWeight = packageWeight;
    }


    @Override
    public String toString() {
        return "Product name: "+productName+" Product type: chocolate, Barcode: "+barCode+", Price including VAT: "+price+" din , Package weight "+packageWeight+"g";
    }
}
