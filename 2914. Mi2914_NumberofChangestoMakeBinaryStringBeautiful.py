class Solution(object):
    def minChanges(self, s):
        """
        :type s: str
        :rtype: int
        """
        changes = 0
        i = 0

        while i < len(s):
            if s[i] != s[i + 1]:
                changes += 1

            i += 2

        return changes


if __name__ == "__main__":
    s = "11"

    solution = Solution()
    k = solution.minChanges(s)

    print(k)