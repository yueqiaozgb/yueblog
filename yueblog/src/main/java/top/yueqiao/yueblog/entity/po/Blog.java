package top.yueqiao.yueblog.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import top.yueqiao.yueblog.entity.BaseEntity;

/**
 * @Author : yueqiao
 * @Create : 2024/12/17 23:27
 */
@Data
@TableName("blog")
@EqualsAndHashCode(callSuper = true)
public class Blog extends BaseEntity {

    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private String id;

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
     * 正文
     */
    private String content;

    /**
     * 正文字数
     */
    private String wordCount;

    /**
     * 是否推荐
     */
    private String isFeatured;

    /**
     * 阅读时间
     */
    private String readTime;

    /**
     * 浏览次数
     */
    private String viewCount;

    /**
     * 点赞次数
     */
    private String likeCount;

    /**
     * 文章状态
     */
    private String status;

}
