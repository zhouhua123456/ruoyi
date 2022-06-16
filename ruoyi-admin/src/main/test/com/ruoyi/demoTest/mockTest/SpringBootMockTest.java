package com.ruoyi.demoTest.mockTest;

import com.ruoyi.system.service.ISysConfigService;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootMockTest {

    @Mock
    private ISysConfigService configService;
}
