--comment on table AXDS.TB_MDHC_DATA
  --is '卫生部数据集数据元与岱嘉数据元映射关系表';


--个人信息
delete from PATIENT;
--科室
delete from DEPT;
--人员
delete from PERSONNEL;
--术语
delete from TERM;
--文档
delete from DOC;

--就诊信息——就诊卡
delete from VISIT_MEDICAL_CARD;
--就诊信息——号源
delete from VISIT_NUMBER_SOURCE;
--就诊信息——门诊挂号
delete from VISIT_OUTPATIENT_REGISTER;
--就诊信息——住院就诊
delete from VISIT_INPATIENT_VISIT;
--就诊信息----住院就诊----诊断
delete from INPATIENT_VISIT_DIAGNOSIS;

--就诊信息——转科
delete from VISIT_TRANSFER_DEPT;
--就诊信息——出院
delete from VISIT_LEAVE_HOSPITAL;
--就诊信息——出院-----诊断
delete from LEAVE_HOSPITAL_DIAGNOSIS;

--医嘱
delete from ORDERS;


--申请单——检验
delete from REQUEST_LIS;
--申请单——检验----检验项目
delete from LIS_INSPECTION_ITEM;
--申请单——检查
delete from REQUEST_RIS;
--申请单——检查----检查项目
delete from RIS_CHECK_ITEM;
--申请单——病理
delete from REQUEST_PIS;
--申请单——病理----检查项目
delete from PIS_CHECK_ITEM;
--申请单——病理----取材部位
delete from PIS_DRAWING_PARTS;
--申请单——病理----联系人
delete from PIS_CONTACT_PERSON;

--申请单——输血
delete from REQUEST_BLOOD_TRANSFUSION;
--申请单——手术
delete from REQUEST_OPERATION;
--申请单——手术----检查项目
delete from OPERATION_CHECK_ITEM;


--预约——门诊
delete from RESERVE_OUTPATIENT;
--预约——检查
delete from RESERVE_RIS;


--状态——医嘱
delete from STATUS_ORDER_EXEC;
--状态----检查
delete from STATUS_RIS;
--状态----检查----检查状态
delete from RIS_CHECK_STATUS;
--状态----检验
delete from STATUS_LIS;
--状态——手术排班
delete from STATUS_OPERATION_SCHEDULING;
--状态——手术
delete from STATUS_OPERATION;
--状态——手术----检查状态
delete from OPERATION_CHECK_STATUS;

commit;



--个人信息
select * from PATIENT;
--科室
select * from DEPT;
--人员
select * from PERSONNEL;
--术语
select * from TERM;
--文档
select * from DOC;

--就诊信息——就诊卡
select * from VISIT_MEDICAL_CARD;
--就诊信息——号源
select * from VISIT_NUMBER_SOURCE;
--就诊信息——门诊挂号
select * from VISIT_OUTPATIENT_REGISTER;
--就诊信息——住院就诊
select * from VISIT_INPATIENT_VISIT;
--就诊信息----住院就诊----诊断
select * from INPATIENT_VISIT_DIAGNOSIS;

--就诊信息——转科
select * from VISIT_TRANSFER_DEPT;
--就诊信息——出院
select * from VISIT_LEAVE_HOSPITAL;
--就诊信息——出院-----诊断
select * from LEAVE_HOSPITAL_DIAGNOSIS;

--医嘱
select * from ORDERS;


--申请单——检验
select * from REQUEST_LIS;
--申请单——检验----检验项目
select * from LIS_INSPECTION_ITEM;
--申请单——检查
select * from REQUEST_RIS;
--申请单——检查----检查项目
select * from RIS_CHECK_ITEM;
--申请单——病理
select * from REQUEST_PIS;
--申请单——病理----检查项目
select * from PIS_CHECK_ITEM;
--申请单——病理----取材部位
select * from PIS_DRAWING_PARTS;
--申请单——病理----联系人
select * from PIS_CONTACT_PERSON;

--申请单——输血
select * from REQUEST_BLOOD_TRANSFUSION;
--申请单——手术
select * from REQUEST_OPERATION;
--申请单——手术----检查项目
select * from OPERATION_CHECK_ITEM;


--预约——门诊
select * from RESERVE_OUTPATIENT;
--预约——检查
select * from RESERVE_RIS;


--状态——医嘱
select * from STATUS_ORDER_EXEC;
--状态----检查
select * from STATUS_RIS;
--状态----检查----检查状态
select * from RIS_CHECK_STATUS;
--状态----检验
select * from STATUS_LIS;
--状态——手术排班
select * from STATUS_OPERATION_SCHEDULING;
--状态——手术
select * from STATUS_OPERATION;
--状态——手术----检查状态
select * from OPERATION_CHECK_STATUS;

