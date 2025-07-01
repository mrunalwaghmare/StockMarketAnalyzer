# StockMarketAnalyzer
# 📊 Stock Market Analyzer – Find Best Time to Buy and Sell Stocks

This is a simple Java-based mini project that simulates a real-world stock trading strategy. It analyzes stock prices over several days and finds the best day to buy and the best day to sell to maximize profit.

---

## 💡 Project Idea

In stock markets, the goal is to **buy at a low price and sell at a higher price**. This project takes an array of stock prices where each index represents the stock price on that day and calculates:

- The day to **buy** the stock (lowest price)
- The day to **sell** the stock (highest price *after* buy day)
- The **maximum profit** possible

---

## 🛠️ Technologies Used

- Java
- Arrays and Subarrays
- Basic Java logic and conditionals

---

## 📥 Input

An array of stock prices, e.g.:

```java
int[] prices = {100, 180, 260, 310, 40, 535, 695};
