package top.yueqiao.yueblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.yueqiao.yueblog.entity.po.Blog;
import top.yueqiao.yueblog.mapper.BlogMapper;
import top.yueqiao.yueblog.service.IBlogService;

/**
 * @Author : yueqiao
 * @Create : 2024/12/17 23:59
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {
}
