import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_EVEN;

public class taxcalculator {
    public static void main(String[] args){

        double PriceWithoutVAT=9.99;

        System.out.println("The price without VAT is" + PriceWithoutVAT);
//price with vat calculation
        double PriceWithVat = (PriceWithoutVAT * 1.23);
        System.out.println("The price with VAT is " + PriceWithVat);
//value of 10000 sales without VAT
        double ValueOf10000SalesExcludingVAT = (PriceWithoutVAT*10000);
        System.out.println("Value of 10 000 sales excluding vat "+ ValueOf10000SalesExcludingVAT );

//value of 10000 sales with VAT
        double ValueOf10000SalesIncludingVAT = (PriceWithVat*10000);
        System.out.println("Value of 10 000 sales excluding vat "+ ValueOf10000SalesIncludingVAT );


        //BIG DECIMAL CLASS
        System.out.println(" ");
        System.out.println("After using Big Decimall");
        BigDecimal dbPriceWithoutVAT = new BigDecimal( "9.99");
        System.out.println("Price without VAT " + dbPriceWithoutVAT);

        BigDecimal dbPriceWithVat = dbPriceWithoutVAT.multiply(new BigDecimal( "1.23"));

        dbPriceWithVat = dbPriceWithVat.setScale(2,ROUND_HALF_EVEN);
        System.out.println("Peic with VAT rounded:" + dbPriceWithVat);

        BigDecimal dbValueWithVat = dbPriceWithVat.multiply(new BigDecimal(10_000));
        System.out.println("Value with VAT " + dbValueWithVat);

        BigDecimal dbPriceWithoutVAT2 = dbPriceWithoutVAT.divide(
                new BigDecimal("1.23"),
                ROUND_HALF_EVEN);
        System.out.println("Value without VAT"+ dbPriceWithoutVAT2);

    }
}

