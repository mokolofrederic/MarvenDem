package first.testng.example;

public class ParamsTest {
	@Test(dataProvider="getData")
	public void UserId(String usernam, String subject) {
		System.out.println(x);
	}
}
