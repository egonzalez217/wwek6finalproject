package labs;
import java.util.*;
public class labWeek4 
{

	public static void main(String[] args) 
	{
//append 0-9 wth dashes to a stringbuilder
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 10; i++)
		{
			sb.append(i);
			if(i != 9) 
			{
				sb.append(" - ");
			}
			
		}
		System.out.println(sb.toString());
		
//create a list of strings and add 5 strings to it each with different length
		List<String> strings = new ArrayList<String>();
		strings.add("Tom");
		strings.add("Sammy");
		strings.add("Paul");
		strings.add("I");
		strings.add("me");
		
//take list of strings and return the shortest string
		System.out.println(findShortestString(strings));
		
//return list with first and last element switched
		List<String> swapped = swapFirstAndLast(strings);
		
		for(String string : swapped)
		{
		System.out.println(string);
		}
		
//take list of string return string with all the elements concatenated to each other
		System.out.println(combineStrings(swapped));
		
//write method that takes a list of strings and a string and returns a new list with all strings from the original list
//containing the second string parameter
		System.out.println("---");
		List<String> searchResults = search(strings, "a");
		for(String result : searchResults)
		{
			System.out.println(result);
		}
		
//write a method that takes a list of integers and returns a list where the first list in the returned valuse contains any
//number from the input list that is divisible by 2, the second list contains values from the input list that are divisible
//by 3, the third divisible by 5, and the fourth all number from the input list not divisible by 2,3, or 5
		System.out.println("---");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);
		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
		for(List<Integer> list : sortedNumbers)
		{
			for(Integer number : list)
			{
				System.out.println(number);
			}
			System.out.println("Next list ----------");
		}
		
//write and test a method that takes a list of strings and returns a list of integers that contains the length of each string
		List<Integer> stringLengths = calculateStringLengths(strings);
		for(Integer i : stringLengths)
		{
			System.out.println(i);
		}
		
//create a set of strings and add 5 values
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("This");
		set.add("Is");
		set.add("Lit");
		
//write and test a method that takes a set of strings and a character and returns a set of strings consisting of all the strings
//input set that start with the character parameter
		Set<String> startsWithH = findAllThatStartWith(set, 'H');
		for(String word : startsWithH)
		{
			System.out.println(word);
		}
		
//write and test a method that takes a set of strings and returns a list of the same things
		List<String> resultList = convertSetToList(set);
		
		for(String listString : resultList)
		{
			System.out.println(listString);
		}
		
//write and test a method that takes a set of integers and returns a new set of integers containing only even numbers from the original set
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(3);
		integerSet.add(4);
		integerSet.add(6);
		integerSet.add(9);
		
		Set<Integer> extractedEvens = extractEven(integerSet);
		for(Integer number : extractedEvens)
		{
			System.out.println(number);
		}
		
//create a map of string and string and add 3 times to it where the key of each is a word and the value is the definition of the word
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Grape", "A crisp, juicy, cylindrical fruit");
		dictionary.put("Year", "A time span of 365 - 366 days");
		dictionary.put("Keyboard", "A device used to input characters into a computer, whether mobile or immobile.");
		
//write and test a method that takes a Map<String, String> and a string and returns the value from a key in the map that matches the string parameter
		String value = lookupValue(dictionary, "Grape");
		System.out.println(value);
//write and test a method that takes a List<String> and returns a Map<Character, Integer> containing a count of all the stirngs that start with a given character
		Map<Character , Integer> counts = countStartingLetters(resultList);
		for(Character character : counts.keySet())
		{
			System.out.println(character + " - " + counts.get(character));
		}
		
		
		
	}
	
	public static Map<Character, Integer> countStartingLetters(List<String> list)
	{
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		
		for(String string : list)
		{
			char c = string.charAt(0);
			if(results.get(c) == null)
			{
				results.put(c, 1);
			}
			else 
			{
				results.put(c, results.get(c) + 1);
			}
		}
		
		return results;
	}
	
	public static String lookupValue(Map<String, String> map, String string)
	{
		for(String key : map.keySet())
		{
			if(key.equals(string))
			{
				return map.get(key); 
			}
		}
		return "";
	}

	public static Set<Integer> extractEven(Set<Integer> set)
	{
		Set<Integer> results = new HashSet<Integer>();
		for(Integer number : set)
		{
			if(number % 2 == 0)
			{
				results.add(number);
			}
		}
		return results;
	}
	
	public static List<String> convertSetToList(Set<String> set)
	{
		List<String> results = new ArrayList();
		
		for(String string : set)
		{
			results.add(string);
		}
		
		return results;
	}
	
	public static Set<String> findAllThatStartWith(Set<String> set, char c)
	{
		Set<String> results = new HashSet<String>();
		
		for(String string : set)
		{
			if(string.charAt(0) == c)
			{
				results.add(string);
			}
		}
		
		return results;
 	}
	
	public static List<Integer> calculateStringLengths(List<String> list)
	{
		List<Integer> lengths = new ArrayList<Integer>();
		for(String string : list)
		{
			lengths.add(string.length());
		}
		
		return lengths;
	}
	
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list)
	{
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		for(Integer number : list)
		{
			if(number % 2 == 0)
			{
				results.get(0).add(number);
			}
			if(number % 3 == 0)
			{
				results.get(1).add(number);
			}
			if(number % 5 == 0)
			{
				results.get(2).add(number);
			}
			if(number % 2 != 0 && number % 3 != 0 && number % 5 != 0)
			{
				results.get(3).add(number);
			}
		}
		
		return results;
	}
	
	public static List<String> search (List<String> list, String query)
	{
		List<String> results = new ArrayList<String>();
		for(String string : list)
		{
			if(string.contains(query))
			{
				results.add(string);
			}
		}
		return results;
	}
	
	public static String findShortestString (List<String> list)
	{
		String shortest = list.get(0);
		for(String string : list)
		{
			if(string.length() < shortest.length())
			{
				shortest = string;
			}
		}
		return shortest;
	}
	
	public static List<String> swapFirstAndLast(List<String> list)
	{
		String temp = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.set(list.size() - 1, temp);
		return list;
	}
	
	public static String combineStrings(List<String> strings)
	{
		StringBuilder result = new StringBuilder();
		for(String string : strings)
		{
			result.append(string + " , ");
		}
		return result.toString();
	}
}
