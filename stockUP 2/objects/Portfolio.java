package objects;

import java.util.ArrayList;
import java.util.Calendar;

public class Portfolio {
   private Calendar openDate = Calendar.getInstance();
   private Calendar closeDate = Calendar.getInstance();
   private double balance;
   private ArrayList<Stock> stocks = new ArrayList<>();

   public Portfolio(double initialBalance) {
      this.balance = initialBalance;
   }

   public String getOpenDate() {
      return this.openDate.toString();
   }

   public String getCloseDate() {
      return this.closeDate.toString();
   }

   public double getBalance() {
      return this.balance;
   }

   public double getNetworth() {
      double netWorth = balance;
      for (Stock stock : stocks) {
         netWorth += stock.getPrice() * stock.getQty();
      }
      return netWorth;
   }

   public ArrayList<Stock> getStocks() {
      return this.stocks;
   }

   public void setCloseDate() {
      this.closeDate = Calendar.getInstance();
   }

   public void addFunds(double amount) {
      if (amount > 0.0) {
         this.balance += amount;
      }
   }

   public void addStock(Stock stock) {
      this.stocks.add(stock);
   }

   public void buyStock(Stock stock, int quantity, double purchaseAmount) {
      this.balance -= purchaseAmount;
      stock.setQty(quantity);
      this.stocks.add(stock);
   }

   public void sellStock(int index) {
      Stock soldStock = this.stocks.get(index);
      double sellAmount = soldStock.getPrice() * soldStock.getQty();
      this.addFunds(sellAmount);
      this.stocks.remove(index);
   }
   
   // Validation method for withdrawal
   public boolean validateWithdrawal(double amount) {
      return amount > 0 && amount <= balance;
   }
}