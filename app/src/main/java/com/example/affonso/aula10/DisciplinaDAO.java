package com.example.affonso.aula10;


import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Affonso on 27/03/2016.
 */
    public class DisciplinaDAO extends BaseDaoImpl<Disciplina, Integer> {
        public DisciplinaDAO(ConnectionSource connectionSource) throws SQLException {
            super(Disciplina.class);
            setConnectionSource(connectionSource);
            initialize();
        }

        @Override
        public QueryBuilder<Disciplina, Integer> queryBuilder(){
            return super.queryBuilder();
        }
        @Override
        public List<Disciplina> query(PreparedQuery<Disciplina> preparedQuery) throws SQLException{
            return super.query(preparedQuery);

        }
}
