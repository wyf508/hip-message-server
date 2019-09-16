package com.djhu.hiup.message.server.core.dao;


import com.djhu.hiup.message.server.core.model.Patient;

public interface IEmpiDao {

    int getEmpiCount(String newEmpi);

    void discardEmpiByEmpiPk(String discardEmpi);

    int insertSelective(Patient record);

    int updateSelective(Patient patient);
}