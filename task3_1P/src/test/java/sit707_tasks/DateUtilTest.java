package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "223743838";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Sushma";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january 31 Should Increment To February 1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january 31 Should Decrement To January 30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("test January Nominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024);
		date.increment();
		System.out.println("testMinJanuary1ShouldIncrementToJanuary2" + date);
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement();
        System.out.println("test Min January 1 Should Decrement To December 31" + date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
    public void testJune1Decrement() {
		System.out.println("TestCase: 1A");
        DateUtil date = new DateUtil(1, 6, 1994);
        date.decrement();
        System.out.println("test June 1 Decrement" + date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }
	
	@Test
    public void testJune2Decrement() {
		System.out.println("TestCase: 2A");
        DateUtil date = new DateUtil(2, 6, 1994);
        date.decrement();
        System.out.println("test June 1 Decrement" + date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
	
	@Test
    public void testJune15Decrement() {
		System.out.println("TestCase: 3A");
        DateUtil date = new DateUtil(15, 6, 1994);
        date.decrement();
        System.out.println("test June 15 Decrement" + date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
	
	@Test
    public void testJune30Decrement() {
		System.out.println("TestCase: 4A");
        DateUtil date = new DateUtil(30, 6, 1994);
        date.decrement();
        System.out.println("test June 30 Decrement" + date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
	
	@Test(expected = RuntimeException.class)
    public void testJune31DecrementInvalid() {
		System.out.println("TestCase: 5A");
        DateUtil date = new DateUtil(31, 6, 1994);
        date.decrement();
        System.out.println("test June 31 Decrement" + date + ":Invalid Date");
       
    }
	
	@Test
    public void testJan15Decrement() {
		System.out.println("TestCase: 6A");
        DateUtil date = new DateUtil(15, 1, 1994);
        date.decrement();
        System.out.println("test Jan 15 Decrement" + date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }
	
	@Test
    public void testFeb15Decrement() {
		System.out.println("TestCase: 7A");
        DateUtil date = new DateUtil(15, 2, 1994);
        date.decrement();
        System.out.println("test Feb 15 Decrement" + date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
	
	@Test
    public void testNov15Decrement() {
		System.out.println("TestCase: 8A");
        DateUtil date = new DateUtil(15, 11, 1994);
        date.decrement();
        System.out.println("test Nov 15 Decrement" + date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(11, date.getMonth());
    }
	
	@Test
    public void testDec15Decrement() {
		System.out.println("TestCase: 9A");
        DateUtil date = new DateUtil(15, 12, 1994);
        date.decrement();
        System.out.println("test Dec 15 Decrement" + date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(12, date.getMonth());
    }
	
	@Test
    public void testJune151700Decrement() {
		System.out.println("TestCase: 10A");
        DateUtil date = new DateUtil(15, 6, 1700);
        date.decrement();
        System.out.println("test June 15 Decrement" + date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
	
	@Test
    public void testJune151701Decrement() {
		System.out.println("TestCase: 11A");
        DateUtil date = new DateUtil(15, 6, 1701);
        date.decrement();
        System.out.println("test June 15 Decrement" + date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
	
	@Test
    public void testJune62023Decrement() {
		System.out.println("TestCase: 12A");
        DateUtil date = new DateUtil(15, 6, 2023);
        date.decrement();
        System.out.println("test June 15 Decrement" + date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
	
	@Test
    public void testJune152024Decrement() {
		System.out.println("TestCase: 13A");
        DateUtil date = new DateUtil(15, 6, 2024);
        date.decrement();
        System.out.println("test June 15 Decrement" + date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        System.out.println("-------------------------------------------");
    }
	
	@Test
    public void testJune1Increment() {
		System.out.println("TestCase: 1B");
        DateUtil date = new DateUtil(1, 6, 1994);
        date.increment();
        System.out.println("test June 1 increment" + date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
	
	@Test
    public void testJune2Increment() {
		System.out.println("TestCase: 2B");
        DateUtil date = new DateUtil(2, 6, 1994);
        date.increment();
        System.out.println("test June 1 increment" + date);
        Assert.assertEquals(3, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
	
	@Test
    public void testJune15Increment() {
		System.out.println("TestCase: 3B");
        DateUtil date = new DateUtil(15, 6, 1994);
        date.increment();
        System.out.println("test June 15 increment" + date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
	
	@Test
    public void testJune30Increment() {
		System.out.println("TestCase: 4B");
        DateUtil date = new DateUtil(30, 6, 1994);
        date.increment();
        System.out.println("test June 30 increment" + date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
    }
	
	@Test(expected = RuntimeException.class)
    public void testJune31IncrementInvalid() {
		System.out.println("TestCase: 5B");
        DateUtil date = new DateUtil(31, 6, 1994);
        date.increment();
        System.out.println("test June 31 increment" + date + ":Invalid Date");
       
    }
	
	@Test
    public void testJan15Increment() {
		System.out.println("TestCase: 6B");
        DateUtil date = new DateUtil(15, 1, 1994);
        date.increment();
        System.out.println("test Jan 15 increment" + date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }
	
	@Test
    public void testFeb15Increment() {
		System.out.println("TestCase: 7B");
        DateUtil date = new DateUtil(15, 2, 1994);
        date.increment();
        System.out.println("test Feb 15 increment" + date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
	
	@Test
    public void testNov15Increment() {
		System.out.println("TestCase: 8B");
        DateUtil date = new DateUtil(15, 11, 1994);
        date.increment();
        System.out.println("test Nov 15 increment" + date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(11, date.getMonth());
    }
	
	@Test
    public void testDec15Increment() {
		System.out.println("TestCase: 9B");
        DateUtil date = new DateUtil(15, 12, 1994);
        date.increment();
        System.out.println("test Dec 15 increment" + date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(12, date.getMonth());
    }
	
	@Test
    public void testJune151700Increment() {
		System.out.println("TestCase: 10B");
        DateUtil date = new DateUtil(15, 6, 1700);
        date.increment();
        System.out.println("test June 15 increment" + date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
	
	@Test
    public void testJune151701Increment() {
		System.out.println("TestCase: 11B");
        DateUtil date = new DateUtil(15, 6, 1701);
        date.increment();
        System.out.println("test June 15 increment" + date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
	
	@Test
    public void testJune62023Increment() {
		System.out.println("TestCase: 12B");
        DateUtil date = new DateUtil(15, 6, 2023);
        date.increment();
        System.out.println("test June 15 increment" + date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
	
	@Test
    public void testJune152024Increment() {
		System.out.println("TestCase: 13B");
        DateUtil date = new DateUtil(15, 6, 2024);
        date.increment();
        System.out.println("test June 15 increment" + date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        System.out.println("-------------------------------------------");
    }
	
	@Test
    public void testLeapYearFebruary28Increment() {
		System.out.println("test cases for February with a leap year condition");
        DateUtil date = new DateUtil(28, 2, 2024);
        date.increment();
        System.out.println("test Leap Year February 28 Increment" + date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

    @Test
    public void testLeapYearFebruary29Increment() {
        DateUtil date = new DateUtil(29, 2, 2024);
        date.increment();
        System.out.println("test Leap Year March 1 Decrement" + date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }

    @Test
    public void testLeapYearMarch1Decrement() {
        DateUtil date = new DateUtil(1, 3, 2024);
        date.decrement();
        System.out.println("test Leap Year March 1 Decrement" + date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

    @Test
    public void testLeapYearFebruary29Decrement() {
        DateUtil date = new DateUtil(29, 2, 2024);
        date.decrement();
        System.out.println("test Leap Year February 29 Decrement" + date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

}
