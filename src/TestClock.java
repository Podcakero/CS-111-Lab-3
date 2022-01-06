/*
 * Name: Robert "Drew" Weimer
 * Lab Assignment: 3
 * Lab Instructor: Branson Beach
 * Date: 1/28/2020
 */
public class TestClock
{
	public static void main(String[] args)
	{
		//Make a new Clock object with time 00:00:00
		Clock clock = new Clock(0, 0, 0);
		
		//Set the time of your Clock object to be "23:22:42"
		clock.setTime(23, 22, 42);
		
		//Print your clock object, you should get "23:22:42"
		System.out.println(clock);
		
		//Increment the hour, minute, and second of your clock by one each
		clock.incrementSecond();
		clock.incrementMinute();
		clock.incrementHour();
		
		//Print your clock object, you should get "00:23:43"
		System.out.println(clock);
		
		//Increment the seconds of your clock by 17 seconds
		clock.incrementSecondsBy(17);
		
		//Print your clock object, you should get "00:24:00"
		System.out.println(clock);
		
		//Make a second clock object of time "23:59:59"
		Clock clock2 = new Clock(23, 59, 59);
		
		//Increment the minutes of your second clock by 24 minutes and the seconds of your second clock by 1.
		clock2.incrementMinuteBy(24);
		clock2.incrementSecond();
		
		//Print your second clock object, you should get "00:24:00"
		System.out.println(clock2);
		
		//Print if your first clock object is equal to your second clock object, you should get true
		System.out.println(clock.equals(clock2));
		
	}	
}