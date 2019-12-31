import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class ApiTest {

    public static String access_token;

    @Test
    public static void getToken(){
        WeChatToken getWeChatToken = new WeChatToken();
        access_token=
                given()
                .params("corpid",getWeChatToken.getCorpid())
                .params("corpsecret",getWeChatToken.getCorpsecret())
                .when()
                .log().all()
                .get("https://qyapi.weixin.qq.com/cgi-bin/gettoken")
                .then()
                .log().all()
                .statusCode(200)
                .body("errcode",equalTo(0))
                .extract().body().path("access_token");
    }

    @Test
    public static void createDepartment(){
        DepartmentParm departmentParm = new DepartmentParm();
        Map<String,Object> map = new HashMap<>();
        map.put("name",departmentParm.getName());
        map.put("parentid",departmentParm.getParentid());
        given()
                .queryParam("access_token",ApiTest.access_token)
                .contentType(ContentType.JSON)
                .body(map)
                .when()
                .post("https://qyapi.weixin.qq.com/cgi-bin/department/create?access_token=ACCESS_TOKEN")
                .then()
                .log().all()
                .statusCode(200);
    }
}
