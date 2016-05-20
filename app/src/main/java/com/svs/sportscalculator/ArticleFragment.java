package com.svs.sportscalculator;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.svs.sportscalculator.primera.LigaEsp1Calc;
import com.svs.sportscalculator.primera.LigaEsp1Clas;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sergio on 07/02/2015.
 */
public class ArticleFragment extends Fragment {
    public static final String ARG_ARTICLES_NUMBER = "articles_number";

    private ProgressDialog pDialog;
    JSONParser jParser = new JSONParser();
    ArrayList<HashMap<String, String>> equiposList;
    private static String url_all_equipos = "http://abaco.sevase.es/equipo/getEquipos";
    //private static String url_all_equipos = "http://10.0.2.2:8081/abaco/equipo/getEquipos";
    //private static String url_all_equipos = "http://sportcalc.esy.es/get_equipos.php";
    private static final String TAG_SUCCESS = "success";
    private static final String TAG_EQUIPOS = "equipos";
    private static final String TAG_ID = "id";
    private static final String TAG_NOMBRE = "nombre";
    //private static final String TAG_POS = "pos";
    private static final String TAG_PTS = "pts";
    private static final String TAG_PJ = "pj";
    private static final String TAG_GF = "gf";
    private static final String TAG_DG = "dg";
    private static final String TAG_DG1 = "dg1";private static final String TAG_DG2 = "dg2";
    private static final String TAG_DG3 = "dg3";private static final String TAG_DG4 = "dg4";
    private static final String TAG_DG5 = "dg5";private static final String TAG_DG6 = "dg6";
    private static final String TAG_DG7 = "dg7";private static final String TAG_DG8 = "dg8";
    private static final String TAG_DG9 = "dg9";private static final String TAG_DG10 = "dg10";
    private static final String TAG_DG11 = "dg11";private static final String TAG_DG12 = "dg12";
    private static final String TAG_DG13 = "dg13";private static final String TAG_DG14 = "dg14";
    private static final String TAG_DG15 = "dg15";private static final String TAG_DG16 = "dg16";
    private static final String TAG_DG17 = "dg17";private static final String TAG_DG18 = "dg18";
    private static final String TAG_DG19 = "dg19";private static final String TAG_DG20 = "dg20";
    private static final String TAG_JUG1 = "jugados1";private static final String TAG_JUG2 = "jugados2";
    private static final String TAG_JUG3 = "jugados3";private static final String TAG_JUG4 = "jugados4";
    private static final String TAG_JUG5 = "jugados5";private static final String TAG_JUG6 = "jugados6";
    private static final String TAG_JUG7 = "jugados7";private static final String TAG_JUG8 = "jugados8";
    private static final String TAG_JUG9 = "jugados9";private static final String TAG_JUG10 = "jugados10";
    private static final String TAG_JUG11 = "jugados11";private static final String TAG_JUG12 = "jugados12";
    private static final String TAG_JUG13 = "jugados13";private static final String TAG_JUG14 = "jugados14";
    private static final String TAG_JUG15 = "jugados15";private static final String TAG_JUG16 = "jugados16";
    private static final String TAG_JUG17 = "jugados17";private static final String TAG_JUG18 = "jugados18";
    private static final String TAG_JUG19 = "jugados19";private static final String TAG_JUG20 = "jugados20";
    JSONArray equipos = null;

    ArrayList<Integer> id = new ArrayList<Integer>();
    ArrayList<String> nom = new ArrayList<String>();
    ArrayList<Integer> pts = new ArrayList<Integer>();
    ArrayList<Integer> pos = new ArrayList<Integer>();
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

    private static String url_all_partidos = "http://abaco.sevase.es/partido/getPartidos";
    //private static String url_all_partidos = "http://10.0.2.2:8081/abaco/partido/getPartidos";
    //private static String url_all_partidos = "http://sportcalc.esy.es/get_partidos.php";
    private static final String TAG_SUCCESS_P = "success";
    private static final String TAG_PARTIDOS = "partidos";
    private static final String TAG_ID_P = "id";
    private static final String TAG_GOLESL = "goleslocal";
    private static final String TAG_GOLESV = "golesvisit";
    private static final String TAG_FECHA = "fecha";
    private static final String TAG_EQUIPOL = "equipol";
    private static final String TAG_EQUIPOV = "equipov";
    //private static final String TAG_IDEQUIPOL = "idequipol";
    //private static final String TAG_IDEQUIPOV = "idequipov";
    private static final String TAG_JORNADA = "jornada";
    JSONArray partidos = null;

    ArrayList<Integer> idPartido = new ArrayList<Integer>();
    ArrayList<Integer> golesL = new ArrayList<Integer>();
    ArrayList<Integer> golesV = new ArrayList<Integer>();
    ArrayList<String> fecha = new ArrayList<String>();
    ArrayList<Integer> idEquipoL = new ArrayList<Integer>();
    ArrayList<Integer> idEquipoV = new ArrayList<Integer>();
    ArrayList<Integer> jornada = new ArrayList<Integer>();

    private static String url_all_jornadas = "http://abaco.sevase.es/jornada/getJornada";
    //private static String url_all_jornadas = "http://10.0.2.2:8081/abaco/jornada/getJornada";
    //private static String url_all_jornadas = "http://sportcalc.esy.es/get_jornada.php";
    private static final String TAG_SUCCESS_J = "success";
    private static final String TAG_JORNADAS = "jornada";
    private static final String TAG_NUMERO = "numero";
    JSONArray jornadas = null;

    int numJornada = 0;

    public ArticleFragment() {
        // Constructor vacío obligatorio
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_article, container, false);
        int i = getArguments().getInt(ARG_ARTICLES_NUMBER);
        String article = getResources().getStringArray(R.array.Tags)[i];

        getActivity().setTitle(article);
        //TextView headline = (TextView)rootView.findViewById(R.id.headline);
        //headline.append(" "+article);

        ImageView img = (ImageView) rootView.findViewById(R.id.imageView);
        Button buttonClas = (Button) rootView.findViewById(R.id.buttonClas);
        Button buttonCalc = (Button) rootView.findViewById(R.id.buttonCalc);
        /*if(i == 0){
            headline.setVisibility(rootView.GONE);
            buttonClas.setVisibility(rootView.GONE);
            buttonCalc.setVisibility(rootView.GONE);
            img.setImageResource(R.drawable.cabecera);
        }else*/ if(i == 0){
            //headline.setVisibility(rootView.GONE);
            img.setImageResource(R.drawable.primera);
            new LoadLiga().execute();
            buttonClas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), LigaEsp1Clas.class);
                    enviarLiga(intent);
                    startActivity(intent);
                }
            });
            buttonCalc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), LigaEsp1Calc.class);
                    enviarLiga(intent);
                    startActivity(intent);
                }
            });
        }else if(i == 1){
            //headline.setVisibility(rootView.GONE);
            img.setImageResource(R.drawable.segunda);
            buttonClas.setText("Próximamente");
            buttonCalc.setVisibility(rootView.GONE);
        }/*else if(i == 2){
            headline.setVisibility(rootView.GONE);
            img.setImageResource(R.drawable.ligabaloncesto);
            buttonClas.setText("Próximamente");
            buttonCalc.setVisibility(rootView.GONE);
        }else if(i == 3){
            headline.setVisibility(rootView.GONE);
            img.setImageResource(R.drawable.motor);
            buttonClas.setText("Próximamente");
            buttonCalc.setVisibility(rootView.GONE);
        }*/

        return rootView;
    }

    class LoadLiga extends AsyncTask<String, String, String> {
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(getActivity());
            pDialog.setMessage("Cargando datos...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(false);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... args) {
            // Building Parameters
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            // getting JSON string from URL
            JSONObject json = jParser.makeHttpRequest(url_all_equipos, "GET", params);
            JSONObject json2 = jParser.makeHttpRequest(url_all_partidos, "GET", params);
            JSONObject json3 = jParser.makeHttpRequest(url_all_jornadas, "GET", params);

            // Check your log cat for JSON reponse
            /*Log.e("All Equipos: ", json.toString());
            Log.e("All Partidos: ", json2.toString());*/

            try {
                // Checking for SUCCESS TAG
                int success = json.getInt(TAG_SUCCESS);
                int successP = json.getInt(TAG_SUCCESS_P);
                int successJ = json.getInt(TAG_SUCCESS_J);

                if (success == 1) {
                    // equipos found
                    // Getting Array of Equipos
                    equipos = json.getJSONArray(TAG_EQUIPOS);

                    // looping through All Equipos
                    for (int i = 0; i < equipos.length(); i++) {
                        JSONObject c = equipos.getJSONObject(i);

                        // Storing each json item in variable
                        int tag_id = Integer.parseInt(c.getString(TAG_ID));
                        String tag_nombre = c.getString(TAG_NOMBRE);
                        int tag_pts = Integer.parseInt(c.getString(TAG_PTS));
                        //int tag_pos = Integer.parseInt(c.getString(TAG_POS));
                        int tag_pj = Integer.parseInt(c.getString(TAG_PJ));
                        int tag_gf = Integer.parseInt(c.getString(TAG_GF));
                        int tag_dg = Integer.parseInt(c.getString(TAG_DG));
                        int tag_dg1 = Integer.parseInt(c.getString(TAG_DG1));int tag_dg2 = Integer.parseInt(c.getString(TAG_DG2));
                        int tag_dg3 = Integer.parseInt(c.getString(TAG_DG3));int tag_dg4 = Integer.parseInt(c.getString(TAG_DG4));
                        int tag_dg5 = Integer.parseInt(c.getString(TAG_DG5));int tag_dg6 = Integer.parseInt(c.getString(TAG_DG6));
                        int tag_dg7 = Integer.parseInt(c.getString(TAG_DG7));int tag_dg8 = Integer.parseInt(c.getString(TAG_DG8));
                        int tag_dg9 = Integer.parseInt(c.getString(TAG_DG9));int tag_dg10 = Integer.parseInt(c.getString(TAG_DG10));
                        int tag_dg11 = Integer.parseInt(c.getString(TAG_DG11));int tag_dg12 = Integer.parseInt(c.getString(TAG_DG12));
                        int tag_dg13 = Integer.parseInt(c.getString(TAG_DG13));int tag_dg14 = Integer.parseInt(c.getString(TAG_DG14));
                        int tag_dg15 = Integer.parseInt(c.getString(TAG_DG15));int tag_dg16 = Integer.parseInt(c.getString(TAG_DG16));
                        int tag_dg17 = Integer.parseInt(c.getString(TAG_DG17));int tag_dg18 = Integer.parseInt(c.getString(TAG_DG18));
                        int tag_dg19 = Integer.parseInt(c.getString(TAG_DG19));int tag_dg20 = Integer.parseInt(c.getString(TAG_DG20));
                        int tag_JUG1 = Integer.parseInt(c.getString(TAG_JUG1));int tag_JUG2 = Integer.parseInt(c.getString(TAG_JUG2));
                        int tag_JUG3 = Integer.parseInt(c.getString(TAG_JUG3));int tag_JUG4 = Integer.parseInt(c.getString(TAG_JUG4));
                        int tag_JUG5 = Integer.parseInt(c.getString(TAG_JUG5));int tag_JUG6 = Integer.parseInt(c.getString(TAG_JUG6));
                        int tag_JUG7 = Integer.parseInt(c.getString(TAG_JUG7));int tag_JUG8 = Integer.parseInt(c.getString(TAG_JUG8));
                        int tag_JUG9 = Integer.parseInt(c.getString(TAG_JUG9));int tag_JUG10 = Integer.parseInt(c.getString(TAG_JUG10));
                        int tag_JUG11 = Integer.parseInt(c.getString(TAG_JUG11));int tag_JUG12 = Integer.parseInt(c.getString(TAG_JUG12));
                        int tag_JUG13 = Integer.parseInt(c.getString(TAG_JUG13));int tag_JUG14 = Integer.parseInt(c.getString(TAG_JUG14));
                        int tag_JUG15 = Integer.parseInt(c.getString(TAG_JUG15));int tag_JUG16 = Integer.parseInt(c.getString(TAG_JUG16));
                        int tag_JUG17 = Integer.parseInt(c.getString(TAG_JUG17));int tag_JUG18 = Integer.parseInt(c.getString(TAG_JUG18));
                        int tag_JUG19 = Integer.parseInt(c.getString(TAG_JUG19));int tag_JUG20 = Integer.parseInt(c.getString(TAG_JUG20));

                        id.add(tag_id);nom.add(tag_nombre);pts.add(tag_pts);/*pos.add(tag_pos);*/pj.add(tag_pj);gf.add(tag_gf);dg.add(tag_dg);
                        dg1.add(tag_dg1);dg2.add(tag_dg2);dg3.add(tag_dg3);dg4.add(tag_dg4);dg5.add(tag_dg5);
                        dg6.add(tag_dg6);dg7.add(tag_dg7);dg8.add(tag_dg8);dg9.add(tag_dg9);dg10.add(tag_dg10);
                        dg11.add(tag_dg11);dg12.add(tag_dg12);dg13.add(tag_dg13);dg14.add(tag_dg14);dg15.add(tag_dg15);
                        dg16.add(tag_dg16);dg17.add(tag_dg17);dg18.add(tag_dg18);dg19.add(tag_dg19);dg20.add(tag_dg20);
                        jugados1.add(tag_JUG1);jugados2.add(tag_JUG2);jugados3.add(tag_JUG3);jugados4.add(tag_JUG4);jugados5.add(tag_JUG5);
                        jugados6.add(tag_JUG6);jugados7.add(tag_JUG7);jugados8.add(tag_JUG8);jugados9.add(tag_JUG9);jugados10.add(tag_JUG10);
                        jugados11.add(tag_JUG11);jugados12.add(tag_JUG12);jugados13.add(tag_JUG13);jugados14.add(tag_JUG14);jugados15.add(tag_JUG15);
                        jugados16.add(tag_JUG16);jugados17.add(tag_JUG17);jugados18.add(tag_JUG18);jugados19.add(tag_JUG19);jugados20.add(tag_JUG20);
                    }
                } else {
                    Log.e("Equipos: ", "No hay equipos.");
                }

                if (successP == 1) {
                    // partidos found
                    // Getting Array of Partidos
                    partidos = json2.getJSONArray(TAG_PARTIDOS);

                    // looping through All Partidos
                    for (int i = 0; i < partidos.length(); i++) {
                        JSONObject c = partidos.getJSONObject(i);

                        // Storing each json item in variable
                        int tag_id_p = Integer.parseInt(c.getString(TAG_ID_P));
                        int tag_golesl = Integer.parseInt(c.getString(TAG_GOLESL));
                        int tag_golesv = Integer.parseInt(c.getString(TAG_GOLESV));
                        String tag_fecha = c.getString(TAG_FECHA);
                        JSONObject tag_equipol = c.getJSONObject(TAG_EQUIPOL);
                        JSONObject tag_equipov = c.getJSONObject(TAG_EQUIPOV);
                        //Log.e("PRUEBA","tag_equipol: "+tag_equipol);
                        //Log.e("PRUEBA","tag_equipov: "+tag_equipov);
                        int tag_idequipol = Integer.parseInt(tag_equipol.getString(TAG_ID_P));
                        int tag_idequipov = Integer.parseInt(tag_equipov.getString(TAG_ID_P));
                        //Log.e("PRUEBA","tag_idequipol: "+tag_idequipol);
                        //Log.e("PRUEBA","tag_idequipov: "+tag_idequipov);
                        //int tag_idequipol = Integer.parseInt(c.getString(TAG_EQUIPOL));
                        //int tag_idequipov = Integer.parseInt(c.getString(TAG_EQUIPOV));
                        int tag_jornada = Integer.parseInt(c.getString(TAG_JORNADA));

                        idPartido.add(tag_id_p);golesL.add(tag_golesl);golesV.add(tag_golesv);fecha.add(tag_fecha);
                        idEquipoL.add(tag_idequipol);idEquipoV.add(tag_idequipov);jornada.add(tag_jornada);
                    }
                } else {
                    Log.e("Partidos: ", "No hay partidos.");
                }

                if (successJ == 1) {
                    // jornadas found
                    // Getting Array of Jornadas
                    jornadas = json3.getJSONArray(TAG_JORNADAS);

                    // looping through All Jornadas
                    for (int i = 0; i < jornadas.length(); i++) {
                        JSONObject c = jornadas.getJSONObject(i);
                        // Storing each json item in variable
                        int tag_numjornada = Integer.parseInt(c.getString(TAG_NUMERO));

                        numJornada = tag_numjornada;
                    }
                } else {
                    Log.e("Jornadas: ", "No hay jornadas.");
                }
                //Log.e("SC", "id Equipos: " + id);
                //Log.e("SC", "id Partidos: " + idPartido);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }
        protected void onPostExecute(String file_url) {
            // dismiss the dialog after getting all products
            pDialog.dismiss();
            // updating UI from Background Thread

            getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    //enviar datos a la siguiente activity
                }
            });

        }
    }
    public void enviarLiga(Intent intent){
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

        intent.putExtra("bundleNumJornada", numJornada);
    }
}