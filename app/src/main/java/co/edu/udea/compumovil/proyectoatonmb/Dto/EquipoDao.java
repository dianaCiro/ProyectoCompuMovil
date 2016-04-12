package co.edu.udea.compumovil.proyectoatonmb.Dto;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Toast;

import co.edu.udea.compumovil.proyectoatonmb.baseDeDatos.DataSource;

/**
 * Created by caterine.ciro on 11/04/16.
 */
public class EquipoDao {

    public void insertar(EquipoDto equipo,Context context){
        DataSource dataSource=new DataSource(context,"administracion",null,1);
        SQLiteDatabase db = dataSource.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("mac",equipo.getMac());
        values.put("ip",equipo.getIp());
        values.put("descripcion",equipo.getDescripcion());
        db.insert("Equipo", null, values);
        db.close();

        Toast.makeText(context,"Equipo registrado!!",Toast.LENGTH_SHORT).show();

    }
    public void mostrar(Context context){
        DataSource dataSource=new DataSource(context,"administracion",null,1);
        SQLiteDatabase db = dataSource.getWritableDatabase();

        Cursor fila=db.rawQuery("SELECT mac,ip,descripcion FROM Equipo WHERE 1==1", null);

        if(fila.moveToFirst()){
            String nombre= fila.getString(0);
            Toast.makeText(context,"Esto retorno: "+nombre,Toast.LENGTH_LONG).show();
        }else {

            Toast.makeText(context, "No se ha encontrado nadaaa!!", Toast.LENGTH_LONG).show();
        }
        db.close();

    }
}
