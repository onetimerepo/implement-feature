package eu.europa.ec.digit.search;

import java.util.Arrays;
import java.util.Collections;
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
		Collections.sort(list);
		return list.get(0) + " " + list.get(1) + " " + list.get(2) + " " + list.get(4) + " " + list.get(5) + " " + list.get(6) + " " + list.get(7) + " " + list.get(8);

	}

	protected List<String> removeDuplicatesFromList(List<String> values) {

		boolean exist = false;

		for (String val : values) {

			if (exist) {
				values.remove(val);
			} else {
				exist = true;
			}

		}

		return values;
	}

}
