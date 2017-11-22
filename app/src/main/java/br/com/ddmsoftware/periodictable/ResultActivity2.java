package br.com.ddmsoftware.periodictable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;

public class ResultActivity2 extends AppCompatActivity {

    public static final String URL_MESSAGE = "br.com.ddmsoftware.periodictable.URLMESSAGE";

    private String url = "";

    private TextView tvResult_Z;
    private TextView tvResult_Element;
    private TextView tvResultGroup;
    private TextView tvResultPeriod;

    private TextView tvResult_Element2;
    private TextView tvResult_LatimName;
    private TextView tvResultOriginName;
    private TextView tvResultAtomicWeight;
    private TextView tvResultDensidade;
    private TextView tvResultFusao;
    private TextView tvResultEbulicao;
    private TextView tvResult_Abundancia;
    private TextView tvResult_CJ;
    private TextView tvResult_X10;

    private AppBarLayout appBarLayoutImage;

    private FirebaseAnalytics mFirebaseAnalytics;

    private enum Elements {
        H,He, Li, Be,B,C,N,O,F,Ne,Na,Mg,Al,Si,P,S,Cl,Ar,K,Ca,Sc,Ti,V,Cr,Mn,
        Fe,Co,Ni,Cu,Zn,Ga,Ge,As,Se,Br,Kr,Rb,Sr,Y,Zr,Nb,Mo,Tc,Ru,Rh,Pd,Ag,Cd,In,Sn,Sb,Te,I,Xe,Cs,
        Ba,La,Ce,Pr,Nd,Pm,Sm,Eu,Gd,Tb,Dy,Ho,Er,Tm,Yb,Lu,Hf,Ta,W,Re,Os,Ir,Pt,Au,Hg,Tl,Pb,Bi,Po,At,
        Rn,Fr,Ra,Ac,Th,Pa,U,Np, Pu, Am, Cm,Bk, Cf, Es, Fm, Md, No, Lr, Rf, Db, Sg, Bh, Hs, Mt,
        Ds,Rg, Cn, Uut, Fl, Uup, Lv, Uus, Uuo
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvResult_Z = findViewById(R.id.tvResultZ);
        tvResult_Element = findViewById(R.id.tvResultElement);
        tvResultGroup = findViewById(R.id.tvResultGroup);
        tvResultPeriod = findViewById(R.id.tvResultPeriod);

        tvResult_Element2 = findViewById(R.id.tvResult_Element2);
        tvResult_LatimName = findViewById(R.id.tvResult_LatimName);
        tvResultOriginName = findViewById(R.id.tvResultOriginName);
        tvResultAtomicWeight = findViewById(R.id.tvResultAtomicWeight);
        tvResultDensidade = findViewById(R.id.tvResultDensidade);
        tvResultFusao = findViewById(R.id.tvResultFusao);
        tvResultEbulicao = findViewById(R.id.tvResultEbulicao);
        tvResult_Abundancia = findViewById(R.id.tvResult_Abundancia);
        tvResult_CJ = findViewById(R.id.tvResult_CJ);
        tvResult_X10 = findViewById(R.id.tvResult_X10);

        appBarLayoutImage = findViewById(R.id.app_bar);

        FloatingActionButton fab =  findViewById(R.id.fabWiki);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "Wiki");
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Wikipedia_Click");
                bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

                // Valida se a conexão com a internet existe
                if (checkConnection()) {
                    Intent intent = new Intent(ResultActivity2.this, WebviewActivity.class);
                    intent.putExtra(URL_MESSAGE, url);

                    startActivity(intent);
                } else {
                    Toast.makeText(ResultActivity2.this,R.string.network_connection, Toast.LENGTH_LONG).show();
                }
            }
        });


        receiveDataFromActivity();

        // Load Advertisement Banner
        AdView mAdView = findViewById(R.id.adViewResult);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // handle arrow click here
        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("ConstantConditions")
    @SuppressLint("SetTextI18n")
    private void receiveDataFromActivity() {
                /*
        Z[0]                    Sym[1]	                Element[2]
        Oficiallatim[3]	        Origin of name[4]       Group[5]
        Group Name[6]	        Period[7]	            Atomic weight (u (±))[8]
        Density (g/cm3)[9]	    Melting Point (K)[10]	Boiling Point (K)[11]
        C10 (J/(g·K))[12]	    χ10[13]                 Abundance (mg/kg)[14]
        URL[15]	                Image[16]*/

        String[] aResult;

        Intent intent = getIntent();

        Bundle extra = intent.getExtras();
        assert extra != null;

        String message = extra.getString(MainActivity.EXTRA_MESSAGE);

        aResult = message != null ? message.split( ";" ) : new String[0];

        tvResult_Element.setText(aResult[2] + " (" + aResult[1] +")");
        getSupportActionBar().setTitle(tvResult_Element.getText());

        tvResult_Z.setText(aResult[0]);
        tvResult_Element.setText(aResult[2] + " (" + aResult[1] +")"); // "Nome em Latim: "
        tvResultGroup.setText(aResult[5]+ "-" + aResult[6]); // Group  + Group name
        tvResultPeriod.setText(aResult[7]); //Period

        //tvResult_Element1.setText(aResult[2] + " (" + aResult[1] +")"); //Element

        tvResult_Element2.setText(aResult[2] + " (" + aResult[1] +")"); // Element
        tvResult_LatimName.setText(aResult[3]);//Latim name
        tvResultOriginName.setText(aResult[4]); //Origin name
        tvResultAtomicWeight.setText(aResult[8]); //Atomic Weight

        tvResultDensidade.setText(aResult[9]); // Density
        tvResultFusao.setText(aResult[10]); //"Ponto de Fusão: " +
        tvResultEbulicao.setText(aResult[11]); //"Ponto de Ebulição: " +
        tvResult_Abundancia.setText(aResult[14]); //"Abundância: " +
        tvResult_CJ.setText(aResult[12]); //"CJ: " +
        tvResult_X10.setText(aResult[13]); //"X10: " +

        url = aResult[15];

        setElementImageOnAppBar(aResult[1]);
    }


    private void setElementImageOnAppBar(String pElement) {

        //String value ; // assume input
        ResultActivity2.Elements element = ResultActivity2.Elements.valueOf(pElement);

        switch(element) {
            case H  : appBarLayoutImage.setBackgroundResource(R.drawable.h); break;
            case He : appBarLayoutImage.setBackgroundResource(R.drawable.he); break;
            case Li : appBarLayoutImage.setBackgroundResource(R.drawable.li); break;
            case Be : appBarLayoutImage.setBackgroundResource(R.drawable.be); break;
            case B  : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case C  : appBarLayoutImage.setBackgroundResource(R.drawable.c); break;
            case N  : appBarLayoutImage.setBackgroundResource(R.drawable.n); break;
            case O  : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case F  : appBarLayoutImage.setBackgroundResource(R.drawable.f); break;
            case Ne : appBarLayoutImage.setBackgroundResource(R.drawable.ne); break;
            case Na : appBarLayoutImage.setBackgroundResource(R.drawable.na); break;
            case Mg : appBarLayoutImage.setBackgroundResource(R.drawable.mg); break;
            case Al : appBarLayoutImage.setBackgroundResource(R.drawable.al); break;
            case Si : appBarLayoutImage.setBackgroundResource(R.drawable.si); break;
            case P  : appBarLayoutImage.setBackgroundResource(R.drawable.p); break;
            case S  : appBarLayoutImage.setBackgroundResource(R.drawable.s); break;
            case Cl : appBarLayoutImage.setBackgroundResource(R.drawable.cl); break;
            case Ar : appBarLayoutImage.setBackgroundResource(R.drawable.ar); break;
            case K  : appBarLayoutImage.setBackgroundResource(R.drawable.k); break;
            case Ca : appBarLayoutImage.setBackgroundResource(R.drawable.ca); break;
            case Sc : appBarLayoutImage.setBackgroundResource(R.drawable.sc); break;
            case Ti : appBarLayoutImage.setBackgroundResource(R.drawable.ti); break;
            case V  : appBarLayoutImage.setBackgroundResource(R.drawable.v); break;
            case Cr : appBarLayoutImage.setBackgroundResource(R.drawable.cr); break;
            case Mn : appBarLayoutImage.setBackgroundResource(R.drawable.mn); break;
            case Fe : appBarLayoutImage.setBackgroundResource(R.drawable.fe); break;
            case Co : appBarLayoutImage.setBackgroundResource(R.drawable.co); break;
            case Ni : appBarLayoutImage.setBackgroundResource(R.drawable.ni); break;
            case Cu : appBarLayoutImage.setBackgroundResource(R.drawable.cu); break;
            case Zn : appBarLayoutImage.setBackgroundResource(R.drawable.zn); break;
            case Ga : appBarLayoutImage.setBackgroundResource(R.drawable.ga); break;
            case Ge : appBarLayoutImage.setBackgroundResource(R.drawable.ge); break;
            case As : appBarLayoutImage.setBackgroundResource(R.drawable.as); break;
            case Se : appBarLayoutImage.setBackgroundResource(R.drawable.se); break;
            case Br : appBarLayoutImage.setBackgroundResource(R.drawable.br); break;
            case Kr : appBarLayoutImage.setBackgroundResource(R.drawable.kr); break;
            case Rb : appBarLayoutImage.setBackgroundResource(R.drawable.rb); break;
            case Sr : appBarLayoutImage.setBackgroundResource(R.drawable.sr); break;
            case Y  : appBarLayoutImage.setBackgroundResource(R.drawable.y); break;
            case Zr : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Nb : appBarLayoutImage.setBackgroundResource(R.drawable.nb); break;
            case Mo : appBarLayoutImage.setBackgroundResource(R.drawable.mo); break;
            case Tc : appBarLayoutImage.setBackgroundResource(R.drawable.tc); break;
            case Ru : appBarLayoutImage.setBackgroundResource(R.drawable.ru); break;
            case Rh : appBarLayoutImage.setBackgroundResource(R.drawable.rh); break;
            case Pd : appBarLayoutImage.setBackgroundResource(R.drawable.pd); break;
            case Ag : appBarLayoutImage.setBackgroundResource(R.drawable.ag); break;
            case Cd : appBarLayoutImage.setBackgroundResource(R.drawable.cd); break;
            case In : appBarLayoutImage.setBackgroundResource(R.drawable.in); break;
            case Sn : appBarLayoutImage.setBackgroundResource(R.drawable.sn); break;
            case Sb : appBarLayoutImage.setBackgroundResource(R.drawable.sb); break;
            case Te : appBarLayoutImage.setBackgroundResource(R.drawable.te); break;
            case I  : appBarLayoutImage.setBackgroundResource(R.drawable.i); break;
            case Xe : appBarLayoutImage.setBackgroundResource(R.drawable.xe); break;
            case Cs : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Ba : appBarLayoutImage.setBackgroundResource(R.drawable.ba); break;
            case La : appBarLayoutImage.setBackgroundResource(R.drawable.la); break;
            case Ce : appBarLayoutImage.setBackgroundResource(R.drawable.ce); break;
            case Pr : appBarLayoutImage.setBackgroundResource(R.drawable.pr); break;
            case Nd : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Pm : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Sm : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Eu : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Gd : appBarLayoutImage.setBackgroundResource(R.drawable.gd); break;
            case Tb : appBarLayoutImage.setBackgroundResource(R.drawable.tb); break;
            case Dy : appBarLayoutImage.setBackgroundResource(R.drawable.dy); break;
            case Ho : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Er : appBarLayoutImage.setBackgroundResource(R.drawable.er); break;
            case Tm : appBarLayoutImage.setBackgroundResource(R.drawable.tm); break;
            case Yb : appBarLayoutImage.setBackgroundResource(R.drawable.yb); break;
            case Lu : appBarLayoutImage.setBackgroundResource(R.drawable.lu); break;
            case Hf : appBarLayoutImage.setBackgroundResource(R.drawable.hf); break;
            case Ta : appBarLayoutImage.setBackgroundResource(R.drawable.ta); break;
            case W  : appBarLayoutImage.setBackgroundResource(R.drawable.w); break;
            case Re : appBarLayoutImage.setBackgroundResource(R.drawable.re); break;
            case Os : appBarLayoutImage.setBackgroundResource(R.drawable.os); break;
            case Ir : appBarLayoutImage.setBackgroundResource(R.drawable.ir); break;
            case Pt : appBarLayoutImage.setBackgroundResource(R.drawable.pt); break;
            case Au : appBarLayoutImage.setBackgroundResource(R.drawable.au); break;
            case Hg : appBarLayoutImage.setBackgroundResource(R.drawable.hg); break;
            case Tl : appBarLayoutImage.setBackgroundResource(R.drawable.tl); break;
            case Pb : appBarLayoutImage.setBackgroundResource(R.drawable.pb); break;
            case Bi : appBarLayoutImage.setBackgroundResource(R.drawable.bi); break;
            case Po : appBarLayoutImage.setBackgroundResource(R.drawable.po); break;
            case At : appBarLayoutImage.setBackgroundResource(R.drawable.at); break;
            case Rn : appBarLayoutImage.setBackgroundResource(R.drawable.rn); break;
            case Fr : appBarLayoutImage.setBackgroundResource(R.drawable.fr); break;
            case Ra : appBarLayoutImage.setBackgroundResource(R.drawable.ra); break;
            case Ac : appBarLayoutImage.setBackgroundResource(R.drawable.ac); break;
            case Th : appBarLayoutImage.setBackgroundResource(R.drawable.th); break;
            case Pa : appBarLayoutImage.setBackgroundResource(R.drawable.pa); break;
            case U  : appBarLayoutImage.setBackgroundResource(R.drawable.u); break;
            case Np : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Pu : appBarLayoutImage.setBackgroundResource(R.drawable.pu); break;
            case Am : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Cm : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Bk : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Cf : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Es : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Fm : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Md : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case No : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Lr : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Rf : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Db : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Sg : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Bh : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Hs : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Mt : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Ds : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Rg : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Cn : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Uut: appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Fl : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Uup: appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Lv : appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Uus: appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
            case Uuo: appBarLayoutImage.setBackgroundColor(Color.BLACK); break; // Image not found
        }
    }


    /* Function to validate the Internet connection before start a search on Wikipedia
	 */
    private boolean checkConnection() {
        boolean conectado;
        ConnectivityManager conectivityManager = (ConnectivityManager) getSystemService( Context.CONNECTIVITY_SERVICE);
        assert conectivityManager != null;
        conectado = conectivityManager.getActiveNetworkInfo() != null
                && conectivityManager.getActiveNetworkInfo().isAvailable()
                && conectivityManager.getActiveNetworkInfo().isConnected();
        return conectado;
    }

}
