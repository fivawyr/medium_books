### Chapter 0 
- by creating our Walker class with `random()`, we can implement a four step or eight step() function (using three points on the x and y axis). If we want to increase the speed of the places strokes, we can just use an easy for loop (i < 10). 
- the random number from `random()` function isnt truly random; instead there pseudorandom because theyre the result of a mathematicla function htat merely simulates randomness. This function would yield a pattern over time and this stop seeming to be random. That time period is so long, however, that `random()` is random enough
#### Probability and Nonunform Distributions
- to create more nature like random results, we can manipulate the random function to create nonuniform Distributions (for example population and darwinians survival of the fittest concept &rarr; random would be not enough to meet the actual rules of the concept)
- lets look at the **Probability** to get a better a better understanding of randomness:
> a card deck with 52 cards, to drawn an ace is: $ number of aces / number of cards = 4 / 52 = 0.077 = 7.7% $ the Probability to drawn a diamond is $ 13 / 52 = 0.25 = 25% $ 
- to calculate the Probability of multiple events, just multiple the individual Probability each time: $ (1/2) * (1/2) * (1/2) = 1/8 = 0.125 $ 
- if we look at examples where we want to keep the random values whithin a mean (**bell curve**), we need to use **Distributions** (gaussian Distributions) 
- in java we can call `p.randomGaussian(x = mean, y = standard deviation)` to call the random function within the bell curve
- 
