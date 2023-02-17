import org.junit.jupiter.api.Test;

        import static io.restassured.RestAssured.given;
        import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void shouldReturnRequest() {
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("Upon a long ago")// отправляемые данные (заголовки и query можно выставлять аналогично)
                // Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("Upon a long ago"))
        ;
    }
}