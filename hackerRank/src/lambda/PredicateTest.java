/**
 * 
 */
package lambda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author pkunwer
 *
 */
public class PredicateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Predicate<String> nullCheck = arg -> arg != null;
		Predicate<String> emptyCheck = arg -> arg.length() > 0;
		Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
		String helloStr = "hello";
		System.out.println(nullAndEmptyCheck.test(helloStr));
		String nullStr = null;
		System.out.println(nullAndEmptyCheck.test(nullStr));
		removeIf();

		// Consumer calls
		testPredicate();

		// Function calls
		FunctionUse();
		combineFunction();

		// Supplier Calls
		generateBolleans();

	}

	public static void removeIf() {
		List<String> greeting = new ArrayList<>();
		greeting.add("Hello");
		greeting.add("World");

		greeting.removeIf(str -> !str.startsWith("H"));
		greeting.forEach(System.out::println);
	}

	// Consumer method
	public static void testPredicate() {
		Stream.of("hello", "world").forEach(System.out::println);

		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("hello World");
	}

	// Function Interface
	public static void FunctionUse() {
		Arrays.stream("4,-9,16".split(",")).map(Integer::parseInt).map(i -> (i < 0) ? -i : i)
				.forEach(System.out::println);
		Function<String, Integer> strLength = str -> str.length();
		System.out.println(strLength.apply("upercalifragilisticexpialidocious"));
	}

	// Function Interface
	public static void combineFunction() {
		Function<String, Integer> parseInt = Integer::parseInt;
		Function<Integer, Integer> absInt = Math::abs;
		Function<String, Integer> parseAndAbsInt = parseInt.andThen(absInt);
		Arrays.stream("4,-9,16".split(",")).map(parseAndAbsInt).forEach(System.out::println);
	}

	// Supplier Interface
	public static void generateBolleans() {
		Random random = new Random();
		Stream.generate(random::nextBoolean).limit(2).forEach(System.out::println);

		Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
		System.out.println(currentDateTime.get());
	}
}
