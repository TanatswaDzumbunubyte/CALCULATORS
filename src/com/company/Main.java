package com.company;

public class Main {

    public static void main(String[] args) {
	//How much you weigh on Mars

        float earthWeight;

                float marsWeight;
                        double marsWeightInDouble;
                                int marsWeightInInt;

                                earthWeight=75;
                                marsWeight=(earthWeight*0.38F);
        System.out.println(earthWeight + "kg on Earth is" + marsWeight+ "kg on Mars");

        //converts fromfloat to double
        marsWeightInDouble=marsWeight;
        System.out.println("Kilograms on mars converted to double" + marsWeight);

        //to 4 decimal places(instead of printline used printf)
        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n " , marsWeightInDouble);

        //turning float to int
        marsWeightInInt =(int)marsWeightInDouble;
        System.out.println("kilograms on mars to int" + marsWeightInInt);

        //casting int to char
        char c= (char)marsWeightInInt;
        System.out.println("The ASCII table equivalent of marsWeightInInt is " + c);

        //assign the value of performing some mathematical operation on a char character to an int variable
        int exampleOfMathOnChar = c * c;
        System.out.println("An example of a mathematical operation on the char type:" + exampleOfMathOnChar);

    }
}
