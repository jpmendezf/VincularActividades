package spa.seccionuno.vincularactividades;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vincular a SegundaActivity forma 1
        //Intent i= new Intent("spa.seccionuno.vincularactividades.SegundaActivity");
        //startActivity(i);


        //Vincular a SegundaActivity forma 2
        //Intent idos= new Intent();
        //idos.setAction("spa.seccionuno.vincularactividades.SegundaActivity");
        //startActivity(idos);

        //Vincular a SegundaActivity forma 3
        //Intent itres= new Intent(this,SegundaActivity.class);
        //startActivity(itres);

        //Vincular a SegundaActivity forma 4
        Intent icuatro= new Intent("spa.seccionuno.vincularactividades.SegundaActivity");
        startActivity(Intent.createChooser( icuatro,"Escoge una aplicacion"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
