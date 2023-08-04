public class Salad implements MenuItem {
    private String size;
    private String dressing;

    /**
     * The constructor for salad will create a salad object and assign the salad object with
     * two String variables: a size and a dressing.
     * @param orderLine a string in the format of "salad,size,dressing"
     */
    public Salad(String orderLine){
        //TODO Student
    }

    /**
     * getReceipt creates a String that is ready to be printed to a receipt that is
     * 20 characters wide. This will look very similar to the Pizza's getReceipt method.
     * Instead of looping through all the toppings, you will want to list the size of
     * the salad and the dressing. Make sure to end with a new line character.
     * Example:
     * SALAD          10.50
     *               MEDIUM
     *                RANCH
     *
     * @return recipt a String displaying the price of the pizza and a list of all the toppings.
     */
    @Override
    public String getReceipt() {
        //TODO Student
    }

    /**
     * calculatePrice calculates the price of a salad. If a salad is small, it is $8.50. A medium
     * salad is $10.50. A large salad is $12.50.
     * @return price a double that holds the cost of the pizza
     */
    @Override
    public double calculatePrice() {
        //TODO Student
    }
}