--添加服务信息表
-- Create table
create table hlht.SERVICE
(
  pk             number,
  service_type   varchar2(64),
  service_code   varchar2(16),
  service_name   varchar2(64),
  interface_mode varchar2(64),
  service_addr   varchar2(64),
  create_date    timestamp,
  update_date    timestamp
)
;
-- Add comments to the table
comment on table hlht.SERVICE
  is '服务表';
-- Add comments to the columns
comment on column hlht.SERVICE.pk
  is '自增主键';
comment on column hlht.SERVICE.service_type
  is '服务类型';
comment on column hlht.SERVICE.service_code
  is '服务代码';
comment on column hlht.SERVICE.service_name
  is '服务名称';
comment on column hlht.SERVICE.interface_mode
  is '接口模型';
comment on column hlht.SERVICE.service_addr
  is '服务地址';
comment on column hlht.SERVICE.create_date
  is '创建时间';
comment on column hlht.SERVICE.update_date
  is '更新时间';
-- Create/Recreate primary, unique and foreign key constraints
alter table hlht.SERVICE
  add constraint service_pk primary key (PK);

--添加序列
create sequence hlht.service_seq;

--添加基础数据
insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'个人信息注册、查询服务','个人信息注册服务','S0001','PRPA_IN201311UV02','http://localhost:15555/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'个人信息注册、查询服务','个人信息更新服务','S0002','PRPA_IN201314UV02','http://localhost:15556/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'个人信息注册、查询服务','个人信息合并服务','S0003','PRPA_IN201304UV02','http://localhost:15557/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'个人信息注册、查询服务','个人信息查询服务','S0004','PRPA_IN201305UV02','http://localhost:15558/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'医疗卫生机构注册、查询服务','医疗卫生机构（科室）信息注册服务','S0005','PRPM_IN401030UV01','http://localhost:15559/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'医疗卫生机构注册、查询服务','医疗卫生机构（科室）信息更新服务','S0006','PRPM_IN403010UV01','http://localhost:15560/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'医疗卫生机构注册、查询服务','医疗卫生机构（科室）信息查询服务','S0007','PRPM_IN406010UV01','http://localhost:15561/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'医疗卫生机构注册、查询服务','医疗卫生人员信息注册服务','S0008','PRPM_IN301010UV01','http://localhost:15562/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'医疗卫生机构注册、查询服务','医疗卫生人员信息更新服务','S0009','PRPM_IN303010UV01','http://localhost:15563/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'医疗卫生机构注册、查询服务','医疗卫生人员信息查询服务','S0010','PRPM_IN306010UV01','http://localhost:15564/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'术语注册、查询服务','术语注册服务','S0011','PRVS_IN000001UV01','http://localhost:15565/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'术语注册、查询服务','术语更新服务','S0012','PRVS_IN000002UV01','http://localhost:15566/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'术语注册、查询服务','术语查询服务','S0013','PRVS_IN000003UV01','http://localhost:15567/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'文档注册、查询服务','电子病历文档注册服务','S0014','ProvideAndRegisterDocumentSetRequest','http://localhost:15568/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'文档注册、查询服务','电子病历文档调阅服务','S0015','RetrieveDocumentSetRequest','http://localhost:15569/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'文档注册、查询服务','电子病历文档检索服务','S0016','GetDocumentStroedInfoRequest','http://localhost:15570/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','就诊卡信息新增服务','S0017','PRPA_IN201311UV02','http://localhost:15571/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','就诊卡信息更新服务','S0018','PRPA_IN201314UV02','http://localhost:15572/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','就诊卡信息查询服务','S0019','PRPA_IN201305UV02','http://localhost:15573/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','号源排班信息新增服务','S0020','PRSC_IN030101UV','http://localhost:15574/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','号源排班信息更新服务','S0021','PRSC_IN030102UV','http://localhost:15575/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','号源排班信息查询服务','S0022','PRSC_IN100000UV','http://localhost:15576/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','门诊挂号信息新增服务','S0023','PRPA_IN400001UV','http://localhost:15577/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','门诊挂号信息更新服务','S0024','PRPA_IN400002UV','http://localhost:15578/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','门诊挂号信息查询服务','S0025','PRPA_IN900300UV','http://localhost:15579/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','住院就诊信息登记服务','S0026','PRPA_IN400001UV','http://localhost:15580/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','住院就诊信息更新服务','S0027','PRPA_IN400002UV','http://localhost:15581/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','住院就诊信息查询服务','S0028','PRPA_IN900300UV','http://localhost:15582/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','住院转科信息新增服务','S0029','PRPA_IN302011UV','http://localhost:15583/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','住院转科信息更新服务','S0030','PRPA_IN302012UV','http://localhost:15584/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','住院转科信息查询服务','S0031','PRPA_IN900300UV','http://localhost:15585/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','出院登记信息新增服务','S0032','PRPA_IN400003UV','http://localhost:15586/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','出院登记信息更新服务','S0033','PRPA_IN400002UV','http://localhost:15587/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'就诊信息交互服务','出院登记信息查询服务','S0034','PRPA_IN900300UV','http://localhost:15588/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'医嘱信息交互服务','医嘱信息新增服务','S0035','POOR_IN200901UV','http://localhost:15589/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'医嘱信息交互服务','医嘱信息更新服务','S0036','POOR_IN200902UV','http://localhost:15590/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'医嘱信息交互服务','医嘱信息查询服务','S0037','QUMT_IN020030PL','http://localhost:15591/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','检验申请信息新增服务','S0038','POOR_IN200901UV','http://localhost:15592/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','检验申请信息更新服务','S0039','POOR_IN200902UV','http://localhost:15593/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','检验申请信息查询服务','S0040','QUMT_IN020030PL','http://localhost:15594/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','检查申请信息新增服务','S0041','POOR_IN200901UV','http://localhost:15595/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','检查申请信息更新服务','S0042','POOR_IN200902UV','http://localhost:15596/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','检查申请信息查询服务','S0043','QUMT_IN020030UV01','http://localhost:15597/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','病理申请信息新增服务','S0044','POOR_IN200901UV','http://localhost:15598/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','病理申请信息更新服务','S0045','POOR_IN200902UV','http://localhost:15599/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','病理申请信息查询服务','S0046','QUMT_IN020030UV01','http://localhost:15600/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','输血申请信息新增服务','S0047','POOR_IN200901UV','http://localhost:15601/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','输血申请信息更新服务','S0048','POOR_IN200902UV','http://localhost:15602/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','输血申请信息查询服务','S0049','QUMT_IN020030UV01','http://localhost:15603/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','手术申请信息新增服务','S0050','POOR_IN200901UV','http://localhost:15604/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','手术申请信息更新服务','S0051','POOR_IN200902UV','http://localhost:15605/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'申请单信息交互服务','手术申请信息查询服务','S0052','QUMT_IN020030UV01','http://localhost:15606/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'预约信息交互服务','门诊预约状态信息新增服务','S0053','PRPA_IN410001UV','http://localhost:15607/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'预约信息交互服务','门诊预约状态信息更新服务','S0054','PRPA_IN410002UV','http://localhost:15608/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'预约信息交互服务','门诊预约状态信息查询服务','S0055','PRPA_IN900300UV','http://localhost:15609/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'预约信息交互服务','检查预约状态信息新增服务','S0056','PRSC_IN010101UV01','http://localhost:15610/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'预约信息交互服务','检查预约状态信息更新服务','S0057','PRSC_IN010201UV01','http://localhost:15611/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'预约信息交互服务','检查预约状态信息查询服务','S0058','QUMT_IN020030UV01','http://localhost:15612/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','医嘱执行状态信息更新服务','S0059','POOR_IN200901UV','http://localhost:15613/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','医嘱执行状态信息查询服务','S0060','QUMT_IN020030UV01','http://localhost:15614/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','检查状态信息更新服务','S0061','POOR_IN200902UV','http://localhost:15615/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','检查状态信息查询服务','S0062','QUMT_IN020030UV01','http://localhost:15616/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','检验状态信息更新服务','S0063','POLB_IN224000UV01','http://localhost:15617/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','检验状态信息查询服务','S0064','QUMT_IN020030UV01','http://localhost:15618/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','普通检验结果信息新增服务','S0065','ProvideAndRegisterDocumentSetRequest','http://localhost:15619/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','普通检验结果信息更新服务','S0066','ProvideAndRegisterDocumentSetRequest','http://localhost:15620/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','普通检验结果信息查询服务','S0067','RetrieveDocumentSetRequest','http://localhost:15621/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','药敏检验结果信息新增服务','S0068','ProvideAndRegisterDocumentSetRequest','http://localhost:15622/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','药敏检验结果信息更新服务','S0069','ProvideAndRegisterDocumentSetRequest','http://localhost:15623/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','药敏检验结果信息查询服务','S0070','RetrieveDocumentSetRequest','http://localhost:15624/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','检查结果信息新增服务','S0071','ProvideAndRegisterDocumentSetRequest','http://localhost:15625/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','检查结果信息更新服务','S0072','ProvideAndRegisterDocumentSetRequest','http://localhost:15626/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','检查结果信息查询服务','S0073','RetrieveDocumentSetRequest','http://localhost:15627/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','病理结果信息新增服务','S0074','ProvideAndRegisterDocumentSetRequest','http://localhost:15628/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','病理结果信息更新服务','S0075','ProvideAndRegisterDocumentSetRequest','http://localhost:15629/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','病理结果信息查询服务','S0076','RetrieveDocumentSetRequest','http://localhost:15630/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','手术排班信息新增服务','S0077','PRSC_IN010101UV01','http://localhost:15631/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','手术排班信息更新服务','S0078','PRSC_IN010201UV01','http://localhost:15632/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','手术排班信息查询服务','S0079','QUMT_IN020030UV01','http://localhost:15633/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','手术状态信息更新服务','S0080','POOR_IN200902UV','http://localhost:15634/services/hipMessageServer?wsdl', sysdate, null);
  insert into hlht.service (PK, SERVICE_TYPE,  SERVICE_NAME,SERVICE_CODE, INTERFACE_MODE, SERVICE_ADDR, CREATE_DATE, UPDATE_DATE)
values (hlht.service_seq.nextval,'结果、状态信息交互服务','手术状态信息查询服务','S0081','QUMT_IN020030UV01','http://localhost:15635/services/hipMessageServer?wsdl', sysdate, null);
commit;

-- 调用日志表：Add/modify columns
alter table HLHT.call_log add MSG_CREATE_DATE VARCHAR2(32);
-- Add comments to the columns
comment on column HLHT.OPERATION_CHECK_STATUS.operative_state_code
  is '消息创建时间';

