package MavenExample;

import org.testng.annotations.Test;

public class ReadingdatafromCommandtest {

	@Test(groups="smoke")
	public void ReadingdatafromCommandtest() {
		System.out.println(executing poll scm);
	String URL=	System.getProperty("url");
	String UN=System.getProperty("username");
	String PWD=System.getProperty("password");
	System.out.println(URL);
	System.out.println(UN);
	System.out.println(PWD);

}
	@Test(groups="regression")
	public void regressiontest() {
		System.out.println("regression test");
	}
}
