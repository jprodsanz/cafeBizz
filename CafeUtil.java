import java.util.ArrayList;

public class CafeUtil {
    public String greeting () {
        return "Welcome to Coffee Shop X";
    }
    public int  getStreakGoal (int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i; 
        }
        return sum;
    }
    public int  getStreakGoal () {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i; 
        }
        return sum;
    }
    public double getOrderTotal(double[] priceList) {
        double totalPrice = 0;
        
        for (int i = 0; i < priceList.length; i++) {
            totalPrice += priceList[i];
    }
    return totalPrice;
    }
    public void displayMenu(ArrayList<String> itemsList){
        for (int i = 0; i < itemsList.size(); i++) {
        System.out.println(itemsList.get(i)); 
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Welcome to Coffee X, please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Heyyyyy " + userName);
        System.out.printf("Thank you for your patience,these %s costumers are in front of you", customers.size());
        customers.add(userName);
        System.out.println(customers);

}
}

