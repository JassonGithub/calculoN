package com.example.jasson.calc_notas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1pa,n2pa,n3pa;
    private EditText n1sw,n2sw,n3sw;
    private EditText n1ro,n2ro,n3ro;
    private EditText n1se,n2se,n3se;
    private EditText n1au,n2au,n3au;
    float defp,defs,defe,defr,defa;
    private TextView defpa,defro,defse,defsw,defau,lblres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lblres=(TextView) findViewById(R.id.lblres);

        n1pa=(EditText) findViewById(R.id.n1pa);
        n2pa=(EditText) findViewById(R.id.n2pa);
        n3pa=(EditText) findViewById(R.id.n3pa);
        defpa=(TextView) findViewById(R.id.defpa);

        n1sw=(EditText) findViewById(R.id.n1sw);
        n2sw=(EditText) findViewById(R.id.n2sw);
        n3sw=(EditText) findViewById(R.id.n3sw);
        defsw=(TextView) findViewById(R.id.defsw);

        n1se=(EditText) findViewById(R.id.n1se);
        n2se=(EditText) findViewById(R.id.n2se);
        n3se=(EditText) findViewById(R.id.n3se);
        defse=(TextView) findViewById(R.id.defse);

        n1ro=(EditText) findViewById(R.id.n1ro);
        n2ro=(EditText) findViewById(R.id.n2ro);
        n3ro=(EditText) findViewById(R.id.n3ro);
        defro=(TextView) findViewById(R.id.defro);

        n1au=(EditText) findViewById(R.id.n1au);
        n2au=(EditText) findViewById(R.id.n2au);
        n3au=(EditText) findViewById(R.id.n3au);
        defau=(TextView) findViewById(R.id.defau);

        recuperar("arch_pa","nota1",n1pa);
        recuperar("arch_pa","nota2",n2pa);
        recuperar("arch_pa","nota3",n3pa);

        recuperar("arch_sw","nota1",n1sw);
        recuperar("arch_sw","nota2",n2sw);
        recuperar("arch_sw","nota3",n3sw);

        recuperar("arch_se","nota1",n1se);
        recuperar("arch_se","nota2",n2se);
        recuperar("arch_se","nota3",n3se);

        recuperar("arch_ro","nota1",n1ro);
        recuperar("arch_ro","nota2",n2ro);
        recuperar("arch_ro","nota3",n3ro);

        recuperar("arch_au","nota1",n1au);
        recuperar("arch_au","nota2",n2au);
        recuperar("arch_au","nota3",n3au);

        funcionpa();
        funcionsw();
        funcionse();
        funcionro();
        funcionau();

        final EditText fn1pa = (EditText) findViewById(R.id.n1pa);
        fn1pa.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionpa();
                    grabar("arch_pa","nota1",n1pa.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        final EditText fn2pa = (EditText) findViewById(R.id.n2pa);
        fn2pa.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionpa();
                    grabar("arch_pa","nota2",n2pa.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        final EditText fn3pa = (EditText) findViewById(R.id.n3pa);
        fn3pa.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionpa();
                    grabar("arch_pa","nota3",n3pa.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });


        //************************************************************************
        final EditText fn1sw = (EditText) findViewById(R.id.n1sw);
        fn1sw.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionsw();
                    grabar("arch_sw","nota1",n1sw.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        final EditText fn2sw = (EditText) findViewById(R.id.n2sw);
        fn2sw.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionsw();
                    grabar("arch_sw","nota2",n2sw.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        final EditText fn3sw = (EditText) findViewById(R.id.n3sw);
        fn3sw.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionsw();
                    grabar("arch_sw","nota3",n3sw.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        //************************************************************************
        final EditText fn1se = (EditText) findViewById(R.id.n1se);
        fn1se.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionse();
                    grabar("arch_se","nota1",n1se.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        final EditText fn2se = (EditText) findViewById(R.id.n2se);
        fn2se.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionse();
                    grabar("arch_se","nota2",n2se.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        final EditText fn3se = (EditText) findViewById(R.id.n3se);
        fn3se.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionse();
                    grabar("arch_se","nota3",n3se.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        //************************************************************************
        final EditText fn1ro = (EditText) findViewById(R.id.n1ro);
        fn1ro.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionro();
                    grabar("arch_ro","nota1",n1ro.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        final EditText fn2ro = (EditText) findViewById(R.id.n2ro);
        fn2ro.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionro();
                    grabar("arch_ro","nota2",n2ro.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        final EditText fn3ro = (EditText) findViewById(R.id.n3ro);
        fn3ro.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionro();
                    grabar("arch_ro","nota3",n3ro.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        //************************************************************************
        final EditText fn1au = (EditText) findViewById(R.id.n1au);
        fn1au.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionau();
                    grabar("arch_au","nota1",n1au.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        final EditText fn2au = (EditText) findViewById(R.id.n2au);
        fn2au.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionau();
                    grabar("arch_au","nota2",n2au.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });

        final EditText fn3au = (EditText) findViewById(R.id.n3au);
        fn3au.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {

                String aux = s.toString();

                if(aux.length()>0){
                    funcionau();
                    grabar("arch_au","nota3",n3au.getText().toString());
                }
                else{
                    lblres.setText("no ha ingresado nada");
                }
            }
        });


    }

    public void funcionpa(){
        String not1;
        String not2;
        String not3;

        if(n1pa.getText().toString().length()>0){
            if(Float.parseFloat(n1pa.getText().toString())<=5){
                not1 = n1pa.getText().toString();
            }else{
                not1="6";
            }
        }
        else{not1="0";}

        if(n2pa.getText().toString().length()>0){

            if(Float.parseFloat(n2pa.getText().toString())<=5){
                not2 = n2pa.getText().toString();
            }else{
                not2="6";
            }
        }
        else{not2="0";}

        if(n3pa.getText().toString().length()>0){

            if(Float.parseFloat(n3pa.getText().toString())<=5){
                not3 = n3pa.getText().toString();
            }else{
                not3="6";
            }
        }
        else{not3="0";}

        float n1 = Float.parseFloat(not1);
        float n2 = Float.parseFloat(not2);
        float n3 = Float.parseFloat(not3);
        float def = (n1+n2+n3)/3;
        defp=def;

        if(Float.parseFloat(not1)==6 || Float.parseFloat(not2)==6 || Float.parseFloat(not3)==6){
            defpa.setText("Error!");
        }
        else{
            defpa.setText(String.format("%.2f",def));
        }

    }
    public void funcionsw(){
        String not1;
        String not2;
        String not3;

        if(n1sw.getText().toString().length()>0){

            if(Float.parseFloat(n1sw.getText().toString())<=5){
                not1 = n1sw.getText().toString();
            }else{
                not1="6";
            }
        }
        else{not1="0";}
        if(n2sw.getText().toString().length()>0){

            if(Float.parseFloat(n2sw.getText().toString())<=5){
                not2 = n2sw.getText().toString();
            }else{
                not2="6";
            }
        }
        else{not2="0";}

        if(n3sw.getText().toString().length()>0){

            if(Float.parseFloat(n3sw.getText().toString())<=5){
                not3 = n3sw.getText().toString();
            }else{
                not3="6";
            }
        }
        else{not3="0";}

        float n1 = Float.parseFloat(not1);
        float n2 = Float.parseFloat(not2);
        float n3 = Float.parseFloat(not3);
        float def = (n1+n2+n3)/3;
        defs=def;

        if(Float.parseFloat(not1)==6 || Float.parseFloat(not2)==6 || Float.parseFloat(not3)==6){
            defsw.setText("error!");
        }
        else{
            defsw.setText(String.format("%.2f",def));
        }
    }
    public void funcionse(){
        String not1;
        String not2;
        String not3;

        if(n1se.getText().toString().length()>0){

            if(Float.parseFloat(n1se.getText().toString())<=5){
                not1 = n1se.getText().toString();
            }else{
                not1="6";
            }
        }
        else{not1="0";}
        if(n2se.getText().toString().length()>0){

            if(Float.parseFloat(n2se.getText().toString())<=5){
                not2 = n2se.getText().toString();
            }else{
                not2="6";
            }
        }
        else{not2="0";}

        if(n3se.getText().toString().length()>0){

            if(Float.parseFloat(n3se.getText().toString())<=5){
                not3 = n3se.getText().toString();
            }else{
                not3="6";
            }
        }
        else{not3="0";}

        float n1 = Float.parseFloat(not1);
        float n2 = Float.parseFloat(not2);
        float n3 = Float.parseFloat(not3);
        float def = (n1+n2+n3)/3;
        defe=def;

        if(Float.parseFloat(not1)==6 || Float.parseFloat(not2)==6 || Float.parseFloat(not3)==6){
            defse.setText("error!");
        }
        else{
            defse.setText(String.format("%.2f",def));
        }
    }
    public void funcionro(){
        String not1;
        String not2;
        String not3;

        if(n1ro.getText().toString().length()>0){

            if(Float.parseFloat(n1ro.getText().toString())<=5){
                not1 = n1ro.getText().toString();
            }else{
                not1="6";
            }
        }
        else{not1="0";}
        if(n2ro.getText().toString().length()>0){

            if(Float.parseFloat(n2ro.getText().toString())<=5){
                not2 = n2ro.getText().toString();
            }else{
                not2="6";
            }
        }
        else{not2="0";}

        if(n3ro.getText().toString().length()>0){

            if(Float.parseFloat(n3ro.getText().toString())<=5){
                not3 = n3ro.getText().toString();
            }else{
                not3="6";
            }
        }
        else{not3="0";}

        float n1 = Float.parseFloat(not1);
        float n2 = Float.parseFloat(not2);
        float n3 = Float.parseFloat(not3);
        float def = (n1+n2+n3)/3;
        defr=def;

        if(Float.parseFloat(not1)==6 || Float.parseFloat(not2)==6 || Float.parseFloat(not3)==6){
            defro.setText("error!");
        }
        else{
            defro.setText(String.format("%.2f",def));
        }
    }
    public void funcionau(){
        String not1;
        String not2;
        String not3;

        if(n1au.getText().toString().length()>0){

            if(Float.parseFloat(n1au.getText().toString())<=5){
                not1 = n1au.getText().toString();
            }else{
                not1="6";
            }
        }
        else{not1="0";}
        if(n2au.getText().toString().length()>0){

            if(Float.parseFloat(n2au.getText().toString())<=5){
                not2 = n2au.getText().toString();
            }else{
                not2="6";
            }
        }
        else{not2="0";}

        if(n3au.getText().toString().length()>0){

            if(Float.parseFloat(n3au.getText().toString())<=5){
                not3 = n3au.getText().toString();
            }else{
                not3="6";
            }
        }
        else{not3="0";}

        float n1 = Float.parseFloat(not1);
        float n2 = Float.parseFloat(not2);
        float n3 = Float.parseFloat(not3);
        float def = (n1+n2+n3)/3;
        defa=def;

        if(Float.parseFloat(not1)==6 || Float.parseFloat(not2)==6 || Float.parseFloat(not3)==6){
            defau.setText("error!");
        }
        else{
            defau.setText(String.format("%.2f",def));
        }

    }
    public void final_semestre(View view){

        float finals = (defa+defs+defe+defr+defa)/5;
        lblres.setText("Promedio semestre: "+String.format("%.2f",finals));
        Toast toast1 = Toast.makeText(getApplicationContext(), "Final semestre: "+String.format("%.2f",finals), Toast.LENGTH_LONG);
        toast1.show();
    }

    public void grabar(String archivo_name, String key, String nota){

        SharedPreferences preferencias=getSharedPreferences(archivo_name, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();
        editor.putString(key,nota);
        editor.commit();
    }

    public void recuperar(String archivo_name, String key, EditText e){
        SharedPreferences prefe = getSharedPreferences(archivo_name, Context.MODE_PRIVATE);
        String dato = prefe.getString(key, "");
        if (dato.length()==0) {
            Toast.makeText(this,"No existe", Toast.LENGTH_LONG).show();
        }
        else {
            e.setText(dato);
        }
    }

    public void acerca_de(View view){
        Intent i = new Intent(this,Acerca_DE.class);
        startActivity(i);
    }



}
