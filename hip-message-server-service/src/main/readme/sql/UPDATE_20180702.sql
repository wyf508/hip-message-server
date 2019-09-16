-- 手术检查状态表：Add/modify columns
alter table HLHT.OPERATION_CHECK_STATUS add operative_state_code VARCHAR2(32);
alter table HLHT.OPERATION_CHECK_STATUS add operative_state_name VARCHAR2(32);
-- Add comments to the columns 
comment on column HLHT.OPERATION_CHECK_STATUS.operative_state_code
  is '手术状态编码';
comment on column HLHT.OPERATION_CHECK_STATUS.operative_state_name
  is '手术状态名称';

--系统目录表：添加基础数据
insert into HLHT.system_dir(pk,dir_path,create_date)
values(HLHT.system_dir_seq.nextval,'d:/hlht/',sysdate);
commit;

--文档信息表： Add/modify columns
alter table HLHT.DOC modify doc_path VARCHAR2(128);

--患者信息表：Add/modify columns
alter table HLHT.patient modify EMPI VARCHAR2(64);

-- 服务调用日志信息表：Add/modify columns
alter table HLHT.CALL_LOG add update_date TIMESTAMP(6);
alter table HLHT.CALL_LOG add service_code VARCHAR2(32);
alter table HLHT.CALL_LOG add service_comment VARCHAR2(128);
alter table HLHT.CALL_LOG add response_code VARCHAR2(32);
alter table HLHT.CALL_LOG add response_msg VARCHAR2(256);
-- Add comments to the columns
comment on column HLHT.CALL_LOG.service_code
  is '服务代码';
comment on column HLHT.CALL_LOG.service_comment
  is '服务说明';
comment on column HLHT.CALL_LOG.response_code
  is '返回状态：AE、NF、OK、AE';
comment on column HLHT.CALL_LOG.response_msg
  is '对应返回状态所对应返回消息：系统错误、未找到数据、找到数据、查询参数错误';
comment on column HLHT.CALL_LOG.update_date
  is '更新时间';
alter table HLHT.CALL_LOG modify MSG_PATH VARCHAR2(128);

-- 添加EMPI表：Create table
create table HLHT.EMPI
(
  empi                          VARCHAR2(64),
  patient_id                    VARCHAR2(32),
  status_code                   VARCHAR2(32),
  effective_time                VARCHAR2(32),
  identity_no                   VARCHAR2(32),
  certificates_type_id          VARCHAR2(32),
  certificates_type_depict      VARCHAR2(32),
  name                          VARCHAR2(32),
  contact_number                VARCHAR2(32),
  gender_id                     VARCHAR2(32),
  gender_depict                 VARCHAR2(32),
  date_of_birth                 VARCHAR2(32),
  addr                          VARCHAR2(32),
  addr_state                    VARCHAR2(32),
  addr_city                     VARCHAR2(32),
  addr_county                   VARCHAR2(32),
  addr_street_name_base         VARCHAR2(32),
  addr_street_name              VARCHAR2(32),
  house_number                  VARCHAR2(32),
  postal_code                   VARCHAR2(32),
  marital_status_id             VARCHAR2(32),
  marital_status_depict         VARCHAR2(32),
  ethnic_group_id               VARCHAR2(32),
  ethnic_group_descrive         VARCHAR2(32),
  occupation_id                 VARCHAR2(32),
  occupation_depict             VARCHAR2(32),
  company                       VARCHAR2(32),
  company_contact_phone         VARCHAR2(32),
  health_card_number            VARCHAR2(32),
  health_card_organization_code VARCHAR2(32),
  health_file_number            VARCHAR2(32),
  archiving_organization_code   VARCHAR2(32),
  contact_relationship_code     VARCHAR2(32),
  contact_phone                 VARCHAR2(32),
  contact_name                  VARCHAR2(32),
  provider_organization_id      VARCHAR2(32),
  provider_organization_name    VARCHAR2(32),
  medicare_type_id              VARCHAR2(32),
  medicare_type_depict          VARCHAR2(32),
  author_code                   VARCHAR2(32),
  author_name                   VARCHAR2(32),
  create_time                   TIMESTAMP(6),
  update_time                   TIMESTAMP(6),
  hiup_status                   VARCHAR2(16),
  hiup_info                     VARCHAR2(100)

)
tablespace HLHT
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table
comment on table HLHT.EMPI
  is '病人信息表';
-- Add comments to the columns
comment on column HLHT.EMPI.empi
  is '患者唯一标识';
comment on column HLHT.EMPI.patient_id
  is 'PatientID';
comment on column HLHT.EMPI.status_code
  is '状态代码，固定值"active"';
comment on column HLHT.EMPI.effective_time
  is '患者登记时间';
comment on column HLHT.EMPI.identity_no
  is '身份证号';
comment on column HLHT.EMPI.certificates_type_id
  is '证件类别代码';
comment on column HLHT.EMPI.certificates_type_depict
  is '证件类别描述';
comment on column HLHT.EMPI.name
  is '姓名';
comment on column HLHT.EMPI.contact_number
  is '联系电话';
comment on column HLHT.EMPI.gender_id
  is '性别代码';
comment on column HLHT.EMPI.gender_depict
  is '性别描述';
comment on column HLHT.EMPI.date_of_birth
  is '出生时间';
comment on column HLHT.EMPI.addr
  is '非结构化地址（完整地址描述）';
comment on column HLHT.EMPI.addr_state
  is '地址-省（自治区、直辖市）';
comment on column HLHT.EMPI.addr_city
  is '地址-市（地区）';
comment on column HLHT.EMPI.addr_county
  is '地址-县（区）';
comment on column HLHT.EMPI.addr_street_name_base
  is '地址-乡（镇、街道办事处）';
comment on column HLHT.EMPI.addr_street_name
  is '地址-村（街、路、弄等）';
comment on column HLHT.EMPI.house_number
  is '地址-门牌号码';
comment on column HLHT.EMPI.postal_code
  is '邮政编码';
comment on column HLHT.EMPI.marital_status_id
  is '婚姻状况代码';
comment on column HLHT.EMPI.marital_status_depict
  is '婚姻状况描述';
comment on column HLHT.EMPI.ethnic_group_id
  is '民族代码';
comment on column HLHT.EMPI.ethnic_group_descrive
  is '民族描述';
comment on column HLHT.EMPI.occupation_id
  is '职业类别代码';
comment on column HLHT.EMPI.occupation_depict
  is '职业类别描述';
comment on column HLHT.EMPI.company
  is '工作单位名称';
comment on column HLHT.EMPI.company_contact_phone
  is '工作单位联系电话';
comment on column HLHT.EMPI.health_card_number
  is '健康卡号';
comment on column HLHT.EMPI.health_card_organization_code
  is '健康卡发放机构代码';
comment on column HLHT.EMPI.health_file_number
  is '城乡居民健康档案编号';
comment on column HLHT.EMPI.archiving_organization_code
  is '建档医疗机构组织机构代码';
comment on column HLHT.EMPI.contact_relationship_code
  is '联系人关系，属性都为空';
comment on column HLHT.EMPI.contact_phone
  is '联系人电话';
comment on column HLHT.EMPI.contact_name
  is '联系人姓名';
comment on column HLHT.EMPI.provider_organization_id
  is '登记机构代码';
comment on column HLHT.EMPI.provider_organization_name
  is '登记机构名称';
comment on column HLHT.EMPI.medicare_type_id
  is '医疗保险类别代码';
comment on column HLHT.EMPI.medicare_type_depict
  is '医疗保险类别描述';
comment on column HLHT.EMPI.author_code
  is '作者职工代码';
comment on column HLHT.EMPI.author_name
  is '作者人姓名';
comment on column HLHT.EMPI.create_time
  is '创建时间';
comment on column HLHT.EMPI.update_time
  is '修改时间';
comment on column HLHT.EMPI.hiup_status
  is '平台状态';
comment on column HLHT.EMPI.hiup_info
  is '平台信息';

-- Create/Recreate primary, unique and foreign key constraints
alter table HLHT.EMPI
  add constraint EMPI_PK primary key (EMPI)
  using index
  tablespace HLHT
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
