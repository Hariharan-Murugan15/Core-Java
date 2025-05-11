package com.java;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class StudentScoreTest {
	Calculator calci;
	StudentScore score = null;

	static Stream<Object[]> testValues() {
		return Stream.of(
			new Object[] {10, 10, 100},
			new Object[] {-1, 10, -1}
		);
	}

	@ParameterizedTest
	@MethodSource("testValues")
	void StudentScoreCalculator(int maths, int science, int expectedVal) {
		calci = mock(Calculator.class);
		when(calci.mult(maths, science)).thenReturn(expectedVal); 
		score = new StudentScore(calci);
		score.calculateScore(maths, science);
		assertEquals(expectedVal, score.getScore());
	}
}