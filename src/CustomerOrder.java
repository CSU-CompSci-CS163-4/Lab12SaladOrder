import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerOrder {
    private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
    private ArrayList<Salad> salads = new ArrayList<Salad>();

    /**
     * getPizzas returns the ArrayList of pizzas
     * @return pizzas
     */
    public ArrayList<Pizza> getPizzas(){
        //Paste your work from Lab 10
    }

    /**
     * getSalads returns the ArrayList of salads
     * @return salads
     */
    public ArrayList<Salad> getSalads(){
        //TODO Student
    }



    /**
     * readOrder takes in the name of a csv file and tries to create objects based on the first item in
     * each line. If the first word is "pizza", then readOrder creates a Pizza object and saves it in
     * the pizzas ArrayList. If the first word is "salad", then a Salad object is made and stored in 
     * an ArrayList called "salads". You will have to make this new arrayList.
     * In the csv file, a pizza will look like "pizza,pepperoni,tomatoes,onions"
     * A salad will look like "salad,medium,ranch"
     * @param filename the name of a file
     */
    public void readOrder(String filename){
        //Paste your work from Lab 10 and implement the new requirements
    }

    /**
     * buildReceipt uses the getReceipt() method from Pizza and Salad to make a String containing all the
     * "receipt blocks" of all the items in the order. All salads must be listed after the pizzas. These
     * two for loops should look very similar.
     * @return a string containing all the receipt blocks from every item in the order.
     */
    public String buildReceipt(){
        //Paste your work from Lab 10 and implement the new requirements
    }

    /**
     * printReceipt uses a PrintWriter to write the receipt to a specific file. Remeber to use
     * try/catch blocks and to close your PrintWriter, otherwise nothing will save! The buildReceipt
     * method can be useful to print the receipt.
     * @param fileName the name of the file to print to.
     */
    public void printReceipt(String fileName){
        //TODO Student
    }
}
