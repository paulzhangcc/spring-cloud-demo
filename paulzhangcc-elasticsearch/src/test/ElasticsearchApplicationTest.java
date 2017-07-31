import com.paulzhangcc.demo.ElasticsearchApplication;
import com.paulzhangcc.demo.EsModel.LoanEsBean;
import com.paulzhangcc.demo.service.LoanServiceEs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.math.BigDecimal;

/**
 * Created by paul on 2017/7/21.
 */

@SpringBootTest(classes = ElasticsearchApplication.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ElasticsearchApplicationTest {
    @Autowired
    LoanServiceEs loanServiceEs;

    @Test
    public void testGetLoanEs() {
        LoanEsBean loanEsBean = loanServiceEs.findOne(1000);
        System.out.println(loanEsBean);
    }

    @Test
    public void testSaveLoanEs() {
        LoanEsBean loanEsBean = new LoanEsBean();
        loanEsBean.setAmount(new BigDecimal(10000));
        loanEsBean.setLoanId(1000);
        loanEsBean.setTitle("个人借款");
        loanServiceEs.save(loanEsBean);
        System.out.println(Boolean.TRUE);
    }
}

