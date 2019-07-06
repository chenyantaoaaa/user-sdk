package com.sxh.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;

    private String accountId;
    @NotEmpty(message = "用户名不能为空")
    @Length(min = 5, max = 20, message = "用户名5-20长度")
    private String loginName;

    private String loginPassword;

    private String name;

    private String number;

    private Integer groupId;

    private Integer companyId;

    private Integer departmentId;

    private Integer jobId;

    private Byte sex;

    private String idCard;

    private String tel;

    private Date entryDay;

    private Date birthday;

    private String email;

    private Integer leaderId;

    private String leaderName;

    private String officePhone;

    private String officeArea;

    private Integer jobLevel;

    private String remark;

    private Boolean fixeduser;

    private Boolean deleteFlag;

    private Integer sanfangId;

    private String sanfangName;

    private Integer sanfangAccountId;

    private String sanfangAccountName;

    private String sanfangOrgName;

    private Integer creator;

    private String creatorName;

    private Date createTime;

    private Integer modifier;

    private String modifierName;

    private Date modifyTime;

}
