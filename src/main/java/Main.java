import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Main {

  public static void main (final String[] args) throws NoSuchAlgorithmException {
    System.out.println("Generating secure booleans");
    int trueCount = 0;
    int falseCount = 0;
    for (int i = 0; i < 100; i++) {
      if (SecureRandomNumberGenerator.generateRandomBoolean()) {
        trueCount++;
      } else {
        falseCount++;
      }
    }
    System.out.println("True Count: " + trueCount);
    System.out.println("False Count: " + falseCount);

    System.out.println("Generating secure int: " + SecureRandomNumberGenerator.generateRandomInt());
    System.out.println("Generating secure long: " + SecureRandomNumberGenerator.generateRandomLong());
    System.out.println("Generating secure float: " + SecureRandomNumberGenerator.generateRandomFloat());
    System.out.println("Generating secure double: " + SecureRandomNumberGenerator.generateRandomDouble());
    System.out.println("Generating secure gaussian: " + SecureRandomNumberGenerator.generateRandomGaussian());
    System.out.println("Generating secure bytes: " + Arrays.toString(SecureRandomNumberGenerator.generateRandomBytes()));

    System.out.println("Generating random int with upper bound: "
        + SecureRandomNumberGenerator.generateRandomIntWithUpperBound(1000));
    SecureRandomNumberGenerator.generateRandomStreamOfInts(3, 1, 10)
        .forEach(value -> System.out.println("Value: " + value));
  }
}
