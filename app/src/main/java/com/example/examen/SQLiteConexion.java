package com.example.examen;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.example.examen.transacciones.Transacciones;

public class SQLiteConexion extends SQLiteOpenHelper{
    public SQLiteConexion(Context context, String dbname, SQLiteDatabase.CursorFactory factory, int version){
        super(context,dbname,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Transacciones.CreateTableContactos);
        db.execSQL(Transacciones.CreateTablePaises);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Transacciones.DropTableContactos);
        db.execSQL(Transacciones.DropTablePaises);
        onCreate(db);
    }
}
