# CourtneyThanHW1
## How to run:
### Download Prime.java and PrimeMain.java<br/>Open command prompt and run javac PrimeMain.java and java PrimeMain<br/>The result will be printed out in a new text file named "primes"
### First, I would use Prime of Sieves to find prime numbers from 1 to 10^8, then I would create Atomic Integer to find the number of primes that are in 1 to 10^8, and Atomic Long to find the sum of all primes. The reason why I must use atomic number is that with all the 8 threads created, atomic numbers can access the threads and synchronize them during multithreaded operations; moreover, using atomic number would provide a faster and more readable performance. Next, I create 8 different equally ranges and passed them as objects into 8 different threads that takes on different numbers of primes and different sums in their ranges which simultaneously happen at the same time. Then I calculate the run time by having the start time at the beginning and the end time at the end.
## Prime of Sieves:
### Creating a Boolean list with the size of 10^8 which starts at 2 and set all the variables to true. Then the loop start picking up the index that is true and turn all of its multiples into false, then start to iterate up to the next true index. At the end, we'll have a list of all primes number which are the indexes that are set to true.
### https://www.geeksforgeeks.org/sieve-of-eratosthenes/
