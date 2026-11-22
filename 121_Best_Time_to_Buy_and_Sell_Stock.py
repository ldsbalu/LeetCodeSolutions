

class Solution(object):
    def maxProfit(self, prices):
        min_price = prices[0]
        max_profit = 0

        for price in prices[1:]: #prices = [7,1,5,3,6,4]
            min_price = min(min_price, price)
            # Update min_price if this price is smaller.
            # Calculate the possible profit.
            profit = price - min_price

            max_profit = max(max_profit, profit)

        return max_profit




if __name__ == "__main__":
    prices = [7,1,5,3,6,4]


    solution = Solution()
    k = solution.maxProfit(prices)
    print('max Profit is ', k)


