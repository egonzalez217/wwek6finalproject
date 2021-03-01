package labs;

public class labWeek3 
{

	public static void main(String[] args) 
	{
		//print out values from the array
				int values[] = {1, 5, 2, 8, 13, 6};
				System.out.println(values[0]);
				
				System.out.println(values[values.length - 1]);
				
				//System.out.println(values[6]);
				
				//System.out.println(values[-1]);
				
				//iterate and print out the values for the array
				for(int i = 0; i < values.length; i++)
				{
					System.out.println(values[i]);
				}
				//
				for(int n : values)
				{
					System.out.println(n);
				}
				//print out the average of the values in the array	
				int sum = 0;
				for(int n : values)
				{
					sum += n;
				}
				
				int average = sum/ values.length;
				System.out.println(average);
				//print out the even values in the array
				for(int n : values)
				{
					if(n % 2 == 1)
					{
						System.out.println(n);
					}
				}
				//get the sum of the letters of the names in the array
				String names[] = {"Sam", "Sally", "Thomas", "Robert"};
				
				int sumOfLetters = 0;
				for(String name : names)
				{
					sumOfLetters += name.length();
				}
				
				//use the greet function
				greet("Tom");
				greet("Sally");
				
				//use the greet2 function
				String greeting = greet2("Emilio");
				System.out.println(greeting);
				
				//use the function istringlongerthannumber
				System.out.println(isStringLongerThanNumber("Hello", 3));
				
				//use the function doesarraycontainstring
				System.out.println(doesArrayContainString(names, "Hello"));
				
				//use the function doesarratcontainstring
				System.out.println(findSmallestNumber(values));
				
				//use the function calculateaverage
				double[] doubles = {45.7, 30.2, 67.3};
				System.out.println(calculateAverage(doubles));
				
				//use the function extractstringlengths
				int[] nameLengths = extractStringLengths(names);
				for(int number : nameLengths)
				{
					System.out.println(number);
				}
				
				//use the function hasmoreevenwordcharacters
				System.out.println(hasMoreEvenWordCharacters(names));
				
				//use palindrome function
				System.out.println(isPalindrome("racecar"));
				
				
			}
			
			//palindrome
			public static boolean isPalindrome(String string)
			{
				for(int i = 0; i < string.length() / 2; i++)
				{
					if (string.charAt(i) != string.charAt(string.length() - i - 1))
					{
						return false;
					}
				}
				
				return true;
			}
			
			public static boolean hasMoreEvenWordCharacters(String array[])
			{
				int evenLetters = 0;
				int oddLetters = 0;
				
				for(String string : array)
				{
					if(string.length() % 2 == 0)
					{
						evenLetters += string.length();
					}
					else
					{
						oddLetters += string.length();
					}
				}
				
				return evenLetters > oddLetters;
				
			}
			
			public static void greet(String name)
			{
				
				System.out.println("Hello, " + name);
				return;
			}
			
			public static String greet2(String name)
			{
				return "Hi, " + name + "!";
			}
			
			public static boolean isStringLongerThanNumber(String string, int number)
			{
				return string.length() > number;
				
			}
			
			public static boolean doesArrayContainString(String array[], String string)
			{
				for(String str : array)
				{
					if(str.equals(string))
					{
						return true;
					}
					
				}
			return false;
			}

			public static int findSmallestNumber(int[] numbers)
			{
				int smallest = numbers[0];
				
				for(int number : numbers)
				{
					if(number < smallest)
					{
						smallest = number;
					}
				}
				return smallest;
			}
			
			
			public static double calculateAverage(double[] array)
			{
				double sum = 0;
				for(double number : array)
				{
					sum += number;
				}
				return sum / array.length;
			}
			
			public static int[] extractStringLengths (String [] strings)
			{
				int[] results = new int[strings.length];
				for (int i = 0; i < strings.length; i++)
				{
					results[i] = strings[i].length();
				}
				
				return results;
			}
		}
