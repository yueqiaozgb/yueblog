package top.yueqiao.yueblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.yueqiao.yueblog.entity.po.Tag;
import top.yueqiao.yueblog.mapper.TagMapper;
import top.yueqiao.yueblog.service.ITagService;

/**
 * @Author : yueqiao
 * @Create : 2024/12/18 0:03
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {
}
