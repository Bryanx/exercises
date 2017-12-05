package json;

	import com.google.gson.Gson;
	import com.google.gson.GsonBuilder;
	import org.junit.Test;
	import static org.junit.Assert.assertEquals;

	public class GsonTest {
		@Test
		public void Box2String2Box() {
			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();

			Box box = new Box(10,20,30);

			String jsonString = gson.toJson(box);
			System.out.printf("Serialised: %s%n", jsonString);

			Box otherBox = gson.fromJson(jsonString, Box.class);
			assertEquals("Not same box", box, gson.fromJson(jsonString, Box.class));
		}
	}