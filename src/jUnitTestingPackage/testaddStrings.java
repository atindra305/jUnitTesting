package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//Atindra Shekhar
//E19CSE187

class testaddStrings {

	@Test
	void test() {
		jUnitFunction junitString = new jUnitFunction();
		String result = junitString.addStrings("Atindra", " Shekhar");
		assertEquals ("Atindra Shekhar", result);
	}

}
