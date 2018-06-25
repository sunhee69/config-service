package com.pccth.testdb.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pccth.testdb.model.GenAppealId;
import com.pccth.testdb.service.GenAppealIdSevice;

@Service
@Transactional
public class GenAppealIdSeviceImp  implements GenAppealIdSevice{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public List<GenAppealId> findAll() {
        List<GenAppealId> result = jdbcTemplate.query("SELECT * FROM EGPAPPEAL.GEN_APPEAL_ID",
               (rs, rowNum) -> new GenAppealId(rs.getString("BUDGET_YEAR"), rs.getInt("RUNNING_NO"))
        );
        return result;

    }
}
