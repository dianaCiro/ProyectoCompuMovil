package co.edu.udea.compumovil.proyectoatonmb.Dao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import co.edu.udea.compumovil.proyectoatonmb.Dto.EquipoDao;
import co.edu.udea.compumovil.proyectoatonmb.Dto.EquipoDto;
import co.edu.udea.compumovil.proyectoatonmb.R;

public class Equipo extends AppCompatActivity {

    EditText edtMac;
    EditText edtIP;
    EditText edtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipo);
        edtMac=(EditText)findViewById(R.id.txtMac);
        edtIP=(EditText)findViewById(R.id.txtIp);
        edtDescripcion=(EditText)findViewById(R.id.txtDescripcion);


    }
    public void insertar(View v){



        EquipoDao dao = new EquipoDao();
        EquipoDto equipoDto=new EquipoDto();
        equipoDto.setMac(edtMac.getText().toString());
        equipoDto.setIp(edtIP.getText().toString());
        equipoDto.setDescripcion(edtDescripcion.getText().toString());
        dao.insertar(equipoDto, this);

    }
    public void obtener(View v){
        EquipoDao dao = new EquipoDao();
        dao.mostrar(this);
    }
}
