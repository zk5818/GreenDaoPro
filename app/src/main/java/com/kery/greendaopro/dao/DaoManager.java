package com.kery.greendaopro.dao;

/**
 * Created by Administrator on 2018/11/21.
 */


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import org.greenrobot.greendao.database.Database;

/**
 * Created by admin on 2017/9/19.
 */

public class DaoManager {
    private final static String dbName = "student_db";
    private static DaoManager mInstance;
    private DaoMaster.OpenHelper openHelper;
    private Context context;
    private  DaoSession mDaoSession;

    public DaoManager(Context context) {
        this.context = context;
        openHelper = new DaoMaster.OpenHelper(context, dbName, null) {};
    }

    /**
     * 获取单例引用
     *
     * @param context
     * @return
     */
    public static DaoManager getInstance(Context context) {
        if (mInstance == null) {
            synchronized (DaoManager.class) {
                if (mInstance == null) {
                    mInstance = new DaoManager(context);
                }
            }
        }
        return mInstance;
    }

    /**
     * 获取可读数据库
     */
    private SQLiteDatabase getReadableDatabase() {
        if (openHelper == null) {
            openHelper = new MySQLiteOpenHelper(context, dbName, null);
        }
        SQLiteDatabase db = openHelper.getReadableDatabase();
        return db;
    }

    /**
     * 获取可写数据库
     */
    private SQLiteDatabase getWritableDatabase() {
        if (openHelper == null) {
            openHelper = new MySQLiteOpenHelper(context, dbName, null);
        }
        SQLiteDatabase db = openHelper.getWritableDatabase();
        return db;
    }

    public void deleSQL() {
        SQLiteDatabase db = getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        DaoMaster.dropAllTables(daoMaster.getDatabase(), true);
        DaoMaster.createAllTables(daoMaster.getDatabase(), true);

    }

    class MySQLiteOpenHelper extends DaoMaster.OpenHelper {

        @Override
        public void onCreate(Database db) {
            super.onCreate(db);
        }

        public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
            super(context, name, factory);
        }
    }

}

