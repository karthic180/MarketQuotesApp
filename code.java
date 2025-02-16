import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MarketQuotesApp {
    public static void main(String[] args) {
        Map<String, String> marketQuotes = new HashMap<>();
        marketQuotes.put("dow", "Latest Dow Quote: 34,000");
        marketQuotes.put("ftse", "Latest FTSE Quote: 7,000");
        marketQuotes.put("nasdaq", "Latest Nasdaq Quote: 14,000");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter market name (dow, ftse, nasdaq): ");
        String market = scanner.nextLine().toLowerCase();

        if (marketQuotes.containsKey(market)) {
            System.out.println(marketQuotes.get(market));
        } else {
            System.out.println("Market not recognized. Please enter dow, ftse, or nasdaq.");
        }

        scanner.close();
    }
}
