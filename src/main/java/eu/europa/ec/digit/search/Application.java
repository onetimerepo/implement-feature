package eu.europa.ec.digit.search;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LOGGER.info("Starting");
		System.exit(0);
	}

	protected String sortMyString(String unsortedString) {

		List<String> list = Arrays.asList(unsortedString.split(" "));
		return list.stream()
				.sorted()
				.collect(joining(" "));

	}

	protected List<String> removeDuplicatesFromList(List<String> values) {
		return values.stream()
				.distinct()
				.collect(toList());
	}

}
