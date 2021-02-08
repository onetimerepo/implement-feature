package eu.europa.ec.digit.search;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationTests.class);

	@InjectMocks
	public Application application;

	@Test
	public void sortMyString1Test() {

		String value = "the quick brown fox jumps over the lazy dog";
		value = application.sortMyString(value);

		LOGGER.info(value);
		Assert.assertEquals(value, "brown dog fox jumps lazy over quick the the");

	}
	
	@Test
	public void sortMyString2Test() {

		String value = "The quick Brown fox jumps Over the lazy dog";
		value = application.sortMyString(value);

		LOGGER.info(value);
		Assert.assertEquals(value, "Brown dog fox jumps lazy Over quick The the");

	}
	
	@Test
	public void sortMyString3Test() {

		String value = "Just a Sentence";
		value = application.sortMyString(value);

		LOGGER.info(value);
		Assert.assertEquals(value, "a Just Sentence");

	}

	
	@Test
	public void removeDuplicates1Test() {

		String[] value = "Just a Sentence".split(" ");
		List<String> values = application.removeDuplicatesFromList(Arrays.asList(value));

		Assert.assertTrue(values.size() == 3);
		Assert.assertTrue(values.get(0).equals("Just"));
		Assert.assertTrue(values.get(1).equals("a"));
		Assert.assertTrue(values.get(2).equals("Sentence"));

	}
	
	@Test
	public void removeDuplicates2Test() {

		String[] value = "Just Just a Sentence".split(" ");
		List<String> values = application.removeDuplicatesFromList(Arrays.asList(value));

		Assert.assertTrue(values.size() == 3);
		Assert.assertTrue(values.get(0).equals("Just"));
		Assert.assertTrue(values.get(1).equals("a"));
		Assert.assertTrue(values.get(2).equals("Sentence"));

	}
	

}
