--第一部分:电子病历卫生部数据集数据元与岱嘉数据元映射关系表
--17个电子病历基本数据集(2014文档不包含第一个：HDSD00.01)
select tmd.mdhc_set_mdcode,tmd.mdhc_set_mdname
  from AXDS.Tb_Mdhc_Data tmd
 where mdhc_set_mdcode like 'HDSD%'and  mdhc_set_mdcode !='HDSD00.01'
 group by tmd.mdhc_set_mdcode,tmd.mdhc_set_mdname
 order by tmd.mdhc_set_mdcode,tmd.mdhc_set_mdname

--58子集
select tmd.mdhc_set_subcode,tmd.mdhc_set_subset
  from AXDS.Tb_Mdhc_Data tmd
 where mdhc_set_mdcode like 'HDSD%' and  mdhc_set_mdcode !='HDSD00.01'
 group by tmd.mdhc_set_subcode,tmd.mdhc_set_subset
 order by tmd.mdhc_set_subcode,tmd.mdhc_set_subset

--数据集--子集--数据元
select tmd.mdhc_set_mdcode as 数据集编码,
       tmd.mdhc_set_mdname as 数据集,
       tmd.mdhc_set_subcode as 子集编码,
       tmd.mdhc_set_subset as 子集,
       mdhc_meta_mdcode as 数据元标识,
       mdhc_meta_mdname as 数据元名称,
       mdhc_meta_type as 数据元数据类型,
       mdhc_meta_allow as 数据元值域,
       mdhc_meta_format  as 数据元表示格式
  from AXDS.Tb_Mdhc_Data tmd
 where mdhc_set_mdcode like 'HDSD%'
   and mdhc_set_mdcode != 'HDSD00.01'
 order by tmd.mdhc_set_mdcode,
          tmd.mdhc_set_mdname,
          tmd.mdhc_set_subcode,
          tmd.mdhc_set_subset,
          mdhc_meta_mdcode,
          mdhc_meta_mdname,
          mdhc_meta_type,
          mdhc_meta_allow,
          mdhc_meta_format
          

--1：标准数据集管理--电子病历基本数据集查阅          
--1.1）：左侧显示内容
select '电子病历基本数据集' as 标准规范,
       tmd.mdhc_set_mdcode as 数据集编码,
       tmd.mdhc_set_mdname as 数据集,
       tmd.mdhc_set_subcode as 子集编码,
       tmd.mdhc_set_subset as 子集
  from AXDS.Tb_Mdhc_Data tmd
 where mdhc_set_mdcode like 'HDSD%'
   and mdhc_set_mdcode != 'HDSD00.01'
   --判断输入：数据集名称关键字动态添加下面条件
   and mdhc_set_mdname like '%%'
 group by tmd.mdhc_set_mdcode,
          tmd.mdhc_set_mdname,
          tmd.mdhc_set_subcode,
          tmd.mdhc_set_subset
 order by tmd.mdhc_set_mdcode,
          tmd.mdhc_set_mdname,
          tmd.mdhc_set_subcode,
          tmd.mdhc_set_subset
          
--1.2）：参考页面右侧显示内容
----判断输入：数据元名称关键字动态过滤（前端定义变量缓存该内容，进行过滤即可）
select mdhc_meta_mdcode as 数据元标识,
       mdhc_meta_mdname as 数据元名称,
       mdhc_meta_define as 数据元定义,
       mdhc_meta_type   as 数据元数据类型,
       mdhc_meta_allow  as 数据元允许值,
       mdhc_meta_format as 数据元表示格式
  from AXDS.Tb_Mdhc_Data tmd
 where mdhc_set_mdcode like 'HDSD%'
   and mdhc_set_mdcode != 'HDSD00.01'
   --选择左侧内容，参数传递到下面条件
   and tmd.mdhc_set_mdcode = '数据集编码（查询动态输入参数）'
   and tmd.mdhc_set_subcode = '子集编码（查询动态输入参数）'
 order by mdhc_meta_mdcode,
          mdhc_meta_mdname,
          mdhc_meta_define,
          mdhc_meta_type,
          mdhc_meta_allow,
          mdhc_meta_format
          
          
          select tmd.mdhc_meta_define
  from AXDS.Tb_Mdhc_Data tmd
           
--1.3）：值域表          
select trd.range_value,trd.range_value_mean
  from axds.tb_range_data trd
 where trd.range_code='数据元允许值（查询动态输入参数）'
 
 
--2：共享文档管理       
--2.1）：电子病历共享文档查阅
--2.1.1）：查询报告
select PK                 as 自增主键,
       DOC_TYPE_ID        as 文档类型代码,
       DOC_TYPE_DEPICT    as 文档类型描述,
       CREATE_TIME        as 创建时间,
       UPDATE_TIME        as 修改时间,
       PATIENT_VISIT_TIME as 患者就诊日期时间,
       DEPT_CODE          as 科室代码,
       INPATIENT_NO       as 住院号标识,
       OUTPATIENT_NO      as 门诊号标识,
       DOC_FLOW_NO        as 文档流水号,
       SYSTEM_DIR_PK      as 系统目录主键,
       DOC_PATH           as 文档地址
  from hlht.doc;
  
--2.1.2）：查询患者信息  
  select e.EMPI           as 患者唯一标识,
       e.NAME           as 姓名,
       e.IDENTITY_NO    as 身份证号,
       e.DATE_OF_BIRTH  as 出生时间,
       e.CONTACT_NUMBER as 联系电话,
       e.ADDR           as 非结构化地址,
       e.patient_id,
       e.status_code
  from EMPI e
 where e.status_code != 'obsolete'
   and e.empi in (select empi
                    from hlht.patient p
                   where p.status_code != 'obsolete'
                     and p.patient_id = 'doc_patient_id（查询动态输入参数）')
                     
                     
--2.1.3）：判断住院号/门诊号是否为空，查询就诊科室  
--住院号
select dept_id, dept_name
  from VISIT_INPATIENT_VISIT
 where INPATIENT_NO = '住院号（查询动态输入参数）'
 --门诊号
select dept_id, dept_name
  from VISIT_OUTPATIENT_REGISTER
 where DOOR_EMERGENCY_NO = '门诊号（查询动态输入参数）'
                     

--2.2）：电子病历共享文档模板设置
--待交互稿确定后，根据交互稿进行处理

 
--3：互联互通服务管理          
--3.1）：互联互通服务列表
select SERVICE_TYPE as 服务类型 from hlht.service group by SERVICE_TYPE;

select PK             as 自增主键,
       SERVICE_TYPE   as 服务类型,
       SERVICE_CODE   as 服务代码,
       SERVICE_NAME   as 服务名称,
       INTERFACE_MODE as 接口模型,
       SERVICE_ADDR   as 服务地址,
       CREATE_DATE    as 创建时间,
       UPDATE_DATE    as 更新时间
  from hlht.service
 where SERVICE_TYPE = '服务类型（查询动态输入参数）'
   and SERVICE_NAME = '服务名称（查询动态输入参数）'

update hlht.service
   set SERVICE_TYPE   = '服务类型（更新动态输入参数）',
       SERVICE_CODE   = '服务代码（更新动态输入参数）',
       SERVICE_NAME   = '服务名称（更新动态输入参数）',
       INTERFACE_MODE = '接口模型（更新动态输入参数）',
       SERVICE_ADDR   = '服务地址（更新动态输入参数）',
       CREATE_DATE    = '创建时间（更新动态输入参数）',
       UPDATE_DATE    = '更新时间（更新动态输入参数）'
 where PK = '自增主键（更新动态输入参数）'

--3.2）：服务运行性能
select PK              as 自增主键,
       SERVICE_CODE    as 服务代码,
       SERVICE_COMMENT as 服务说明,
       MSG_ID          as 消息ID,
       SENDER_ID       as 发送者ID,
       MSG_CREATE_DATE as 发送时间,
       SYSTEM_DIR_PK   as 系统目录主键,
       MSG_PATH        as 消息地址,
       RECEIVER_ID     as 接收者ID,
       CREATE_DATE     as 接收时间,
       UPDATE_DATE     as 响应时间
  from hlht.call_log
  where SERVICE_CODE='服务代码（查询动态输入参数）'

