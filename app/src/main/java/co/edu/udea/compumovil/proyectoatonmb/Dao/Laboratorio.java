package co.edu.udea.compumovil.proyectoatonmb.Dao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import co.edu.udea.compumovil.proyectoatonmb.R;
import co.edu.udea.compumovil.proyectoatonmb.baseDeDatos.DataSource;

public class Laboratorio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratorio);
        DataSource dataSource=new DataSource(this,"administracion",null,1);
    }
}
