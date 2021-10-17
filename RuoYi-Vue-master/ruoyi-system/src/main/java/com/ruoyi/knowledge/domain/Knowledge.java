package com.ruoyi.knowledge.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 提示信息表对象 Knowledge
 * 
 * @author xiaoyu
 * @date 2021-10-15
 */
public class Knowledge extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 信息编号 */
    private Long informid;

    /** 信息内容 */
    @Excel(name = "信息内容")
    private String inform;

    /** 权重 */
    @Excel(name = "权重")
    private Long weight;

    /** 险情类型 */
    @Excel(name = "险情类型")
    private Long disastertype;

    /** 处置对象 */
    @Excel(name = "处置对象")
    private Long disposeobj;

    /** 详细类型 */
    @Excel(name = "详细类型")
    private Long detailtype;

    /** 四级标签 */
    @Excel(name = "四级标签")
    private Long label4;

    /** 提示信息类型 */
    @Excel(name = "提示信息类型")
    private Long informtypeid;

    public void setInformid(Long informid) 
    {
        this.informid = informid;
    }

    public Long getInformid() 
    {
        return informid;
    }
    public void setInform(String inform) 
    {
        this.inform = inform;
    }

    public String getInform() 
    {
        return inform;
    }
    public void setWeight(Long weight) 
    {
        this.weight = weight;
    }

    public Long getWeight() 
    {
        return weight;
    }
    public void setDisastertype(Long disastertype) 
    {
        this.disastertype = disastertype;
    }

    public Long getDisastertype() 
    {
        return disastertype;
    }
    public void setDisposeobj(Long disposeobj) 
    {
        this.disposeobj = disposeobj;
    }

    public Long getDisposeobj() 
    {
        return disposeobj;
    }
    public void setDetailtype(Long detailtype) 
    {
        this.detailtype = detailtype;
    }

    public Long getDetailtype() 
    {
        return detailtype;
    }
    public void setLabel4(Long label4) 
    {
        this.label4 = label4;
    }

    public Long getLabel4() 
    {
        return label4;
    }
    public void setInformtypeid(Long informtypeid) 
    {
        this.informtypeid = informtypeid;
    }

    public Long getInformtypeid() 
    {
        return informtypeid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("informid", getInformid())
            .append("inform", getInform())
            .append("weight", getWeight())
            .append("disastertype", getDisastertype())
            .append("disposeobj", getDisposeobj())
            .append("detailtype", getDetailtype())
            .append("label4", getLabel4())
            .append("informtypeid", getInformtypeid())
            .toString();
    }
}