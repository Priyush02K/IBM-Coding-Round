-Lexicographically smallest string hackerrank solution

Sort the string array from start index to end index.

Declare an answer string as blank.

Iterate through i=0 till n:

Update answer to answer+arr[i].

Return answer.

#  Here’s a Python implementation of the above steps:

def lexSmallest(a, n):

   a.sort(key = lambda x: x*3, reverse = False)

   return ''.join(a)

# Test the function

a = ["c", "cb", "cba"]

n = len(a)

print(lexSmallest(a, n))  # Output: cbacbc
