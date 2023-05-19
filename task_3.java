@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age; // Инициализируй поля класса в конструкторе
    this.result = result;
  }

  @Parameterized.Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
        {18, true},
        {17, false},
        {21, true},
        {20, false},
        
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program(); 
    boolean isAdult = program.checkIsAdult(17);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Возраст менее допустимого порога", false, isAdult);
	}
}
