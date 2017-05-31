import com.ssm.dal.dao.CustomerDao;
import com.ssm.dal.pojo.Customer;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;


/**
 * Created by wing on 2017/5/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class MybatisConnTest {
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testconn(){
        Customer customer = customerDao.getCustomerById(14);
        System.out.println(customer);
//        Connection con = sqlSessionFactory.openSession().getConnection();
//        assertNotNull("数据库连接失败!!!", con);
    }
}
