package top.yueqiao.yueblog.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Author : yueqiao
 * @Create : 2024/11/30 21:19
 */
@Data
public class Tag {

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
