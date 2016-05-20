package com.svs.sportscalculator.primera;

/**
 * Created by sergio on 08/12/2014.
 */
public class Equipo {
    private int id;
    private String nombre;
    private int idImagen;
    private int pts;
    //private int pos;
    private int pj;
    private int gf;
    private int dg;
    private int dg1, dg2, dg3, dg4, dg5, dg6, dg7, dg8, dg9, dg10, dg11, dg12,
            dg13, dg14, dg15, dg16, dg17, dg18, dg19, dg20;
    private int jug1, jug2, jug3, jug4, jug5, jug6, jug7, jug8, jug9, jug10, jug11, jug12,
            jug13, jug14, jug15, jug16, jug17, jug18, jug19, jug20;

    public Equipo(int id, String nombre, int idImagen) {
        this.id = id;
        this.nombre = nombre;
        this.idImagen = idImagen;
    }
    public Equipo(int id, String nombre, int idImagen, int pts/*, int pos*/, int pj, int gf, int dg, int dg1, int dg2,
                  int dg3, int dg4, int dg5, int dg6, int dg7, int dg8, int dg9,
                  int dg10, int dg11, int dg12, int dg13, int dg14, int dg15, int dg16,
                  int dg17, int dg18, int dg19, int dg20, int jug1, int jug2, int jug3, int jug4, int jug5,
                  int jug6, int jug7, int jug8, int jug9, int jug10, int jug11, int jug12, int jug13,
                  int jug14, int jug15, int jug16, int jug17, int jug18, int jug19, int jug20) {
        this.id = id;
        this.nombre = nombre;
        this.idImagen = idImagen;
        this.pts = pts;
        //this.pos = pos;
        this.pj = pj;
        this.gf = gf;
        this.dg = dg;
        this.dg1 = dg1;
        this.dg2 = dg2;
        this.dg3 = dg3;
        this.dg4 = dg4;
        this.dg5 = dg5;
        this.dg6 = dg6;
        this.dg7 = dg7;
        this.dg8 = dg8;
        this.dg9 = dg9;
        this.dg10 = dg10;
        this.dg11 = dg11;
        this.dg12 = dg12;
        this.dg13 = dg13;
        this.dg14 = dg14;
        this.dg15 = dg15;
        this.dg16 = dg16;
        this.dg17 = dg17;
        this.dg18 = dg18;
        this.dg19 = dg19;
        this.dg20 = dg20;
        this.jug1 = jug1;
        this.jug2 = jug2;
        this.jug3 = jug3;
        this.jug4 = jug4;
        this.jug5 = jug5;
        this.jug6 = jug6;
        this.jug7 = jug7;
        this.jug8 = jug8;
        this.jug9 = jug9;
        this.jug10 = jug10;
        this.jug11 = jug11;
        this.jug12 = jug12;
        this.jug13 = jug13;
        this.jug14 = jug14;
        this.jug15 = jug15;
        this.jug16 = jug16;
        this.jug17 = jug17;
        this.jug18 = jug18;
        this.jug19 = jug19;
        this.jug20 = jug20;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getIdImagen() {
        return idImagen;
    }
    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }
    public int getPts() {
        return pts;
    }
    public void setPts(int pts) {
        this.pts = pts;
    }
    /*public int getPos() {
        return pos;
    }
    public void setPos(int pos) {
        this.pos = pos;
    }*/
    public int getPj() {
        return pj;
    }
    public void setPj(int pj) {
        this.pj = pj;
    }
    public int getGf() {
        return gf;
    }
    public void setGf(int gf) {
        this.gf = gf;
    }
    public int getDg() {
        return dg;
    }
    public void setDg(int dg) {
        this.dg = dg;
    }

    public int getDg1() {
        return dg1;
    }

    public void setDg1(int dg1) {
        this.dg1 = dg1;
    }

    public int getDg2() {
        return dg2;
    }

    public void setDg2(int dg2) {
        this.dg2 = dg2;
    }

    public int getDg3() {
        return dg3;
    }

    public void setDg3(int dg3) {
        this.dg3 = dg3;
    }

    public int getDg4() {
        return dg4;
    }

    public void setDg4(int dg4) {
        this.dg4 = dg4;
    }

    public int getDg5() {
        return dg5;
    }

    public void setDg5(int dg5) {
        this.dg5 = dg5;
    }

    public int getDg6() {
        return dg6;
    }

    public void setDg6(int dg6) {
        this.dg6 = dg6;
    }

    public int getDg7() {
        return dg7;
    }

    public void setDg7(int dg7) {
        this.dg7 = dg7;
    }

    public int getDg8() {
        return dg8;
    }

    public void setDg8(int dg8) {
        this.dg8 = dg8;
    }

    public int getDg9() {
        return dg9;
    }

    public void setDg9(int dg9) {
        this.dg9 = dg9;
    }

    public int getDg10() {
        return dg10;
    }

    public void setDg10(int dg10) {
        this.dg10 = dg10;
    }

    public int getDg11() {
        return dg11;
    }

    public void setDg11(int dg11) {
        this.dg11 = dg11;
    }

    public int getDg12() {
        return dg12;
    }

    public void setDg12(int dg12) {
        this.dg12 = dg12;
    }

    public int getDg13() {
        return dg13;
    }

    public void setDg13(int dg13) {
        this.dg13 = dg13;
    }

    public int getDg14() {
        return dg14;
    }

    public void setDg14(int dg14) {
        this.dg14 = dg14;
    }

    public int getDg15() {
        return dg15;
    }

    public void setDg15(int dg15) {
        this.dg15 = dg15;
    }

    public int getDg16() {
        return dg16;
    }

    public void setDg16(int dg16) {
        this.dg16 = dg16;
    }

    public int getDg17() {
        return dg17;
    }

    public void setDg17(int dg17) {
        this.dg17 = dg17;
    }

    public int getDg18() {
        return dg18;
    }

    public void setDg18(int dg18) {
        this.dg18 = dg18;
    }

    public int getDg19() {
        return dg19;
    }

    public void setDg19(int dg19) {
        this.dg19 = dg19;
    }

    public int getDg20() {
        return dg20;
    }

    public void setDg20(int dg20) {
        this.dg20 = dg20;
    }

    public int getJug1() {
        return jug1;
    }

    public void setJug1(int jug1) {
        this.jug1 = jug1;
    }

    public int getJug2() {
        return jug2;
    }

    public void setJug2(int jug2) {
        this.jug2 = jug2;
    }

    public int getJug3() {
        return jug3;
    }

    public void setJug3(int jug3) {
        this.jug3 = jug3;
    }

    public int getJug4() {
        return jug4;
    }

    public void setJug4(int jug4) {
        this.jug4 = jug4;
    }

    public int getJug5() {
        return jug5;
    }

    public void setJug5(int jug5) {
        this.jug5 = jug5;
    }

    public int getJug6() {
        return jug6;
    }

    public void setJug6(int jug6) {
        this.jug6 = jug6;
    }

    public int getJug7() {
        return jug7;
    }

    public void setJug7(int jug7) {
        this.jug7 = jug7;
    }

    public int getJug8() {
        return jug8;
    }

    public void setJug8(int jug8) {
        this.jug8 = jug8;
    }

    public int getJug9() {
        return jug9;
    }

    public void setJug9(int jug9) {
        this.jug9 = jug9;
    }

    public int getJug10() {
        return jug10;
    }

    public void setJug10(int jug10) {
        this.jug10 = jug10;
    }

    public int getJug11() {
        return jug11;
    }

    public void setJug11(int jug11) {
        this.jug11 = jug11;
    }

    public int getJug12() {
        return jug12;
    }

    public void setJug12(int jug12) {
        this.jug12 = jug12;
    }

    public int getJug13() {
        return jug13;
    }

    public void setJug13(int jug13) {
        this.jug13 = jug13;
    }

    public int getJug14() {
        return jug14;
    }

    public void setJug14(int jug14) {
        this.jug14 = jug14;
    }

    public int getJug15() {
        return jug15;
    }

    public void setJug15(int jug15) {
        this.jug15 = jug15;
    }

    public int getJug16() {
        return jug16;
    }

    public void setJug16(int jug16) {
        this.jug16 = jug16;
    }

    public int getJug17() {
        return jug17;
    }

    public void setJug17(int jug17) {
        this.jug17 = jug17;
    }

    public int getJug18() {
        return jug18;
    }

    public void setJug18(int jug18) {
        this.jug18 = jug18;
    }

    public int getJug19() {
        return jug19;
    }

    public void setJug19(int jug19) {
        this.jug19 = jug19;
    }

    public int getJug20() {
        return jug20;
    }

    public void setJug20(int jug20) {
        this.jug20 = jug20;
    }
}
