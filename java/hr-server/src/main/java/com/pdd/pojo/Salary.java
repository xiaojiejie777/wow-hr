package com.pdd.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author pdd
 * @since 2021-03-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Salary对象", description="")
public class Salary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "基本工资")
    @TableField("basicSalary")
    private Integer basicSalary;

    @ApiModelProperty(value = "奖金")
    private Integer bonus;

    @ApiModelProperty(value = "午餐补助")
    @TableField("lunchSalary")
    private Integer lunchSalary;

    @ApiModelProperty(value = "交通补助")
    @TableField("trafficSalary")
    private Integer trafficSalary;

    @ApiModelProperty(value = "应发工资")
    @TableField("allSalary")
    private Integer allSalary;

    @ApiModelProperty(value = "养老金基数")
    @TableField("pensionBase")
    private Integer pensionBase;

    @ApiModelProperty(value = "养老金比率")
    @TableField("pensionPer")
    private Float pensionPer;

    @ApiModelProperty(value = "启用时间")
    @TableField("createDate")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "医疗基数")
    @TableField("medicalBase")
    private Integer medicalBase;

    @ApiModelProperty(value = "医疗保险比率")
    @TableField("medicalPer")
    private Float medicalPer;

    @ApiModelProperty(value = "公积金基数")
    @TableField("accumulationFundBase")
    private Integer accumulationFundBase;

    @ApiModelProperty(value = "公积金比率")
    @TableField("accumulationFundPer")
    private Float accumulationFundPer;

    @ApiModelProperty(value = "名称")
    private String name;


}
