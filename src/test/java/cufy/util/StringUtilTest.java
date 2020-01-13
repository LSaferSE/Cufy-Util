/*
 * Copyright (c) 2019, LSafer, All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * -You can edit this file (except the header).
 * -If you have change anything in this file. You
 *   shall mention that this file has been edited.
 *   By adding a new header (at the bottom of this header)
 *   with the word "Editor" on top of it.
 */

package cufy.util;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("JavaDoc")
public class StringUtilTest {
	@Test
	public void all() {
		String s = "Sulaiman";

		Assert.assertNull("Contains not detected", StringUtil.all(s, "Su", "ma", "n", "ai", "im"));
		Assert.assertEquals("Missing query not detected", "Rx", StringUtil.all(s, "Su", "ma", "Rx", "er"));
	}

	@Test
	public void any() {
		String s = "Sulaiman";

		Assert.assertEquals("Query not detected", "la", StringUtil.any(s, "la", "ma", "Cha"));
		Assert.assertNull("Shouldn't detected anything", StringUtil.any(s, "Ra", "Ka", "e3", "po"));
	}

	@Test
	public void logging() {
		Assert.assertEquals("annoying letters still not escaped", "A\\t B\\n \\r C\\b", StringUtil.logging("A\t B\n \r C\b"));
	}

	@Test
	public void repeat() {
		String str = StringUtil.repeat("abc", " ", 3);
		Assert.assertEquals("Wrong string build", "abc abc abc", str);
	}
}
