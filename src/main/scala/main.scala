/**
 * Primality Test
 */

object Main
{
    final val VERSION = "v.0.1.0"

    val _inc6: (Int) => Int = (n) => n + 6

    /**
     * Pure function to test primality. Uses recursion.
     *
     * @param n Number to test if it's prime
     * @param i Seed initializer needed for recursion
     * @return True if the number is prime
     */
    def isPrime(n: Int, i: Int = 5): Boolean =
    {
        if (n <= 3)
            return n > 1
        if (n % 2 == 0 || n % 3 == 0)
            return false
        while (scala.math.pow(i, 2) <= n)
        {
            if (n % i == 0 || n % (i + 2) == 0)
                return false
            return isPrime(n, _inc6(i))
        }
        true
    }

    def main(args: Array[String]): Unit =
    {
        println(s"Prime Checker $VERSION")
        println("Is 12209 prime? " + isPrime(12209))
        println("Is 17471 prime? " + isPrime(17471))
    }
}