package com.svs.sportscalculator.primera;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.svs.sportscalculator.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sergio on 04/02/2015.
 */
public class ExpandableListAdapter extends BaseExpandableListAdapter {
    private Context _context;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, ArrayList<Partido>> _listDataChild;

    ArrayList<Integer> radioButtons = new ArrayList<Integer>();

    int numJornada;

    public ExpandableListAdapter(Context context, List<String> listDataHeader,
                                 HashMap<String, ArrayList<Partido>> listChildData, int numeroJornada) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
        this.numJornada = numeroJornada;

        for(int i=0; i<380; i++){
            radioButtons.add(0);
        }
    }

    //LigaEsp1Calc lec = new LigaEsp1Calc();
    //int numJornada = 31;

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        //Log.e("PRUEBA"," "+numJornada);
        final Partido childPartido = (Partido) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.liga_esp1_list_item, null);
        }

        //TextView fecha = (TextView) convertView.findViewById(R.id.fecha);
        //fecha.setText(childPartido.getFechaS());
        ImageView escudoL = (ImageView) convertView.findViewById(R.id.escudoL);
        escudoL.setImageResource(childPartido.getIdImagenL());
        ImageView escudoV = (ImageView) convertView.findViewById(R.id.escudoV);
        escudoV.setImageResource(childPartido.getIdImagenV());
        TextView nombreL = (TextView) convertView.findViewById(R.id.nombreEquipoL);
        nombreL.setText(childPartido.getLocalS());
        TextView nombreV = (TextView) convertView.findViewById(R.id.nombreEquipoV);
        nombreV.setText(childPartido.getVisitanteS());

        RadioGroup rg = (RadioGroup) convertView.findViewById(R.id.radioGroup1);
        RadioButton rb1 = (RadioButton) convertView.findViewById(R.id.radioButton1);
        RadioButton rb2 = (RadioButton) convertView.findViewById(R.id.radioButton2);
        RadioButton rb3 = (RadioButton) convertView.findViewById(R.id.radioButton3);
        final int positionPartido = childPartido.getId()-1;
        rb1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                radioButtons.remove(positionPartido);
                radioButtons.add(positionPartido,1);
                //0=ninguno,1=izda,2=centro,3=dcha
            }
        });
        rb2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                radioButtons.remove(positionPartido);
                radioButtons.add(positionPartido,2);
                //0=ninguno,1=izda,2=centro,3=dcha
            }
        });
        rb3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                radioButtons.remove(positionPartido);
                radioButtons.add(positionPartido,3);
                //0=ninguno,1=izda,2=centro,3=dcha
            }
        });
        if(radioButtons.get(positionPartido)==1){
            rg.check(R.id.radioButton1);
        }else if(radioButtons.get(positionPartido)==2){
            rg.check(R.id.radioButton2);
        }else if(radioButtons.get(positionPartido)==3){
            rg.check(R.id.radioButton3);
        }else{
            rg.check(0);
        }
        //Log.e("PRUEBA","Lista RadioButtons: "+radioButtons+" PosPartido: "+positionPartido);
        //Log.e("PRUEBA", "NumJornada:" + childPartido.getNumJornada());
        //Log.e("PRUEBA", "" + rg.getChildCount());

        if(childPartido.getNumJornada() < numJornada){
            for (int i = 0; i < rg.getChildCount(); i++) {
                rg.getChildAt(i).setEnabled(false);
            }
            if(childPartido.getGolesLocal() - childPartido.getGolesVisitante() > 0){
                rg.check(R.id.radioButton1);
            }else if(childPartido.getGolesLocal() - childPartido.getGolesVisitante() < 0){
                rg.check(R.id.radioButton3);
            }else{
                rg.check(R.id.radioButton2);
            }
        }else{
            for (int i = 0; i < rg.getChildCount(); i++) {
                rg.getChildAt(i).setEnabled(true);
            }
        }

        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.liga_esp1_list_group, null);
        }

        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    public ArrayList<Integer> getRadioButtons(){
        return radioButtons;
    }
}
