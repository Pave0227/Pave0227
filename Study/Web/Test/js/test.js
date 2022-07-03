//Recursive(재귀)

function factorial(n) {
  let result = 1;

  for (let i = n; i >= 1; i--) {
    result *= i;
  }

  return result;
}

function Factorial_2(n) {
  if (n == 1) {
    return 1;
  }
  return n * Factorial_2(n - 1);
}
