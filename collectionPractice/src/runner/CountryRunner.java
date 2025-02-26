package runner;

import dto.CountryDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

public class CountryRunner {

    public static void main(String[] args) {


        Collection<CountryDto> countryDtos=getCountries();

        System.out.println("collection is empty " +countryDtos.isEmpty());//to check collection is empty

        System.out.println("size of the collection"+countryDtos.size());//to chech size of collection
        CountryDto c18 = new CountryDto("Bangladesh",880,156118464,"Shahabuddin Chuppu");

        System.out.println("country 18 is removed from collection"+countryDtos.remove(c18));//to remove object from collection

        CountryDto c82 = new CountryDto("Greenland",299,56375,"Dickon Mitchell");
        System.out.println("collection contains country 82"+countryDtos.contains(c82));//to check collection contains country82

        Collection<CountryDto> countryDtos1=new ArrayList<>();
        CountryDto c201 = new CountryDto("Vietnam",84,89571130,"Lương Cường");
        CountryDto c202 = new CountryDto("Yemen",23,495361967,"Rashad al-Alimi");
        CountryDto c203 = new CountryDto("Zambia",260,13460305,"Hakainde Hichilema");
        CountryDto c204 = new CountryDto("Zimbabwe",263,11651858,"Emmerson Mnangagwa");
        System.out.println("collection is empty"+countryDtos1.isEmpty());

        countryDtos1.add(c201);//to add object into collection
        countryDtos1.add(c202);
        countryDtos1.add(c203);
        countryDtos1.add(c204);

        countryDtos.addAll(countryDtos1);//to add collection into the collection

        System.out.println("size of the collection after adding countryDto1 is"+countryDtos.size());

        System.out.println(countryDtos.containsAll(countryDtos1));//to check collection contain other collection

        Iterator<CountryDto> countryDtoIterator= countryDtos.iterator();
        while(countryDtoIterator.hasNext())
        {
            CountryDto countryDto= countryDtoIterator.next();
            System.out.println(countryDto);
        }

        System.out.println(countryDtos.equals(countryDtos1));//to compare two collection

        System.out.println(countryDtos.removeAll(countryDtos1));

        System.out.println("size of the collection after removing countryDto1"+countryDtos.size());

        countryDtos1.clear();

        System.out.println("collection countryDto is empty after clear countryDto1"+countryDtos1.isEmpty());

        System.out.println("collection countryDto is empty after clear countryDto1"+countryDtos.isEmpty());

        System.out.println("hascode of countryDto" + countryDtos.hashCode());
        Object[] array = countryDtos.toArray();

        for(int i=0;i< array.length;i++)
        {
            System.out.println(array[i]);
        }
        Predicate<CountryDto> predicate =(CountryDto value)-> value.getCountryCode() == 856;
        System.out.println(countryDtos.size());
        countryDtos.removeIf(predicate);
        System.out.println(countryDtos.size());

        Comparator<CountryDto> comparator=(CountryDto c, CountryDto d)-> (int) (c.getPopulation()&d.getPopulation());
        System.out.println(countryDtos.stream().max(comparator));
        System.out.println(countryDtos.stream().min(comparator));

    }


    public static Collection<CountryDto> getCountries()
    {
        CountryDto c1 = new CountryDto("Afganistan",122,29121286,"Emir – Hibatullah Akhundzada");
        CountryDto c2 = new CountryDto("Albania",355,2986952," Bajram Begaj");
        CountryDto c3 = new CountryDto("Algeria",213,34586184," Abdelmadjid Tebboune");
        CountryDto c4 = new CountryDto("American Samoa",684,57881,"Xavier Espot Zamora");
        CountryDto c5 = new CountryDto("Andorra",376,84000,"Joan Enric Vives i Sicília");
        CountryDto c6 = new CountryDto("Angola",244,13068161,"João Lourenço");
        CountryDto c7 = new CountryDto("Anguilla",264,13254,"Gaston Browne");
        CountryDto c8 = new CountryDto("Antarctica",672,0,"Xavier Espot Zamora");
        CountryDto c9 = new CountryDto("Antigua and Barbuda",268,86754,"Charles");
        CountryDto c10 = new CountryDto("Argentina",54,2766890,"Javier Milei");
        CountryDto c11 = new CountryDto("Armenia",374,2968000,"Vahagn Khachaturyan");
        CountryDto c12 = new CountryDto("Aruba",297,71566,"Javier Milei");
        CountryDto c13 = new CountryDto("Australia",61,21515754,"Charles");
        CountryDto c14 = new CountryDto("Austria",43,8205000," Alexander Van der Bellen");
        CountryDto c15 = new CountryDto("Azerbaijan",994,8303512," Ilham Aliyev");
        CountryDto c16 = new CountryDto("Bahamas",242,301790,"Charles");
        CountryDto c17 = new CountryDto("Bahrain",973,738004," Sheikh Hamad bin Isa Al Khalifa");
        CountryDto c18 = new CountryDto("Bangladesh",880,156118464,"Shahabuddin Chuppu");
        CountryDto c19 = new CountryDto("Barbados",246,285653,"SandraMason");
        CountryDto c20 = new CountryDto("Belarus",375,9685000,"Alexandr Lukashenko");
        CountryDto c21 = new CountryDto("Belgium",32,30510,"Philippe");
        CountryDto c22 = new CountryDto("Belize",501,314522,"Patrice Talon");
        CountryDto c23 = new CountryDto("Benin",501,314522,"Jigme Khesar");
        CountryDto c24 = new CountryDto("Bermuda",441,65365,"Alexander De Croo");
        CountryDto c25 = new CountryDto("Bhutan",975,699847,"Roman Golovchenko");
        CountryDto c26 = new CountryDto("Bolivia",591,9947418,"Luis Arce");
        CountryDto c27 = new CountryDto("Bosnia and Herzegovina",387,4590000,"Borjana Kristo");
        CountryDto c28 = new CountryDto("Botswana",267,2029307,"Duma Boko");
        CountryDto c29 = new CountryDto("Brazil",55,201103330,"Luiz Inacio Lula da Silva");
        CountryDto c30 = new CountryDto("British Indian Ocean Territory",246,4000,"Rosen Zhelyazkov");
        CountryDto c31 = new CountryDto("British Virgin Islands",284,21730,"Borjana Krišto");
        CountryDto c32 = new CountryDto("Bulgaria",673,395027," Hassanal Bolkiah");
        CountryDto c33 = new CountryDto("Brunei",359,7148785,"Rumen Radev");
        CountryDto c34 = new CountryDto("Burkina Faso",226,16241811," Ibrahim Traore");
        CountryDto c35 = new CountryDto("Burundi",257,9863117,"Évariste Ndayishimiye");
        CountryDto c36 = new CountryDto("Cambodia",855,14453680,"Norodom Sihamoni");
        CountryDto c37 = new CountryDto("Cameroon",237,19294149," Paul Biya");
        CountryDto c38 = new CountryDto("Canada",1,33679000,"Charles");
        CountryDto c39 = new CountryDto("Cape Verde",238,508659,"José Maria Neves");
        CountryDto c40 = new CountryDto("Cayman Islands",345,44270,"Ulisses Correia e Silva");
        CountryDto c41 = new CountryDto("Central African Republic",236,4844927,"Faustin-Archange");
        CountryDto c42 = new CountryDto("Chad",253,10543464," Mahamat Idriss Déby");
        CountryDto c43 = new CountryDto("Chile",56,16746491,"Gabriel Boric");
        CountryDto c44 = new CountryDto("China",86,1330044000,"Xi Jinping");
        CountryDto c45 = new CountryDto("Christmas Island",61,1500,"Li Qiang");
        CountryDto c46 = new CountryDto("Cocos Islands",61,628," Félix Moloua");
        CountryDto c47 = new CountryDto("Colombia",57,47790000,"Gustavo Petro");
        CountryDto c48 = new CountryDto("Comoros",269,773407," Azali Assoumani");
        CountryDto c49 = new CountryDto("Cook Islands",682,21388,"Justin Trudeau");
        CountryDto c50 = new CountryDto("Costa Rica",506,4516220,"Joseph Ngute");
        CountryDto c51 = new CountryDto("Croatia",385,4491000,"  Rodrigo Chaves Robles");
        CountryDto c52 = new CountryDto("Cuba",53,11423000," Miguel Díaz-Canel");
        CountryDto c53 = new CountryDto("Curacao",599,141766,"Miguel Díaz-Canel");
        CountryDto c54 = new CountryDto("Cyprus",357,1102677,"Nikos Christodoulides");
        CountryDto c55 = new CountryDto("Czech Republic",420,10476000,"Petr Pavel");
        CountryDto c56 = new CountryDto("Democratic Republic of the Congo",243,70916439," Petr Fiala");
        CountryDto c57 = new CountryDto("Denmark",45,5484000,"Frederik X");
        CountryDto c58 = new CountryDto("Djibouti",253,740528," Ismaïl Omar Guelleh");
        CountryDto c59 = new CountryDto("Dominica",767,72813," Sylvanie Burton");
        CountryDto c60 = new CountryDto("Dominican Republic",809,9823821,"Luis Abinader");
        CountryDto c61 = new CountryDto("East Timor",670,1154625," José Ramos-Horta");
        CountryDto c62 = new CountryDto("Ecuador",593,14790608,"Daniel Noboa");
        CountryDto c63 = new CountryDto("Egypt",20,80471869," Abdel Fattah el-Sisi");
        CountryDto c64 = new CountryDto("El Salvador",503,6052064,"Nayib Bukele");
        CountryDto c65 = new CountryDto("Equatorial Guinea",240,1014999," Teodoro Obiang Nguema Mbasogo");
        CountryDto c66 = new CountryDto("Eritrea",291,5792984,"Isaias Afwerki");
        CountryDto c67 = new CountryDto("Estonia",372,1291170,"Alar Karis");
        CountryDto c68 = new CountryDto("Ethiopia",251,88013491," Isaias Afwerki");
        CountryDto c69 = new CountryDto("Falkland Islands",500,2638,"Mostafa Madbouly");
        CountryDto c70 = new CountryDto("Faroe Islands",298,48228,"Russell Dlamini");
        CountryDto c71 = new CountryDto("Fiji",679,875983," Naiqama Lalabalavu");
        CountryDto c72 = new CountryDto("Finland",358,5244000," Sauli Niinistö");
        CountryDto c73 = new CountryDto("France",33,64768389,"Emmanuel Macron");
        CountryDto c74 = new CountryDto("French Polynesia",689,270485,"Petteri Orpo");
        CountryDto c75 = new CountryDto("Gabon",241,154255," Brice Oligui");
        CountryDto c76 = new CountryDto("Gambia",220,1593256,"Adama Barrow");
        CountryDto c77 = new CountryDto("Georgia",995,4630000,"Salome Zourabichvili");
        CountryDto c78 = new CountryDto("Germany",49,81802257," Frank-Walter Steinmeier");
        CountryDto c79 = new CountryDto("Ghana",233,24339838,"John Mahama");
        CountryDto c80 = new CountryDto("Gibraltar",350,24884,"Olaf Scholz");
        CountryDto c81 = new CountryDto("Greece",30,11000000,"Katerina Sakellaropoulou");
        CountryDto c82 = new CountryDto("Greenland",299,56375,"Dickon Mitchell");
        CountryDto c83 = new CountryDto("Grenada",473,107818," Charles");
        CountryDto c84 = new CountryDto("Guam",671,159358,"Kyriakos Mitsotakis");
        CountryDto c85 = new CountryDto("Guatemala",502,13550440," Bernardo Arévalo");
        CountryDto c86 = new CountryDto("Guernsey",1481,65228,"");
        CountryDto c87 = new CountryDto("Guinea",224,10324025," Mamady Doumbouya");
        CountryDto c88 = new CountryDto("Guinea-Bissau",245,1565126,"Umaro Sissoco Embaló");
        CountryDto c89 = new CountryDto("Guyana",592,748486," Irfaan Ali");
        CountryDto c90 = new CountryDto("Haiti",509,9648924," Alix Didier Fils-Aimé");
        CountryDto c91 = new CountryDto("Honduras",504,7989415," Xiomara Castro");
        CountryDto c92 = new CountryDto("Hong Kong",852,6898686,"Viktor Orbán");
        CountryDto c93 = new CountryDto("Hungary",36,9982000," Tamás Sulyok");
        CountryDto c94 = new CountryDto("Iceland",354,308910,"");
        CountryDto c95 = new CountryDto("India",91,1173108018,"Halla Tómasdóttir");
        CountryDto c96 = new CountryDto("Indonesia",62,242968342,"Halla Tómasdóttir");
        CountryDto c97 = new CountryDto("Iran",98,76923300,"");
        CountryDto c98 = new CountryDto("Iraq",964,29671605," Ali Khamenei");
        CountryDto c99 = new CountryDto("Ireland",353,4622917," Michael D. Higgins");
        CountryDto c100 = new CountryDto("Isle of Man",44,75049,"Simon Harris");
        CountryDto c101 = new CountryDto("Israel",972,7353985,"Isaac Herzog");
        CountryDto c102 = new CountryDto("Italy",39,60340384,"Sergio Mattarella");
        CountryDto c103 = new CountryDto("Ivory Coast",225,21058798,"");
        CountryDto c104 = new CountryDto("Jamaica",1,2847232,"Alassane Ouattara");
        CountryDto c105 = new CountryDto("Japan",81,127288000,"Naruhito");
        CountryDto c106 = new CountryDto("Jersey",44,90812,"Shigeru Ishiba");
        CountryDto c107 = new CountryDto("Jordan",962,6407085,"Abdullah II");
        CountryDto c108 = new CountryDto("Kazakhstan",7,15340000,"Qasym-Zhomart Toqaev");
        CountryDto c109 = new CountryDto("Kenya",254,40046566," William Ruto");
        CountryDto c110 = new CountryDto("Kiribati",686,92533,"Taneti Maamau");
        CountryDto c111 = new CountryDto("Kosovo",383,1800000,"Oljas Bektenov");
        CountryDto c112 = new CountryDto("Kuwait",965,2789132,"Sheikh");
        CountryDto c113 = new CountryDto("Kyrgyzstan",996,5508626," Sadyr Japarov");
        CountryDto c114 = new CountryDto("Laos",856,6368162," Thongloun Sisoulith");
        CountryDto c115 = new CountryDto("Latvia",371,2217969," Edgars Rinkēvičs");
        CountryDto c116 = new CountryDto("Lebanon",961,4125247," Joseph Aoun");
        CountryDto c117 = new CountryDto("Lesotho",266,1919552,"Letsie III");
        CountryDto c118 = new CountryDto("Liberia",231,3685076,"Joseph Boakai");
        CountryDto c119 = new CountryDto("Libya",218,646454,"Mohamed al-Menfi");
        CountryDto c120 = new CountryDto("Liechtenstein",423,35000," Hans-Adam II");
        CountryDto c121 = new CountryDto("Lithuania",370,2944459,"Gitanas Nausėda");
        CountryDto c122 = new CountryDto("Luxembourg",352,449198,"Henri");
        CountryDto c123 = new CountryDto("Macau",853,449198,"Christian Ntsay");
        CountryDto c124 = new CountryDto("Macedonia",389,2062294,"Gintautas Paluckas");
        CountryDto c125 = new CountryDto("Madagascar",261,21281844," Andry Rajoelina");
        CountryDto c126 = new CountryDto("Malawi",265,15447500,"Lazarus Chakwera");
        CountryDto c127 = new CountryDto(" Malaysia",60,28274729,"Ibrahim Iskandar");
        CountryDto c128 = new CountryDto("Maldives",960,395650,"Mohamed Muizzu");
        CountryDto c129 = new CountryDto("mali",223,13796354,"Assimi Goïta");
        CountryDto c130 = new CountryDto("malta",356,403000,"George Vella");
        CountryDto c131 = new CountryDto("Marshall Islands",692,	65859," Hilda Heine");
        CountryDto c132 = new CountryDto("Mauritania",222,3205060,"Mohamed Ould Ghazouani");
        CountryDto c133 = new CountryDto("Mauritius",566,46546323,"Dharam Gokhool");
        CountryDto c134 = new CountryDto(" Mexico",56,454323154,"Claudia Sheinbaum");
        CountryDto c135 = new CountryDto(" Federated States of Micronesia",564,4543521,"Wesley Simina");
        CountryDto c136 = new CountryDto("Moldova",256,546532121,"Maia Sandu");
        CountryDto c137 = new CountryDto("Monaco",564,65623,"Albert II");
        CountryDto c138 = new CountryDto("Mongolia",456,54231222,"Ukhnaagiin Khürelsükh");
        CountryDto c139 = new CountryDto("Montenegro",382,	666730,"Jakov Milatović");
        CountryDto c140 = new CountryDto("Morocco",212,31627428,"Mohammed VI");
        CountryDto c141 = new CountryDto(" Mozambique",533,45423121,"Daniel Chapo");
        CountryDto c142 = new CountryDto("Myanmar",120,51423121,"Min Aung Hlaing");
        CountryDto c143 = new CountryDto("Namibia",879,54561323,"Nangolo Mbumba");
        CountryDto c144 = new CountryDto(" Nauru",85,545122,"David Adeang");
        CountryDto c145 = new CountryDto("nepal",555,564152,"Ram Chandra Poudel");
        CountryDto c146 = new CountryDto("Netherlands",632,56451221,"Willem-Alexander");
        CountryDto c147 = new CountryDto("New Zealand",56,54521212,"Charles III");
        CountryDto c148 = new CountryDto("Nicaragua",654,5645121,"Daniel Ortega");
        CountryDto c149 = new CountryDto("niger",987,54512132," Omar Tchiani");
        CountryDto c150 = new CountryDto("nigeria",656,78985625,"Bola Tinubu");
        CountryDto c151 = new CountryDto(" North Korea",45,645452332,"Kim Jong-un");
        CountryDto c152 = new CountryDto("North Macedonia",54,54541212,"Stevo Pendarovski");
        CountryDto c153 = new CountryDto("Norway",756,5452121,"Harald V");
        CountryDto c154 = new CountryDto("oman",96,4542102,"Haitham bin Tariq");
        CountryDto c155 = new CountryDto("Pakistan",644,5454213238L,"Asif Ali Zardari");
        CountryDto c156 = new CountryDto("Palau",542,46532133,"Surangel Whipps Jr");
        CountryDto c157 = new CountryDto("Palestine",507,3410676," Laurentino Cortizo");
        CountryDto c158 = new CountryDto("Papua New Guinea",675,6064515," Charles III");
        CountryDto c159 = new CountryDto("Paraguay",595,6375830,"Santiago Peña");
        CountryDto c160 = new CountryDto("Peru",592,29907003,"Dina Boluarte");
        CountryDto c161 = new CountryDto("Philippines",63,99900177,"Bongbong Marcos");
        CountryDto c162 = new CountryDto("Poland",48,38500000,"Andrzej Duda");
        CountryDto c163 = new CountryDto("Portugal",351,10676000,"Marcelo Rebelo de Sousa");
        CountryDto c164 = new CountryDto("Qatar",974,840926,"Sheikh Tamim bin Hamad Al Thani");
        CountryDto c165 = new CountryDto("Romania",40,21959278,"Klaus Iohannis");
        CountryDto c166 = new CountryDto("Russia",7,140702000,"Vladimir Putin");
        CountryDto c167 = new CountryDto("Rwanda",250,11055976,"Paul Kagame");
        CountryDto c168 = new CountryDto("Saint Kitts and Nevis",1590,51134,"Charles III");
        CountryDto c169 = new CountryDto("Saint Lucia",1758,160922,"Philip Pierre");
        CountryDto c170 = new CountryDto("Saint Vincent and the Grenadines",1784,104217,"Ralph Gonsalves");
        CountryDto c171 = new CountryDto(" Samoa",685,192001," Fiamē Naomi");
        CountryDto c172 = new CountryDto("San Marino",378,31477," Dalibor Riccardi");
        CountryDto c173 = new CountryDto("Saudi Arabia",45,6232302,"Salman");
        CountryDto c174 = new CountryDto("Serbia",789,51212088,"Aleksandar Vučić");
        CountryDto c175 = new CountryDto("Seychelles",888,53230,"Wavel Ramkalawan");
        CountryDto c176 = new CountryDto("Singapore",98,51213023,"Tharman Shanmugaratnam");
        CountryDto c177 = new CountryDto("Slovakia",454,542128899," Peter Pellegrini");
        CountryDto c178 = new CountryDto("Somalia",966,4411212,"Hassan Mohamud");
        CountryDto c179 = new CountryDto("South Africa",984,421305252,"Cyril Ramaphosa");
        CountryDto c180 = new CountryDto("South Korea",455,542121,"Choi Sang-mok");
        CountryDto c181 = new CountryDto(" Spain",34,46505963,"King – Felipe VI");
        CountryDto c182 = new CountryDto(" Sri Lanka",94,21513990,"Anura Kumara Dissanayake");
        CountryDto c183 = new CountryDto("Sudan",249,35000000,"Osman Hussein");
        CountryDto c184 = new CountryDto(" Sweden",46,9555893,"Carl XVI Gustaf");
        CountryDto c185 = new CountryDto("Switzerland",256,7581000,"Karin Keller-Sutter ");
        CountryDto c186 = new CountryDto("Syria",963,22198110,"Vacant");
        CountryDto c187 = new CountryDto("Tajikistan",886,2894384," Emomali Rahmon");
        CountryDto c188 = new CountryDto("Tanzania",255,41892895,"Samia Suluhu Hassan");
        CountryDto c189 = new CountryDto("Thailand",256,67089500," Maha Vajiralongkorn");
        CountryDto c190 = new CountryDto("Trinidad and Tobago",1868,1228691,"Christine Kangaloo");
        CountryDto c191 = new CountryDto("Turkey",90,77804122," Recep Tayyip Erdoğan");
        CountryDto c192 = new CountryDto("Uganda",256,33398682,"Yoweri Museveni");
        CountryDto c193 = new CountryDto("Ukraine",380,45415596,"Volodymyr Zelensky");
        CountryDto c194 = new CountryDto("United Arab Emirates",55,8564321,"Sheikh Mohamed bin Zayed Al");
        CountryDto c195 = new CountryDto("United Kingdom",44,62348447," Keir Starmer");
        CountryDto c196 = new CountryDto("United States",1,310232863,"Donald Trump");
        CountryDto c197 = new CountryDto(" Uruguay",598,3477000,"Luis Lacalle Pou");
        CountryDto c198 = new CountryDto("Uzbekistan",1254,523236,"Shavkat Mirziyoyev");
        CountryDto c199 = new CountryDto("Vatican City",978,5688,"Pope Francis");
        CountryDto c200 = new CountryDto("Venezuela",58,27223228," Edmundo González");
      /*  CountryDto c201 = new CountryDto("Vietnam",84,89571130,"Lương Cường");
        CountryDto c202 = new CountryDto("Yemen",23,495361967,"Rashad al-Alimi");
        CountryDto c203 = new CountryDto("Zambia",260,13460305,"Hakainde Hichilema");
        CountryDto c204 = new CountryDto("Zimbabwe",263,11651858,"Emmerson Mnangagwa");
*/

        Collection<CountryDto> countryDtos=new ArrayList<>();
        countryDtos.add(c1);
        countryDtos.add(c2);
        countryDtos.add(c3);
        countryDtos.add(c4);
        countryDtos.add(c5);
        countryDtos.add(c6);
        countryDtos.add(c7);
        countryDtos.add(c8);
        countryDtos.add(c9);
        countryDtos.add(c10);
        countryDtos.add(c11);
        countryDtos.add(c12);
        countryDtos.add(c13);
        countryDtos.add(c14);
        countryDtos.add(c15);
        countryDtos.add(c16);
        countryDtos.add(c17);
        countryDtos.add(c18);
        countryDtos.add(c19);
        countryDtos.add(c20);
        countryDtos.add(c21);
        countryDtos.add(c22);
        countryDtos.add(c23);
        countryDtos.add(c24);
        countryDtos.add(c25);
        countryDtos.add(c26);
        countryDtos.add(c27);
        countryDtos.add(c28);
        countryDtos.add(c29);
        countryDtos.add(c30);
        countryDtos.add(c31);
        countryDtos.add(c32);
        countryDtos.add(c33);
        countryDtos.add(c34);
        countryDtos.add(c35);
        countryDtos.add(c36);
        countryDtos.add(c37);
        countryDtos.add(c38);
        countryDtos.add(c39);
        countryDtos.add(c40);
        countryDtos.add(c41);
        countryDtos.add(c42);
        countryDtos.add(c43);
        countryDtos.add(c44);
        countryDtos.add(c45);
        countryDtos.add(c46);
        countryDtos.add(c47);
        countryDtos.add(c48);
        countryDtos.add(c49);
        countryDtos.add(c50);
        countryDtos.add(c51);
        countryDtos.add(c52);
        countryDtos.add(c53);
        countryDtos.add(c54);
        countryDtos.add(c55);
        countryDtos.add(c56);
        countryDtos.add(c57);
        countryDtos.add(c58);
        countryDtos.add(c59);
        countryDtos.add(c60);
        countryDtos.add(c61);
        countryDtos.add(c62);
        countryDtos.add(c63);
        countryDtos.add(c64);
        countryDtos.add(c65);
        countryDtos.add(c66);
        countryDtos.add(c67);
        countryDtos.add(c68);
        countryDtos.add(c69);
        countryDtos.add(c70);
        countryDtos.add(c71);
        countryDtos.add(c72);
        countryDtos.add(c73);
        countryDtos.add(c74);
        countryDtos.add(c75);
        countryDtos.add(c76);
        countryDtos.add(c77);
        countryDtos.add(c78);
        countryDtos.add(c79);
        countryDtos.add(c80);
        countryDtos.add(c81);
        countryDtos.add(c82);
        countryDtos.add(c83);
        countryDtos.add(c84);
        countryDtos.add(c85);
        countryDtos.add(c86);
        countryDtos.add(c87);
        countryDtos.add(c88);
        countryDtos.add(c89);
        countryDtos.add(c90);
        countryDtos.add(c91);
        countryDtos.add(c92);
        countryDtos.add(c93);
        countryDtos.add(c94);
        countryDtos.add(c95);
        countryDtos.add(c96);
        countryDtos.add(c97);
        countryDtos.add(c98);
        countryDtos.add(c99);
        countryDtos.add(c100);
        countryDtos.add(c101);
        countryDtos.add(c102);
        countryDtos.add(c103);
        countryDtos.add(c104);
        countryDtos.add(c105);
        countryDtos.add(c106);
        countryDtos.add(c107);
        countryDtos.add(c108);
        countryDtos.add(c109);
        countryDtos.add(c110);
        countryDtos.add(c111);
        countryDtos.add(c112);
        countryDtos.add(c113);
        countryDtos.add(c114);
        countryDtos.add(c115);
        countryDtos.add(c116);
        countryDtos.add(c117);
        countryDtos.add(c118);
        countryDtos.add(c119);
        countryDtos.add(c120);
        countryDtos.add(c121);
        countryDtos.add(c122);
        countryDtos.add(c123);
        countryDtos.add(c124);
        countryDtos.add(c125);
        countryDtos.add(c126);
        countryDtos.add(c127);
        countryDtos.add(c128);
        countryDtos.add(c129);
        countryDtos.add(c130);
        countryDtos.add(c131);
        countryDtos.add(c132);
        countryDtos.add(c133);
        countryDtos.add(c134);
        countryDtos.add(c135);
        countryDtos.add(c136);
        countryDtos.add(c137);
        countryDtos.add(c138);
        countryDtos.add(c139);
        countryDtos.add(c140);
        countryDtos.add(c141);
        countryDtos.add(c142);
        countryDtos.add(c143);
        countryDtos.add(c144);
        countryDtos.add(c145);
        countryDtos.add(c146);
        countryDtos.add(c147);
        countryDtos.add(c148);
        countryDtos.add(c149);
        countryDtos.add(c150);
        countryDtos.add(c151);
        countryDtos.add(c152);
        countryDtos.add(c153);
        countryDtos.add(c154);
        countryDtos.add(c155);
        countryDtos.add(c156);
        countryDtos.add(c157);
        countryDtos.add(c158);
        countryDtos.add(c159);
        countryDtos.add(c160);
        countryDtos.add(c161);
        countryDtos.add(c162);
        countryDtos.add(c163);
        countryDtos.add(c164);
        countryDtos.add(c165);
        countryDtos.add(c166);
        countryDtos.add(c167);
        countryDtos.add(c168);
        countryDtos.add(c169);
        countryDtos.add(c170);
        countryDtos.add(c171);
        countryDtos.add(c172);
        countryDtos.add(c173);
        countryDtos.add(c174);
        countryDtos.add(c175);
        countryDtos.add(c176);
        countryDtos.add(c177);
        countryDtos.add(c178);
        countryDtos.add(c179);
        countryDtos.add(c180);
        countryDtos.add(c181);
        countryDtos.add(c182);
        countryDtos.add(c183);
        countryDtos.add(c184);
        countryDtos.add(c185);
        countryDtos.add(c186);
        countryDtos.add(c187);
        countryDtos.add(c188);
        countryDtos.add(c189);
        countryDtos.add(c190);
        countryDtos.add(c191);
        countryDtos.add(c192);
        countryDtos.add(c193);
        countryDtos.add(c194);
        countryDtos.add(c195);
        countryDtos.add(c196);
        countryDtos.add(c197);
        countryDtos.add(c198);
        countryDtos.add(c199);
        countryDtos.add(c200);

        return  countryDtos;
    }

}
