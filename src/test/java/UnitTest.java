import com.pluralsight.Browser;
import com.pluralsight.Pages;
import com.pluralsight.PathPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

	@Test
	public void canGoToHomePage() {
		Pages.homePage().goTo();
		Assert.assertTrue(Pages.homePage().isAt());
	}
	
	@Test
	public void canGoToJavaPathPage() {
		Pages.pathPages().goTo();
		PathPage pathPage = Pages.pathPages().getPathPage("Java");
		pathPage.goTo();
		Assert.assertTrue(pathPage.isAtPathPage("Java"));
	}
	
	@AfterClass
	public static void cleanUp() {
		Browser.close();
	}

}
