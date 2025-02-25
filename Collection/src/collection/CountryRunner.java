package collection;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import dto.CountryDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryRunner {
    public static void main(String[] args) {

        CountryDTO country1 = new CountryDTO("Afganistan",122,29121286,"Emir – Hibatullah Akhundzada");

        CountryDTO country2 = new CountryDTO("Albania",355,2986952," Bajram Begaj");

        CountryDTO country3 = new CountryDTO("Algeria",213,34586184," Abdelmadjid Tebboune");

        CountryDTO country4 = new CountryDTO("American Samoa",684,57881,"Xavier Espot Zamora");

        CountryDTO country5 = new CountryDTO("Andorra",376,84000,"Joan Enric Vives i Sicília");

        CountryDTO country6 = new CountryDTO("Angola",244,13068161,"João Lourenço");

        CountryDTO country7 = new CountryDTO("Anguilla",264,13254,"Gaston Browne");

        CountryDTO country8 = new CountryDTO("Antarctica",672,0,"Xavier Espot Zamora");

        CountryDTO country9 = new CountryDTO("Antigua and Barbuda",268,86754,"Charles");

        CountryDTO country10 = new CountryDTO("Argentina",54,2766890,"Javier Milei");

        CountryDTO country11 = new CountryDTO("Armenia",374,2968000,"Vahagn Khachaturyan");

        CountryDTO country12 = new CountryDTO("Aruba",297,71566,"Javier Milei");

        CountryDTO country13 = new CountryDTO("Australia",61,21515754,"Charles");

        CountryDTO country14 = new CountryDTO("Austria",43,8205000," Alexander Van der Bellen");

        CountryDTO country15 = new CountryDTO("Azerbaijan",994,8303512," Ilham Aliyev");

        CountryDTO country16 = new CountryDTO("Bahamas",242,301790,"Charles");

        CountryDTO country17 = new CountryDTO("Bahrain",973,738004," Sheikh Hamad bin Isa Al Khalifa");

        CountryDTO country18 = new CountryDTO("Bangladesh",880,156118464,"Shahabuddin Chuppu");

        CountryDTO country19 = new CountryDTO("Barbados",246,285653,"Sandra Mason");

        CountryDTO country20 = new CountryDTO("Belarus",375,9685000,"Alexander Lukashenko");

        CountryDTO country21 = new CountryDTO("Belgium",32,30510,"Philippe");

        CountryDTO country22 = new CountryDTO("Belize",501,314522,"Patrice Talon");

        CountryDTO country23 = new CountryDTO("Benin",501,314522,"Jigme Khesar");

        CountryDTO country24 = new CountryDTO("Bermuda",441,65365,"Alexander De Croo");

        CountryDTO country25 = new CountryDTO("Bhutan",975,699847,"Roman Golovchenko");

        CountryDTO country26 = new CountryDTO("Bolivia",591,9947418,"Luis Arce");

        CountryDTO country27 = new CountryDTO("Bosnia and Herzegovina",387,4590000,"Borjana Kristo");

        CountryDTO country28 = new CountryDTO("Botswana",267,2029307,"Duma Boko");

        CountryDTO country29 = new CountryDTO("Brazil",55,201103330,"Luiz Inacio Lula da Silva");

        CountryDTO country30 = new CountryDTO("British Indian Ocean Territory",246,4000,"Rosen Zhelyazkov");

        CountryDTO country31 = new CountryDTO("British Virgin Islands",284,21730,"Borjana Krišto");

        CountryDTO country32 = new CountryDTO("Bulgaria",673,395027," Hassanal Bolkiah");

        CountryDTO country33 = new CountryDTO("Brunei",359,7148785,"Rumen Radev");

        CountryDTO country34 = new CountryDTO("Burkina Faso",226,16241811," Ibrahim Traore");

        CountryDTO country35 = new CountryDTO("Burundi",257,9863117,"Évariste Ndayishimiye");

        CountryDTO country36 = new CountryDTO("Cambodia",855,14453680,"Norodom Sihamoni");

        CountryDTO country37 = new CountryDTO("Cameroon",237,19294149," Paul Biya");

        CountryDTO country38 = new CountryDTO("Canada",1,33679000,"Charles");

        CountryDTO country39 = new CountryDTO("Cape Verde",238,508659,"José Maria Neves");

        CountryDTO country40 = new CountryDTO("Cayman Islands",345,44270,"Ulisses Correia e Silva");

        CountryDTO country41 = new CountryDTO("Central African Republic",236,4844927,"Faustin-Archange");

        CountryDTO country42 = new CountryDTO("Chad",253,10543464," Mahamat Idriss Déby");

        CountryDTO country43 = new CountryDTO("Chile",56,16746491,"Gabriel Boric");

        CountryDTO country44 = new CountryDTO("China",86,1330044000,"Xi Jinping");

        CountryDTO country45 = new CountryDTO("Christmas Island",61,1500,"Li Qiang");

        CountryDTO country46 = new CountryDTO("Cocos Islands",61,628," Félix Moloua");

        CountryDTO country47 = new CountryDTO("Colombia",57,47790000,"Gustavo Petro");

        CountryDTO country48 = new CountryDTO("Comoros",269,773407," Azali Assoumani");

        CountryDTO country49 = new CountryDTO("Cook Islands",682,21388,"Justin Trudeau");

        CountryDTO country50 = new CountryDTO("Costa Rica",506,4516220,"Joseph Ngute");

        CountryDTO country51 = new CountryDTO("Croatia",385,4491000,"  Rodrigo Chaves Robles");

        CountryDTO country52 = new CountryDTO("Cuba",53,11423000," Miguel Díaz-Canel");

        CountryDTO country53 = new CountryDTO("Curacao",599,141766,"Miguel Díaz-Canel");

        CountryDTO country54 = new CountryDTO("Cyprus",357,1102677,"Nikos Christodoulides");

        CountryDTO country55 = new CountryDTO("Czech Republic",420,10476000,"Petr Pavel");

        CountryDTO country56 = new CountryDTO("Democratic Republic of the Congo",243,70916439," Petr Fiala");

        CountryDTO country57 = new CountryDTO("Denmark",45,5484000,"Frederik X");

        CountryDTO country58 = new CountryDTO("Djibouti",253,740528," Ismaïl Omar Guelleh");

        CountryDTO country59 = new CountryDTO("Dominica",767,72813," Sylvanie Burton");

        CountryDTO country60 = new CountryDTO("Dominican Republic",809,9823821,"Luis Abinader");

        CountryDTO country61 = new CountryDTO("East Timor",670,1154625," José Ramos-Horta");

        CountryDTO country62 = new CountryDTO("Ecuador",593,14790608,"Daniel Noboa");

        CountryDTO country63 = new CountryDTO("Egypt",20,80471869," Abdel Fattah el-Sisi");

        CountryDTO country64 = new CountryDTO("El Salvador",503,6052064,"Nayib Bukele");

        CountryDTO country65 = new CountryDTO("Equatorial Guinea",240,1014999," Teodoro Obiang Nguema Mbasogo");

        CountryDTO country66 = new CountryDTO("Eritrea",291,5792984,"Isaias Afwerki");

        CountryDTO country67 = new CountryDTO("Estonia",372,1291170,"Alar Karis");

        CountryDTO country68 = new CountryDTO("Ethiopia",251,88013491," Isaias Afwerki");

        CountryDTO country69 = new CountryDTO("Falkland Islands",500,2638,"Mostafa Madbouly");

        CountryDTO country70 = new CountryDTO("Faroe Islands",298,48228,"Russell Dlamini");

        CountryDTO country71 = new CountryDTO("Fiji",679,875983," Naiqama Lalabalavu");

        CountryDTO country72 = new CountryDTO("Finland",358,5244000," Sauli Niinistö");

        CountryDTO country73 = new CountryDTO("France",33,64768389,"Emmanuel Macron");

        CountryDTO country74 = new CountryDTO("French Polynesia",689,270485,"Petteri Orpo");

        CountryDTO country75 = new CountryDTO("Gabon",241,154255," Brice Oligui");

        CountryDTO country76 = new CountryDTO("Gambia",220,1593256,"Adama Barrow");

        CountryDTO country77 = new CountryDTO("Georgia",995,4630000,"Salome Zourabichvili");

        CountryDTO country78 = new CountryDTO("Germany",49,81802257," Frank-Walter Steinmeier");

        CountryDTO country79 = new CountryDTO("Ghana",233,24339838,"John Mahama");

        CountryDTO country80 = new CountryDTO("Gibraltar",350,24884,"Olaf Scholz");

        CountryDTO country81 = new CountryDTO("Greece",30,11000000,"Katerina Sakellaropoulou");

        CountryDTO country82 = new CountryDTO("Greenland",299,56375,"Dickon Mitchell");

        CountryDTO country83 = new CountryDTO("Grenada",473,107818," Charles");

        CountryDTO country84 = new CountryDTO("Guam",671,159358,"Kyriakos Mitsotakis");

        CountryDTO country85 = new CountryDTO("Guatemala",502,13550440," Bernardo Arévalo");

        CountryDTO country86 = new CountryDTO("Guernsey",1481,65228,"");

        CountryDTO country87 = new CountryDTO("Guinea",224,10324025," Mamady Doumbouya");

        CountryDTO country88 = new CountryDTO("Guinea-Bissau",245,1565126,"Umaro Sissoco Embaló");

        CountryDTO country89 = new CountryDTO("Guyana",592,748486," Irfaan Ali");

        CountryDTO country90 = new CountryDTO("Haiti",509,9648924," Alix Didier Fils-Aimé");

        CountryDTO country91 = new CountryDTO("Honduras",504,7989415," Xiomara Castro");

        CountryDTO country92 = new CountryDTO("Hong Kong",852,6898686,"Viktor Orbán");

        CountryDTO country93 = new CountryDTO("Hungary",36,9982000," Tamás Sulyok");

        CountryDTO country94 = new CountryDTO("Iceland",354,308910,"");

        CountryDTO country95 = new CountryDTO("India",91,1173108018,"Halla Tómasdóttir");

        CountryDTO country96 = new CountryDTO("Indonesia",62,242968342,"Halla Tómasdóttir");

        CountryDTO country97 = new CountryDTO("Iran",98,76923300,"");

        CountryDTO country98 = new CountryDTO("Iraq",964,29671605," Ali Khamenei");

        CountryDTO country99 = new CountryDTO("Ireland",353,4622917," Michael D. Higgins");

        CountryDTO country100 = new CountryDTO("Isle of Man",44,75049,"Simon Harris");

        CountryDTO country101 = new CountryDTO("Israel",972,7353985,"Isaac Herzog");

        CountryDTO country102 = new CountryDTO("Italy",39,60340384,"Sergio Mattarella");

        CountryDTO country103 = new CountryDTO("Ivory Coast",225,21058798,"");

        CountryDTO country104 = new CountryDTO("Jamaica",1,2847232,"Alassane Ouattara");

        CountryDTO country105 = new CountryDTO("Japan",81,127288000,"Naruhito");

        CountryDTO country106 = new CountryDTO("Jersey",44,90812,"Shigeru Ishiba");

        CountryDTO country107 = new CountryDTO("Jordan",962,6407085,"Abdullah II");

        CountryDTO country108 = new CountryDTO("Kazakhstan",7,15340000,"Qasym-Zhomart Toqaev");

        CountryDTO country109 = new CountryDTO("Kenya",254,40046566," William Ruto");

        CountryDTO country110 = new CountryDTO("Kiribati",686,92533,"Taneti Maamau");

        CountryDTO country111 = new CountryDTO("Kosovo",383,1800000,"Oljas Bektenov");

        CountryDTO country112 = new CountryDTO("Kuwait",965,2789132,"Sheikh");

        CountryDTO country113 = new CountryDTO("Kyrgyzstan",996,5508626," Sadyr Japarov");

        CountryDTO country114 = new CountryDTO("Laos",856,6368162," Thongloun Sisoulith");

        CountryDTO country115 = new CountryDTO("Latvia",371,2217969," Edgars Rinkēvičs");

        CountryDTO country116 = new CountryDTO("Lebanon",961,4125247," Joseph Aoun");

        CountryDTO country117 = new CountryDTO("Lesotho",266,1919552,"Letsie III");

        CountryDTO country118 = new CountryDTO("Liberia",231,3685076,"Joseph Boakai");

        CountryDTO country119 = new CountryDTO("Libya",218,646454,"Mohamed al-Menfi");

        CountryDTO country120 = new CountryDTO("Liechtenstein",423,35000," Hans-Adam II");

        CountryDTO country121 = new CountryDTO("Lithuania",370,2944459,"Gitanas Nausėda");

        CountryDTO country122 = new CountryDTO("Luxembourg",352,449198,"Henri");

        CountryDTO country123 = new CountryDTO("Macau",853,449198,"Christian Ntsay");

        CountryDTO country124 = new CountryDTO("Macedonia",389,2062294,"Gintautas Paluckas");

        CountryDTO country125 = new CountryDTO("Madagascar",261,21281844," Andry Rajoelina");

        CountryDTO country126 = new CountryDTO("Malawi",265,15447500,"Lazarus Chakwera");

        CountryDTO country127 = new CountryDTO(" Malaysia",60,28274729,"Ibrahim Iskandar");

        CountryDTO country128 = new CountryDTO("Maldives",960,395650,"Mohamed Muizzu");

        CountryDTO country129 = new CountryDTO("mali",223,13796354,"Assimi Goïta");

        CountryDTO country130 = new CountryDTO("malta",356,403000,"George Vella");

        CountryDTO country131 = new CountryDTO("Marshall Islands",692,	65859," Hilda Heine");

        CountryDTO country132 = new CountryDTO("Mauritania",222,3205060,"Mohamed Ould Ghazouani");

        CountryDTO country133 = new CountryDTO("Mauritius",566,46546323,"Dharam Gokhool");

        CountryDTO country134 = new CountryDTO(" Mexico",56,454323154,"Claudia Sheinbaum");

        CountryDTO country135 = new CountryDTO(" Federated States of Micronesia",564,4543521,"Wesley Simina");

        CountryDTO country136 = new CountryDTO("Moldova",256,546532121,"Maia Sandu");

        CountryDTO country137 = new CountryDTO("Monaco",564,65623,"Albert II");

        CountryDTO country138 = new CountryDTO("Mongolia",456,54231222,"Ukhnaagiin Khürelsükh");

        CountryDTO country139 = new CountryDTO("Montenegro",382,	666730,"Jakov Milatović");

        CountryDTO country140 = new CountryDTO("Morocco",212,31627428,"Mohammed VI");

        CountryDTO country141 = new CountryDTO(" Mozambique",533,45423121,"Daniel Chapo");

        CountryDTO country142 = new CountryDTO("Myanmar",120,51423121,"Min Aung Hlaing");

        CountryDTO country143 = new CountryDTO("Namibia",879,54561323,"Nangolo Mbumba");

        CountryDTO country144 = new CountryDTO(" Nauru",85,545122,"David Adeang");

        CountryDTO country145 = new CountryDTO("nepal",555,564152,"Ram Chandra Poudel");

        CountryDTO country146 = new CountryDTO("Netherlands",632,56451221,"Willem-Alexander");

        CountryDTO country147 = new CountryDTO("New Zealand",56,54521212,"Charles III");

        CountryDTO country148 = new CountryDTO("Nicaragua",654,5645121,"Daniel Ortega");

        CountryDTO country149 = new CountryDTO("niger",987,54512132," Omar Tchiani");

        CountryDTO country150 = new CountryDTO("nigeria",656,78985625,"Bola Tinubu");

        CountryDTO country151 = new CountryDTO(" North Korea",45,645452332,"Kim Jong-un");

        CountryDTO country152 = new CountryDTO("North Macedonia",54,54541212,"Stevo Pendarovski");

        CountryDTO country153 = new CountryDTO("Norway",756,5452121,"Harald V");

        CountryDTO country154 = new CountryDTO("oman",96,4542102,"Haitham bin Tariq");

        CountryDTO country155 = new CountryDTO("Pakistan",644,5454213238L,"Asif Ali Zardari");

        CountryDTO country156 = new CountryDTO("Palau",542,46532133,"Surangel Whipps Jr");

        CountryDTO country157 = new CountryDTO("Palestine",507,3410676," Laurentino Cortizo");

        CountryDTO country158 = new CountryDTO("Papua New Guinea",675,6064515," Charles III");

        CountryDTO country159 = new CountryDTO("Paraguay",595,6375830,"Santiago Peña");

        CountryDTO country160 = new CountryDTO("Peru",592,29907003,"Dina Boluarte");

        CountryDTO country161 = new CountryDTO("Philippines",63,99900177,"Bongbong Marcos");

        CountryDTO country162 = new CountryDTO("Poland",48,38500000,"Andrzej Duda");

        CountryDTO country163 = new CountryDTO("Portugal",351,10676000,"Marcelo Rebelo de Sousa");

        CountryDTO country164 = new CountryDTO("Qatar",974,840926,"Sheikh Tamim bin Hamad Al Thani");

        CountryDTO country165 = new CountryDTO("Romania",40,21959278,"Klaus Iohannis");

        CountryDTO country166 = new CountryDTO("Russia",7,140702000,"Vladimir Putin");

        CountryDTO country167 = new CountryDTO("Rwanda",250,11055976,"Paul Kagame");

        CountryDTO country168 = new CountryDTO("Saint Kitts and Nevis",1590,51134,"Charles III");

        CountryDTO country169 = new CountryDTO("Saint Lucia",1758,160922,"Philip Pierre");

        CountryDTO country170 = new CountryDTO("Saint Vincent and the Grenadines",1784,104217,"Ralph Gonsalves");

        CountryDTO country171 = new CountryDTO(" Samoa",685,192001," Fiamē Naomi");

        CountryDTO country172 = new CountryDTO("San Marino",378,31477," Dalibor Riccardi");

        CountryDTO country173 = new CountryDTO("Saudi Arabia",45,6232302,"Salman");

        CountryDTO country174 = new CountryDTO("Serbia",789,51212088,"Aleksandar Vučić");

        CountryDTO country175 = new CountryDTO("Seychelles",888,53230,"Wavel Ramkalawan");

        CountryDTO country176 = new CountryDTO("Singapore",98,51213023,"Tharman Shanmugaratnam");

        CountryDTO country177 = new CountryDTO("Slovakia",454,542128899," Peter Pellegrini");

        CountryDTO country178 = new CountryDTO("Somalia",966,4411212,"Hassan Mohamud");

        CountryDTO country179 = new CountryDTO("South Africa",984,421305252,"Cyril Ramaphosa");

        CountryDTO country180 = new CountryDTO("South Korea",455,542121,"Choi Sang-mok");

        CountryDTO country181 = new CountryDTO(" Spain",34,46505963,"King – Felipe VI");

        CountryDTO country182 = new CountryDTO(" Sri Lanka",94,21513990,"Anura Kumara Dissanayake");

        CountryDTO country183 = new CountryDTO("Sudan",249,35000000,"Osman Hussein");

        CountryDTO country184 = new CountryDTO(" Sweden",46,9555893,"Carl XVI Gustaf");

        CountryDTO country185 = new CountryDTO("Switzerland",256,7581000,"Karin Keller-Sutter ");

        CountryDTO country186 = new CountryDTO("Syria",963,22198110,"Vacant");

        CountryDTO country187 = new CountryDTO("Tajikistan",886,2894384," Emomali Rahmon");

        CountryDTO country188 = new CountryDTO("Tanzania",255,41892895,"Samia Suluhu Hassan");

        CountryDTO country189 = new CountryDTO("Thailand",256,67089500," Maha Vajiralongkorn");

        CountryDTO country190 = new CountryDTO("Trinidad and Tobago",1868,1228691,"Christine Kangaloo");

        CountryDTO country191 = new CountryDTO("Turkey",90,77804122," Recep Tayyip Erdoğan");

        CountryDTO country192 = new CountryDTO("Uganda",256,33398682,"Yoweri Museveni");

        CountryDTO country193 = new CountryDTO("Ukraine",380,45415596,"Volodymyr Zelensky");

        CountryDTO country194 = new CountryDTO("United Arab Emirates",55,8564321,"Sheikh Mohamed bin Zayed Al");

        CountryDTO country195 = new CountryDTO("United Kingdom",44,62348447," Keir Starmer");

        CountryDTO country196 = new CountryDTO("United States",1,310232863,"Donald Trump");

        CountryDTO country197 = new CountryDTO(" Uruguay",598,3477000,"Luis Lacalle Pou");

        CountryDTO country198 = new CountryDTO("Uzbekistan",1254,523236,"Shavkat Mirziyoyev");

        Collection<CountryDTO> countryDTOS= new ArrayList<>();

        countryDTOS.add(country1);
        countryDTOS.add(country2);
        countryDTOS.add(country3);
        countryDTOS.add(country4);
        countryDTOS.add(country5);
        countryDTOS.add(country6);
        countryDTOS.add(country7);
        countryDTOS.add(country8);
        countryDTOS.add(country9);
        countryDTOS.add(country10);
        countryDTOS.add(country11);
        countryDTOS.add(country12);
        countryDTOS.add(country13);
        countryDTOS.add(country14);
        countryDTOS.add(country15);
        countryDTOS.add(country16);
        countryDTOS.add(country17);
        countryDTOS.add(country18);
        countryDTOS.add(country19);
        countryDTOS.add(country20);
        countryDTOS.add(country21);
        countryDTOS.add(country22);
        countryDTOS.add(country23);
        countryDTOS.add(country24);
        countryDTOS.add(country25);
        countryDTOS.add(country26);
        countryDTOS.add(country27);
        countryDTOS.add(country28);
        countryDTOS.add(country29);
        countryDTOS.add(country30);
        countryDTOS.add(country31);
        countryDTOS.add(country32);
        countryDTOS.add(country33);
        countryDTOS.add(country34);
        countryDTOS.add(country35);
        countryDTOS.add(country36);
        countryDTOS.add(country37);
        countryDTOS.add(country38);
        countryDTOS.add(country39);
        countryDTOS.add(country40);
        countryDTOS.add(country41);
        countryDTOS.add(country42);
        countryDTOS.add(country43);
        countryDTOS.add(country44);
        countryDTOS.add(country45);
        countryDTOS.add(country46);
        countryDTOS.add(country47);
        countryDTOS.add(country48);
        countryDTOS.add(country49);
        countryDTOS.add(country50);
        countryDTOS.add(country51);
        countryDTOS.add(country52);
        countryDTOS.add(country53);
        countryDTOS.add(country54);
        countryDTOS.add(country55);
        countryDTOS.add(country56);
        countryDTOS.add(country57);
        countryDTOS.add(country58);
        countryDTOS.add(country59);
        countryDTOS.add(country60);
        countryDTOS.add(country61);
        countryDTOS.add(country62);
        countryDTOS.add(country62);
        countryDTOS.add(country63);
        countryDTOS.add(country64);
        countryDTOS.add(country65);
        countryDTOS.add(country66);
        countryDTOS.add(country67);
        countryDTOS.add(country68);
        countryDTOS.add(country69);
        countryDTOS.add(country70);
        countryDTOS.add(country71);
        countryDTOS.add(country72);
        countryDTOS.add(country73);
        countryDTOS.add(country74);
        countryDTOS.add(country75);
        countryDTOS.add(country76);
        countryDTOS.add(country77);
        countryDTOS.add(country78);
        countryDTOS.add(country79);
        countryDTOS.add(country80);
        countryDTOS.add(country81);
        countryDTOS.add(country82);
        countryDTOS.add(country83);
        countryDTOS.add(country84);
        countryDTOS.add(country85);
        countryDTOS.add(country86);
        countryDTOS.add(country87);
        countryDTOS.add(country88);
        countryDTOS.add(country89);
        countryDTOS.add(country90);
        countryDTOS.add(country91);
        countryDTOS.add(country91);
        countryDTOS.add(country92);
        countryDTOS.add(country93);
        countryDTOS.add(country94);
        countryDTOS.add(country95);
        countryDTOS.add(country96);
        countryDTOS.add(country97);
        countryDTOS.add(country98);
        countryDTOS.add(country99);
        countryDTOS.add(country100);
        countryDTOS.add(country101);
        countryDTOS.add(country102);
        countryDTOS.add(country103);
        countryDTOS.add(country104);
        countryDTOS.add(country105);
        countryDTOS.add(country106);
        countryDTOS.add(country107);
        countryDTOS.add(country108);
        countryDTOS.add(country109);
        countryDTOS.add(country110);
        countryDTOS.add(country111);
        countryDTOS.add(country112);
        countryDTOS.add(country113);
        countryDTOS.add(country114);
        countryDTOS.add(country115);
        countryDTOS.add(country116);
        countryDTOS.add(country117);
        countryDTOS.add(country118);
        countryDTOS.add(country119);
        countryDTOS.add(country120);
        countryDTOS.add(country121);
        countryDTOS.add(country122);
        countryDTOS.add(country123);
        countryDTOS.add(country124);
        countryDTOS.add(country125);
        countryDTOS.add(country126);
        countryDTOS.add(country127);
        countryDTOS.add(country128);
        countryDTOS.add(country129);
        countryDTOS.add(country130);
        countryDTOS.add(country131);
        countryDTOS.add(country132);
        countryDTOS.add(country133);
        countryDTOS.add(country134);
        countryDTOS.add(country135);
        countryDTOS.add(country136);
        countryDTOS.add(country137);
        countryDTOS.add(country138);
        countryDTOS.add(country139);
        countryDTOS.add(country140);
        countryDTOS.add(country141);
        countryDTOS.add(country142);
        countryDTOS.add(country143);
        countryDTOS.add(country144);
        countryDTOS.add(country145);
        countryDTOS.add(country146);
        countryDTOS.add(country147);
        countryDTOS.add(country148);
        countryDTOS.add(country149);
        countryDTOS.add(country150);
        countryDTOS.add(country151);
        countryDTOS.add(country152);
        countryDTOS.add(country153);
        countryDTOS.add(country154);
        countryDTOS.add(country155);
        countryDTOS.add(country156);
        countryDTOS.add(country157);
        countryDTOS.add(country158);
        countryDTOS.add(country159);
        countryDTOS.add(country160);
        countryDTOS.add(country161);
        countryDTOS.add(country162);
        countryDTOS.add(country162);
        countryDTOS.add(country163);
        countryDTOS.add(country164);
        countryDTOS.add(country165);
        countryDTOS.add(country166);
        countryDTOS.add(country167);
        countryDTOS.add(country168);
        countryDTOS.add(country169);
        countryDTOS.add(country170);
        countryDTOS.add(country171);
        countryDTOS.add(country172);
        countryDTOS.add(country173);
        countryDTOS.add(country174);
        countryDTOS.add(country175);
        countryDTOS.add(country176);
        countryDTOS.add(country177);
        countryDTOS.add(country178);
        countryDTOS.add(country179);
        countryDTOS.add(country180);
        countryDTOS.add(country181);
        countryDTOS.add(country182);
        countryDTOS.add(country183);
        countryDTOS.add(country184);
        countryDTOS.add(country185);
        countryDTOS.add(country186);
        countryDTOS.add(country187);
        countryDTOS.add(country188);
        countryDTOS.add(country189);
        countryDTOS.add(country190);
        countryDTOS.add(country191);

        countryDTOS.add(country192);
        countryDTOS.add(country193);
        countryDTOS.add(country194);
        countryDTOS.add(country195);
        countryDTOS.add(country196);
        countryDTOS.add(country197);
        countryDTOS.add(country198);

        System.out.println(countryDTOS);

     // System.out.println(countryDTOS.equals(countryDTO1));

        Iterator<CountryDTO> countryDtoIterator= countryDTOS.iterator();
        while(countryDtoIterator.hasNext())
        {
            CountryDTO countryDto= countryDtoIterator.next();
            System.out.println(countryDto);
        }

        System.out.println(countryDTOS.isEmpty());

        System.out.println(countryDTOS.size());

        System.out.println(countryDTOS.contains("checking the object india is present in countryDTO -- " + "India"));

        System.out.println(countryDTOS.remove("Removing pakistan from countryDTO -- " + "Pakistan"));

        CountryDTO country199 = new CountryDTO("Vatican City",978,5688,"Pope Francis");

        CountryDTO country200 = new CountryDTO("Venezuela",58,27223228,"Edmundo González");

        CountryDTO country201 = new CountryDTO("Vietnam",84,89571130,"Lương Cường");

        Collection<CountryDTO> countryDTO1 = new ArrayList<>();

        countryDTO1.add(country199);
        countryDTO1.add(country200);
        countryDTO1.add(country201);

        countryDTOS.addAll(countryDTO1);

        System.out.println("checking the size of countryDTODS after adding another array -- " +countryDTOS.size());

        System.out.println("checking all the elements of new array is present in collection -- " + countryDTOS.containsAll(countryDTO1));

        System.out.println(countryDTOS.hashCode());

        Object[] array = countryDTOS.toArray();

        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }


        System.out.println(countryDTOS.removeAll(countryDTO1));

        System.out.println("checking the size of countryDTOS after after removing the elements of countryDTO1 -- "+countryDTOS.size());

        countryDTO1.clear();

        System.out.println("checking countryDTOS is empty or no after clear -- "+countryDTOS.isEmpty());

        System.out.println("checking countryDTO1 is empty or no after clear -- "+countryDTO1.isEmpty());

        System.out.println("checking the equality  of countryDTOS and countryDTO1 -- "+ countryDTOS.equals(countryDTO1));




    }
}
