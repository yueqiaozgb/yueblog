package top.yueqiao.yueblog.controller.blog;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yueqiao.yueblog.entity.po.Blog;
import top.yueqiao.yueblog.service.IBlogService;

import java.util.List;

/**
 * @Author : yueqiao
 * @Create : 2024/12/7 16:36
 */
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Resource
    private IBlogService blogService;

    @RequestMapping("/test")
    public List<Blog> test() {
        return blogService.list();
    }

}
