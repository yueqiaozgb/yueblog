package top.yueqiao.yueblog.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import top.yueqiao.yueblog.entity.BaseEntity;

/**
 * @Author : yueqiao
 * @create 2024/11/30 20:53
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Blog extends BaseEntity {

    /**
     * 主键id
     */
    @TableId
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 封面图片
     */
    private String coverImage;
    /**
     * 摘要
     */
    private String summary;
    /**
     * 内容
     */
    private String content;
    /**
     * 字数
     */
    private Integer wordCount;
    /**
     * 是否推荐
     */
    private String isFeatured;
    /**
     * 阅读时间
     */
    private Integer readTime;
    /**
     * 浏览次数
     */
    private Integer viewCount;
    /**
     * 点赞次数
     */
    private Integer likeCount;
    /**
     * 文章状态
     */
    private String status;

}
