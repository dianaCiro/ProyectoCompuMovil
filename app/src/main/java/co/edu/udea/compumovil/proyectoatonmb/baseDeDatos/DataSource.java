package co.edu.udea.compumovil.proyectoatonmb.baseDeDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import co.edu.udea.compumovil.proyectoatonmb.Dto.EquipoDao;

/**
 * Created by caterine.ciro on 11/04/16.
 */
public class DataSource extends SQLiteOpenHelper{
    public DataSource(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Usuarios(usuario text primary key,constaseña text, rol text)");
        db.execSQL("CREATE TABLE Equipo(mac text primary key,ip text, descripcion text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST Usuarios");
        db.execSQL("DROP TABLE IF EXIST Equipo");
        db.execSQL("CREATE TABLE Usuarios(usuario text primary key,constaseña text, rol text)");
        db.execSQL("CREATE TABLE Equipo(mac text primary key,ip text, descripcion text)");
    }
}
