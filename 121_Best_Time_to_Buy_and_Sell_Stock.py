from itertools import count


class Solution(object):
    def maxProfit(self, prices):
        #part 1
        # min_price = prices[0]
        # max_profit = 0
        #
        # for price in prices[1:]: #prices = [7,1,5,3,6,4]
        #     min_price = min(min_price, price)
        #     # Update min_price if this price is smaller.
        #     # Calculate the possible profit.
        #     profit = price - min_price
        #
        #     max_profit = max(max_profit, profit)
        #
        # return max_profit

        #part 2
        total_profit = 0
        # for i in range(1, len(prices)):
        #     if prices[i] > prices[i - 1]:
        #         total_profit += prices[i] - prices[i - 1]
        # return total_profit


        for i in range(0, len(prices)):
            k = prices[i] * prices[i]
            prices[i] = k
        prices.sort()
        return prices







if __name__ == "__main__":
    prices =  [-7,-3,2,3,11]

    solution = Solution()
    k = solution.maxProfit(prices)
    print('max Profit is ', k)


