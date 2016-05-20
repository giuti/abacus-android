package com.svs.sportscalculator.primera;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import com.svs.sportscalculator.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class LigaEsp1Calc extends ActionBarActivity {

    ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
    ArrayList<Integer> id = new ArrayList<Integer>();
    ArrayList<String> nom = new ArrayList<String>();
    ArrayList<Integer> pts = new ArrayList<Integer>();
    //ArrayList<Integer> ptsRecalculados = new ArrayList<Integer>();
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

    ArrayList<Partido> partidosJ1 = new ArrayList<Partido>();ArrayList<Partido> partidosJ2 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ3 = new ArrayList<Partido>();ArrayList<Partido> partidosJ4 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ5 = new ArrayList<Partido>();ArrayList<Partido> partidosJ6 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ7 = new ArrayList<Partido>();ArrayList<Partido> partidosJ8 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ9 = new ArrayList<Partido>();ArrayList<Partido> partidosJ10 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ11 = new ArrayList<Partido>();ArrayList<Partido> partidosJ12 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ13 = new ArrayList<Partido>();ArrayList<Partido> partidosJ14 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ15 = new ArrayList<Partido>();ArrayList<Partido> partidosJ16 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ17 = new ArrayList<Partido>();ArrayList<Partido> partidosJ18 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ19 = new ArrayList<Partido>();ArrayList<Partido> partidosJ20 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ21 = new ArrayList<Partido>();ArrayList<Partido> partidosJ22 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ23 = new ArrayList<Partido>();ArrayList<Partido> partidosJ24 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ25 = new ArrayList<Partido>();ArrayList<Partido> partidosJ26 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ27 = new ArrayList<Partido>();ArrayList<Partido> partidosJ28 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ29 = new ArrayList<Partido>();ArrayList<Partido> partidosJ30 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ31 = new ArrayList<Partido>();ArrayList<Partido> partidosJ32 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ33 = new ArrayList<Partido>();ArrayList<Partido> partidosJ34 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ35 = new ArrayList<Partido>();ArrayList<Partido> partidosJ36 = new ArrayList<Partido>();
    ArrayList<Partido> partidosJ37 = new ArrayList<Partido>();ArrayList<Partido> partidosJ38 = new ArrayList<Partido>();

    //número de la próxima jornada que se va a disputar
    public int numeroJornada;

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, ArrayList<Partido>> listDataChild;
    ArrayList<Integer> radioButtons = new ArrayList<Integer>();

    @Override
    protected void onRestart() {
        super.onRestart();
        Bundle bundle = getIntent().getExtras();
        //ptsRecalculados = bundle.getIntegerArrayList("bundlePts");
        pts = bundle.getIntegerArrayList("bundlePts");
        Button boton = (Button) findViewById(R.id.buttonCalculate);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButtons = listAdapter.getRadioButtons();
                //Log.e("PRUEBA","Botón radioButtons: "+radioButtons);
                //Log.e("PRUEBA","PTS: "+pts);
                recalcularClasificacion();
                //Log.e("PRUEBA","PTS: "+pts);
                Intent intent = new Intent(LigaEsp1Calc.this, LigaEsp1ClasCalc.class);
                enviar(intent);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_liga_esp1_calc);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);

        Bundle bundle = getIntent().getExtras();
        id = bundle.getIntegerArrayList("bundleId");
        nom = bundle.getStringArrayList("bundleNom");
        pts = bundle.getIntegerArrayList("bundlePts");
        //ptsRecalculados = bundle.getIntegerArrayList("bundlePts");
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

        numeroJornada = bundle.getInt("bundleNumJornada");
        //Log.e("Prueba", "jor->>>" + numeroJornada);
        //Log.e("Prueba", "nom->>>" + nom);
        //Log.e("Prueba", "par->>>" + idPartido);
        //numeroJornada.setNumero(bundle.getInt("bundleNumJornada"));

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

        /*Log.e("Prueba","idPartido->>>"+idPartido);
        Log.e("Prueba","idEquipoL->>>"+idEquipoL);
        Log.e("Prueba","idEquipoV->>>"+idEquipoV);
        Log.e("Prueba","golesL->>>"+golesL);
        Log.e("Prueba","golesV->>>"+golesV);
        Log.e("Prueba","fecha->>>"+fecha);*/
        for(int i=0; i<380; i++) {
            listaPartidos.add(new Partido(idPartido.get(i), listaEquipos.get(idEquipoL.get(i)-1), listaEquipos.get(idEquipoV.get(i)-1),
                    idEquipoL.get(i)-1, idEquipoV.get(i)-1,
                    listaEquipos.get(idEquipoL.get(i)-1).getNombre(), listaEquipos.get(idEquipoV.get(i)-1).getNombre(),
                    golesL.get(i), golesV.get(i), fecha.get(i), jornada.get(i), escudos[idEquipoL.get(i)-1], escudos[idEquipoV.get(i)-1]));
        }

        partidosJ1.add(listaPartidos.get(0));partidosJ1.add(listaPartidos.get(1));partidosJ1.add(listaPartidos.get(2));partidosJ1.add(listaPartidos.get(3));partidosJ1.add(listaPartidos.get(4));partidosJ1.add(listaPartidos.get(5));partidosJ1.add(listaPartidos.get(6));partidosJ1.add(listaPartidos.get(7));partidosJ1.add(listaPartidos.get(8));partidosJ1.add(listaPartidos.get(9));
        partidosJ2.add(listaPartidos.get(10));partidosJ2.add(listaPartidos.get(11));partidosJ2.add(listaPartidos.get(12));partidosJ2.add(listaPartidos.get(13));partidosJ2.add(listaPartidos.get(14));partidosJ2.add(listaPartidos.get(15));partidosJ2.add(listaPartidos.get(16));partidosJ2.add(listaPartidos.get(17));partidosJ2.add(listaPartidos.get(18));partidosJ2.add(listaPartidos.get(19));
        partidosJ3.add(listaPartidos.get(20));partidosJ3.add(listaPartidos.get(21));partidosJ3.add(listaPartidos.get(22));partidosJ3.add(listaPartidos.get(23));partidosJ3.add(listaPartidos.get(24));partidosJ3.add(listaPartidos.get(25));partidosJ3.add(listaPartidos.get(26));partidosJ3.add(listaPartidos.get(27));partidosJ3.add(listaPartidos.get(28));partidosJ3.add(listaPartidos.get(29));
        partidosJ4.add(listaPartidos.get(30));partidosJ4.add(listaPartidos.get(31));partidosJ4.add(listaPartidos.get(32));partidosJ4.add(listaPartidos.get(33));partidosJ4.add(listaPartidos.get(34));partidosJ4.add(listaPartidos.get(35));partidosJ4.add(listaPartidos.get(36));partidosJ4.add(listaPartidos.get(37));partidosJ4.add(listaPartidos.get(38));partidosJ4.add(listaPartidos.get(39));
        partidosJ5.add(listaPartidos.get(40));partidosJ5.add(listaPartidos.get(41));partidosJ5.add(listaPartidos.get(42));partidosJ5.add(listaPartidos.get(43));partidosJ5.add(listaPartidos.get(44));partidosJ5.add(listaPartidos.get(45));partidosJ5.add(listaPartidos.get(46));partidosJ5.add(listaPartidos.get(47));partidosJ5.add(listaPartidos.get(48));partidosJ5.add(listaPartidos.get(49));
        partidosJ6.add(listaPartidos.get(50));partidosJ6.add(listaPartidos.get(51));partidosJ6.add(listaPartidos.get(52));partidosJ6.add(listaPartidos.get(53));partidosJ6.add(listaPartidos.get(54));partidosJ6.add(listaPartidos.get(55));partidosJ6.add(listaPartidos.get(56));partidosJ6.add(listaPartidos.get(57));partidosJ6.add(listaPartidos.get(58));partidosJ6.add(listaPartidos.get(59));
        partidosJ7.add(listaPartidos.get(60));partidosJ7.add(listaPartidos.get(61));partidosJ7.add(listaPartidos.get(62));partidosJ7.add(listaPartidos.get(63));partidosJ7.add(listaPartidos.get(64));partidosJ7.add(listaPartidos.get(65));partidosJ7.add(listaPartidos.get(66));partidosJ7.add(listaPartidos.get(67));partidosJ7.add(listaPartidos.get(68));partidosJ7.add(listaPartidos.get(69));
        partidosJ8.add(listaPartidos.get(70));partidosJ8.add(listaPartidos.get(71));partidosJ8.add(listaPartidos.get(72));partidosJ8.add(listaPartidos.get(73));partidosJ8.add(listaPartidos.get(74));partidosJ8.add(listaPartidos.get(75));partidosJ8.add(listaPartidos.get(76));partidosJ8.add(listaPartidos.get(77));partidosJ8.add(listaPartidos.get(78));partidosJ8.add(listaPartidos.get(79));
        partidosJ9.add(listaPartidos.get(80));partidosJ9.add(listaPartidos.get(81));partidosJ9.add(listaPartidos.get(82));partidosJ9.add(listaPartidos.get(83));partidosJ9.add(listaPartidos.get(84));partidosJ9.add(listaPartidos.get(85));partidosJ9.add(listaPartidos.get(86));partidosJ9.add(listaPartidos.get(87));partidosJ9.add(listaPartidos.get(88));partidosJ9.add(listaPartidos.get(89));
        partidosJ10.add(listaPartidos.get(90));partidosJ10.add(listaPartidos.get(91));partidosJ10.add(listaPartidos.get(92));partidosJ10.add(listaPartidos.get(93));partidosJ10.add(listaPartidos.get(94));partidosJ10.add(listaPartidos.get(95));partidosJ10.add(listaPartidos.get(96));partidosJ10.add(listaPartidos.get(97));partidosJ10.add(listaPartidos.get(98));partidosJ10.add(listaPartidos.get(99));
        partidosJ11.add(listaPartidos.get(100));partidosJ11.add(listaPartidos.get(101));partidosJ11.add(listaPartidos.get(102));partidosJ11.add(listaPartidos.get(103));partidosJ11.add(listaPartidos.get(104));partidosJ11.add(listaPartidos.get(105));partidosJ11.add(listaPartidos.get(106));partidosJ11.add(listaPartidos.get(107));partidosJ11.add(listaPartidos.get(108));partidosJ11.add(listaPartidos.get(109));
        partidosJ12.add(listaPartidos.get(110));partidosJ12.add(listaPartidos.get(111));partidosJ12.add(listaPartidos.get(112));partidosJ12.add(listaPartidos.get(113));partidosJ12.add(listaPartidos.get(114));partidosJ12.add(listaPartidos.get(115));partidosJ12.add(listaPartidos.get(116));partidosJ12.add(listaPartidos.get(117));partidosJ12.add(listaPartidos.get(118));partidosJ12.add(listaPartidos.get(119));
        partidosJ13.add(listaPartidos.get(120));partidosJ13.add(listaPartidos.get(121));partidosJ13.add(listaPartidos.get(122));partidosJ13.add(listaPartidos.get(123));partidosJ13.add(listaPartidos.get(124));partidosJ13.add(listaPartidos.get(125));partidosJ13.add(listaPartidos.get(126));partidosJ13.add(listaPartidos.get(127));partidosJ13.add(listaPartidos.get(128));partidosJ13.add(listaPartidos.get(129));
        partidosJ14.add(listaPartidos.get(130));partidosJ14.add(listaPartidos.get(131));partidosJ14.add(listaPartidos.get(132));partidosJ14.add(listaPartidos.get(133));partidosJ14.add(listaPartidos.get(134));partidosJ14.add(listaPartidos.get(135));partidosJ14.add(listaPartidos.get(136));partidosJ14.add(listaPartidos.get(137));partidosJ14.add(listaPartidos.get(138));partidosJ14.add(listaPartidos.get(139));
        partidosJ15.add(listaPartidos.get(140));partidosJ15.add(listaPartidos.get(141));partidosJ15.add(listaPartidos.get(142));partidosJ15.add(listaPartidos.get(143));partidosJ15.add(listaPartidos.get(144));partidosJ15.add(listaPartidos.get(145));partidosJ15.add(listaPartidos.get(146));partidosJ15.add(listaPartidos.get(147));partidosJ15.add(listaPartidos.get(148));partidosJ15.add(listaPartidos.get(149));
        partidosJ16.add(listaPartidos.get(150));partidosJ16.add(listaPartidos.get(151));partidosJ16.add(listaPartidos.get(152));partidosJ16.add(listaPartidos.get(153));partidosJ16.add(listaPartidos.get(154));partidosJ16.add(listaPartidos.get(155));partidosJ16.add(listaPartidos.get(156));partidosJ16.add(listaPartidos.get(157));partidosJ16.add(listaPartidos.get(158));partidosJ16.add(listaPartidos.get(159));
        partidosJ17.add(listaPartidos.get(160));partidosJ17.add(listaPartidos.get(161));partidosJ17.add(listaPartidos.get(162));partidosJ17.add(listaPartidos.get(163));partidosJ17.add(listaPartidos.get(164));partidosJ17.add(listaPartidos.get(165));partidosJ17.add(listaPartidos.get(166));partidosJ17.add(listaPartidos.get(167));partidosJ17.add(listaPartidos.get(168));partidosJ17.add(listaPartidos.get(169));
        partidosJ18.add(listaPartidos.get(170));partidosJ18.add(listaPartidos.get(171));partidosJ18.add(listaPartidos.get(172));partidosJ18.add(listaPartidos.get(173));partidosJ18.add(listaPartidos.get(174));partidosJ18.add(listaPartidos.get(175));partidosJ18.add(listaPartidos.get(176));partidosJ18.add(listaPartidos.get(177));partidosJ18.add(listaPartidos.get(178));partidosJ18.add(listaPartidos.get(179));
        partidosJ19.add(listaPartidos.get(180));partidosJ19.add(listaPartidos.get(181));partidosJ19.add(listaPartidos.get(182));partidosJ19.add(listaPartidos.get(183));partidosJ19.add(listaPartidos.get(184));partidosJ19.add(listaPartidos.get(185));partidosJ19.add(listaPartidos.get(186));partidosJ19.add(listaPartidos.get(187));partidosJ19.add(listaPartidos.get(188));partidosJ19.add(listaPartidos.get(189));
        partidosJ20.add(listaPartidos.get(190));partidosJ20.add(listaPartidos.get(191));partidosJ20.add(listaPartidos.get(192));partidosJ20.add(listaPartidos.get(193));partidosJ20.add(listaPartidos.get(194));partidosJ20.add(listaPartidos.get(195));partidosJ20.add(listaPartidos.get(196));partidosJ20.add(listaPartidos.get(197));partidosJ20.add(listaPartidos.get(198));partidosJ20.add(listaPartidos.get(199));
        partidosJ21.add(listaPartidos.get(200));partidosJ21.add(listaPartidos.get(201));partidosJ21.add(listaPartidos.get(202));partidosJ21.add(listaPartidos.get(203));partidosJ21.add(listaPartidos.get(204));partidosJ21.add(listaPartidos.get(205));partidosJ21.add(listaPartidos.get(206));partidosJ21.add(listaPartidos.get(207));partidosJ21.add(listaPartidos.get(208));partidosJ21.add(listaPartidos.get(209));
        partidosJ22.add(listaPartidos.get(210));partidosJ22.add(listaPartidos.get(211));partidosJ22.add(listaPartidos.get(212));partidosJ22.add(listaPartidos.get(213));partidosJ22.add(listaPartidos.get(214));partidosJ22.add(listaPartidos.get(215));partidosJ22.add(listaPartidos.get(216));partidosJ22.add(listaPartidos.get(217));partidosJ22.add(listaPartidos.get(218));partidosJ22.add(listaPartidos.get(219));
        partidosJ23.add(listaPartidos.get(220));partidosJ23.add(listaPartidos.get(221));partidosJ23.add(listaPartidos.get(222));partidosJ23.add(listaPartidos.get(223));partidosJ23.add(listaPartidos.get(224));partidosJ23.add(listaPartidos.get(225));partidosJ23.add(listaPartidos.get(226));partidosJ23.add(listaPartidos.get(227));partidosJ23.add(listaPartidos.get(228));partidosJ23.add(listaPartidos.get(229));
        partidosJ24.add(listaPartidos.get(230));partidosJ24.add(listaPartidos.get(231));partidosJ24.add(listaPartidos.get(232));partidosJ24.add(listaPartidos.get(233));partidosJ24.add(listaPartidos.get(234));partidosJ24.add(listaPartidos.get(235));partidosJ24.add(listaPartidos.get(236));partidosJ24.add(listaPartidos.get(237));partidosJ24.add(listaPartidos.get(238));partidosJ24.add(listaPartidos.get(239));
        partidosJ25.add(listaPartidos.get(240));partidosJ25.add(listaPartidos.get(241));partidosJ25.add(listaPartidos.get(242));partidosJ25.add(listaPartidos.get(243));partidosJ25.add(listaPartidos.get(244));partidosJ25.add(listaPartidos.get(245));partidosJ25.add(listaPartidos.get(246));partidosJ25.add(listaPartidos.get(247));partidosJ25.add(listaPartidos.get(248));partidosJ25.add(listaPartidos.get(249));
        partidosJ26.add(listaPartidos.get(250));partidosJ26.add(listaPartidos.get(251));partidosJ26.add(listaPartidos.get(252));partidosJ26.add(listaPartidos.get(253));partidosJ26.add(listaPartidos.get(254));partidosJ26.add(listaPartidos.get(255));partidosJ26.add(listaPartidos.get(256));partidosJ26.add(listaPartidos.get(257));partidosJ26.add(listaPartidos.get(258));partidosJ26.add(listaPartidos.get(259));
        partidosJ27.add(listaPartidos.get(260));partidosJ27.add(listaPartidos.get(261));partidosJ27.add(listaPartidos.get(262));partidosJ27.add(listaPartidos.get(263));partidosJ27.add(listaPartidos.get(264));partidosJ27.add(listaPartidos.get(265));partidosJ27.add(listaPartidos.get(266));partidosJ27.add(listaPartidos.get(267));partidosJ27.add(listaPartidos.get(268));partidosJ27.add(listaPartidos.get(269));
        partidosJ28.add(listaPartidos.get(270));partidosJ28.add(listaPartidos.get(271));partidosJ28.add(listaPartidos.get(272));partidosJ28.add(listaPartidos.get(273));partidosJ28.add(listaPartidos.get(274));partidosJ28.add(listaPartidos.get(275));partidosJ28.add(listaPartidos.get(276));partidosJ28.add(listaPartidos.get(277));partidosJ28.add(listaPartidos.get(278));partidosJ28.add(listaPartidos.get(279));
        partidosJ29.add(listaPartidos.get(280));partidosJ29.add(listaPartidos.get(281));partidosJ29.add(listaPartidos.get(282));partidosJ29.add(listaPartidos.get(283));partidosJ29.add(listaPartidos.get(284));partidosJ29.add(listaPartidos.get(285));partidosJ29.add(listaPartidos.get(286));partidosJ29.add(listaPartidos.get(287));partidosJ29.add(listaPartidos.get(288));partidosJ29.add(listaPartidos.get(289));
        partidosJ30.add(listaPartidos.get(290));partidosJ30.add(listaPartidos.get(291));partidosJ30.add(listaPartidos.get(292));partidosJ30.add(listaPartidos.get(293));partidosJ30.add(listaPartidos.get(294));partidosJ30.add(listaPartidos.get(295));partidosJ30.add(listaPartidos.get(296));partidosJ30.add(listaPartidos.get(297));partidosJ30.add(listaPartidos.get(298));partidosJ30.add(listaPartidos.get(299));
        partidosJ31.add(listaPartidos.get(300));partidosJ31.add(listaPartidos.get(301));partidosJ31.add(listaPartidos.get(302));partidosJ31.add(listaPartidos.get(303));partidosJ31.add(listaPartidos.get(304));partidosJ31.add(listaPartidos.get(305));partidosJ31.add(listaPartidos.get(306));partidosJ31.add(listaPartidos.get(307));partidosJ31.add(listaPartidos.get(308));partidosJ31.add(listaPartidos.get(309));
        partidosJ32.add(listaPartidos.get(310));partidosJ32.add(listaPartidos.get(311));partidosJ32.add(listaPartidos.get(312));partidosJ32.add(listaPartidos.get(313));partidosJ32.add(listaPartidos.get(314));partidosJ32.add(listaPartidos.get(315));partidosJ32.add(listaPartidos.get(316));partidosJ32.add(listaPartidos.get(317));partidosJ32.add(listaPartidos.get(318));partidosJ32.add(listaPartidos.get(319));
        partidosJ33.add(listaPartidos.get(320));partidosJ33.add(listaPartidos.get(321));partidosJ33.add(listaPartidos.get(322));partidosJ33.add(listaPartidos.get(323));partidosJ33.add(listaPartidos.get(324));partidosJ33.add(listaPartidos.get(325));partidosJ33.add(listaPartidos.get(326));partidosJ33.add(listaPartidos.get(327));partidosJ33.add(listaPartidos.get(328));partidosJ33.add(listaPartidos.get(329));
        partidosJ34.add(listaPartidos.get(330));partidosJ34.add(listaPartidos.get(331));partidosJ34.add(listaPartidos.get(332));partidosJ34.add(listaPartidos.get(333));partidosJ34.add(listaPartidos.get(334));partidosJ34.add(listaPartidos.get(335));partidosJ34.add(listaPartidos.get(336));partidosJ34.add(listaPartidos.get(337));partidosJ34.add(listaPartidos.get(338));partidosJ34.add(listaPartidos.get(339));
        partidosJ35.add(listaPartidos.get(340));partidosJ35.add(listaPartidos.get(341));partidosJ35.add(listaPartidos.get(342));partidosJ35.add(listaPartidos.get(343));partidosJ35.add(listaPartidos.get(344));partidosJ35.add(listaPartidos.get(345));partidosJ35.add(listaPartidos.get(346));partidosJ35.add(listaPartidos.get(347));partidosJ35.add(listaPartidos.get(348));partidosJ35.add(listaPartidos.get(349));
        partidosJ36.add(listaPartidos.get(350));partidosJ36.add(listaPartidos.get(351));partidosJ36.add(listaPartidos.get(352));partidosJ36.add(listaPartidos.get(353));partidosJ36.add(listaPartidos.get(354));partidosJ36.add(listaPartidos.get(355));partidosJ36.add(listaPartidos.get(356));partidosJ36.add(listaPartidos.get(357));partidosJ36.add(listaPartidos.get(358));partidosJ36.add(listaPartidos.get(359));
        partidosJ37.add(listaPartidos.get(360));partidosJ37.add(listaPartidos.get(361));partidosJ37.add(listaPartidos.get(362));partidosJ37.add(listaPartidos.get(363));partidosJ37.add(listaPartidos.get(364));partidosJ37.add(listaPartidos.get(365));partidosJ37.add(listaPartidos.get(366));partidosJ37.add(listaPartidos.get(367));partidosJ37.add(listaPartidos.get(368));partidosJ37.add(listaPartidos.get(369));
        partidosJ38.add(listaPartidos.get(370));partidosJ38.add(listaPartidos.get(371));partidosJ38.add(listaPartidos.get(372));partidosJ38.add(listaPartidos.get(373));partidosJ38.add(listaPartidos.get(374));partidosJ38.add(listaPartidos.get(375));partidosJ38.add(listaPartidos.get(376));partidosJ38.add(listaPartidos.get(377));partidosJ38.add(listaPartidos.get(378));partidosJ38.add(listaPartidos.get(379));

        //Última jornada disputada
        //jornadaActual =  jornada.get(0)+1;
        //Log.e("PRUEBA", "jornada actual: " + jornadaActual);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
        // preparing list data
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild, numeroJornada);
        // setting list adapter
        expListView.setAdapter(listAdapter);
        expListView.setSelection(numeroJornada-1);

        Button boton = (Button) findViewById(R.id.buttonCalculate);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButtons = listAdapter.getRadioButtons();
                //Log.e("PRUEBA","Botón radioButtons: "+radioButtons);
                //Log.e("PRUEBA","PTS: "+pts);
                recalcularClasificacion();
                //Log.e("PRUEBA","PTS: "+pts);
                Intent intent = new Intent(LigaEsp1Calc.this, LigaEsp1ClasCalc.class);
                enviar(intent);
                startActivity(intent);
            }
        });
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, ArrayList<Partido>>();

        for(int i=1; i<39; i++){
            if(i<numeroJornada){
                listDataHeader.add("Jornada "+i+" [TERMINADA]");
            }else{
                listDataHeader.add("Jornada "+i);
            }
        }

        listDataChild.put(listDataHeader.get(0), partidosJ1);listDataChild.put(listDataHeader.get(1), partidosJ2);
        listDataChild.put(listDataHeader.get(2), partidosJ3);listDataChild.put(listDataHeader.get(3), partidosJ4);
        listDataChild.put(listDataHeader.get(4), partidosJ5);listDataChild.put(listDataHeader.get(5), partidosJ6);
        listDataChild.put(listDataHeader.get(6), partidosJ7);listDataChild.put(listDataHeader.get(7), partidosJ8);
        listDataChild.put(listDataHeader.get(8), partidosJ9);listDataChild.put(listDataHeader.get(9), partidosJ10);
        listDataChild.put(listDataHeader.get(10), partidosJ11);listDataChild.put(listDataHeader.get(11), partidosJ12);
        listDataChild.put(listDataHeader.get(12), partidosJ13);listDataChild.put(listDataHeader.get(13), partidosJ14);
        listDataChild.put(listDataHeader.get(14), partidosJ15);listDataChild.put(listDataHeader.get(15), partidosJ16);
        listDataChild.put(listDataHeader.get(16), partidosJ17);listDataChild.put(listDataHeader.get(17), partidosJ18);
        listDataChild.put(listDataHeader.get(18), partidosJ19);listDataChild.put(listDataHeader.get(19), partidosJ20);
        listDataChild.put(listDataHeader.get(20), partidosJ21);listDataChild.put(listDataHeader.get(21), partidosJ22);
        listDataChild.put(listDataHeader.get(22), partidosJ23);listDataChild.put(listDataHeader.get(23), partidosJ24);
        listDataChild.put(listDataHeader.get(24), partidosJ25);listDataChild.put(listDataHeader.get(25), partidosJ26);
        listDataChild.put(listDataHeader.get(26), partidosJ27);listDataChild.put(listDataHeader.get(27), partidosJ28);
        listDataChild.put(listDataHeader.get(28), partidosJ29);listDataChild.put(listDataHeader.get(29), partidosJ30);
        listDataChild.put(listDataHeader.get(30), partidosJ31);listDataChild.put(listDataHeader.get(31), partidosJ32);
        listDataChild.put(listDataHeader.get(32), partidosJ33);listDataChild.put(listDataHeader.get(33), partidosJ34);
        listDataChild.put(listDataHeader.get(34), partidosJ35);listDataChild.put(listDataHeader.get(35), partidosJ36);
        listDataChild.put(listDataHeader.get(36), partidosJ37);listDataChild.put(listDataHeader.get(37), partidosJ38);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_liga_esp1_calc, menu);
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

    public void recalcularClasificacion(){
        int puntosEquipoL, puntosEquipoV;
        for(int i=0; i<radioButtons.size(); i++){
            puntosEquipoL = pts.get(listaPartidos.get(i).getIdLocal());
            puntosEquipoV = pts.get(listaPartidos.get(i).getIdVisitante());
            if(radioButtons.get(i) == 1){
                pts.remove(listaPartidos.get(i).getIdLocal());
                pts.add(listaPartidos.get(i).getIdLocal(),puntosEquipoL+3);
            }else if(radioButtons.get(i) == 2){
                pts.remove(listaPartidos.get(i).getIdLocal());
                pts.add(listaPartidos.get(i).getIdLocal(),puntosEquipoL+1);
                pts.remove(listaPartidos.get(i).getIdVisitante());
                pts.add(listaPartidos.get(i).getIdVisitante(),puntosEquipoV+1);
            }else if(radioButtons.get(i) == 3){
                pts.remove(listaPartidos.get(i).getIdVisitante());
                pts.add(listaPartidos.get(i).getIdVisitante(),puntosEquipoV+3);
            }
        }
    }

    public void enviar(Intent intent){
        intent.putExtra("bundleId", id);
        intent.putExtra("bundleNom", nom);
        intent.putExtra("bundlePts", pts);
        //intent.putExtra("bundlePos", pos);
        intent.putExtra("bundlePj", pj);
        intent.putExtra("bundleGf", gf);
        intent.putExtra("bundleDg", dg);
        intent.putExtra("bundleDg1", dg1);intent.putExtra("bundleDg2", dg2);intent.putExtra("bundleDg3", dg3);
        intent.putExtra("bundleDg4", dg4);intent.putExtra("bundleDg5", dg5);intent.putExtra("bundleDg6", dg6);
        intent.putExtra("bundleDg7", dg7);intent.putExtra("bundleDg8", dg8);intent.putExtra("bundleDg9", dg9);
        intent.putExtra("bundleDg10", dg10);intent.putExtra("bundleDg11", dg11);intent.putExtra("bundleDg12", dg12);
        intent.putExtra("bundleDg13", dg13);intent.putExtra("bundleDg14", dg14);intent.putExtra("bundleDg15", dg15);
        intent.putExtra("bundleDg16", dg16);intent.putExtra("bundleDg17", dg17);intent.putExtra("bundleDg18", dg18);
        intent.putExtra("bundleDg19", dg19);intent.putExtra("bundleDg20", dg20);
        intent.putExtra("bundleJUG1", jugados1);intent.putExtra("bundleJUG2", jugados2);intent.putExtra("bundleJUG3", jugados3);
        intent.putExtra("bundleJUG4", jugados4);intent.putExtra("bundleJUG5", jugados5);intent.putExtra("bundleJUG6", jugados6);
        intent.putExtra("bundleJUG7", jugados7);intent.putExtra("bundleJUG8", jugados8);intent.putExtra("bundleJUG9", jugados9);
        intent.putExtra("bundleJUG10", jugados10);intent.putExtra("bundleJUG11", jugados11);intent.putExtra("bundleJUG12", jugados12);
        intent.putExtra("bundleJUG13", jugados13);intent.putExtra("bundleJUG14", jugados14);intent.putExtra("bundleJUG15", jugados15);
        intent.putExtra("bundleJUG16", jugados16);intent.putExtra("bundleJUG17", jugados17);intent.putExtra("bundleJUG18", jugados18);
        intent.putExtra("bundleJUG19", jugados19);intent.putExtra("bundleJUG20", jugados20);

        intent.putExtra("bundleIdPartido", idPartido);
        intent.putExtra("bundleGolesL", golesL);
        intent.putExtra("bundleGolesV", golesV);
        intent.putExtra("bundleFecha", fecha);
        intent.putExtra("bundleIdEquipoL", idEquipoL);
        intent.putExtra("bundleIdEquipoV", idEquipoV);
        intent.putExtra("bundleJornada", jornada);
    }
}
