package com.svs.sportscalculator.primera;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.svs.sportscalculator.Adaptador;
import com.svs.sportscalculator.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class LigaEsp1ClasCalc extends ActionBarActivity {

    ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
    ArrayList<Integer> id = new ArrayList<Integer>();
    ArrayList<String> nom = new ArrayList<String>();
    ArrayList<Integer> pts = new ArrayList<Integer>();
    //ArrayList<Integer> pos = new ArrayList<Integer>();
    ArrayList<Integer> pj = new ArrayList<Integer>();
    ArrayList<Integer> gf = new ArrayList<Integer>();
    ArrayList<Integer> dg = new ArrayList<Integer>();
    ArrayList<Integer> dg1 = new ArrayList<Integer>();ArrayList<Integer> dg2 = new ArrayList<Integer>();
    ArrayList<Integer> dg3 = new ArrayList<Integer>();ArrayList<Integer> dg4 = new ArrayList<Integer>();
    ArrayList<Integer> dg5 = new ArrayList<Integer>();ArrayList<Integer> dg6 = new ArrayList<Integer>();
    ArrayList<Integer> dg7 = new ArrayList<Integer>();ArrayList<Integer> dg8 = new ArrayList<Integer>();
    ArrayList<Integer> dg9 = new ArrayList<Integer>();ArrayList<Integer> dg10 = new ArrayList<Integer>();
    ArrayList<Integer> dg11 = new ArrayList<Integer>();ArrayList<Integer> dg12 = new ArrayList<Integer>();
    ArrayList<Integer> dg13 = new ArrayList<Integer>();ArrayList<Integer> dg14 = new ArrayList<Integer>();
    ArrayList<Integer> dg15 = new ArrayList<Integer>();ArrayList<Integer> dg16 = new ArrayList<Integer>();
    ArrayList<Integer> dg17 = new ArrayList<Integer>();ArrayList<Integer> dg18 = new ArrayList<Integer>();
    ArrayList<Integer> dg19 = new ArrayList<Integer>();ArrayList<Integer> dg20 = new ArrayList<Integer>();
    ArrayList<Integer> jugados1 = new ArrayList<Integer>();ArrayList<Integer> jugados2 = new ArrayList<Integer>();
    ArrayList<Integer> jugados3 = new ArrayList<Integer>();ArrayList<Integer> jugados4 = new ArrayList<Integer>();
    ArrayList<Integer> jugados5 = new ArrayList<Integer>();ArrayList<Integer> jugados6 = new ArrayList<Integer>();
    ArrayList<Integer> jugados7 = new ArrayList<Integer>();ArrayList<Integer> jugados8 = new ArrayList<Integer>();
    ArrayList<Integer> jugados9 = new ArrayList<Integer>();ArrayList<Integer> jugados10 = new ArrayList<Integer>();
    ArrayList<Integer> jugados11 = new ArrayList<Integer>();ArrayList<Integer> jugados12 = new ArrayList<Integer>();
    ArrayList<Integer> jugados13 = new ArrayList<Integer>();ArrayList<Integer> jugados14 = new ArrayList<Integer>();
    ArrayList<Integer> jugados15 = new ArrayList<Integer>();ArrayList<Integer> jugados16 = new ArrayList<Integer>();
    ArrayList<Integer> jugados17 = new ArrayList<Integer>();ArrayList<Integer> jugados18 = new ArrayList<Integer>();
    ArrayList<Integer> jugados19 = new ArrayList<Integer>();ArrayList<Integer> jugados20 = new ArrayList<Integer>();

    ArrayList<Partido> listaPartidos = new ArrayList<Partido>();
    ArrayList<Integer> idPartido = new ArrayList<Integer>();
    ArrayList<Integer> golesL = new ArrayList<Integer>();
    ArrayList<Integer> golesV = new ArrayList<Integer>();
    ArrayList<String> fecha = new ArrayList<String>();
    ArrayList<Integer> idEquipoL = new ArrayList<Integer>();
    ArrayList<Integer> idEquipoV = new ArrayList<Integer>();
    ArrayList<Integer> jornada = new ArrayList<Integer>();

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_liga_esp1_clas_calc);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        //actionBar.hide();

        Bundle bundle = getIntent().getExtras();
        id = bundle.getIntegerArrayList("bundleId");
        nom = bundle.getStringArrayList("bundleNom");
        pts = bundle.getIntegerArrayList("bundlePts");
        //pos = bundle.getIntegerArrayList("bundlePos");
        pj = bundle.getIntegerArrayList("bundlePj");
        gf = bundle.getIntegerArrayList("bundleGf");
        dg = bundle.getIntegerArrayList("bundleDg");
        dg1 = bundle.getIntegerArrayList("bundleDg1");dg2 = bundle.getIntegerArrayList("bundleDg2");
        dg3 = bundle.getIntegerArrayList("bundleDg3");dg4 = bundle.getIntegerArrayList("bundleDg4");
        dg5 = bundle.getIntegerArrayList("bundleDg5");dg6 = bundle.getIntegerArrayList("bundleDg6");
        dg7 = bundle.getIntegerArrayList("bundleDg7");dg8 = bundle.getIntegerArrayList("bundleDg8");
        dg9 = bundle.getIntegerArrayList("bundleDg9");dg10 = bundle.getIntegerArrayList("bundleDg10");
        dg11 = bundle.getIntegerArrayList("bundleDg11");dg12 = bundle.getIntegerArrayList("bundleDg12");
        dg13 = bundle.getIntegerArrayList("bundleDg13");dg14 = bundle.getIntegerArrayList("bundleDg14");
        dg15 = bundle.getIntegerArrayList("bundleDg15");dg16 = bundle.getIntegerArrayList("bundleDg16");
        dg17 = bundle.getIntegerArrayList("bundleDg17");dg18 = bundle.getIntegerArrayList("bundleDg18");
        dg19 = bundle.getIntegerArrayList("bundleDg19");dg20 = bundle.getIntegerArrayList("bundleDg20");
        jugados1 = bundle.getIntegerArrayList("bundleJUG1");jugados2 = bundle.getIntegerArrayList("bundleJUG2");
        jugados3 = bundle.getIntegerArrayList("bundleJUG3");jugados4 = bundle.getIntegerArrayList("bundleJUG4");
        jugados5 = bundle.getIntegerArrayList("bundleJUG5");jugados6 = bundle.getIntegerArrayList("bundleJUG6");
        jugados7 = bundle.getIntegerArrayList("bundleJUG7");jugados8 = bundle.getIntegerArrayList("bundleJUG8");
        jugados9 = bundle.getIntegerArrayList("bundleJUG9");jugados10 = bundle.getIntegerArrayList("bundleJUG10");
        jugados11 = bundle.getIntegerArrayList("bundleJUG11");jugados12 = bundle.getIntegerArrayList("bundleJUG12");
        jugados13 = bundle.getIntegerArrayList("bundleJUG13");jugados14 = bundle.getIntegerArrayList("bundleJUG14");
        jugados15 = bundle.getIntegerArrayList("bundleJUG15");jugados16 = bundle.getIntegerArrayList("bundleJUG16");
        jugados17 = bundle.getIntegerArrayList("bundleJUG17");jugados18 = bundle.getIntegerArrayList("bundleJUG18");
        jugados19 = bundle.getIntegerArrayList("bundleJUG19");jugados20 = bundle.getIntegerArrayList("bundleJUG20");

        idPartido = bundle.getIntegerArrayList("bundleIdPartido");
        golesL = bundle.getIntegerArrayList("bundleGolesL");
        golesV = bundle.getIntegerArrayList("bundleGolesV");
        fecha = bundle.getStringArrayList("bundleFecha");
        idEquipoL = bundle.getIntegerArrayList("bundleIdEquipoL");
        idEquipoV = bundle.getIntegerArrayList("bundleIdEquipoV");
        jornada = bundle.getIntegerArrayList("bundleJornada");

        int escudos[] = {R.drawable.atl, R.drawable.bar, R.drawable.mad, R.drawable.vil, R.drawable.cel,
                R.drawable.eib, R.drawable.sev, R.drawable.dep, R.drawable.ath, R.drawable.get,
                R.drawable.val, R.drawable.mal, R.drawable.rso, R.drawable.esp, R.drawable.bet,
                R.drawable.pal, R.drawable.gra, R.drawable.ray, R.drawable.spo, R.drawable.lev};

        for(int i=0; i<20; i++) {
            listaEquipos.add(new Equipo(id.get(i), nom.get(i), escudos[i], pts.get(i)/*, pos.get(i)*/, pj.get(i), gf.get(i), dg.get(i),
                    dg1.get(i), dg2.get(i), dg3.get(i), dg4.get(i), dg5.get(i),
                    dg6.get(i), dg7.get(i), dg8.get(i), dg9.get(i), dg10.get(i),
                    dg11.get(i), dg12.get(i), dg13.get(i), dg14.get(i), dg15.get(i),
                    dg16.get(i), dg17.get(i), dg18.get(i), dg19.get(i), dg20.get(i),
                    jugados1.get(i), jugados2.get(i), jugados3.get(i), jugados4.get(i), jugados5.get(i),
                    jugados6.get(i), jugados7.get(i), jugados8.get(i), jugados9.get(i), jugados10.get(i),
                    jugados11.get(i), jugados12.get(i), jugados13.get(i), jugados14.get(i), jugados15.get(i),
                    jugados16.get(i), jugados17.get(i), jugados18.get(i), jugados19.get(i), jugados20.get(i)));
        }

        for(int i=0; i<380; i++) {
            listaPartidos.add(new Partido(idPartido.get(i), listaEquipos.get(idEquipoL.get(i) - 1), listaEquipos.get(idEquipoV.get(i) - 1),
                    idEquipoL.get(i) - 1, idEquipoV.get(i) - 1,
                    listaEquipos.get(idEquipoL.get(i) - 1).getNombre(), listaEquipos.get(idEquipoV.get(i) - 1).getNombre(),
                    golesL.get(i), golesV.get(i), fecha.get(i), jornada.get(i), escudos[idEquipoL.get(i) - 1], escudos[idEquipoV.get(i) - 1]));
        }

        Collections.sort(listaEquipos, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo e1, Equipo e2) {
                return new Integer(e2.getPts()).compareTo(new Integer(e1.getPts()));
            }
        });

        calculateClassification();

        lista = (ListView) findViewById(R.id.ListViewClasificacionCalculada);

        lista.setAdapter(new Adaptador(this, R.layout.entradaclasificacion, listaEquipos) {
            @Override
            public void onEntrada(Object entrada, View view) {
                if(entrada != null) {
                    TextView pos = (TextView) view.findViewById(R.id.posicion);
                    if(pos != null)
                        pos.setText(String.valueOf(listaEquipos.indexOf(entrada)+1));
                    ImageView escudo = (ImageView) view.findViewById(R.id.escudo);
                    if(escudo != null)
                        escudo.setImageResource(((Equipo) entrada).getIdImagen());
                    TextView nombre = (TextView) view.findViewById(R.id.nombreEquipo);
                    if(nombre != null)
                        nombre.setText(((Equipo) entrada).getNombre());
                    TextView punto = (TextView) view.findViewById(R.id.puntosEquipo);
                    if(punto != null)
                        punto.setText(String.valueOf(((Equipo) entrada).getPts()));
                }
            }
        });
    }

    public void calculateClassification(){
        //Inicio cuádruple empate a puntos:
        for(int i=0; i<17; i++){
            if(listaEquipos.get(i).getPts() == listaEquipos.get(i+3).getPts()){
                Equipo equipo1= listaEquipos.get(i);
                Equipo equipo2 = listaEquipos.get(i + 1);
                Equipo equipo3 = listaEquipos.get(i + 2);
                Equipo equipo4 = listaEquipos.get(i + 3);
                int pts1 = 0;
                int pts2 = 0;
                int pts3 = 0;
                int pts4 = 0;
                int dif1 = 0;
                int dif2 = 0;
                int dif3 = 0;
                int dif4 = 0;
                for(int j=0; j<380; j++){
                    if((listaPartidos.get(j).getLocal())==equipo1){
                        if(listaPartidos.get(j).getVisitante()==equipo2){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts1 = pts1+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts2 = pts2+3;
                            }else{
                                pts1 = pts1+1;
                                pts2 = pts2+1;
                            }
                            dif1 = dif1+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif2 = dif2+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }else if(listaPartidos.get(j).getVisitante()==equipo3){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts1 = pts1+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts3 = pts3+3;
                            }else{
                                pts1 = pts1+1;
                                pts3 = pts3+1;
                            }
                            dif1 = dif1+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif3 = dif3+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }else if(listaPartidos.get(j).getVisitante()==equipo4){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts1 = pts1+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts4 = pts4+4;
                            }else{
                                pts1 = pts1+1;
                                pts4 = pts4+1;
                            }
                            dif1 = dif1+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif4 = dif4+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }
                    }else if((listaPartidos.get(j).getLocal())==equipo2){
                        if(listaPartidos.get(j).getVisitante()==equipo1){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts2 = pts2+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts1 = pts1+3;
                            }else{
                                pts1 = pts1+1;
                                pts2 = pts2+1;
                            }
                            dif2 = dif2+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif1 = dif1+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }else if(listaPartidos.get(j).getVisitante()==equipo3){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts2 = pts2+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts3 = pts3+3;
                            }else{
                                pts2 = pts2+1;
                                pts3 = pts3+1;
                            }
                            dif2 = dif2+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif3 = dif3+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }else if(listaPartidos.get(j).getVisitante()==equipo4){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts2 = pts2+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts4 = pts4+4;
                            }else{
                                pts1 = pts1+1;
                                pts4 = pts4+1;
                            }
                            dif2 = dif2+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif4 = dif4+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }
                    }else if((listaPartidos.get(j).getLocal())==equipo3){
                        if(listaPartidos.get(j).getVisitante()==equipo1){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts3 = pts3+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts1 = pts1+3;
                            }else{
                                pts1 = pts1+1;
                                pts3 = pts3+1;
                            }
                            dif3 = dif3+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif1 = dif1+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }else if(listaPartidos.get(j).getVisitante()==equipo2){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts3 = pts3+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts2 = pts2+3;
                            }else{
                                pts2 = pts2+1;
                                pts3 = pts3+1;
                            }
                            dif3 = dif3+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif2 = dif2+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }else if(listaPartidos.get(j).getVisitante()==equipo4){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts3 = pts3+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts4 = pts4+4;
                            }else{
                                pts3 = pts3+1;
                                pts4 = pts4+1;
                            }
                            dif3 = dif3+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif4 = dif4+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }
                    }else if((listaPartidos.get(j).getLocal())==equipo4){
                        if(listaPartidos.get(j).getVisitante()==equipo1){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts4 = pts4+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts1 = pts1+3;
                            }else{
                                pts1 = pts1+1;
                                pts4 = pts4+1;
                            }
                            dif4 = dif4+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif1 = dif1+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }else if(listaPartidos.get(j).getVisitante()==equipo2){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts4 = pts4+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts2 = pts2+3;
                            }else{
                                pts4 = pts4+1;
                                pts2 = pts2+1;
                            }
                            dif4 = dif4+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif2 = dif2+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }else if(listaPartidos.get(j).getVisitante()==equipo3){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts4 = pts4+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts3 = pts3+4;
                            }else{
                                pts3 = pts3+1;
                                pts4 = pts4+1;
                            }
                            dif4 = dif4+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif3 = dif3+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }
                    }
                }
                Log.e("TEST","i___ "+i);
                Log.e("TEST","dif1: "+dif1);
                Log.e("TEST","dif2: "+dif2);
                Log.e("TEST","dif3: "+dif3);
                Log.e("TEST","dif4: "+dif4);
                if((pts1>pts2)&&(pts2>pts4)&&(pts4>pts3)){
                    intercambiarPos(listaEquipos, i+2);
                    i = 0;
                }else if((pts1>pts3)&&(pts3>pts2)&&(pts2>pts4)){
                    intercambiarPos(listaEquipos, i+1);
                    i = 0;
                }else if((pts1>pts3)&&(pts3>pts4)&&(pts4>pts2)){
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i+2);
                    i = 0;
                }else if((pts1>pts4)&&(pts4>pts2)&&(pts2>pts3)){
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    i = 0;
                }else if((pts1>pts4)&&(pts4>pts3)&&(pts3>pts2)){
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    i = 0;
                }else if((pts2>pts1)&&(pts1>pts3)&&(pts3>pts4)){
                    intercambiarPos(listaEquipos, i);
                    i = 0;
                }else if((pts2>pts1)&&(pts1>pts4)&&(pts4>pts3)){
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+2);
                    i = 0;
                }else if((pts2>pts3)&&(pts3>pts1)&&(pts1>pts4)){
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+1);
                    i = 0;
                }else if((pts2>pts3)&&(pts3>pts4)&&(pts4>pts1)){
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i+2);
                    i = 0;
                }else if((pts2>pts4)&&(pts4>pts1)&&(pts1>pts3)){
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    i = 0;
                }else if((pts2>pts4)&&(pts4>pts3)&&(pts3>pts1)){
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i+2);
                    i = 0;
                }else if((pts3>pts1)&&(pts1>pts2)&&(pts2>pts4)){
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    i = 0;
                }else if((pts3>pts1)&&(pts1>pts4)&&(pts4>pts2)){
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+2);
                    i = 0;
                }else if((pts3>pts2)&&(pts2>pts1)&&(pts1>pts4)){
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+1);
                    i = 0;
                }else if((pts3>pts2)&&(pts2>pts4)&&(pts4>pts1)){
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i+2);
                    i = 0;
                }else if((pts3>pts4)&&(pts4>pts1)&&(pts1>pts2)){
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    i = 0;
                }else if((pts3>pts4)&&(pts4>pts2)&&(pts2>pts1)){
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i+2);
                    i = 0;
                }else if((pts4>pts1)&&(pts1>pts2)&&(pts2>pts3)){
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    i = 0;
                }else if((pts4>pts1)&&(pts1>pts3)&&(pts3>pts2)){
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+2);
                    i = 0;
                }else if((pts4>pts2)&&(pts2>pts1)&&(pts1>pts3)){
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+1);
                    i = 0;
                }else if((pts4>pts2)&&(pts2>pts3)&&(pts3>pts1)){
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i+2);
                    i = 0;
                }else if((pts4>pts3)&&(pts3>pts1)&&(pts1>pts2)){
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    i = 0;
                }else if((pts4>pts3)&&(pts3>pts2)&&(pts2>pts1)){
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+2);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i+2);
                    i = 0;
                }else if((pts1==pts2)&&(pts1!=pts3)){
                    if(dif1<dif2){
                        intercambiarPos(listaEquipos, i);
                        i = 0;
                    }
                }else if((pts2==pts3)&&(pts1!=pts2)){
                    if(dif2<dif3){
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }
                }else if((pts3==pts4)&&(pts2!=pts3)){
                    if(dif3<dif4){
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }
                }else if((pts1==pts3)&&(pts3!=pts4)){
                    if((dif1>dif3)&&(dif3>dif2)){
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif1>dif3)&&(dif3<dif2)&&(dif1<dif2)){
                        intercambiarPos(listaEquipos, i);
                        i = 0;
                    }else if((dif1<dif3)&&(dif2>dif3)){
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif1<dif3)&&(dif2<dif3)&&(dif1>dif2)){
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        i = 0;
                    }else if((dif1<dif3)&&(dif2<dif3)&&(dif1<dif2)){
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        i = 0;
                    }
                }else if((pts2==pts4)&&(pts1!=pts2)){
                    if((dif2>dif4)&&(dif4>dif3)){
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }else if((dif2>dif4)&&(dif4<dif3)&&(dif2<dif3)){
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif2<dif4)&&(dif3>dif4)){
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }else if((dif2<dif4)&&(dif3<dif4)&&(dif2>dif3)){
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif2<dif4)&&(dif3<dif4)&&(dif2<dif3)){
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }
                }else if(pts2==pts4){
                    if((dif1>dif2)&&(dif2>dif4)&&(dif4>dif3)){
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }else if((dif1>dif3)&&(dif3>dif2)&&(dif2>dif4)){
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif1>dif3)&&(dif3>dif4)&&(dif4>dif2)){
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }else if((dif1>dif4)&&(dif4>dif2)&&(dif2>dif3)){
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif1>dif4)&&(dif4>dif3)&&(dif3>dif2)){
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif2>dif1)&&(dif1>dif3)&&(dif3>dif4)){
                        intercambiarPos(listaEquipos, i);
                        i = 0;
                    }else if((dif2>dif1)&&(dif1>dif4)&&(dif4>dif3)){
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }else if((dif2>dif3)&&(dif3>dif1)&&(dif1>dif4)){
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif2>dif3)&&(dif3>dif4)&&(dif4>dif1)){
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }else if((dif2>dif4)&&(dif4>dif1)&&(dif1>dif3)){
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif2>dif4)&&(dif4>dif3)&&(dif3>dif1)){
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }else if((dif3>dif1)&&(dif1>dif2)&&(dif2>dif4)){
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        i = 0;
                    }else if((dif3>dif1)&&(dif1>dif4)&&(dif4>dif2)){
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }else if((dif3>dif2)&&(dif2>dif1)&&(dif1>dif4)){
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif3>dif2)&&(dif2>dif4)&&(dif4>dif1)){
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }else if((dif3>dif4)&&(dif4>dif1)&&(dif1>dif2)){
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif3>dif4)&&(dif4>dif2)&&(dif2>dif1)){
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }else if((dif4>dif1)&&(dif1>dif2)&&(dif2>dif3)){
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        i = 0;
                    }else if((dif4>dif1)&&(dif1>dif3)&&(dif3>dif2)){
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }else if((dif4>dif2)&&(dif2>dif1)&&(dif1>dif3)){
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif4>dif2)&&(dif2>dif3)&&(dif3>dif1)){
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }else if((dif4>dif3)&&(dif3>dif1)&&(dif1>dif2)){
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif4>dif3)&&(dif3>dif2)&&(dif2>dif1)){
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+2);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i+2);
                        i = 0;
                    }
                }
            }
        }
        //FIN cuádruple empate a puntos
        //Inicio triple empate a puntos:
        for(int i=0; i<18; i++){
            if(listaEquipos.get(i).getPts() == listaEquipos.get(i+2).getPts()){
                Equipo equipo1= listaEquipos.get(i);
                Equipo equipo2 = listaEquipos.get(i + 1);
                Equipo equipo3 = listaEquipos.get(i + 2);
                int pts1 = 0;
                int pts2 = 0;
                int pts3 = 0;
                int dif1 = 0;
                int dif2 = 0;
                int dif3 = 0;
                for(int j=0; j<380; j++){
                    if((listaPartidos.get(j).getLocal())==equipo1){
                        if(listaPartidos.get(j).getVisitante()==equipo2){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts1 = pts1+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts2 = pts2+3;
                            }else{
                                pts1 = pts1+1;
                                pts2 = pts2+1;
                            }
                            dif1 = dif1+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif2 = dif2+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }else if(listaPartidos.get(j).getVisitante()==equipo3){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts1 = pts1+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts3 = pts3+3;
                            }else{
                                pts1 = pts1+1;
                                pts3 = pts3+1;
                            }
                            dif1 = dif1+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                            dif3 = dif3+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                        }
                    }
                    if(listaPartidos.get(j).getVisitante()==equipo1){
                        if(listaPartidos.get(j).getLocal()==equipo2){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts2 = pts2+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts1 = pts1+3;
                            }else{
                                pts1 = pts1+1;
                                pts2 = pts2+1;
                            }
                            dif1 = dif1+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                            dif2 = dif2+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                        }else if(listaPartidos.get(j).getLocal()==equipo3){
                            if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                                pts3 = pts3+3;
                            }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                                pts1 = pts1+3;
                            }else{
                                pts1 = pts1+1;
                                pts3 = pts3+1;
                            }
                            dif1 = dif1+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                            dif3 = dif3+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                        }
                    }
                    if(listaPartidos.get(j).getLocal()==equipo2 && listaPartidos.get(j).getVisitante()==equipo3){
                        if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                            pts2 = pts2+3;
                        }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                            pts3 = pts3+3;
                        }else{
                            pts2 = pts2+1;
                            pts3 = pts3+1;
                        }
                        dif2 = dif2+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                        dif3 = dif3+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                    }
                    if(listaPartidos.get(j).getLocal()==equipo3 && listaPartidos.get(j).getVisitante()==equipo2){
                        if(listaPartidos.get(j).getGolesLocal() > listaPartidos.get(j).getGolesVisitante()){
                            pts3 = pts3+3;
                        }else if(listaPartidos.get(j).getGolesLocal() < listaPartidos.get(j).getGolesVisitante()){
                            pts2 = pts2+3;
                        }else{
                            pts2 = pts2+1;
                            pts3 = pts3+1;
                        }
                        dif3 = dif3+listaPartidos.get(j).getGolesLocal()-listaPartidos.get(j).getGolesVisitante();
                        dif2 = dif2+listaPartidos.get(j).getGolesVisitante()-listaPartidos.get(j).getGolesLocal();
                    }
                }
                Log.e("TEST", "i___ " + i);
                Log.e("TEST","dif1: "+dif1);
                Log.e("TEST","dif2: "+dif2);
                Log.e("TEST","dif3: "+dif3);
                if((pts1>pts3)&&(pts3>pts2)){
                    intercambiarPos(listaEquipos, i+1);
                    i = 0;
                }else if((pts1>pts3)&&(pts3<pts2)&&(pts1<pts2)){
                    intercambiarPos(listaEquipos, i);
                    i = 0;
                }else if((pts1<pts3)&&(pts2>pts3)){
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+1);
                    i = 0;
                }else if((pts1<pts3)&&(pts2<pts3)&&(pts1>pts2)){
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    i = 0;
                }else if((pts1<pts3)&&(pts2<pts3)&&(pts1<pts2)){
                    intercambiarPos(listaEquipos, i);
                    intercambiarPos(listaEquipos, i+1);
                    intercambiarPos(listaEquipos, i);
                    i = 0;
                }else if((pts1==pts2)&&(pts1!=pts3)){
                    if(dif1<dif2){
                        intercambiarPos(listaEquipos, i);
                        i = 0;
                    }
                }else if((pts2==pts3)&&(pts2!=pts1)){
                    if(dif2<dif3){
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }
                }else if(pts1==pts3){
                    if((dif1>dif3)&&(dif3>dif2)){
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif1>dif3)&&(dif3<dif2)&&(dif1<dif2)){
                        intercambiarPos(listaEquipos, i);
                        i = 0;
                    }else if((dif1<dif3)&&(dif2>dif3)){
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+1);
                        i = 0;
                    }else if((dif1<dif3)&&(dif2<dif3)&&(dif1>dif2)){
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        i = 0;
                    }else if((dif1<dif3)&&(dif2<dif3)&&(dif1<dif2)){
                        intercambiarPos(listaEquipos, i);
                        intercambiarPos(listaEquipos, i+1);
                        intercambiarPos(listaEquipos, i);
                        i = 0;
                    }
                }
            }
        }
        //FIN triple empate a puntos
        //Inicio doble empate a puntos:
        for(int i=0; i<19; i++){
            if(listaEquipos.get(i).getPts() == listaEquipos.get(i+1).getPts()){
                int id2 = listaEquipos.get(i+1).getId();
                if(id2==1){
                    if(listaEquipos.get(i).getJug1() > 1){
                        if (listaEquipos.get(i).getDg1() < 0){
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg1() == 0) {
                            if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                    intercambiarPos(listaEquipos, i);
                                    i = 0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==2){
                    if(listaEquipos.get(i).getJug2() > 1) {
                        if (listaEquipos.get(i).getDg2() < 0) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg2() == 0) {
                            if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                    intercambiarPos(listaEquipos, i);
                                    i = 0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==3){
                    if(listaEquipos.get(i).getJug3() > 1){
                        if(listaEquipos.get(i).getDg3() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg3() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==10){
                    if(listaEquipos.get(i).getJug10() > 1){
                        if(listaEquipos.get(i).getDg10() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg10() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==4){
                    if(listaEquipos.get(i).getJug4() > 1){
                        if(listaEquipos.get(i).getDg4() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg4() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==5){
                    if(listaEquipos.get(i).getJug5() > 1){
                        if(listaEquipos.get(i).getDg5() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg5() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==6){
                    if(listaEquipos.get(i).getJug6() > 1){
                        if(listaEquipos.get(i).getDg6() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg6() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==7){
                    if(listaEquipos.get(i).getJug7() > 1){
                        if(listaEquipos.get(i).getDg7() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg7() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==8){
                    if(listaEquipos.get(i).getJug8() > 1){
                        if(listaEquipos.get(i).getDg8() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg8() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==9){
                    if(listaEquipos.get(i).getJug9() > 1){
                        if(listaEquipos.get(i).getDg9() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg9() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==11){
                    if(listaEquipos.get(i).getJug11() > 1){
                        if(listaEquipos.get(i).getDg11() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg11() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==12){
                    if(listaEquipos.get(i).getJug12() > 1){
                        if(listaEquipos.get(i).getDg12() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg12() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==13){
                    if(listaEquipos.get(i).getJug13() > 1){
                        if(listaEquipos.get(i).getDg13() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg13() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==15){
                    if(listaEquipos.get(i).getJug15() > 1){
                        if(listaEquipos.get(i).getDg15() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg15() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==16){
                    if(listaEquipos.get(i).getJug16() > 1){
                        if(listaEquipos.get(i).getDg16() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg16() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==14){
                    if(listaEquipos.get(i).getJug14() > 1){
                        if(listaEquipos.get(i).getDg14() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg14() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==17){
                    if(listaEquipos.get(i).getJug17() > 1){
                        if(listaEquipos.get(i).getDg17() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg17() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==18){
                    if(listaEquipos.get(i).getJug18() > 1){
                        if(listaEquipos.get(i).getDg18() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg18() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==19){
                    if(listaEquipos.get(i).getJug19() > 1){
                        if(listaEquipos.get(i).getDg19() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg19() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }else if(id2==20){
                    if(listaEquipos.get(i).getJug20() > 1){
                        if(listaEquipos.get(i).getDg20() < 0){
                            intercambiarPos(listaEquipos, i);
                            i=0;
                        }else if (listaEquipos.get(i).getDg20() == 0){
                            if(listaEquipos.get(i).getDg() < listaEquipos.get(i+1).getDg()){
                                intercambiarPos(listaEquipos, i);
                                i=0;
                            }else if (listaEquipos.get(i).getDg() == listaEquipos.get(i+1).getDg()){
                                if (listaEquipos.get(i).getGf() < listaEquipos.get(i+1).getGf()){
                                    intercambiarPos(listaEquipos, i);
                                    i=0;
                                }
                            }
                        }
                    }else{
                        if (listaEquipos.get(i).getDg() < listaEquipos.get(i + 1).getDg()) {
                            intercambiarPos(listaEquipos, i);
                            i = 0;
                        } else if (listaEquipos.get(i).getDg() == listaEquipos.get(i + 1).getDg()) {
                            if (listaEquipos.get(i).getGf() < listaEquipos.get(i + 1).getGf()) {
                                intercambiarPos(listaEquipos, i);
                                i = 0;
                            }
                        }
                    }
                }
            }
        }
        //FIN doble empate a puntos
    }

    public void intercambiarPos (ArrayList<Equipo> a, int pos){
        Equipo aux = a.get(pos);
        a.remove(pos);
        a.add(pos+1, aux);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_liga_esp1_clas_calc, menu);
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

        switch (id) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

        //return super.onOptionsItemSelected(item);
    }
}
