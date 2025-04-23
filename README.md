# Smallest Multiple Engine Project For Software Engineering Course At SUNY New Paltz
This project is designed to compute the smallest number that can be evenly divided by all the numbers 1 through n, where n is a user inputted number.
The user can input a text file that contains many numbers, and our program will use multithreaded process managing to run the computation on each number contained in the text file, then output each result to a new text file.




Number of Threads: 4

![System Diagram]https://github.com/BenjaminFisher1/SoftwareEngineering/blob/main/System%20Diagram.pdf

Assignment #2: The system will find the smallest postive number that is evenly divisable by all the numbers in 1-n
  Ex) Input : 10
      Output: 2520 


Benchmark Test Results: 
When doing the benchmark testing, we found out that 6 threads was the optimal amount of threads for our project to run faster as opposed to 4. We ran into issues when raising the number of threads to 12 which was too high and was producing inconsistent results. With the number of threads being 6, we noticed the MultiNetworker was running approximately 24% faster as opposed to the original 4 threads we previously had.

