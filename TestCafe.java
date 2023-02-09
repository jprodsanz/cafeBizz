import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appLogic = new CafeUtil();
        
        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week \n\n", appLogic.getStreakGoal(10));
        System.out.printf("Purchases needed by week 10: %s \n\n", appLogic.getStreakGoal());
        
        System.out.println("----- Order Total Test-----");
            double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appLogic.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> menu = new ArrayList<String>();
            menu.add("drip coffee");
            menu.add("cappuccino");
            menu.add("latte");
            menu.add("mocha");
            appLogic.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
            // --- Test 4 times ---
            for (int i = 0; i < 4; i++) {
                appLogic.addCustomer(customers);
                System.out.println("\n");
            }
    }
}
