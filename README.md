# codingame-horse-racing-duals
Easy puzzle from codingame (sorting, loops).


	The Goal

Casablanca’s hippodrome is organizing a new type of horse racing: duals. During a dual, only two horses will participate in the race. In order for the race to be interesting, it is necessary to try to select two horses with similar strength.

Write a program which, using a given number of strengths, identifies the two closest strengths and shows their difference with an integer (≥ 0).

Previous description copied from codingame.com

Now, my own thoughts here regarding this one. This could be done by comparing each horse strength to all other horses not compared before; but it takes rather long to go through it all. It seemed to me that it would be better to sort each horse's strength value, compare them to the one next up; then return the smallest difference.
Initially I tried bubble sort. It worked for the first two test cases of a few horses, but it failed to produce results on the last case where there were 99999 horses. According to the puzzle, my algorithm wasn't fast enough. Makes sense, I think the big O notation for bubble sort is O(n^2).
So, my solution was to scour the internet for a faster sorting algorithm, I settled for quick sort. What can I say, name says it all :). I studied the logic behind it and came up with this solution.

EDIT:Since then, I discovered that there are built-in sorting methods in Java. I added a new code file with the example using that.

CHEERS!
