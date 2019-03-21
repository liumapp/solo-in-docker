package com.liumapp.solo.transporter.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.ant.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 链接表
 * </p>
 *
 * @author liumapp
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="B3SoloLink对象", description="链接表")
public class B3SoloLink extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId("oId")
    private String oId;

    @ApiModelProperty(value = "链接地址")
    @TableField("linkAddress")
    private String linkAddress;

    @ApiModelProperty(value = "链接描述")
    @TableField("linkDescription")
    private String linkDescription;

    @ApiModelProperty(value = "链接展现的排序")
    @TableField("linkOrder")
    private Integer linkOrder;

    @ApiModelProperty(value = "链接标题")
    @TableField("linkTitle")
    private String linkTitle;


}
