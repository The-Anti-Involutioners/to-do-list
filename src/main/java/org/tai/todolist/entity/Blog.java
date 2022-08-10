package org.tai.todolist.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Karigen
 * @since 2022-08-09
 */
@Getter
@Setter
@Accessors(chain = true)
@Schema(name = "Blog", description = "")
public class Blog extends Model<Blog> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "blog_id", type = IdType.AUTO)
    private Integer blogId;

    private Integer userid;

    @TableField("`context`")
    private String context;

    @Schema(description = "发送时间戳,1970-1-1至今的小时数")
    private Integer postTime;

    @Schema(description = "逻辑删除键")
    @TableLogic
    private Boolean flag;

    @Override
    public Serializable pkVal() {
        return this.blogId;
    }
}
