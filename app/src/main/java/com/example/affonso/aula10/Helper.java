package com.example.affonso.aula10;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by Affonso on 17/03/2016.
 */
public class Helper extends OrmLiteSqliteOpenHelper{
    private static final String NOME = "ayty";
    private static final int VERSAO = 2;

    public Helper(Context context) {
        super(context, NOME, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Professor.class);
            TableUtils.createTable(connectionSource, Aluno.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        try {
            TableUtils.dropTable(connectionSource, Aluno.class, true);
            TableUtils.dropTable(connectionSource, Professor.class, true);
            onCreate(sqLiteDatabase, connectionSource);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}