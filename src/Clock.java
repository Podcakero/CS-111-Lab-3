/*
 * Name: Robert "Drew" Weimer
 * Lab Assignment: 3
 * Lab Instructor: Branson Beach
 * Date: 1/28/2020
 */
public class Clock
{
	/*
	 * Class properties: one for the hour, minute, and second
	 */
	int hr;
	int min;
	int sec;

	/**
	 * Basic constructor: all properties set to 0.
	 */
	public Clock()
	{
		hr = 0;
		min = 0;
		sec = 0;
	}

	/**
	 * Advanced constructor: set local properties to the given parameters.
	 *
	 * @param hr  The current hour.
	 * @param min The current minute.
	 * @param sec The current second.
	 */
	public Clock(int hr, int min, int sec)
	{
		setTime(hr, min, sec);
	}

	/**
	 * setTime: set the time of the clock to be the given parameters.
	 * Make sure the parameters are valid, remember there are not 30 hours in a day.
	 *
	 * @param hr  The hour to which to set the time.
	 * @param min The minute to which to set the time.
	 * @param sec The second to which to set the time.
	 */
	public void setTime(int hr, int min, int sec)
	{
		if (hr > 23)
			throw new IllegalArgumentException("Unable to set hour value. Is it out of bounds?");
		if (min > 59)
			throw new IllegalArgumentException("Unable to set minutes value. Is it out of bounds?");
		if (sec > 59)
			throw new IllegalArgumentException("Unable to set seconds value. Is it out of bounds?");
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}

	/**
	 * returns the hour properties
	 *
	 * @return The current hour.
	 */
	public int getHours()
	{
		return hr;
	}

	/**
	 * getMinutes: returns the minute properties
	 *
	 * @return The current minute.
	 */
	public int getMinutes()
	{
		return min;
	}

	/**
	 * getSeconds: returns the seconds properties
	 *
	 * @return The current second.
	 */
	public int getSeconds()
	{
		return sec;
	}

	/**
	 * incrementSeconds: adds one to the seconds properties.
	 * Remember though, if the seconds is 60 or more you need to increment the
	 * minutes property instead of seconds and the seconds property will be set to 0.
	 */
	public void incrementSecond()
	{
		if (sec == 59)
		{
			incrementMinute();
			sec = 0;
		}
		else
			sec++;
	}

	/**
	 * incrementMinute: adds one to the minutes properties.
	 * Remember though, if the minutes is 60 or more you need to increment the
	 * hours property instead of minutes and the minutes property will be set to 0.
	 */
	public void incrementMinute()
	{
		if (min == 59)
		{
			incrementHour();
			min = 0;
		}
		else
			min++;
	}

	/**
	 * incrementHour: adds one to the hours properties.
	 * Remember though, if the hours is 24 or more you need to set
	 * the hours property to 0.
	 */
	public void incrementHour()
	{
		if (hr == 23)
			hr = 0;
		else
			hr++;
	}

	/**
	 * incrementSecondsBy: increments the seconds by a given parameter.
	 *
	 * @param count The number of seconds by which to increment the clock.
	 */
	public void incrementSecondsBy(int count)
	{
		for (int i = 0; i < count; i++)
			incrementSecond();
	}

	/**
	 * incrementMinuteBy: increments the minutes by a given parameter.
	 *
	 * @param count The number of minutes by which to increment the clock.
	 */
	public void incrementMinuteBy(int count)
	{
		for (int i = 0; i < count; i++)
			incrementMinute();
	}

	/**
	 * incrementHourBy: increments the hours by a given parameter.
	 *
	 * @param count The number of hours by which to increment the clock.
	 */
	public void incrementHourBy(int count)
	{
		for (int i = 0; i < count; i++)
			incrementHour();
	}

	/**
	 * equals: returns true if the parameter clock's time is the same as the local time.
	 *
	 * @param clock The other clock to compare with this one.
	 * @returns True if the two Clocks have the same hour, minute, and second.  False otherwise.
	 */
	public boolean equals(Clock clock)
	{
		boolean equalSec = this.sec == clock.sec;
		boolean equalMin = this.min == clock.min;
		boolean equalHr = this.hr == clock.hr;

		return equalSec && equalMin && equalHr;
	}

	/**
	 * toString: returns the clock properties as a string in the format "HH:MM:SS"
	 * H = hour, M = minute, S = second.
	 * Always print each number as two digits, for example instead of "1:1:1" for the
	 * return string you will return "01:01:01" so remember to add leading zeros until each
	 * set of numbers has two digits.
	 */
	public String toString()
	{
		String output = "";

		//Hours
		if (this.hr < 10)
			output += "0";
		output += this.hr + ":";

		//Minutes
		if (this.min < 10)
			output += "0";
		output += this.min + ":";

		//Seconds
		if (this.sec < 10)
			output += "0";
		output += this.sec;

		return output;

	}

}
