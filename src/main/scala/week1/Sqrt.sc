

def isGoodEnough(guess: Double, x: Double): Boolean =
  Math.abs(guess * guess - x) / x < 0.001

def improve(guess: Double, x: Double): Double =
  (guess + x / guess) / 2

def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)

def sqrt(x: Double) = sqrtIter(1.0, x)
sqrt(0.001)
sqrt(0.1e-20)
sqrt(1.0e20)
sqrt(1.0e50)

