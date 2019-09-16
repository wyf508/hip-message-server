#功能
## 互联互通服务程序 ##
- 接收报告信息
- 查询报告信息

#数据库
- 互联互通交互服务输入参数对应表在HLHT用户下
- ATS_ES.Tb_Mdhc_Data（电子病历卫生部数据集数据元与岱嘉数据元映射关系表，依据：电子病历基本数据集，描述数据集--子集--数据元关系），TB_INTE_MAPPING_MDHC（岱嘉数据元映射表）
- 上面是字典，真实数据在HLHT_GATE用户下，HLHT_GATE用户下表根据ATS_ES.Tb_Mdhc_Data表中的子集编码（表名）及所对应数据元（列）进行创建
- 数据集子集和电子病历共享文档关联关系：多数情况，一个数据元子集对应一个电子病历共享文档类型，少数情况，多个数据元子集对应一个电子病历共享文档类型



#约定
- 程序名称：hip-message-server-service
- 文件编码：UTF-8
- 编译环境：JDK1.8

#打包发布说明
- 直接install即可，会生成zip压缩文件
- zip及附带环境一起发给现场即可，比如：数据库文件、jre、activeMp
- 除程序依赖环境外，现场解压zip，修改config下面的配置文件，双击startup.bat即可

#使用方法说明
- 定制化：需要配置datax3(服务vm模板、json)，详情查看doc文件夹下的配置手册
- 标准：直接调用服务端，详情查看doc文件夹下的配置手册


#注意事项
- config/xml2Json/以下文件配置，门诊住院相关域可能需要根据现场实际情况配置修改（AddActOrder.properties、ActOrderQuery.properties、AddActRequest.properties、ActRequestQuery.properties）

#问题排查
-

#已知问题
-

#TO DO


