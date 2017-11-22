package br.com.ddmsoftware.periodictable;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

   //public static final PeriodicTable periodicTable_EXTRA_MESSAGE = new PeriodicTable();
    public static final String EXTRA_MESSAGE = "br.com.ddmsoftware.periodictable.MESSAGE";

    private List<PeriodicTable> myList;

    private TextView tvHydrogenium;
    private TextView tvHelium;
    private TextView tvLithium;
    private TextView tvBeryllium;
    private TextView tvBoron;
    private TextView tvCarbonium;
    private TextView tvNitrogenium;
    private TextView tvOxygenium;
    private TextView tvFluorum;
    private TextView tvNeon;
    private TextView tvNatrium;
    private TextView tvMagnesium;
    private TextView tvAlumen;
    private TextView tvSilicium;
    private TextView tvPhosphorus;
    private TextView tvSulphur;
    private TextView tvClorum;
    private TextView tvArgon;
    private TextView tvKalium;
    private TextView tvCalcium;
    private TextView tvScandium;
    private TextView tvTitanium;
    private TextView tvVanadium;
    private TextView tvChromium;
    private TextView tvManganum;
    private TextView tvFerrum;
    private TextView tvCobaltum;
    private TextView tvNiccolum;
    private TextView tvCuprum;
    private TextView tvZincum;
    private TextView tvGalium;
    private TextView tvGermanium;
    private TextView tvArsenicum;
    private TextView tvSelenium;
    private TextView tvBromum;
    private TextView tvKrypton;
    private TextView tvRubidium;
    private TextView tvStrontium;
    private TextView tvYttrium;
    private TextView tvZirconium;
    private TextView tvNiobium;
    private TextView tvMolybdenum;
    private TextView tvTechnetium;
    private TextView tvRuthenium;
    private TextView tvRhodium;
    private TextView tvPalladium;
    private TextView tvArgentum;
    private TextView tvCadmium;
    private TextView tvIndium;
    private TextView tvStannum;
    private TextView tvStibium;
    private TextView tvTellurium;
    private TextView tvIodum;
    private TextView tvXenon;
    private TextView tvCaesium;
    private TextView tvBarium;
    private TextView tvLanthanum;
    private TextView tvCerium;
    private TextView tvPraseodymium;
    private TextView tvNeodymium;
    private TextView tvPromethium;
    private TextView tvSamarium;
    private TextView tvEuropium;
    private TextView tvGadolinium;
    private TextView tvTerbium;
    private TextView tvDysprosium;
    private TextView tvHolmium;
    private TextView tvErbium;
    private TextView tvThulium;
    private TextView tvYtterbium;
    private TextView tvLutetium;
    private TextView tvHafnium;
    private TextView tvTantalum;
    private TextView tvWolframium;
    private TextView tvRhenium;
    private TextView tvOsmium;
    private TextView tvIridium;
    private TextView tvPlatinum;
    private TextView tvAurum;
    private TextView tvHydrargyrum;
    private TextView tvThallium;
    private TextView tvPlumbum;
    private TextView tvBismuthum;
    private TextView tvPolonium;
    private TextView tvAstatum;
    private TextView tvRadon;
    private TextView tvFrancium;
    private TextView tvRadium;
    private TextView tvActinium;
    private TextView tvThorium;
    private TextView tvProtactinium;
    private TextView tvUranium;
    private TextView tvNeptunium;
    private TextView tvPlutonium;
    private TextView tvAmericium;
    private TextView tvCurium;
    private TextView tvBerkelium;
    private TextView tvCalifornium;
    private TextView tvEinsteinium;
    private TextView tvFermium;
    private TextView tvMendelevium;
    private TextView tvNobelium;
    private TextView tvLawrencium;
    private TextView tvRhuterfordium;
    private TextView tvDubnium;
    private TextView tvSeaborgium;
    private TextView tvBohrium;
    private TextView tvHassium;
    private TextView tvMeitnerium;
    private TextView tvDarmstadtium;
    private TextView tvRoentgenium;
    private TextView tvCopernicium;
    private TextView tvUnuntrium;
    private TextView tvFlerovium;
    private TextView tvUnunpentium;
    private TextView tvLivermorium;
    private TextView tvUnunsentium;
    private TextView tvUnunoctium;

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        PeriodicTable periodicTable = new PeriodicTable();

        String lang = Locale.getDefault().getDisplayLanguage();

        if ((!lang.equals("pt")) && (!lang.equals("português"))){
            myList = periodicTable.getAllEnglishElements();

        } else
            myList = periodicTable.getAllPortugueseElements();

        tvHydrogenium= findViewById(R.id.tvHydrogenium);
        tvHelium= findViewById(R.id.tvHelium);
        tvLithium= findViewById(R.id.tvLithium);
        tvBeryllium= findViewById(R.id.tvBeryllium);
        tvBoron= findViewById(R.id.tvBoron);
        tvCarbonium= findViewById(R.id.tvCarbon);
        tvNitrogenium= findViewById(R.id.tvNitrogen);
        tvOxygenium= findViewById(R.id.tvOxygen);
        tvFluorum= findViewById(R.id.tvFluorine);
        tvNeon= findViewById(R.id.tvNeon);
        tvNatrium= findViewById(R.id.tvSodium);
        tvMagnesium= findViewById(R.id.tvMagnesium);
        tvAlumen= findViewById(R.id.tvAluminium);
        tvSilicium= findViewById(R.id.tvSilicon);
        tvPhosphorus= findViewById(R.id.tvPhosphorus);
        tvSulphur= findViewById(R.id.tvSulfur);
        tvClorum= findViewById(R.id.tvChlorine);
        tvArgon= findViewById(R.id.tvArgon);
        tvKalium= findViewById(R.id.tvPotassium);
        tvCalcium= findViewById(R.id.tvCalcium);
        tvScandium= findViewById(R.id.tvScandium);
        tvTitanium= findViewById(R.id.tvTitanium);
        tvVanadium= findViewById(R.id.tvVanadium);
        tvChromium= findViewById(R.id.tvChromium);
        tvManganum= findViewById(R.id.tvManganese);
        tvFerrum= findViewById(R.id.tvIron);
        tvCobaltum= findViewById(R.id.tvCobalt);
        tvNiccolum= findViewById(R.id.tvNickel);
        tvCuprum= findViewById(R.id.tvCopper);
        tvZincum= findViewById(R.id.tvZinc);
        tvGalium= findViewById(R.id.tvGallium);
        tvGermanium= findViewById(R.id.tvGermanium);
        tvArsenicum= findViewById(R.id.tvArsenic);
        tvSelenium= findViewById(R.id.tvSelenium);
        tvBromum= findViewById(R.id.tvBromine);
        tvKrypton= findViewById(R.id.tvKrypton);
        tvRubidium= findViewById(R.id.tvRubidium);
        tvStrontium= findViewById(R.id.tvStrontium);
        tvYttrium= findViewById(R.id.tvYttrium);
        tvZirconium= findViewById(R.id.tvZirconium);
        tvNiobium= findViewById(R.id.tvNiobium);
        tvMolybdenum= findViewById(R.id.tvMolybdenum);
        tvTechnetium= findViewById(R.id.tvTechnetium);
        tvRuthenium= findViewById(R.id.tvRuthenium);
        tvRhodium= findViewById(R.id.tvRhodium);
        tvPalladium= findViewById(R.id.tvPalladium);
        tvArgentum= findViewById(R.id.tvSilver);
        tvCadmium= findViewById(R.id.tvCadmium);
        tvIndium= findViewById(R.id.tvIndium);
        tvStannum= findViewById(R.id.tvTin);
        tvStibium= findViewById(R.id.tvAntimony);
        tvTellurium= findViewById(R.id.tvTellurium);
        tvIodum= findViewById(R.id.tvIodine);
        tvXenon= findViewById(R.id.tvXenon);
        tvCaesium= findViewById(R.id.tvCaesium);
        tvBarium= findViewById(R.id.tvBarium);
        tvLanthanum= findViewById(R.id.tvLanthanum);
        tvCerium= findViewById(R.id.tvCerium);
        tvPraseodymium= findViewById(R.id.tvPraseodymium);
        tvNeodymium= findViewById(R.id.tvNeodymium);
        tvPromethium= findViewById(R.id.tvPromethium);
        tvSamarium= findViewById(R.id.tvSamarium);
        tvEuropium= findViewById(R.id.tvEuropium);
        tvGadolinium= findViewById(R.id.tvGadolinium);
        tvTerbium= findViewById(R.id.tvTerbium);
        tvDysprosium= findViewById(R.id.tvDysprosium);
        tvHolmium= findViewById(R.id.tvHolmium);
        tvErbium= findViewById(R.id.tvErbium);
        tvThulium= findViewById(R.id.tvThulium);
        tvYtterbium= findViewById(R.id.tvYtterbium);
        tvLutetium= findViewById(R.id.tvLutetium);
        tvHafnium= findViewById(R.id.tvHafnium);
        tvTantalum= findViewById(R.id.tvTantalum);
        tvWolframium= findViewById(R.id.tvTungsten);
        tvRhenium= findViewById(R.id.tvRhenium);
        tvOsmium= findViewById(R.id.tvOsmium);
        tvIridium= findViewById(R.id.tvIridium);
        tvPlatinum= findViewById(R.id.tvPlatinum);
        tvAurum= findViewById(R.id.tvGold);
        tvHydrargyrum= findViewById(R.id.tvMercury);
        tvThallium= findViewById(R.id.tvThallium);
        tvPlumbum= findViewById(R.id.tvLead);
        tvBismuthum= findViewById(R.id.tvBismuth);
        tvPolonium= findViewById(R.id.tvPolonium);
        tvAstatum= findViewById(R.id.tvAstatine);
        tvRadon= findViewById(R.id.tvRadon);
        tvFrancium= findViewById(R.id.tvFrancium);
        tvRadium= findViewById(R.id.tvRadium);
        tvActinium= findViewById(R.id.tvActinium);
        tvThorium= findViewById(R.id.tvThorium);
        tvProtactinium= findViewById(R.id.tvProtactinium);
        tvUranium= findViewById(R.id.tvUranium);
        tvNeptunium= findViewById(R.id.tvNeptunium);
        tvPlutonium= findViewById(R.id.tvPlutonium);
        tvAmericium= findViewById(R.id.tvAmericium);
        tvCurium= findViewById(R.id.tvCurium);
        tvBerkelium= findViewById(R.id.tvBerkelium);
        tvCalifornium= findViewById(R.id.tvCalifornium);
        tvEinsteinium= findViewById(R.id.tvEinsteinium);
        tvFermium= findViewById(R.id.tvFermium);
        tvMendelevium= findViewById(R.id.tvMendelevium);
        tvNobelium= findViewById(R.id.tvNobelium);
        tvLawrencium= findViewById(R.id.tvLawrencium);
        tvRhuterfordium= findViewById(R.id.tvRutherfordium);
        tvDubnium= findViewById(R.id.tvDubnium);
        tvSeaborgium= findViewById(R.id.tvSeaborgium);
        tvBohrium= findViewById(R.id.tvBohrium);
        tvHassium= findViewById(R.id.tvHassium);
        tvMeitnerium= findViewById(R.id.tvMeitnerium);
        tvDarmstadtium= findViewById(R.id.tvDarmstadtium);
        tvRoentgenium= findViewById(R.id.tvRoentgenium);
        tvCopernicium= findViewById(R.id.tvCopernicium);
        tvUnuntrium= findViewById(R.id.tvUnuntrium);
        tvFlerovium= findViewById(R.id.tvFlerovium);
        tvUnunpentium= findViewById(R.id.tvUnunpentium);
        tvLivermorium= findViewById(R.id.tvLivermorium);
        tvUnunsentium= findViewById(R.id.tvUnunseptium);
        tvUnunoctium= findViewById(R.id.tvUnunoctium);

        TextView[] aTextView = {tvHydrogenium,  tvHelium,       tvLithium,      tvBeryllium,    tvBoron,        tvCarbonium,    tvNitrogenium,
                tvOxygenium,    tvFluorum,      tvNeon,	        tvNatrium,	    tvMagnesium,	tvAlumen,	    tvSilicium,	    tvPhosphorus,
                tvSulphur,	    tvClorum,       tvArgon,	    tvKalium,	    tvCalcium,	    tvScandium,	    tvTitanium,	    tvVanadium,
                tvChromium,	    tvManganum,     tvFerrum,	    tvCobaltum,	    tvNiccolum,	    tvCuprum,	    tvZincum,	    tvGalium,
                tvGermanium,	tvArsenicum,    tvSelenium,	    tvBromum,	    tvKrypton,	    tvRubidium,	    tvStrontium,	tvYttrium,
                tvZirconium,	tvNiobium,      tvMolybdenum,	tvTechnetium,   tvRuthenium,	tvRhodium,	    tvPalladium,	tvArgentum,
                tvCadmium,      tvIndium,	    tvStannum,	    tvStibium,	    tvTellurium,    tvIodum,	    tvXenon,	    tvCaesium,
                tvBarium,       tvLanthanum,	tvCerium,	    tvPraseodymium,	tvNeodymium,    tvPromethium,	tvSamarium,	    tvEuropium,
                tvGadolinium,	tvTerbium,	    tvDysprosium,	tvHolmium,	    tvErbium,	    tvThulium,	    tvYtterbium,	tvLutetium,
                tvHafnium,	    tvTantalum,	    tvWolframium,	tvRhenium,	    tvOsmium,	    tvIridium,	    tvPlatinum,	    tvAurum,
                tvHydrargyrum,	tvThallium,	    tvPlumbum,	    tvBismuthum,    tvPolonium,	    tvAstatum,	    tvRadon,	    tvFrancium,
                tvRadium,	    tvActinium,	    tvThorium,	    tvProtactinium,	tvUranium,	    tvNeptunium,	tvPlutonium,	tvAmericium,
                tvCurium,   	tvBerkelium,    tvCalifornium,	tvEinsteinium,	tvFermium,	    tvMendelevium,	tvNobelium,	    tvLawrencium,
                tvRhuterfordium,tvDubnium,	    tvSeaborgium,	tvBohrium,	    tvHassium,	    tvMeitnerium,	tvDarmstadtium,	tvRoentgenium,
                tvCopernicium,	tvUnuntrium,    tvFlerovium,	tvUnunpentium,	tvLivermorium,	tvUnunsentium,	tvUnunoctium};


        for (int i = 0; i <= myList.size()-1; i++) {

            formatElement(aTextView[i], myList.get(i).sym, myList.get(i).element);
        }


        tvHydrogenium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvHydrogenium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvHelium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvHelium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvLithium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvLithium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvBeryllium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvBeryllium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvBoron.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvBoron.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvCarbonium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvCarbonium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvNitrogenium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvNitrogenium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvOxygenium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvOxygenium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvFluorum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvFluorum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvNeon.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvNeon.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvNatrium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvNatrium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvMagnesium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvMagnesium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvAlumen.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvAlumen.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvSilicium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvSilicium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvPhosphorus.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvPhosphorus.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvSulphur.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvSulphur.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvClorum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvClorum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvArgon.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvArgon.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvKalium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvKalium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvCalcium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvCalcium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvScandium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvScandium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvTitanium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvTitanium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvVanadium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvVanadium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvChromium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvChromium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvManganum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvManganum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvFerrum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvFerrum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvCobaltum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvCobaltum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvNiccolum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvNiccolum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvCuprum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvCuprum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvZincum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvZincum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvGalium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvGalium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvGermanium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvGermanium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvArsenicum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvArsenicum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvSelenium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvSelenium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvBromum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvBromum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvKrypton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvKrypton.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvRubidium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvRubidium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvStrontium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvStrontium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvYttrium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvYttrium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvZirconium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvZirconium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvNiobium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvNiobium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvMolybdenum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvMolybdenum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvTechnetium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvTechnetium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvRuthenium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvRuthenium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvRhodium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvRhodium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvPalladium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvPalladium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvArgentum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvArgentum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvCadmium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvCadmium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvIndium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvIndium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvStannum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvStannum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvStibium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvStibium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvTellurium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvTellurium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvIodum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvIodum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvXenon.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvXenon.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvCaesium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvCaesium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvBarium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvBarium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvLanthanum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvLanthanum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvCerium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvCerium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvPraseodymium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvPraseodymium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvNeodymium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvNeodymium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvPromethium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvPromethium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvSamarium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvSamarium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvEuropium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvEuropium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvGadolinium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvGadolinium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvTerbium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvTerbium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvDysprosium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvDysprosium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvHolmium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvHolmium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvErbium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvErbium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvThulium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvThulium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvYtterbium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvYtterbium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvLutetium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvLutetium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvHafnium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvHafnium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvTantalum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvTantalum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvWolframium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvWolframium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvRhenium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvRhenium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvOsmium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvOsmium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvIridium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvIridium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvPlatinum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvPlatinum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvAurum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvAurum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvHydrargyrum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvHydrargyrum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvThallium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvThallium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvPlumbum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvPlumbum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvBismuthum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvBismuthum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvPolonium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvPolonium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvAstatum.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvAstatum.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvRadon.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvRadon.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvFrancium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvFrancium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvRadium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvRadium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvActinium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvActinium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvThorium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvThorium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvProtactinium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvProtactinium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvUranium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvUranium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvNeptunium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvNeptunium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvPlutonium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvPlutonium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvAmericium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvAmericium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvCurium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvCurium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvBerkelium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvBerkelium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvCalifornium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvCalifornium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvEinsteinium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvEinsteinium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvFermium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvFermium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvMendelevium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvMendelevium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvNobelium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvNobelium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvLawrencium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvLawrencium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvRhuterfordium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvRhuterfordium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvDubnium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvDubnium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvSeaborgium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvSeaborgium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvBohrium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvBohrium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvHassium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvHassium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvMeitnerium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvMeitnerium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvDarmstadtium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvDarmstadtium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvRoentgenium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvRoentgenium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvCopernicium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvCopernicium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvUnuntrium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvUnuntrium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvFlerovium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvFlerovium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvUnunpentium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvUnunpentium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvLivermorium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvLivermorium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvUnunsentium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvUnunsentium.getText().toString().split("\n");onElementsClick(text[1]);}
        });
        tvUnunoctium.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view){ String[] text = tvUnunoctium.getText().toString().split("\n");onElementsClick(text[1]);}
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setItemIconTintList(null);

        // Create a AdView
        // Load Advertisement Banner
        AdView mAdView = findViewById(R.id.adViewMain);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        //int id = item.getItemId();

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void formatElement(TextView pTextView,String pSymbol, String pElement) {

        // Format Symbol of the Element
        SpannableString span1 = new SpannableString(pSymbol);
        span1.setSpan(new RelativeSizeSpan(2f), 0, pSymbol.length(), 0);
        span1.setSpan(new ForegroundColorSpan(Color.BLACK), 0, pSymbol.length(), 0);

        // Format Element Name and Atomic Weight
        SpannableString span2 = new SpannableString(pElement);
        span2.setSpan(new RelativeSizeSpan(1f), 0, pElement.length(), 0);
        span2.setSpan(new ForegroundColorSpan(Color.BLACK), 0, pElement.length(), 0);

        // Format Atomic Weight
        //SpannableString span3 = new SpannableString(pAtomicWeight);
        //span3.setSpan(new RelativeSizeSpan(1f), 0, pAtomicWeight.length(), 0);

        // Concat all the text
        //CharSequence finalText = TextUtils.concat(span1, "\n", span2, "\n", span3);
        CharSequence finalText = TextUtils.concat(span1, "\n", span2);

        // Display information on screen

        pTextView.setText(finalText);
    }

    private void onElementsClick(String pElement){

        String message = null;

        for( int i = 0; i <= myList.size()-1; i++) {

            if(myList.get(i).element.equals(pElement)) {

                message = myList.get(i).z +";"+
                        myList.get(i).sym +";"+
                        myList.get(i).element+";"+
                        myList.get(i).oficialLatim+";"+
                        myList.get(i).originName+";"+
                        myList.get(i).group+";"+
                        myList.get(i).groupName+";"+
                        myList.get(i).period+";"+
                        myList.get(i).atomicWeight+";"+
                        myList.get(i).density+";"+
                        myList.get(i).meltingPoint+";"+
                        myList.get(i).boilingPoint+";"+
                        myList.get(i).cj+";"+
                        myList.get(i).x10+";"+
                        myList.get(i).abundance+";"+
                        myList.get(i).hyperlink+";"+
                        myList.get(i).image;

                break;


            }

            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "Main");
            bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "On_Elements_Click");
            bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
            mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

        }


        Intent intent = new Intent(MainActivity.this, ResultActivity2.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
