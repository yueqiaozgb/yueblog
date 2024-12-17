package top.yueqiao.yueblog.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import top.yueqiao.yueblog.entity.BaseEntity;

/**
 * @Author : yueqiao
 * @Create : 2024/12/17 23:39
 */

@Data
@TableName("tag")
@EqualsAndHashCode(callSuper = true)
public class Tag extends BaseEntity {

    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private String id;

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
