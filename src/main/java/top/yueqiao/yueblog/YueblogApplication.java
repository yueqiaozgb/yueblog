package top.yueqiao.yueblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yueqiao
 * @date 2024/11/22
 */
@MapperScan("top.yueqiao.yueblog.mapper")
@SpringBootApplication
public class YueblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(YueblogApplication.class, args);
	}

}
