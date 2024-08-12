public class Wine extends Product{

    public double bottleVolume;
    public final double alcocholeTax=0.1;


    public Wine (String productName, String barCode, double basicPrice, double bottleVolume){
        this.productName = productName;
        this.barCode = barCode;
        this.basicPrice = basicPrice;
        this.bottleVolume = bottleVolume;
    }

    @Override
    public void priceCalc() {
        this.price=(1+alcocholeTax)*((1+pdv)*this.basicPrice);
    }


    @Override
    public String toString() {
        return "Product name: "+productName+" Product type: Wine, Barcode: "+barCode+", Price including VAT: "+price+" din , Volume "+bottleVolume+" l";
    }
}
