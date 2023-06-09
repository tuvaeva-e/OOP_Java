package HomeWork1;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;



    public VendingMachine(List<Product> products) {

        this.products = products;
    }

    public  BottleOfWater getBottleOfWater(double volume){

        for(Product product : products){
            if (product instanceof BottleOfWater){
               if ( ((BottleOfWater)product).getVolume()  == volume){
                   return (BottleOfWater)product;
               }
            }
        }
        return null;
    }

    public BottleOfJuice getBottleOfJuice(double volume) {
        for(Product product : products){
            if (product instanceof BottleOfJuice){
               if ( ((BottleOfJuice)product).getVolume()  == volume){
                   return (BottleOfJuice)product;
               }
            }
        }
        return null;
    }

}
