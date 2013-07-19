import com.caucho.hessian.client.HessianProxyFactory;
import com.cjm.webservice.hessian.HessianService;
import com.cjm.webservice.hessian.model.HessianModel;
import org.junit.Test;

import java.net.MalformedURLException;

/**
 * User: Ding
 * Date: 13-7-20
 * Time: ÉÏÎç12:26
 */
public class TestClient {

    @Test
    public void testRemotionClient() throws MalformedURLException {
        String url = "http://localhost:8000/remotion/hessianService";

        HessianProxyFactory factory = new HessianProxyFactory();
        HessianService service = (HessianService)factory.create(HessianService.class, url);
        HessianModel model = service.getHessianModel("ding jinlin", "123456");
        String message = service.sayHello("ding jinlin");
        System.out.println(message);
        System.out.println("model --username: " + model.getUsername() + ", --password: " + model.getPassword());
    }
}
