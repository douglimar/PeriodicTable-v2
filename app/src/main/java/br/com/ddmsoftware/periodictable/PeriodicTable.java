package br.com.ddmsoftware.periodictable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Douglimar Moraes  on 18/11/2017.
 * Periodic Table method
 *
 */

class PeriodicTable {

    String z;
    String sym;
    String element;
    String oficialLatim;
    String originName;
    String group;
    String groupName;
    String period;
    String atomicWeight;
    String density;
    String meltingPoint;
    String boilingPoint;
    String cj;
    String x10;
    String abundance;
    String hyperlink;
    String image;

    private PeriodicTable(String z, String sym, String element, String oficialLatim, String originName, String group, String groupName, String period, String atomicWeight, String density, String meltingPoint, String boilingPoint, String cj, String x10, String abundance, String hyperlink, String image) {
        this.z = z;
        this.sym = sym;
        this.element = element;
        this.oficialLatim = oficialLatim;
        this.originName = originName;
        this.group = group;
        this.groupName = groupName;
        this.period = period;
        this.atomicWeight = atomicWeight;
        this.density = density;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
        this.cj = cj;
        this.x10 = x10;
        this.abundance = abundance;
        this.hyperlink = hyperlink;
        this.image = image;
    }

    public PeriodicTable(){

    }



    public List<PeriodicTable> getAllPortugueseElements() {

        List<PeriodicTable> myList = new ArrayList<>();

        myList.add(new PeriodicTable("1","H","Hidrogênio","Hydrogenium","Gera água, do grego hydror+genos","1","Metais Alcalinos","1","1.00794(7)[2] [3] [4]","0.00008988","14.01","20.28","14304","2.20","1400","https://pt.wikipedia.org/wiki/Hidrog%C3%AAnio","h"));
        myList.add(new PeriodicTable("2","He","Hélio","Helium","Sol, do grego helios","18","Gases Nobres","1","4.002602(2)[2] [3]","0.0001785","0.956","4.22","5193","–","0.008","https://pt.wikipedia.org/wiki/H%C3%A9lio","he"));
        myList.add(new PeriodicTable("3","Li","Lítio","Lithium","Rocha, do grego lithos","1","Metais Alcalinos","2","6.941(2)[2] [3] [4] [5]","0.534","453.69","1560","3582","0.98","20","https://pt.wikipedia.org/wiki/L%C3%ADtio","li"));
        myList.add(new PeriodicTable("4","Be","Berílio","Beryllium","Berilo, azul-esverdeada, do grego beryllos","2","Metais Alcalino-terrosos","2","9.012182(3)","1.85","1560","2742","1825","1.57","2.8","https://pt.wikipedia.org/wiki/Ber%C3%ADlio","be"));
        myList.add(new PeriodicTable("5","B","Boro","Borium","Bórax, do árabe buraq","13","Grupo do Boro","2","10.811(7)[2] [3] [4]","2.34","2349","4200","1026","2.04","10","https://pt.wikipedia.org/wiki/Boro","b"));
        myList.add(new PeriodicTable("6","C","Carbono","Carbonium","Carvão, do latim carbo","14","Grupo do Carbono","2","12.0107(8)[2] [3]","2267","3800","4300","0.709","2.55","200","https://pt.wikipedia.org/wiki/Carbono","c"));
        myList.add(new PeriodicTable("7","N","Nitrogênio","Nitrogenium","Gera salitre (nitrato), do grego nitro+gen","15","Grupo do Nitrogênio","2","14.0067(2)[2] [3]","0.0012506","63.15","77.36","1.04","3.04","19","https://pt.wikipedia.org/wiki/Nitrog%C3%AAnio","n"));
        myList.add(new PeriodicTable("8","O","Oxigênio","Oxygenium","Gera ácido, do grego oxys+genes","16","Calcogênios","2","15.9994(3)[2] [3]","0.001429","54.36","90.20","0.918","3.44","461000","https://pt.wikipedia.org/wiki/Oxig%C3%AAnio","o"));
        myList.add(new PeriodicTable("9","F","Flúor","Fluorum","Fluir, do latim fluere","17","Halogênios","2","18.9984032(5)","0.001696","53.53","85.03","0.824","3.98","585","https://pt.wikipedia.org/wiki/Fl%C3%BAor","f"));
        myList.add(new PeriodicTable("10","Ne","Neônio","Neon","Novo, do grego neos","18","Gases Nobres","2","20.1797(6)[2] [4]","0.0008999","24.56","27.07","1.03","–","0.005","https://pt.wikipedia.org/wiki/Ne%C3%B4nio","ne"));
        myList.add(new PeriodicTable("11","Na","Sódio","Natrium","Natron (Carbonato de sódio), do grego nítron 'Sem sabor', do italiano soda","1","Metais Alcalinos","3","22.98976928(2)","0.971","370.87","1156","1228","0.93","23600","https://pt.wikipedia.org/wiki/S%C3%B3dio","na"));
        myList.add(new PeriodicTable("12","Mg","Magnésio","Magnesium","Magnésia, Grécia","2","Metais Alcalino-terrosos","3","24.3050(6)","1738","923","1363","1023","1.31","23300","https://pt.wikipedia.org/wiki/Magn%C3%A9sio","mg"));
        myList.add(new PeriodicTable("13","Al","Alumínio","Alumen","Sal amargo, do latim alumen, ver alúmen","13","Grupo do Boro","3","26.9815386(8)","2698","933.47[4]","2792","0.897","1.61","82300","https://pt.wikipedia.org/wiki/Alum%C3%ADnio","al"));
        myList.add(new PeriodicTable("14","Si","Silício","Silicium","Sílex, do latim silex","14","Grupo do Carbono","3","28.0855(3)[3]","23296","1687","3538","0.705","1.9","282000","https://pt.wikipedia.org/wiki/Sil%C3%ADcio","si"));
        myList.add(new PeriodicTable("15","P","Fósforo","Phosphorus","Portador da luz, do grego phosphoros","15","Grupo do Nitrogênio","3","30.973762(2)","1.82","317.30","550","0.769","2.19","1050","https://pt.wikipedia.org/wiki/F%C3%B3sforo","p"));
        myList.add(new PeriodicTable("16","S","Enxofre","Sulphur","Do latim sulphur","16","Calcogênios","3","32.065(5)[2] [3]","2067","388.36","717.87","0.71","2.58","350","https://pt.wikipedia.org/wiki/Enxofre","s"));
        myList.add(new PeriodicTable("17","Cl","Cloro","Clorum","Amarelo esverdeado, do grego chloros","17","Halogênios","3","35.453(2)[2] [3] [4]","0.003214","171.6","239.11","0.479","3.16","145","https://pt.wikipedia.org/wiki/Cloro","cl"));
        myList.add(new PeriodicTable("18","Ar","Argônio","Argon","Inerte, lento, do grego argos","18","Gases Nobres","3","39.948(1)[2] [3]","0.0017837","83.80","87.30","0.52","–","3.5","https://pt.wikipedia.org/wiki/Arg%C3%B4nio","ar"));
        myList.add(new PeriodicTable("19","K","Potássio","Kalium","Kalium (hidróxido de potássio), do grego kalium Cinza de pote, do neerlandês pottasche","1","Metais Alcalinos","4","39.0983(1)","0.862","336.53","1032","0.757","0.82","20900","https://pt.wikipedia.org/wiki/Pot%C3%A1ssio","k"));
        myList.add(new PeriodicTable("20","Ca","Cálcio","Calcium","Cal, do latim calx","2","Metais Alcalino-terrosos","4","40.078(4)[2]","1.54","1115","1757","0.647","1","41500","https://pt.wikipedia.org/wiki/C%C3%A1lcio","ca"));
        myList.add(new PeriodicTable("21","Sc","Escândio","Scandium","Escandinávia","3","Grupo do Escândio","4","44.955912(6)","2989","1814","3109","0.568","1.36","22","https://pt.wikipedia.org/wiki/Esc%C3%A2ndio","sc"));
        myList.add(new PeriodicTable("22","Ti","Titânio","Titanium","Titãs, mitologia grega","4","Grupo do Titânio","4","47.867(1)","4.54","1941","3560","0.523","1.54","5650","https://pt.wikipedia.org/wiki/Tit%C3%A2nio","ti"));
        myList.add(new PeriodicTable("23","V","Vanádio","Vanadium","Freya, deusa nórdica, do nórdico antigo Vanadis","5","Grupo do Vanádio","4","50.9415(1)","6.11","2183","3680","0.489","1.63","120","https://pt.wikipedia.org/wiki/Van%C3%A1dio","v"));
        myList.add(new PeriodicTable("24","Cr","Cromo","Chromium","Cor, do grego chroma","6","Grupo do Cromo","4","51.9961(6)","7.15","2180","2944","0.449","1.66","102","https://pt.wikipedia.org/wiki/Cr%C3%B4mio","cr"));
        myList.add(new PeriodicTable("25","Mn","Manganês","Manganum","Imã, do latim magnes","7","Grupo do Manganês","4","54.938045(5)","7.44","1519","2334","0.479","1.55","950","https://pt.wikipedia.org/wiki/Mangan%C3%AAs","mn"));
        myList.add(new PeriodicTable("26","Fe","Ferro","Ferrum","Ferro, do latim","8","Grupo do Ferro","4","55.845(2)","7874","1811","3134","0.449","1.83","56300","https://pt.wikipedia.org/wiki/Ferro","fe"));
        myList.add(new PeriodicTable("27","Co","Cobalto","Cobaltum","Duende, gnomo, corrupção do alemão Kobold","9","Grupo do Cobalto","4","58.933195(5)","8.86","1768","3200","0.421","1.88","25","https://pt.wikipedia.org/wiki/Cobalto","co"));
        myList.add(new PeriodicTable("28","Ni","Níquel","Niccolum","Níquelina, do alemão Kupfernickel","10","Grupo do Níquel","4","58.6934(2)","8912","1728","3186","0.444","1.91","84","https://pt.wikipedia.org/wiki/N%C3%ADquel","ni"));
        myList.add(new PeriodicTable("29","Cu","Cobre","Cuprum","Chipre, do latim cyprium","11","Grupo do Cobre","4","63.546(3)[3]","8.96","1357.77[4]","2835","0.385","1.9","60","https://pt.wikipedia.org/wiki/Cobre","cu"));
        myList.add(new PeriodicTable("30","Zn","Zinco","Zincum","Estanho, do alemão Zinn","12","Grupo do Zinco","4","65.409(4)","7134","692.88","1180","0.388","1.65","70","https://pt.wikipedia.org/wiki/Zinco","zn"));
        myList.add(new PeriodicTable("31","Ga","Gálio","Galium","Gália, do latim Gallia","13","Grupo do Boro","4","69.723(1)","5907","3029146","2477","0.371","1.81","19","https://pt.wikipedia.org/wiki/G%C3%A1lio","ga"));
        myList.add(new PeriodicTable("32","Ge","Germânio","Germanium","Alemanha, do latim Germania","14","Grupo do Carbono","4","72.64(1)","5323","1211.40","3106","0.32","2.01","1.5","https://pt.wikipedia.org/wiki/Germ%C3%A2nio","ge"));
        myList.add(new PeriodicTable("33","As","Arsénio","Arsenicum","Masculino, do grego arsenikos","15","Grupo do Nitrogênio","4","74.92160(2)","5776","1090 7","887","0.329","2.18","1.8","https://pt.wikipedia.org/wiki/Ars%C3%A9nio","as"));
        myList.add(new PeriodicTable("34","Se","Selénio","Selenium","Lua, do grego selene","16","Calcogênios","4","78.96(3)[3]","4809","453","958","0.321","2.55","0.05","https://pt.wikipedia.org/wiki/Sel%C3%A9nio","se"));
        myList.add(new PeriodicTable("35","Br","Bromo","Bromum","Mau cheiro, fedido, do grego broma","17","Halogênios","4","79.904(1)","3122","265.8","332.0","0.474","2.96","2.4","https://pt.wikipedia.org/wiki/Bromo","br"));
        myList.add(new PeriodicTable("36","Kr","Criptônio","Krypton","Oculto, do grego kryptos","18","Gases Nobres","4","83.798(2)[2] [4]","0.003733","115.79","119.93","0.248","3","1×10−4","https://pt.wikipedia.org/wiki/Cript%C3%B4nio","kr"));
        myList.add(new PeriodicTable("37","Rb","Rubídio","Rubidium","Vermelho, do latim rubidus","1","Metais Alcalinos","5","85.4678(3)[2]","1532","312.46","961","0.363","0.82","90","https://pt.wikipedia.org/wiki/Rub%C3%ADdio","rb"));
        myList.add(new PeriodicTable("38","Sr","Estrôncio","Strontium","Strontian, Escócia","2","Metais Alcalino-terrosos","5","87.62(1)[2] [3]","2.64","1050","1655","0.301","0.95","370","https://pt.wikipedia.org/wiki/Estr%C3%B4ncio","sr"));
        myList.add(new PeriodicTable("39","Y","Ítrio","Yttrium","Ytterby, Suécia","3","Grupo do Escândio","5","88.90585(2)","4469","1799","3609","0.298","1.22","33","https://pt.wikipedia.org/wiki/%C3%8Dtrio","y"));
        myList.add(new PeriodicTable("40","Zr","Zircônio","Zirconium","Dourado, do persa zargun","4","Grupo do Titânio","5","91.224(2)[2]","6506","2128","4682","0.278","1.33","165","https://pt.wikipedia.org/wiki/Zirc%C3%B4nio","zr"));
        myList.add(new PeriodicTable("41","Nb","Nióbio","Niobium","Niobe, filha de Tântalo mitologia grega","5","Grupo do Vanádio","5","92.906 38(2)","8.57","2750","5017","0.265","1.6","20","https://pt.wikipedia.org/wiki/Ni%C3%B3bio","nb"));
        myList.add(new PeriodicTable("42","Mo","Molibdénio","Molybdenum","Chumbo, do grego molybdos","6","Grupo do Cromo","5","95.94(2)[2]","10.22","2896","4912","0.251","2.16","1.2","https://pt.wikipedia.org/wiki/Molibd%C3%A9nio","mo"));
        myList.add(new PeriodicTable("43","Tc","Tecnécio","Technetium","Artificial, do grego technetos","7","Grupo do Manganês","5","[98][1]","11.5","2430","4538","–","1.9","~ 3×10−9","https://pt.wikipedia.org/wiki/Tecn%C3%A9cio","tc"));
        myList.add(new PeriodicTable("44","Ru","Rutênio","Ruthenium","Rússia, do latim Ruthenia","8","Grupo do Ferro","5","101.07(2)[2]","12.37","2607","4423","0.238","2.2","0.001","https://pt.wikipedia.org/wiki/Rut%C3%AAnio","ru"));
        myList.add(new PeriodicTable("45","Rh","Ródio","Rhodium","Cor-de-rosa, do grego rhodon","9","Grupo do Cobalto","5","102.905 50(2)","12.41","2237","3968","0.243","2.28","0.001","https://pt.wikipedia.org/wiki/R%C3%B3dio","rh"));
        myList.add(new PeriodicTable("46","Pd","Paládio","Palladium","Palas, asteróide","10","Grupo do Níquel","5","106.42(1)[2]","12.02","1828.05","3236","0.244","2.2","0.015","https://pt.wikipedia.org/wiki/Pal%C3%A1dio","pd"));
        myList.add(new PeriodicTable("47","Ag","Prata","Argentum","Prata, do grego argyros","11","Grupo do Cobre","5","107.8682(2)[2]","10501","1234.93[4]","2435","0.235","1.93","0.075","https://pt.wikipedia.org/wiki/Prata","ag"));
        myList.add(new PeriodicTable("48","Cd","Cádmio","Cadmium","Solo, corrupção do grego kadmia[carece de fontes]","12","Grupo do Zinco","5","112.411(8)[2]","8.69","594.22","1040","0.232","1.69","0.159","https://pt.wikipedia.org/wiki/C%C3%A1dmio","cd"));
        myList.add(new PeriodicTable("49","In","Índio","Indium","Azul indigo, violeta, do latim indicium","13","Grupo do Boro","5","114.818(3)","7.31","429.75","2345","0.233","1.78","0.25","https://pt.wikipedia.org/wiki/%C3%8Dndio","in"));
        myList.add(new PeriodicTable("50","Sn","Estanho","Stannum","Duro, do latim stannum","14","Grupo do Carbono","5","118.710(7)[2]","7287","505.08","2875","0.228","1.96","2.3","https://pt.wikipedia.org/wiki/Estanho","sn"));
        myList.add(new PeriodicTable("51","Sb","Antimônio","Stibium","Ver Antimônio","15","Grupo do Nitrogênio","5","121.760(1)[2]","6685","903.78","1860","0.207","2.05","0.2","https://pt.wikipedia.org/wiki/Antim%C3%B4nio","sb"));
        myList.add(new PeriodicTable("52","Te","Telúrio","Tellurium","Terra, planeta, do latim tellus","16","Calcogênios","5","128.60(3)[2]","6232","722.66","1261","0.202","2.1","0.001","https://pt.wikipedia.org/wiki/Tel%C3%BArio","te"));
        myList.add(new PeriodicTable("53","I","Iodo","Iodum","Violeta, do grego ioeides","17","Halogênios","5","126.904 47(3)","4.93","386.85","457.4","0.214","2.66","0.45","https://pt.wikipedia.org/wiki/Iodo","i"));
        myList.add(new PeriodicTable("54","Xe","Xenônio","Xenon","Estranho, do grego xenos","18","Gases Nobres","5","131.293(6)[2] [4]","0.005887","161.4","165.03","0.158","2.6","3×10−5","https://pt.wikipedia.org/wiki/Xen%C3%B4nio","xe"));
        myList.add(new PeriodicTable("55","Cs","Césio","Caesium","Azul-celeste, do latim caesius","1","Metais Alcalinos","6","132.9054519(2)","1873","301.59","944","0.242","0.79","3","https://pt.wikipedia.org/wiki/C%C3%A9sio","cs"));
        myList.add(new PeriodicTable("56","Ba","Bário","Barium","Densidade, pesado, do grego barys","2","Metais Alcalino-terrosos","6","137.327(7)","3594","1000","2170","0.204","0.89","425","https://pt.wikipedia.org/wiki/B%C3%A1rio","ba"));
        myList.add(new PeriodicTable("57","La","Lantânio","Lanthanum","Do grego lanthanein","-","-","6","138.90547(7)[2]","6145","1193","3737","0.195","1.1","39","https://pt.wikipedia.org/wiki/Lant%C3%A2nio","la"));
        myList.add(new PeriodicTable("58","Ce","Cério","Cerium","Ceres, planeta-anão e deus romano","-","-","6","140.116(1)[2]","6.77","1068","3716","0.192","1.12","66.5","https://pt.wikipedia.org/wiki/C%C3%A9rio","ce"));
        myList.add(new PeriodicTable("59","Pr","Praseodímio","Praseodymium","Verde, do grego prasios","-","-","6","140.90765(2)","6773","1208","3793","0.193","1.13","9.2","https://pt.wikipedia.org/wiki/Praseod%C3%ADmio","pr"));
        myList.add(new PeriodicTable("60","Nd","Neodímio","Neodymium","Novo gêmeo, do grego neos+didymos","-","-","6","144.242(3)[2]","7007","1297","3347","0.19","1.14","41.5","https://pt.wikipedia.org/wiki/Neod%C3%ADmio","nd"));
        myList.add(new PeriodicTable("61","Pm","Promécio","Promethium","Prometeu, mitologia grega","-","-","6","[145][1]","7.26","1315","3273","–","1.13","2×10−19","https://pt.wikipedia.org/wiki/Prom%C3%A9cio","pm"));
        myList.add(new PeriodicTable("62","Sm","Samário","Samarium","Samarskite, mineral","-","-","6","150.36(2)[2]","7.52","1345","2067","0.197","1.17","7.05","https://pt.wikipedia.org/wiki/Sam%C3%A1rio","sm"));
        myList.add(new PeriodicTable("63","Eu","Európio","Europium","Europa","-","-","6","151.964(1)[2]","5243","1099","1802","0.182","1.2","2","https://pt.wikipedia.org/wiki/Eur%C3%B3pio","eu"));
        myList.add(new PeriodicTable("64","Gd","Gadolínio","Gadolinium","Johan Gadolin","-","-","6","157.25(3)[2]","7895","1585","3546","0.236","1.2","6.2","https://pt.wikipedia.org/wiki/Gadol%C3%ADnio","gd"));
        myList.add(new PeriodicTable("65","Tb","Térbio","Terbium","Ytterby, Sweden","-","-","6","158.92535(2)","8229","1629","3503","0.182","1.2","1.2","https://pt.wikipedia.org/wiki/T%C3%A9rbio","tb"));
        myList.add(new PeriodicTable("66","Dy","Disprósio","Dysprosium","Inacessível, do grego dysprositos","-","-","6","162.500(1)[2]","8.55","1680","2840","0.17","1.22","5.2","https://pt.wikipedia.org/wiki/Dispr%C3%B3sio","dy"));
        myList.add(new PeriodicTable("67","Ho","Hólmio","Holmium","Estocolmo, do latim Holmia","-","-","6","164.930 32(2)","8795","1734","2993","0.165","1.23","1.3","https://pt.wikipedia.org/wiki/H%C3%B3lmio","ho"));
        myList.add(new PeriodicTable("68","Er","Érbio","Erbium","Ytterby, Suécia","-","-","6","167.259(3)[2]","9066","1802","3141","0.168","1.24","3.5","https://pt.wikipedia.org/wiki/%C3%89rbio","er"));
        myList.add(new PeriodicTable("69","Tm","Túlio","Thulium","Thule","-","-","6","168.93421(2)","9321","1818","2223","0.16","1.25","0.52","https://pt.wikipedia.org/wiki/T%C3%BAlio","tm"));
        myList.add(new PeriodicTable("70","Yb","Itérbio","Ytterbium","Ytterby, Suécia","-","-","6","173.04(3)[2]","6965","1097","1469","0.155","1.1","3.2","https://pt.wikipedia.org/wiki/It%C3%A9rbio","yb"));
        myList.add(new PeriodicTable("71","Lu","Lutécio","Lutetium","Paris, do latim Lutetia","3","Grupo do Escândio","6","174.967(1)[2]","9.84","1925","3675","0.154","1.27","0.8","https://pt.wikipedia.org/wiki/Lut%C3%A9cio","lu"));
        myList.add(new PeriodicTable("72","Hf","Háfnio","Hafnium","Copenhagen, do latim Hafnia","4","Grupo do Titânio","6","178.49(2)","13.31","2506","4876","0.144","1.3","3","https://pt.wikipedia.org/wiki/H%C3%A1fnio","hf"));
        myList.add(new PeriodicTable("73","Ta","Tântalo","Tantalum","Rei Tântalo, mitologia grega","5","Grupo do Vanádio","6","180.94788(2)","16654","3290","5731","0.14","1.5","2","https://pt.wikipedia.org/wiki/T%C3%A2ntalo","ta"));
        myList.add(new PeriodicTable("74","W","Tungstênio","Wolframium","Lobo espuma, do alemão Wol+fram[carece de fontes]","6","Grupo do Cromo","6","183.84(1)","19.25","3695","5828","0.132","2.36","1.3","https://pt.wikipedia.org/wiki/Tungst%C3%AAnio","w"));
        myList.add(new PeriodicTable("75","Re","Rênio","Rhenium","Rio Reno, Alemanha, do latim Rhenia","7","Grupo do Manganês","6","186.207(1)","21.02","3459","5869","0.137","1.9","7×10−4","https://pt.wikipedia.org/wiki/R%C3%AAnio","re"));
        myList.add(new PeriodicTable("76","Os","Ósmio","Osmium","Odor, do grego osme","8","Grupo do Ferro","6","190.23(3)[2]","22.61","3306","5285","0.13","2.2","0.002","https://pt.wikipedia.org/wiki/%C3%93smio","os"));
        myList.add(new PeriodicTable("77","Ir","Irídio","Iridium","Íris, deusa do arco-íris, do grego Iris","9","Grupo do Cobalto","6","192.217(3)","22.56","2719","4701","0.131","2.2","0.001","https://pt.wikipedia.org/wiki/Ir%C3%ADdio","ir"));
        myList.add(new PeriodicTable("78","Pt","Platina","Platinum","Prata pequena, do espanholplata+ina(diminutivo)","10","Grupo do Níquel","6","195.084(9)","21.46","2041.4[4]","4098","0.133","2.28","0.005","https://pt.wikipedia.org/wiki/Platina","pt"));
        myList.add(new PeriodicTable("79","Au","Ouro","Aurum","Dourado, do latim aureus","11","Grupo do Cobre","6","196.966569(4)","19282","1337.33[4]","3129","0.129","2.54","0.004","https://pt.wikipedia.org/wiki/Ouro","au"));
        myList.add(new PeriodicTable("80","Hg","Mercúrio","Hydrargyrum","Líquido prateado, do latim hydra+argyros","12","Grupo do Zinco","6","200.59(2)","135336","234.43","629.88","0.14","2","0.085","https://pt.wikipedia.org/wiki/Merc%C3%BArio_(elemento_qu%C3%ADmico)","hg"));
        myList.add(new PeriodicTable("81","Tl","Tálio","Thallium","Tiro, do grego thallos","13","Grupo do Boro","6","204.3833(2)","11.85","577","1746","0.129","1.62","0.85","https://pt.wikipedia.org/wiki/T%C3%A1lio","tl"));
        myList.add(new PeriodicTable("82","Pb","Chumbo","Plumbum","Do latim plumbum","14","Grupo do Carbono","6","207.2(1)[2] [3]","11342","600.61","2022","0.129","1.87","14","https://pt.wikipedia.org/wiki/Chumbo","pb"));
        myList.add(new PeriodicTable("83","Bi","Bismuto","Bismuthum","Massa branca, corrupção do alemãoWeisse+masse","15","Grupo do Nitrogênio","6","208.98040(1)","9807","544.7","1837","0.122","2.02","0.009","https://pt.wikipedia.org/wiki/Bismuto","bi"));
        myList.add(new PeriodicTable("84","Po","Polônio","Polonium","Polônia","16","Calcogênios","6","[210][1]","9.32","527","1235","–","2.0","2×10−10","https://pt.wikipedia.org/wiki/Pol%C3%B4nio","po"));
        myList.add(new PeriodicTable("85","At","Ástato","Astatum","Instável, do grego astatos","17","Halogênios","6","[210][1]","7","575","610","–","2.2","3×10−20","https://pt.wikipedia.org/wiki/%C3%81stato","at"));
        myList.add(new PeriodicTable("86","Rn","Rádon","Radon","emanação do Radium","18","Gases Nobres","6","[220][1]","0.00973","202","211.3","0.094","2.2","4×10−13","https://pt.wikipedia.org/wiki/R%C3%A1don","rn"));
        myList.add(new PeriodicTable("87","Fr","Frâncio","Francium","França","1","Metais Alcalinos","7","[223][1]","1.87","300","950","–","0.7","~ 1×10−18","https://pt.wikipedia.org/wiki/Fr%C3%A2ncio","fr"));
        myList.add(new PeriodicTable("88","Ra","Rádio","Radium","Raio, do latim radius","2","Metais Alcalino-terrosos","7","[226][1]","5.5","973","2010","0.094","0.9","9×10−7","https://pt.wikipedia.org/wiki/R%C3%A1dio_(elemento_qu%C3%ADmico)","ra"));
        myList.add(new PeriodicTable("89","Ac","Actínio","Actinium","Raio, do grego aktínos","-","-","7","[227][1]","10.07","1323","3471","0.12","1.1","5.5×10−10","https://pt.wikipedia.org/wiki/Act%C3%ADnio","ac"));
        myList.add(new PeriodicTable("90","Th","Tório","Thorium","Thor, deus nórdico","-","-","7","232.03806(2)[1] [2]","11.72","2115","5061","0.113","1.3","9.6","https://pt.wikipedia.org/wiki/T%C3%B3rio","th"));
        myList.add(new PeriodicTable("91","Pa","Protactínio","Protactinium","Primeiro actínio, do grego protos+aktínos","-","-","7","231.03588(2)[1]","15.37","1841","4300","–","1.5","1.4×10−6","https://pt.wikipedia.org/wiki/Protact%C3%ADnio","pa"));
        myList.add(new PeriodicTable("92","U","Urânio","Uranium","Urano, planeta e deus grego","-","-","7","238.02891(3)[1] [2] [4]","18.95","1405.3","4404","0.116","1.38","2.7","https://pt.wikipedia.org/wiki/Ur%C3%A2nio","u"));
        myList.add(new PeriodicTable("93","Np","Ne(p)túnio","Neptunium","Netuno, planeta e deus grego","-","-","7","[237][1]","20.45","917","4273","–","1.36","≤ 3×10−12","https://pt.wikipedia.org/wiki/Nept%C3%BAnio","np"));
        myList.add(new PeriodicTable("94","Pu","Plutônio","Plutonium","Plutão, planeta e deus grego","-","-","7","[244][1]","19.84","912.5","3501","–","1.28","≤ 3×10−11","https://pt.wikipedia.org/wiki/Plut%C3%B4nio","pu"));
        myList.add(new PeriodicTable("95","Am","Amerício","Americium","Américas, continente.","-","-","7","[243][1]","13.69","1449","2880","–","1.13","0 8","https://pt.wikipedia.org/wiki/Amer%C3%ADcio","am"));
        myList.add(new PeriodicTable("96","Cm","Cúrio","Curium","Pierre e Marie Curie","-","-","7","[247][1]","13.51","1613","3383","–","1.28","0 8","https://pt.wikipedia.org/wiki/C%C3%BArio","cm"));
        myList.add(new PeriodicTable("97","Bk","Berquélio","Berkelium","Berkeley, Califórnia","-","-","7","[247][1]","14.79","1259","2900","–","1.3","0 8","https://pt.wikipedia.org/wiki/Berqu%C3%A9lio","bk"));
        myList.add(new PeriodicTable("98","Cf","Califórnio","Californium","Califórnia, estado norte-americano","-","-","7","[251][1]","15.1","1173","(1743)11","–","1.3","0 8","https://pt.wikipedia.org/wiki/Calif%C3%B3rnio","cf"));
        myList.add(new PeriodicTable("99","Es","Einsténio","Einsteinium","Albert Einstein","-","-","7","[252][1]","8.84","1133","(1269)11","–","1.3","0 8","https://pt.wikipedia.org/wiki/Einst%C3%A9nio","es"));
        myList.add(new PeriodicTable("100","Fm","Férmio","Fermium","Enrico Fermi","-","-","7","[257][1]","(9.7)11","(1125)11","–","–","1.3","0 8","https://pt.wikipedia.org/wiki/F%C3%A9rmio","fm"));
        myList.add(new PeriodicTable("101","Md","Mendelévio","Mendelevium","Dmitri Mendeleyev","-","-","7","[258][1]","(10.3)11","(1100)11","–","–","1.3","0 8","https://pt.wikipedia.org/wiki/Mendel%C3%A9vio","md"));
        myList.add(new PeriodicTable("102","No","Nobélio","Nobelium","Alfred Nobel","-","-","7","[259][1]","(9.9)11","(1100)11","–","–","1.3","0 8","https://pt.wikipedia.org/wiki/Nob%C3%A9lio","no"));
        myList.add(new PeriodicTable("103","Lr","Laurêncio","Lawrencium","Ernest Lawrence","3","Grupo do Escândio","7","[262][1]","(15.6)11","(1900)11","–","–","1.3","0 8","https://pt.wikipedia.org/wiki/Laur%C3%AAncio","lr"));
        myList.add(new PeriodicTable("104","Rf","Rutherfórdio","Rhuterfordium","Ernest Rutherford","4","Grupo do Titânio","7","261[1]","(23.2)11","(2400)11","(5800)11","–","–","0 8","https://pt.wikipedia.org/wiki/Rutherf%C3%B3rdio","rf"));
        myList.add(new PeriodicTable("105","Db","Dúbnio","Dubnium","Dubna, Rússia","5","Grupo do Vanádio","7","[262][1]","(29.3)11","–","–","–","–","0 8","https://pt.wikipedia.org/wiki/D%C3%BAbnio","db"));
        myList.add(new PeriodicTable("106","Sg","Seabórgio","Seaborgium","Glenn T. Seaborg","6","Grupo do Cromo","7","[266][1]","(35.0)11","–","–","–","–","0 8","https://pt.wikipedia.org/wiki/Seab%C3%B3rgio","sg"));
        myList.add(new PeriodicTable("107","Bh","Bóhrio","Bohrium","Niels Bohr","7","Grupo do Manganês","7","[264][1]","(37.1)11","–","–","–","–","0 8","https://pt.wikipedia.org/wiki/B%C3%B3hrio","bh"));
        myList.add(new PeriodicTable("108","Hs","Hássio","Hassium","Hessen, Alemanha","8","Grupo do Ferro","7","[277][1]","(40.7)11","–","–","–","–","0 8","https://pt.wikipedia.org/wiki/H%C3%A1ssio","hs"));
        myList.add(new PeriodicTable("109","Mt","Meitnério","Meitnerium","Lise Meitner","9","Grupo do Cobalto","7","[268][1]","(37.4)11","–","–","–","–","0 8","https://pt.wikipedia.org/wiki/Meitn%C3%A9rio","mt"));
        myList.add(new PeriodicTable("110","Ds","Darmstácio","Darmstadtium","Darmstadt, Alemanha","10","Grupo do Níquel","7","[271][1]","(34.8)11","–","–","–","–","0 8","https://pt.wikipedia.org/wiki/Darmst%C3%A1cio","ds"));
        myList.add(new PeriodicTable("111","Rg","Roentgênio","Roentgenium","Wilhelm Conrad Röntgen","11","Grupo do Cobre","7","[272][1]","(28.7)11","–","–","–","–","0 8","https://pt.wikipedia.org/wiki/Roentg%C3%Aanio","rg"));
        myList.add(new PeriodicTable("112","Cn","Copernício","Copernicium","Nicolau Copérnico","12","Grupo do Zinco","7","[277][1]","(23.7)11","–","357 12","–","–","0 8","https://pt.wikipedia.org/wiki/Copern%C3%ADcio","cn"));
        myList.add(new PeriodicTable("113","Uut","Unúntrio","Ununtrium","113, do latim un+un e do grego tri","13","Grupo do Boro","7","[284][1]","(16)11","(700)11","(1400)11","–","–","0 8","https://pt.wikipedia.org/wiki/Un%C3%BAntrio","uut"));
        myList.add(new PeriodicTable("114","Fl","Fleróvio","Flerovium","Georgy Flyorov","14","Grupo do Carbono","7","[289][1]","(14)11","(340)11","(420)11","–","–","0 8","https://pt.wikipedia.org/wiki/Fler%C3%B3vio","fl"));
        myList.add(new PeriodicTable("115","Uup","Ununpêntio","Ununpentium","115, do latim un+un e do grego pent","15","Grupo do Nitrogênio","7","[288][1]","(13.5)11","(700)11","(1400)11","–","–","0 8","https://pt.wikipedia.org/wiki/Ununp%C3%AAntio","uup"));
        myList.add(new PeriodicTable("116","Lv","Livermório","Livermorium","Laboratório Nacional de Lawrence Livermore","16","Calcogênios","7","[292][1]","(12.9)11","(709)11","(1085)11","–","–","0 8","https://pt.wikipedia.org/wiki/Liverm%C3%B3rio","lv"));
        myList.add(new PeriodicTable("117","Uus","Ununséptio","Ununsentium","117, do latim un+un+sent","15","Grupo do Nitrogênio","7","[288][1]","(7.2)11","(723)11","(883)11","–","–","0 8","https://pt.wikipedia.org/wiki/Ununs%C3%A9ptio","uus"));
        myList.add(new PeriodicTable("118","Uuo","Ununóctio","Ununoctium","118, do latim un+un+oct","18","Gases Nobres","7","[294][1]","(5.0)11 13","(258)11","(263)11","–","–","0 8","https://pt.wikipedia.org/wiki/Unun%C3%B3ctio","uuo"));

        return myList;
    }

    public List<PeriodicTable> getAllEnglishElements() {

        List<PeriodicTable> myList = new ArrayList<>();

        myList.add(new PeriodicTable("1","H","Hydrogen","Hydrogenium","composed of the Greek elements hydro-and -gen meaning 'water-forming'","1","Alkali Metals","1","1.0082 3 4 9","0.00008988","14.01","20.28","14304","2.20","1400","https://en.wikipedia.org/wiki/Hydrogen","h"));
        myList.add(new PeriodicTable("2","He","Helium","Helium","the Greek helios, 'sun'","18","Helium Family or Neon Family","1","4.002602(2)2 4","0.0001785","0.956","4.22","5193","–","0.008","https://en.wikipedia.org/wiki/Helium","he"));
        myList.add(new PeriodicTable("3","Li","Lithium","Lithium","the Greek lithos, 'stone'","1","Alkali Metals","2","6.942 3 4 5 9","0.534","453.69","1560","3582","0.98","20","https://en.wikipedia.org/wiki/Lithium","li"));
        myList.add(new PeriodicTable("4","Be","Beryllium","Beryllium","beryl, a mineral","2","Alkaline Earth Metals","2","9.0121831(5)","1.85","1560","2742","1825","1.57","2.8","https://en.wikipedia.org/wiki/Beryllium","be"));
        myList.add(new PeriodicTable("5","B","Boron","Borium","borax, a mineral","13","Icosagens","2","10.812 3 4 9","2.34","2349","4200","1026","2.04","10","https://en.wikipedia.org/wiki/Boron","b"));
        myList.add(new PeriodicTable("6","C","Carbon","Carbonium","the Latin carbo, 'coal'","14","Carbon Family","2","12.0112 4 9","2267","3800","4300","0.709","2.55","200","https://en.wikipedia.org/wiki/Carbon","c"));
        myList.add(new PeriodicTable("7","N","Nitrogen","Nitrogenium","the Greek nitron and '-gen' meaning 'niter-forming'","15","Nitrogen Family","2","14.0072 4 9","0.0012506","63.15","77.36","1.04","3.04","19","https://en.wikipedia.org/wiki/Nitrogen","n"));
        myList.add(new PeriodicTable("8","O","Oxygen","Oxygenium","from the Greek oxy-, both 'sharp' and 'acid', and -gen, meaning 'acid-forming'","16","Chalcogens","2","15.9992 4 9","0.001429","54.36","90.20","0.918","3.44","461000","https://en.wikipedia.org/wiki/Oxygen","o"));
        myList.add(new PeriodicTable("9","F","Fluorine","Fluorum","the Latin fluere, 'to flow'","17","Halogens","2","18.998403163(6)","0.001696","53.53","85.03","0.824","3.98","585","https://en.wikipedia.org/wiki/Fluorine","f"));
        myList.add(new PeriodicTable("10","Ne","Neon","Neon","the Greek neos, meaning 'new'","18","Helium Family or Neon Family","2","20.1797(6)2 3","0.0008999","24.56","27.07","1.03","–","0.005","https://en.wikipedia.org/wiki/Neon","ne"));
        myList.add(new PeriodicTable("11","Na","Sodium","Natrium","the English word soda (natrium in Latin)[3]","1","Alkali Metals","3","22.98976928(2)","0.971","370.87","1156","1228","0.93","23600","https://en.wikipedia.org/wiki/Sodium","na"));
        myList.add(new PeriodicTable("12","Mg","Magnesium","Magnesium","Magnesia, a district of Eastern Thessaly inGreece","2","Alkaline Earth Metals","3","243059","1738","923","1363","1023","1.31","23300","https://en.wikipedia.org/wiki/Magnesium","mg"));
        myList.add(new PeriodicTable("13","Al","Aluminium","Alumen","from alumina, a compound (originallyaluminum)","13","Icosagens","3","26.9815385(7)","2698","933.47[4]","2792","0.897","1.61","82300","https://en.wikipedia.org/wiki/Aluminium","al"));
        myList.add(new PeriodicTable("14","Si","Silicon","Silicium","from the Latin silex, 'flint' (originally silicium)","14","Carbon Family","3","28.0854 9","23296","1687","3538","0.705","1.9","282000","https://en.wikipedia.org/wiki/Silicon","si"));
        myList.add(new PeriodicTable("15","P","Phosphorus","Phosphorus","the Greek phoosphoros, 'carrying light'","15","Nitrogen Family","3","30.973761998(5)","1.82","317.30","550","0.769","2.19","1050","https://en.wikipedia.org/wiki/Phosphorus","p"));
        myList.add(new PeriodicTable("16","S","Sulfur","Sulphur","the Latin sulphur, 'fire and brimstone'[5]","16","Chalcogens","3","32.062 4 9","2067","388.36","717.87","0.71","2.58","350","https://en.wikipedia.org/wiki/Sulfur","s"));
        myList.add(new PeriodicTable("17","Cl","Chlorine","Clorum","the Greek chloros, 'greenish yellow'","17","Halogens","3","35.452 3 4 9","0.003214","171.6","239.11","0.479","3.16","145","https://en.wikipedia.org/wiki/Chlorine","cl"));
        myList.add(new PeriodicTable("18","Ar","Argon","Argon","the Greek argos, 'idle'","18","Helium Family or Neon Family","3","39.948(1)2 4","0.0017837","83.80","87.30","0.52","–","3.5","https://en.wikipedia.org/wiki/Argon","ar"));
        myList.add(new PeriodicTable("19","K","Potassium","Kalium","New Latin potassa, 'potash' (kalium in Latin)[3]","1","Alkali Metals","4","39.0983(1)","0.862","336.53","1032","0.757","0.82","20900","https://en.wikipedia.org/wiki/Potassium","k"));
        myList.add(new PeriodicTable("20","Ca","Calcium","Calcium","the Latin calx, 'lime'","2","Alkaline Earth Metals","4","40.078(4)2","1.54","1115","1757","0.647","1","41500","https://en.wikipedia.org/wiki/Calcium","ca"));
        myList.add(new PeriodicTable("21","Sc","Scandium","Scandium","Scandia, the Latin name for Scandinavia","3","Scandium Family","4","44.955908(5)","2989","1814","3109","0.568","1.36","22","https://en.wikipedia.org/wiki/Scandium","sc"));
        myList.add(new PeriodicTable("22","Ti","Titanium","Titanium","Titans, the sons of the Earth goddess of Greek mythology","4","Titanium Family","4","47.867(1)","4.54","1941","3560","0.523","1.54","5650","https://en.wikipedia.org/wiki/Titanium","ti"));
        myList.add(new PeriodicTable("23","V","Vanadium","Vanadium","Vanadis, an Old Norse name for the Scandinavian goddess Freyja","5","Titanium Family","4","50.9415(1)","6.11","2183","3680","0.489","1.63","120","https://en.wikipedia.org/wiki/Vanadium","v"));
        myList.add(new PeriodicTable("24","Cr","Chromium","Chromium","the Greek chroma, 'color'","6","Chromium Family","4","51.9961(6)","7.15","2180","2944","0.449","1.66","102","https://en.wikipedia.org/wiki/Chromium","cr"));
        myList.add(new PeriodicTable("25","Mn","Manganese","Manganum","corrupted from magnesia negra, see Magnesium","7","Manganese Family","4","54.938044(3)","7.44","1519","2334","0.479","1.55","950","https://en.wikipedia.org/wiki/Manganese","mn"));
        myList.add(new PeriodicTable("26","Fe","Iron","Ferrum","English word (ferrum in Latin)","8","Iron Family","4","55.845(2)","7874","1811","3134","0.449","1.83","56300","https://en.wikipedia.org/wiki/Iron","fe"));
        myList.add(new PeriodicTable("27","Co","Cobalt","Cobaltum","the German word Kobold, 'goblin'","9","Cobalt Family","4","58.933194(4)","8.86","1768","3200","0.421","1.88","25","https://en.wikipedia.org/wiki/Cobalt","co"));
        myList.add(new PeriodicTable("28","Ni","Nickel","Niccolum","from Swedish kopparnickel, containing theGerman word Nickel, 'goblin'","10","Nickel Family","4","58.6934(4)","8912","1728","3186","0.444","1.91","84","https://en.wikipedia.org/wiki/Nickel","ni"));
        myList.add(new PeriodicTable("29","Cu","Copper","Cuprum","English word (Latin cuprum)","11","Coinage Metals","4","63.546(3)4","8.96","1357.77[4]","2835","0.385","1.9","60","https://en.wikipedia.org/wiki/Copper","cu"));
        myList.add(new PeriodicTable("30","Zn","Zinc","Zincum","the German Zink","12","Volatile Metals","4","65.38(2)","7134","692.88","1180","0.388","1.65","70","https://en.wikipedia.org/wiki/Zinc","zn"));
        myList.add(new PeriodicTable("31","Ga","Gallium","Galium","Gallia, the Latin name for France","13","Icosagens","4","69.723(1)","5907","3029146","2477","0.371","1.81","19","https://en.wikipedia.org/wiki/Gallium","ga"));
        myList.add(new PeriodicTable("32","Ge","Germanium","Germanium","Germania, the Latin name for Germany","14","Carbon Family","4","72.630(8)","5323","1211.40","3106","0.32","2.01","1.5","https://en.wikipedia.org/wiki/Germanium","ge"));
        myList.add(new PeriodicTable("33","As","Arsenic","Arsenicum","English word (Latin arsenicum)","15","Nitrogen Family","4","74.921595(6)","5776","1090 7","887","0.329","2.18","1.8","https://en.wikipedia.org/wiki/Arsenic","as"));
        myList.add(new PeriodicTable("34","Se","Selenium","Selenium","the Greek selene, 'moon'","16","Chalcogens","4","78.971(8)4","4809","453","958","0.321","2.55","0.05","https://en.wikipedia.org/wiki/Selenium","se"));
        myList.add(new PeriodicTable("35","Br","Bromine","Bromum","the Greek bromos, 'stench'","17","Halogens","4","799049","3122","265.8","332.0","0.474","2.96","2.4","https://en.wikipedia.org/wiki/Bromine","br"));
        myList.add(new PeriodicTable("36","Kr","Krypton","Krypton","the Greek kryptos, 'hidden'","18","Helium Family or Neon Family","4","83.798(2)2 3","0.003733","115.79","119.93","0.248","3","1×10−4","https://en.wikipedia.org/wiki/Krypton","kr"));
        myList.add(new PeriodicTable("37","Rb","Rubidium","Rubidium","the Latin rubidus, 'deep red'","1","Alkali Metals","5","85.4678(3)2","1532","312.46","961","0.363","0.82","90","https://en.wikipedia.org/wiki/Rubidium","rb"));
        myList.add(new PeriodicTable("38","Sr","Strontium","Strontium","Strontian, a small town in Scotland","2","Alkaline Earth Metals","5","87.62(1)2 4","2.64","1050","1655","0.301","0.95","370","https://en.wikipedia.org/wiki/Strontium","sr"));
        myList.add(new PeriodicTable("39","Y","Yttrium","Yttrium","Ytterby, Sweden","3","Scandium Family","5","88.90584(2)","4469","1799","3609","0.298","1.22","33","https://en.wikipedia.org/wiki/Yttrium","y"));
        myList.add(new PeriodicTable("40","Zr","Zirconium","Zirconium","Persian Zargun, 'gold-colored'; GermanZirkoon, 'jargoon'","4","Titanium Family","5","91.224(2)2","6506","2128","4682","0.278","1.33","165","https://en.wikipedia.org/wiki/Zirconium","zr"));
        myList.add(new PeriodicTable("41","Nb","Niobium","Niobium","Niobe, daughter of king Tantalus from Greek mythology","5","Titanium Family","5","92.90637(2)","8.57","2750","5017","0.265","1.6","20","https://en.wikipedia.org/wiki/Niobium","nb"));
        myList.add(new PeriodicTable("42","Mo","Molybdenum","Molybdenum","the Greek molybdos meaning 'lead'","6","Chromium Family","5","95.95(1)2","10.22","2896","4912","0.251","2.16","1.2","https://en.wikipedia.org/wiki/Molybdenum","mo"));
        myList.add(new PeriodicTable("43","Tc","Technetium","Technetium","the Greek tekhnètos meaning 'artificial'","7","Manganese Family","5","[98]1","11.5","2430","4538","–","1.9","~ 3×10−9","https://en.wikipedia.org/wiki/Technetium","tc"));
        myList.add(new PeriodicTable("44","Ru","Ruthenium","Ruthenium","Ruthenia, the New Latin name for Russia","8","Iron Family","5","101.07(2)2","12.37","2607","4423","0.238","2.2","0.001","https://en.wikipedia.org/wiki/Ruthenium","ru"));
        myList.add(new PeriodicTable("45","Rh","Rhodium","Rhodium","the Greek rhodos, meaning 'rose coloured'","9","Cobalt Family","5","102.90550(2)","12.41","2237","3968","0.243","2.28","0.001","https://en.wikipedia.org/wiki/Rhodium","rh"));
        myList.add(new PeriodicTable("46","Pd","Palladium","Palladium","the then recently discovered asteroidPallas, considered a planet at the time","10","Nickel Family","5","106.42(1)2","12.02","1828.05","3236","0.244","2.2","0.015","https://en.wikipedia.org/wiki/Palladium","pd"));
        myList.add(new PeriodicTable("47","Ag","Silver","Argentum","English word (argentum in Latin)[3]","11","Coinage Metals","5","107.8682(2)2","10501","1234.93[4]","2435","0.235","1.93","0.075","https://en.wikipedia.org/wiki/Silver","ag"));
        myList.add(new PeriodicTable("48","Cd","Cadmium","Cadmium","the New Latin cadmia, from King Kadmos","12","Volatile Metals","5","112.414(4)2","8.69","594.22","1040","0.232","1.69","0.159","https://en.wikipedia.org/wiki/Cadmium","cd"));
        myList.add(new PeriodicTable("49","In","Indium","Indium","indigo","13","Icosagens","5","114.818(1)","7.31","429.75","2345","0.233","1.78","0.25","https://en.wikipedia.org/wiki/Indium","in"));
        myList.add(new PeriodicTable("50","Sn","Tin","Stannum","English word (stannum in Latin)","14","Carbon Family","5","118.710(7)2","7287","505.08","2875","0.228","1.96","2.3","https://en.wikipedia.org/wiki/Tin","sn"));
        myList.add(new PeriodicTable("51","Sb","Antimony","Stibium","composed from the Greek anti, 'against', and monos, 'alone' (stibium in Latin)","15","Nitrogen Family","5","121.760(1)2","6685","903.78","1860","0.207","2.05","0.2","https://en.wikipedia.org/wiki/Antimony","sb"));
        myList.add(new PeriodicTable("52","Te","Tellurium","Tellurium","Latin tellus, 'earth'","16","Chalcogens","5","127.60(3)2","6232","722.66","1261","0.202","2.1","0.001","https://en.wikipedia.org/wiki/Tellurium","te"));
        myList.add(new PeriodicTable("53","I","Iodine","Iodum","French iode (after the Greek ioeides, 'violet')","17","Halogens","5","126.90447(3)","4.93","386.85","457.4","0.214","2.66","0.45","https://en.wikipedia.org/wiki/Iodine","i"));
        myList.add(new PeriodicTable("54","Xe","Xenon","Xenon","the Greek xenos, 'strange'","18","Helium Family or Neon Family","5","131.293(6)2 3","0.005887","161.4","165.03","0.158","2.6","3×10−5","https://en.wikipedia.org/wiki/Xenon","xe"));
        myList.add(new PeriodicTable("55","Cs","Caesium","Caesium","the Latin caesius, 'sky blue'","1","Alkali Metals","6","132.90545196(6)","1873","301.59","944","0.242","0.79","3","https://en.wikipedia.org/wiki/Caesium","cs"));
        myList.add(new PeriodicTable("56","Ba","Barium","Barium","the Greek barys, 'heavy'","2","Alkaline Earth Metals","6","137.327(7)","3594","1000","2170","0.204","0.89","425","https://en.wikipedia.org/wiki/Barium","ba"));
        myList.add(new PeriodicTable("57","La","Lanthanum","Lanthanum","the Greek lanthanein, 'to lie hidden'","-","-","6","138.90547(7)2","6145","1193","3737","0.195","1.1","39","https://en.wikipedia.org/wiki/Lanthanum","la"));
        myList.add(new PeriodicTable("58","Ce","Cerium","Cerium","the then recently discovered asteroidCeres, considered a planet at the time","-","-","6","140.116(1)2","6.77","1068","3716","0.192","1.12","66.5","https://en.wikipedia.org/wiki/Cerium","ce"));
        myList.add(new PeriodicTable("59","Pr","Praseodymium","Praseodymium","the Greek praseios didymos meaning 'green twin'","-","-","6","140.90766(2)","6773","1208","3793","0.193","1.13","9.2","https://en.wikipedia.org/wiki/Praseodymium","pr"));
        myList.add(new PeriodicTable("60","Nd","Neodymium","Neodymium","the Greek neos didymos meaning 'new twin'","-","-","6","144.242(3)2","7007","1297","3347","0.19","1.14","41.5","https://en.wikipedia.org/wiki/Neodymium","nd"));
        myList.add(new PeriodicTable("61","Pm","Promethium","Promethium","Prometheus of Greek mythology who stole fire from the Gods and gave it to humans","-","-","6","[145]1","7.26","1315","3273","–","1.13","2×10−19","https://en.wikipedia.org/wiki/Promethium","pm"));
        myList.add(new PeriodicTable("62","Sm","Samarium","Samarium","Samarskite, the name of the mineral from which it was first isolated","-","-","6","150.36(2)2","7.52","1345","2067","0.197","1.17","7.05","https://en.wikipedia.org/wiki/Samarium","sm"));
        myList.add(new PeriodicTable("63","Eu","Europium","Europium","Europe","-","-","6","151.964(1)2","5243","1099","1802","0.182","1.2","2","https://en.wikipedia.org/wiki/Europium","eu"));
        myList.add(new PeriodicTable("64","Gd","Gadolinium","Gadolinium","Johan Gadolin, chemist, physicist and mineralogist","-","-","6","157.25(3)2","7895","1585","3546","0.236","1.2","6.2","https://en.wikipedia.org/wiki/Gadolinium","gd"));
        myList.add(new PeriodicTable("65","Tb","Terbium","Terbium","Ytterby, Sweden","-","-","6","158.92535(2)","8229","1629","3503","0.182","1.2","1.2","https://en.wikipedia.org/wiki/Terbium","tb"));
        myList.add(new PeriodicTable("66","Dy","Dysprosium","Dysprosium","the Greek dysprositos, 'hard to get'","-","-","6","162.500(1)2","8.55","1680","2840","0.17","1.22","5.2","https://en.wikipedia.org/wiki/Dysprosium","dy"));
        myList.add(new PeriodicTable("67","Ho","Holmium","Holmium","Holmia, the New Latin name for Stockholm","-","-","6","164.93033(2)","8795","1734","2993","0.165","1.23","1.3","https://en.wikipedia.org/wiki/Holmium","ho"));
        myList.add(new PeriodicTable("68","Er","Erbium","Erbium","Ytterby, Sweden","-","-","6","167.259(3)2","9066","1802","3141","0.168","1.24","3.5","https://en.wikipedia.org/wiki/Erbium","er"));
        myList.add(new PeriodicTable("69","Tm","Thulium","Thulium","Thule, the ancient name for Scandinavia","-","-","6","168.93422(2)","9321","1818","2223","0.16","1.25","0.52","https://en.wikipedia.org/wiki/Thulium","tm"));
        myList.add(new PeriodicTable("70","Yb","Ytterbium","Ytterbium","Ytterby, Sweden","-","-","6","173.045(10)2","6965","1097","1469","0.155","1.1","3.2","https://en.wikipedia.org/wiki/Ytterbium","yb"));
        myList.add(new PeriodicTable("71","Lu","Lutetium","Lutetium","Lutetia, the Latin name for Paris","3","Scandium Family","6","174.9668(1)2","9.84","1925","3675","0.154","1.27","0.8","https://en.wikipedia.org/wiki/Lutetium","lu"));
        myList.add(new PeriodicTable("72","Hf","Hafnium","Hafnium","Hafnia, the New Latin name forCopenhagen","4","Titanium Family","6","178.49(2)","13.31","2506","4876","0.144","1.3","3","https://en.wikipedia.org/wiki/Hafnium","hf"));
        myList.add(new PeriodicTable("73","Ta","Tantalum","Tantalum","King Tantalus, father of Niobe from Greek mythology","5","Titanium Family","6","180.94788(2)","16654","3290","5731","0.14","1.5","2","https://en.wikipedia.org/wiki/Tantalum","ta"));
        myList.add(new PeriodicTable("74","W","Tungsten","Wolframium","the Swedish tung sten, 'heavy stone' (W iswolfram, the old name of the tungsten mineral wolframite)[3]","6","Chromium Family","6","183.84(1)","19.25","3695","5828","0.132","2.36","1.3","https://en.wikipedia.org/wiki/Tungsten","w"));
        myList.add(new PeriodicTable("75","Re","Rhenium","Rhenium","Rhenus, the Latin name for the river Rhine","7","Manganese Family","6","186.207(1)","21.02","3459","5869","0.137","1.9","7×10−4","https://en.wikipedia.org/wiki/Rhenium","re"));
        myList.add(new PeriodicTable("76","Os","Osmium","Osmium","the Greek osmè, meaning 'smell'","8","Iron Family","6","190.23(3)2","22.61","3306","5285","0.13","2.2","0.002","https://en.wikipedia.org/wiki/Osmium","os"));
        myList.add(new PeriodicTable("77","Ir","Iridium","Iridium","Iris, the Greek goddess of the rainbow","9","Cobalt Family","6","192.217(3)","22.56","2719","4701","0.131","2.2","0.001","https://en.wikipedia.org/wiki/Iridium","ir"));
        myList.add(new PeriodicTable("78","Pt","Platinum","Platinum","the Spanish platina, meaning 'little silver'","10","Nickel Family","6","195.084(9)","21.46","2041.4[4]","4098","0.133","2.28","0.005","https://en.wikipedia.org/wiki/Platinum","pt"));
        myList.add(new PeriodicTable("79","Au","Gold","Aurum","English word (aurum in Latin)","11","Coinage Metals","6","196.966569(5)","19282","1337.33[4]","3129","0.129","2.54","0.004","https://en.wikipedia.org/wiki/Gold","au"));
        myList.add(new PeriodicTable("80","Hg","Mercury","Hydrargyrum","the New Latin name mercurius, named after the Roman god (Hg from former namehydrargyrum, from Greek hydr-, 'water', and argyros, 'silver')","12","Volatile Metals","6","200.592(3)","135336","234.43","629.88","0.14","2","0.085","https://en.wikipedia.org/wiki/Mercury_(element)","hg"));
        myList.add(new PeriodicTable("81","Tl","Thallium","Thallium","the Greek thallos, 'green twig'","13","Icosagens","6","204389","11.85","577","1746","0.129","1.62","0.85","https://en.wikipedia.org/wiki/Thallium","tl"));
        myList.add(new PeriodicTable("82","Pb","Lead","Plumbum","English word (plumbum in Latin)[3]","14","Carbon Family","6","207.2(1)2 4","11342","600.61","2022","0.129","1.87","14","https://en.wikipedia.org/wiki/Lead","pb"));
        myList.add(new PeriodicTable("83","Bi","Bismuth","Bismuthum","German word, now obsolete","15","Nitrogen Family","6","208.98040(1)1","9807","544.7","1837","0.122","2.02","0.009","https://en.wikipedia.org/wiki/Bismuth","bi"));
        myList.add(new PeriodicTable("84","Po","Polonium","Polonium","Polonia, the New Latin name for Poland","16","Chalcogens","6","[209]1","9.32","527","1235","–","2.0","2×10−10","https://en.wikipedia.org/wiki/Polonium","po"));
        myList.add(new PeriodicTable("85","At","Astatine","Astatum","the Greek astatos, 'unstable'","17","Halogens","6","[210]1","7","575","610","–","2.2","3×10−20","https://en.wikipedia.org/wiki/Astatine","at"));
        myList.add(new PeriodicTable("86","Rn","Radon","Radon","From radium, as it was first detected as an emission from radium during radioactive decay","18","Helium Family or Neon Family","6","[222]1","0.00973","202","211.3","0.094","2.2","4×10−13","https://en.wikipedia.org/wiki/Radon","rn"));
        myList.add(new PeriodicTable("87","Fr","Francium","Francium","Francia, the New Latin name for France","1","Alkali Metals","7","[223]1","1.87","300","950","–","0.7","~ 1×10−18","https://en.wikipedia.org/wiki/Francium","fr"));
        myList.add(new PeriodicTable("88","Ra","Radium","Radium","the Latin radius, 'ray'","2","Alkaline Earth Metals","7","[226]1","5.5","973","2010","0.094","0.9","9×10−7","https://en.wikipedia.org/wiki/Radium","ra"));
        myList.add(new PeriodicTable("89","Ac","Actinium","Actinium","the Greek aktis, 'ray'","-","-","7","[227]1","10.07","1323","3471","0.12","1.1","5.5×10−10","https://en.wikipedia.org/wiki/Actinium","ac"));
        myList.add(new PeriodicTable("90","Th","Thorium","Thorium","Thor, the Scandinavian god of thunder","-","-","7","232.0377(4)1 2","11.72","2115","5061","0.113","1.3","9.6","https://en.wikipedia.org/wiki/Thorium","th"));
        myList.add(new PeriodicTable("91","Pa","Protactinium","Protactinium","the Greek protos, 'first', and actinium, which is produced through the radioactive decay of protactinium","-","-","7","231.03588(2)1","15.37","1841","4300","–","1.5","1.4×10−6","https://en.wikipedia.org/wiki/Protactinium","pa"));
        myList.add(new PeriodicTable("92","U","Uranium","Uranium","Uranus, the seventh planet in the Solar System","-","-","7","238.02891(3)1","18.95","1405.3","4404","0.116","1.38","2.7","https://en.wikipedia.org/wiki/Uranium","u"));
        myList.add(new PeriodicTable("93","Np","Neptunium","Neptunium","Neptune, the eighth planet in the Solar System","-","-","7","[237]1","20.45","917","4273","–","1.36","≤ 3×10−12","https://en.wikipedia.org/wiki/Neptunium","np"));
        myList.add(new PeriodicTable("94","Pu","Plutonium","Plutonium","Pluto, a dwarf planet in the Solar System","-","-","7","[244]1","19.84","912.5","3501","–","1.28","≤ 3×10−11","https://en.wikipedia.org/wiki/Plutonium","pu"));
        myList.add(new PeriodicTable("95","Am","Americium","Americium","The Americas, as the element was first synthesized on the continent, by analogy with europium","-","-","7","[243]1","13.69","1449","2880","–","1.13","0 8","https://en.wikipedia.org/wiki/Americium","am"));
        myList.add(new PeriodicTable("96","Cm","Curium","Curium","Pierre Curie, a physicist, and Marie Curie, a physicist and chemist, named after great scientists by analogy with gadolinium","-","-","7","[247]1","13.51","1613","3383","–","1.28","0 8","https://en.wikipedia.org/wiki/Curium","cm"));
        myList.add(new PeriodicTable("97","Bk","Berkelium","Berkelium","Berkeley, California, where the element was first synthesized, by analogy with terbium","-","-","7","[247]1","14.79","1259","2900","–","1.3","0 8","https://en.wikipedia.org/wiki/Berkelium","bk"));
        myList.add(new PeriodicTable("98","Cf","Californium","Californium","California, where the element was first synthesized","-","-","7","[251]1","15.1","1173","(1743)11","–","1.3","0 8","https://en.wikipedia.org/wiki/Californium","cf"));
        myList.add(new PeriodicTable("99","Es","Einsteinium","Einsteinium","Albert Einstein, physicist","-","-","7","[252]1","8.84","1133","(1269)11","–","1.3","0 8","https://en.wikipedia.org/wiki/Einsteinium","es"));
        myList.add(new PeriodicTable("100","Fm","Fermium","Fermium","Enrico Fermi, physicist","-","-","7","[257]1","(9.7)11","(1125)11","–","–","1.3","0 8","https://en.wikipedia.org/wiki/Fermium","fm"));
        myList.add(new PeriodicTable("101","Md","Mendelevium","Mendelevium","Dmitri Mendeleev, chemist and inventor","-","-","7","[258]1","(10.3)11","(1100)11","–","–","1.3","0 8","https://en.wikipedia.org/wiki/Mendelevium","md"));
        myList.add(new PeriodicTable("102","No","Nobelium","Nobelium","Alfred Nobel, chemist, engineer, innovator, and armaments manufacturer","-","-","7","[259]1","(9.9)11","(1100)11","–","–","1.3","0 8","https://en.wikipedia.org/wiki/Nobelium","no"));
        myList.add(new PeriodicTable("103","Lr","Lawrencium","Lawrencium","Ernest O. Lawrence, physicist","3","Scandium Family","7","[266]1","(15.6)11","(1900)11","–","–","1.3","0 8","https://en.wikipedia.org/wiki/Lawrencium","lr"));
        myList.add(new PeriodicTable("104","Rf","Rutherfordium","Rhuterfordium","Ernest Rutherford, chemist and physicist","4","Titanium Family","7","[267]1","(23.2)11","(2400)11","(5800)11","–","–","0 8","https://en.wikipedia.org/wiki/Rutherfordium","rf"));
        myList.add(new PeriodicTable("105","Db","Dubnium","Dubnium","Dubna, Russia","5","Titanium Family","7","[268]1","(29.3)11","–","–","–","–","0 8","https://en.wikipedia.org/wiki/Dubnium","db"));
        myList.add(new PeriodicTable("106","Sg","Seaborgium","Seaborgium","Glenn T. Seaborg, scientist","6","Chromium Family","7","[269]1","(35.0)11","–","–","–","–","0 8","https://en.wikipedia.org/wiki/Seaborgium","sg"));
        myList.add(new PeriodicTable("107","Bh","Bohrium","Bohrium","Niels Bohr, physicist","7","Manganese Family","7","[270]1","(37.1)11","–","–","–","–","0 8","https://en.wikipedia.org/wiki/Bohrium","bh"));
        myList.add(new PeriodicTable("108","Hs","Hassium","Hassium","Hesse, Germany, where the element was first synthesized","8","Iron Family","7","[269]1","(40.7)11","–","–","–","–","0 8","https://en.wikipedia.org/wiki/Hassium","hs"));
        myList.add(new PeriodicTable("109","Mt","Meitnerium","Meitnerium","Lise Meitner, physicist","9","Cobalt Family","7","[278]1","(37.4)11","–","–","–","–","0 8","https://en.wikipedia.org/wiki/Meitnerium","mt"));
        myList.add(new PeriodicTable("110","Ds","Darmstadtium","Darmstadtium","Darmstadt, Germany, where the element was first synthesized","10","Nickel Family","7","[281]1","(34.8)11","–","–","–","–","0 8","https://en.wikipedia.org/wiki/Darmstadtium","ds"));
        myList.add(new PeriodicTable("111","Rg","Roentgenium","Roentgenium","Wilhelm Conrad Röntgen, physicist","11","Coinage Metals","7","[282]1","(28.7)11","–","–","–","–","0 8","https://en.wikipedia.org/wiki/Roentgenium","rg"));
        myList.add(new PeriodicTable("112","Cn","Copernicium","Copernicium","Nicolaus Copernicus, astronomer","12","Volatile Metals","7","[285]1","(23.7)11","–","357 12","–","–","0 8","https://en.wikipedia.org/wiki/Copernicium","cn"));
        myList.add(new PeriodicTable("113","Uut","Ununtrium","Ununtrium","IUPAC systematic element name","13","Icosagens","7","[286]1","(16)11","(700)11","(1400)11","–","–","0 8","https://en.wikipedia.org/wiki/Ununtrium","uut"));
        myList.add(new PeriodicTable("114","Fl","Flerovium","Flerovium","Georgy Flyorov, physicist","14","Carbon Family","7","[289]1","(14)11","(340)11","(420)11","–","–","0 8","https://en.wikipedia.org/wiki/Flerovium","fl"));
        myList.add(new PeriodicTable("115","Uup","Ununpentium","Ununpentium","IUPAC systematic element name","15","Nitrogen Family","7","[289]1","(13.5)11","(700)11","(1400)11","–","–","0 8","https://en.wikipedia.org/wiki/Ununpentium","uup"));
        myList.add(new PeriodicTable("116","Lv","Livermorium","Livermorium","Lawrence Livermore National Laboratory(in Livermore, California) which collaborated with JINR on its synthesis","16","Chalcogens","7","[293]1","(12.9)11","(709)11","(1085)11","–","–","0 8","https://en.wikipedia.org/wiki/Livermorium","lv"));
        myList.add(new PeriodicTable("117","Uus","Ununseptium","Ununsentium","IUPAC systematic element name","17","Halogens","7","[294]1","(7.2)11","(723)11","(883)11","–","–","0 8","https://en.wikipedia.org/wiki/Ununseptium","uus"));
        myList.add(new PeriodicTable("118","Uuo","Ununoctium","Ununoctium","IUPAC systematic element name","18","Helium Family or Neon Family","7","[294]1","(5.0)11 13","(258)11","(263)11","–","–","0 8","https://en.wikipedia.org/wiki/Ununoctium","uuo"));

        return myList;

    }

}
