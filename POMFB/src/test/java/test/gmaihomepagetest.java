package test;

import org.testng.annotations.Test;

public class gmaihomepagetest extends gmailbasetest{
		@Test
		public void gmailhomepagetest() {
			getHomePage();
			homepage.typefirstname();
		}

}
