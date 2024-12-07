package top.yueqiao.yueblog.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import top.yueqiao.yueblog.entity.BaseEntity;

/**
 * @Author : yueqiao
 * @Create : 2024/11/30 21:20
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Category extends BaseEntity {

    /**
     * 主键id
     */
    @TableId
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 颜色
     */
    private String color;
    /**
     * 备注
     */
    private String remark;

}
