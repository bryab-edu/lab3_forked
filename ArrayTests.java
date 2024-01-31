import static org.junit.Assert.*;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedFilled(){
    int[] input2 = {1, 2, 3};
    int[] input2_reversed = {3, 2, 1};
    assertArrayEquals(input2_reversed, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReversedInPlaceFilled(){
    int[] input2 = {1, 2, 3};
    int[] input2_reversed = {3, 2, 1};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(input2_reversed, input2);
  }
}
