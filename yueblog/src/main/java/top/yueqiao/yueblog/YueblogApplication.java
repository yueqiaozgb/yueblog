package top.yueqiao.yueblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author yueqiao
 * @Create : 2024/12/15 23:24
 */
@SpringBootApplication
@MapperScan("top.yueqiao.yueblog.mapper")
public class YueblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(YueblogApplication.class, args);
    }

}
