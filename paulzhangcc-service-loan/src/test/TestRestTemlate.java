import org.springframework.web.client.RestTemplate;

/**
 * Created by paul on 2017/7/25.
 */
public class TestRestTemlate {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String BaiDu = restTemplate.getForObject("http://www.baidu.com", String.class);
        System.out.println(BaiDu);
    }
}
