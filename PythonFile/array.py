program that takes an array of numbers, iterates through the array
and adds every number in the array, except the one at a given index.
The program should return the minimum and maximum of the sum obtained in python 

Here’s how you can solve this problem in Python:

For each index, sum all elements except the one at that index.
Store all these sums.
Return the minimum and maximum of these sums.
def min_max_sums(arr):
    sums = []
    for i in range(len(arr)):
        total = sum(arr) - arr[i]
        sums.append(total)
    return min(sums), max(sums)

# Example usage:
numbers = [1, 2, 3, 4, 5]
result = min_max_sums(numbers)
print("Minimum sum:", result[0])
print("Maximum sum:", result[1])


This will output the minimum and maximum sums as required.


Here’s how you can do this in Java:

Calculate the total sum of the array.
For each index, subtract the value at that index from the total sum to get the sum excluding that index.
Track the minimum and maximum of these sums.
