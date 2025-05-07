# Smallest Multiple Engine Project For Software Engineering Course At SUNY New Paltz


![embed](https://beldenfarmstand.com/wp-content/uploads/2018/06/2017-08-23_11-50-08_724.jpeg)


Welcome to the Smallest Multiple Engine Project, an advanced, multithreaded solution for calculating the smallest multiple of a range of numbers. Developed as part of the Software Engineering course at SUNY New Paltz, this project showcases the power of optimized multithreaded computation.

## Project Overview 
This project efficiently computes the smallest multiple that can be evenly divided by all numbers in a given range (1 to n). Built with Java and multithreading, it preforms seamlessly, even for larger values!

### Key Features

* Multi-threaded Performance: Leverages parallel processing for faster calculations.
* Flexible Input: Accepts a text file with a list of numbers to process.
* Automated Output: Generates a result file with the smallest multiples for each input.
-Error Handling: Strong validation and error management for user inputs.

## Thread Configuration
* Original Number of Threads: 4
* Current Number of Threads: 6

## How It Works
1) Provide a text file containing the list of numbers you want to process.
2) The program spawns multiple threads to compute the smallest multiple for each number.
3) Results are saved in a new text file for easy reference.

### Example
* Input: 10
* Output: 2520

## Benchmark Test Results
Through benchmark testing, we determined that 6 threads provide the best performance for this project (approximately 24% faster than the initial 4-thread setup). However, increasing the number of threads to 12 led to inconsistent results, indicating an optimal balance at 6.

## Usage
1) Prepare an input file with one number per line.
2) Run the program, specifying the input file path.
3) The program outputs a text file with the computed smallest multiples.

### Technologies Used
* Java: Core language for efficient and scalable development.
* Multithreading: Optimized for concurrent processing.



![System Diagram](https://github.com/BenjaminFisher1/SoftwareEngineering/blob/main/System%20Diagram.pdf)

