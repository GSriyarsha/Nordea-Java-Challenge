# Nordea-Java-Challenge
Hackathon
Problem 1:
ATM Problem


Write a program to support money withdrawals from an ATM. The cash machine will only accept the transaction if the amount of money to be withdrawn is a multiple of C, and the account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal, the bank charges $D. Additionally, if the amount of money withdrawn is greater than or equal to $100, the bank adds $D to the account balance (chargeback).



If the user wants to withdraw an amount of money that is not a multiple of C, the ATM pays the first available amount which is the next multiple of C, greater than the amount for withdrawal.



Calculate the account balance after an attempted transaction.



Input
Positive integer X - the amount of cash which someone wishes to withdraw.
Floating point number Y with two digits of precision - the initial account balance.
Parameter C, which may take the values of 5, 10, 20, 50, 100 or 200 - these are the denominations of the banknotes available in the ATM.
Parameter D denoting the fee charged for a successful withdrawal. It can be a number greater than 0, but less than or equal to 1, with two digits of precision.
All of these numbers should be read from the first and only line of the standard input, separated by a single space.


Output
Output the account balance after the attempted transaction, given as a number with two digits of precision. If there is not enough money in the account to complete the transaction, output the current bank balance.


Constraints
0 < X ≤ 2000
0 ≤ Y ≤ 2000
C in (5,10,20,50,100,200)
0 < D ≤ 1
Example input
50 130.60 5 0.1
Example output
80.50

