package utility;

import java.util.ArrayList;
import objects.Stock;

public class Ink {
  
  public Ink() {
    // do nothing
  }

  // Print Welcome Message
  public void printWelcome() {
    System.out.println("\033[1;35m*** Welcome to StockUP beta ***\033[0m\n");
  }

  // Print Good Day Message
  public void printGoodday() {
    System.out.println("\033[1;33m*** Richer Every Day with StockUP ***\033[0m\n");
  }

  // Print Stock Information
  public void printStock(Stock stock) {
    System.out.printf("\033[1;36mName:\033[0m %s\n\033[1;36mSymbol:\033[0m %s\n\033[1;36mPrice:\033[0m $%.2f\n",
      stock.getName(), stock.getSymbol(), stock.getPrice());
    System.out.println("\033[1;33mHow many units of this stock would you like?\033[0m ");
  }

  // Print Portfolio Information
  public void printPortfolio(ArrayList<Stock> stocks, double networth, double balance) {
    System.out.println("\033[1;34m=== Your Portfolio ===\033[0m");
    for(int i = 0; i < stocks.size(); i++) {
      System.out.printf("(%d) \033[1;36mName:\033[0m %s \033[1;36mSymbol:\033[0m %s \033[1;36mPrice:\033[0m $%.2f \033[1;36mQty:\033[0m %d\n",
        i + 1,
        stocks.get(i).getName(),
        stocks.get(i).getSymbol(),
        stocks.get(i).getPrice(),
        stocks.get(i).getQty());
    }
    System.out.printf("\033[1;34mNetworth:\033[0m $%.2f\n", networth);
    System.out.printf("\033[1;34mBalance:\033[0m $%.2f\n", balance);
  }

  // Print Market Information
  public void printMarket(ArrayList<Stock> stocks) {
    System.out.println("\033[1;34m=== Market ===\033[0m");
    for(int i = 0; i < stocks.size(); i++) {
      System.out.printf("(%d) \033[1;36mName:\033[0m %s \033[1;36mSymbol:\033[0m %s \033[1;36mPrice:\033[0m $%.2f\n",
        i + 1,
        stocks.get(i).getName(),
        stocks.get(i).getSymbol(),
        stocks.get(i).getPrice());
    }
    System.out.println("\033[1;33mWhich stock would you like to buy?\033[0m ");
  }

  // Print Menu Options
  public void printMenu() {
    System.out.println("\033[1;35m=== Menu ===\033[0m");
    System.out.println("(1) Show Portfolio");
    System.out.println("(2) Show Market");
    System.out.println("(3) Add Funds");
    System.out.println("(4) Exit");
    System.out.println("\033[1;33mChoose an option:\033[0m ");
  }

  // Print Stock Details
  public void printStockDetail(Stock stock) {
    System.out.printf("\033[1;36mName:\033[0m %s \033[1;36mSymbol:\033[0m %s \033[1;36mPrice:\033[0m %d \033[1;36mQty:\033[0m %d\n",
      stock.getName(), stock.getSymbol(), 
      stock.getPrice(), stock.getQty());
  }

  // Print Add Funds Message
  public void printAddFunds(double balance) {
    System.out.printf("\033[1;33mCurrent balance:\033[0m $%.2f\n\033[1;33mAmount to add:\033[0m ", balance);
  }
}