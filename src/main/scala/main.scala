/**
 * Primality Test
 */

object Main
{
    final val VERSION = "v.0.1.1"

    /**
     * Pure function to test primality. Uses recursion.
     *
     * @param n Number to test if it's prime
     * @param i Seed initializer needed for recursion
     * @return True if the number is prime
     */
    def isPrime(n: Int)(implicit i: Int = 5): Boolean =
    {
        if (n <= 3)
            return n > 1
        if (n % 2 == 0 || n % 3 == 0)
            return false
        while (i * i <= n)
        {
            if (n % i == 0 || n % (i + 2) == 0)
                return false
            return isPrime(n)(i + 6)
        }
        true
    }

    def main(args: Array[String]): Unit =
    {
        println(s"Prime Checker $VERSION")
        println("Is 7669 prime? " + isPrime(7669))
        println("Is 12209 prime? " + isPrime(12209))
        println("Is 17471 prime? " + isPrime(17471))
    }
}