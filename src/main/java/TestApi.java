import io.restassured.http.ContentType;
import model.UserCreate;
import model.UserModel;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApi {
    String BASE_URI = "https://reqres.in";
    String USER_URI = "/api/users";

    @Test
    public void create(){
       //добавляем пользователя обьектом
        UserCreate ur = new UserCreate()
                .setName("Мару")
                .setJob("Мария");
        //отправляем созданный объект
        UserModel cr = given()
                .baseUri(BASE_URI)
                .log().everything()
                .contentType(ContentType.JSON)
                .body(ur)
                .when()
                .post(USER_URI)
                .then()
                .statusCode(201)
                .extract()
        //проверяем что созданный объект соответствует классу
                .body().as(UserModel.class);

        //проверяем что отправленый объект соответсвтует созданному
        assertEquals(cr.getName(), ur.getName());
        assertEquals(cr.getJob(), ur.getJob());
    }
}
