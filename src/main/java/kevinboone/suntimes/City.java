// Do not edit this file by hand
package kevinboone.suntimes;
public class City {
  public double lat, longt; public String name; public String code;
  public City (String code, String name, double lat, double longt) {
    this.longt = longt; this.lat = lat; 
    this.name = name; this.code = code; 
  }
  public static City[] list = {
    new City ("AD","Europe:Andorra",42.5,1.5166666666666666),
    new City ("AE","Asia:Dubai",25.3,55.3),
    new City ("AF","Asia:Kabul",34.516666666666666,69.2),
    new City ("AG","America:Antigua",17.05,-61.8),
    new City ("AI","America:Anguilla",18.2,-63.06666666666667),
    new City ("AL","Europe:Tirane",41.333333333333336,19.833333333333332),
    new City ("AM","Asia:Yerevan",40.18333333333333,44.5),
    new City ("AO","Africa:Luanda",-8.8,13.233333333333333),
    new City ("AQ","Antarctica:McMurdo",-77.83333333333333,166.6),
    new City ("AQ","Antarctica:Casey",-66.28333333333333,110.51666666666667),
    new City ("AQ","Antarctica:Davis",-68.58333333333333,77.96666666666667),
    new City ("AQ","Antarctica:DumontDUrville",-66.66666666666667,140.01666666666668),
    new City ("AQ","Antarctica:Mawson",-67.6,62.88333333333333),
    new City ("AQ","Antarctica:Palmer",-64.8,-64.1),
    new City ("AQ","Antarctica:Rothera",-67.56666666666666,-68.13333333333334),
    new City ("AQ","Antarctica:Syowa",-69.00611111111111,39.59),
    new City ("AQ","Antarctica:Troll",-72.01138888888889,2.5349999999999997),
    new City ("AQ","Antarctica:Vostok",-78.4,106.9),
    new City ("AR","America:Argentina:Buenos_Aires",-34.6,-58.45),
    new City ("AR","America:Argentina:Cordoba",-31.4,-64.18333333333334),
    new City ("AR","America:Argentina:Salta",-24.783333333333335,-65.41666666666667),
    new City ("AR","America:Argentina:Jujuy",-24.183333333333334,-65.3),
    new City ("AR","America:Argentina:Tucuman",-26.816666666666666,-65.21666666666667),
    new City ("AR","America:Argentina:Catamarca",-28.466666666666665,-65.78333333333333),
    new City ("AR","America:Argentina:La_Rioja",-29.433333333333334,-66.85),
    new City ("AR","America:Argentina:San_Juan",-31.533333333333335,-68.51666666666667),
    new City ("AR","America:Argentina:Mendoza",-32.88333333333333,-68.81666666666666),
    new City ("AR","America:Argentina:San_Luis",-33.31666666666667,-66.35),
    new City ("AR","America:Argentina:Rio_Gallegos",-51.63333333333333,-69.21666666666667),
    new City ("AR","America:Argentina:Ushuaia",-54.8,-68.3),
    new City ("AS","Pacific:Pago_Pago",-14.266666666666667,-170.7),
    new City ("AT","Europe:Vienna",48.21666666666667,16.333333333333332),
    new City ("AU","Australia:Lord_Howe",-31.55,159.08333333333334),
    new City ("AU","Antarctica:Macquarie",-54.5,158.95),
    new City ("AU","Australia:Hobart",-42.88333333333333,147.31666666666666),
    new City ("AU","Australia:Melbourne",-37.81666666666667,144.96666666666667),
    new City ("AU","Australia:Sydney",-33.86666666666667,151.21666666666667),
    new City ("AU","Australia:Broken_Hill",-31.95,141.45),
    new City ("AU","Australia:Brisbane",-27.466666666666665,153.03333333333333),
    new City ("AU","Australia:Lindeman",-20.266666666666666,149.0),
    new City ("AU","Australia:Adelaide",-34.916666666666664,138.58333333333334),
    new City ("AU","Australia:Darwin",-12.466666666666667,130.83333333333334),
    new City ("AU","Australia:Perth",-31.95,115.85),
    new City ("AU","Australia:Eucla",-31.716666666666665,128.86666666666667),
    new City ("AW","America:Aruba",12.5,-69.96666666666667),
    new City ("AX","Europe:Mariehamn",60.1,19.95),
    new City ("AZ","Asia:Baku",40.38333333333333,49.85),
    new City ("BA","Europe:Sarajevo",43.86666666666667,18.416666666666668),
    new City ("BB","America:Barbados",13.1,-59.61666666666667),
    new City ("BD","Asia:Dhaka",23.716666666666665,90.41666666666667),
    new City ("BE","Europe:Brussels",50.833333333333336,4.333333333333333),
    new City ("BF","Africa:Ouagadougou",12.366666666666667,-1.5166666666666666),
    new City ("BG","Europe:Sofia",42.68333333333333,23.316666666666666),
    new City ("BH","Asia:Bahrain",26.383333333333333,50.583333333333336),
    new City ("BI","Africa:Bujumbura",-3.3833333333333333,29.366666666666667),
    new City ("BJ","Africa:Porto-Novo",6.483333333333333,2.6166666666666667),
    new City ("BL","America:St_Barthelemy",17.883333333333333,-62.85),
    new City ("BM","Atlantic:Bermuda",32.28333333333333,-64.76666666666667),
    new City ("BN","Asia:Brunei",4.933333333333334,114.91666666666667),
    new City ("BO","America:La_Paz",-16.5,-68.15),
    new City ("BQ","America:Kralendijk",12.150833333333333,-68.27666666666667),
    new City ("BR","America:Noronha",-3.85,-32.416666666666664),
    new City ("BR","America:Belem",-1.45,-48.483333333333334),
    new City ("BR","America:Fortaleza",-3.716666666666667,-38.5),
    new City ("BR","America:Recife",-8.05,-34.9),
    new City ("BR","America:Araguaina",-7.2,-48.2),
    new City ("BR","America:Maceio",-9.666666666666666,-35.71666666666667),
    new City ("BR","America:Bahia",-12.983333333333333,-38.516666666666666),
    new City ("BR","America:Sao_Paulo",-23.533333333333335,-46.61666666666667),
    new City ("BR","America:Campo_Grande",-20.45,-54.61666666666667),
    new City ("BR","America:Cuiaba",-15.583333333333334,-56.083333333333336),
    new City ("BR","America:Santarem",-2.4333333333333336,-54.86666666666667),
    new City ("BR","America:Porto_Velho",-8.766666666666667,-63.9),
    new City ("BR","America:Boa_Vista",2.8166666666666664,-60.666666666666664),
    new City ("BR","America:Manaus",-3.1333333333333333,-60.016666666666666),
    new City ("BR","America:Eirunepe",-6.666666666666667,-69.86666666666666),
    new City ("BR","America:Rio_Branco",-9.966666666666667,-67.8),
    new City ("BS","America:Nassau",25.083333333333332,-77.35),
    new City ("BT","Asia:Thimphu",27.466666666666665,89.65),
    new City ("BW","Africa:Gaborone",-24.65,25.916666666666668),
    new City ("BY","Europe:Minsk",53.9,27.566666666666666),
    new City ("BZ","America:Belize",17.5,-88.2),
    new City ("CA","America:St_Johns",47.56666666666667,-52.71666666666667),
    new City ("CA","America:Halifax",44.65,-63.6),
    new City ("CA","America:Glace_Bay",46.2,-59.95),
    new City ("CA","America:Moncton",46.1,-64.78333333333333),
    new City ("CA","America:Goose_Bay",53.333333333333336,-60.416666666666664),
    new City ("CA","America:Blanc-Sablon",51.416666666666664,-57.11666666666667),
    new City ("CA","America:Toronto",43.65,-79.38333333333334),
    new City ("CA","America:Nipigon",49.016666666666666,-88.26666666666667),
    new City ("CA","America:Thunder_Bay",48.38333333333333,-89.25),
    new City ("CA","America:Iqaluit",63.733333333333334,-68.46666666666667),
    new City ("CA","America:Pangnirtung",66.13333333333334,-65.73333333333333),
    new City ("CA","America:Atikokan",48.75861111111111,-91.62166666666666),
    new City ("CA","America:Winnipeg",49.88333333333333,-97.15),
    new City ("CA","America:Rainy_River",48.71666666666667,-94.56666666666666),
    new City ("CA","America:Resolute",74.69555555555556,-94.82916666666667),
    new City ("CA","America:Rankin_Inlet",62.81666666666667,-92.08305555555555),
    new City ("CA","America:Regina",50.4,-104.65),
    new City ("CA","America:Swift_Current",50.28333333333333,-107.83333333333333),
    new City ("CA","America:Edmonton",53.55,-113.46666666666667),
    new City ("CA","America:Cambridge_Bay",69.11388888888888,-105.05277777777778),
    new City ("CA","America:Yellowknife",62.45,-114.35),
    new City ("CA","America:Inuvik",68.34972222222221,-133.71666666666667),
    new City ("CA","America:Creston",49.1,-116.51666666666667),
    new City ("CA","America:Dawson_Creek",55.766666666666666,-120.23333333333333),
    new City ("CA","America:Fort_Nelson",58.8,-122.7),
    new City ("CA","America:Whitehorse",60.71666666666667,-135.05),
    new City ("CA","America:Dawson",64.06666666666666,-139.41666666666666),
    new City ("CA","America:Vancouver",49.266666666666666,-123.11666666666666),
    new City ("CC","Indian:Cocos",-12.166666666666666,96.91666666666667),
    new City ("CD","Africa:Kinshasa",-4.3,15.3),
    new City ("CD","Africa:Lubumbashi",-11.666666666666666,27.466666666666665),
    new City ("CF","Africa:Bangui",4.366666666666666,18.583333333333332),
    new City ("CG","Africa:Brazzaville",-4.266666666666667,15.283333333333333),
    new City ("CH","Europe:Zurich",47.38333333333333,8.533333333333333),
    new City ("CI","Africa:Abidjan",5.316666666666666,-4.033333333333333),
    new City ("CK","Pacific:Rarotonga",-21.233333333333334,-159.76666666666668),
    new City ("CL","America:Santiago",-33.45,-70.66666666666667),
    new City ("CL","America:Punta_Arenas",-53.15,-70.91666666666667),
    new City ("CL","Pacific:Easter",-27.15,-109.43333333333334),
    new City ("CM","Africa:Douala",4.05,9.7),
    new City ("CN","Asia:Shanghai",31.233333333333334,121.46666666666667),
    new City ("CN","Asia:Urumqi",43.8,87.58333333333333),
    new City ("CO","America:Bogota",4.6,-74.08333333333333),
    new City ("CR","America:Costa_Rica",9.933333333333334,-84.08333333333333),
    new City ("CU","America:Havana",23.133333333333333,-82.36666666666666),
    new City ("CV","Atlantic:Cape_Verde",14.916666666666666,-23.516666666666666),
    new City ("CW","America:Curacao",12.183333333333334,-69.0),
    new City ("CX","Indian:Christmas",-10.416666666666666,105.71666666666667),
    new City ("CY","Asia:Nicosia",35.166666666666664,33.36666666666667),
    new City ("CY","Asia:Famagusta",35.11666666666667,33.95),
    new City ("CZ","Europe:Prague",50.083333333333336,14.433333333333334),
    new City ("DE","Europe:Berlin",52.5,13.366666666666667),
    new City ("DE","Europe:Busingen",47.7,8.683333333333334),
    new City ("DJ","Africa:Djibouti",11.6,43.15),
    new City ("DK","Europe:Copenhagen",55.666666666666664,12.583333333333334),
    new City ("DM","America:Dominica",15.3,-61.4),
    new City ("DO","America:Santo_Domingo",18.466666666666665,-69.9),
    new City ("DZ","Africa:Algiers",36.78333333333333,3.05),
    new City ("EC","America:Guayaquil",-2.1666666666666665,-79.83333333333333),
    new City ("EC","Pacific:Galapagos",-0.9,-89.6),
    new City ("EE","Europe:Tallinn",59.416666666666664,24.75),
    new City ("EG","Africa:Cairo",30.05,31.25),
    new City ("EH","Africa:El_Aaiun",27.15,-13.2),
    new City ("ER","Africa:Asmara",15.333333333333334,38.88333333333333),
    new City ("ES","Europe:Madrid",40.4,-3.6833333333333336),
    new City ("ES","Africa:Ceuta",35.88333333333333,-5.316666666666666),
    new City ("ES","Atlantic:Canary",28.1,-15.4),
    new City ("ET","Africa:Addis_Ababa",9.033333333333333,38.7),
    new City ("FI","Europe:Helsinki",60.166666666666664,24.966666666666665),
    new City ("FJ","Pacific:Fiji",-18.133333333333333,178.41666666666666),
    new City ("FK","Atlantic:Stanley",-51.7,-57.85),
    new City ("FM","Pacific:Chuuk",7.416666666666667,151.78333333333333),
    new City ("FM","Pacific:Pohnpei",6.966666666666667,158.21666666666667),
    new City ("FM","Pacific:Kosrae",5.316666666666666,162.98333333333332),
    new City ("FO","Atlantic:Faroe",62.016666666666666,-6.766666666666667),
    new City ("FR","Europe:Paris",48.86666666666667,2.3333333333333335),
    new City ("GA","Africa:Libreville",0.38333333333333336,9.45),
    new City ("GB","Europe:London",51.50833333333333,-0.12527777777777777),
    new City ("GD","America:Grenada",12.05,-61.75),
    new City ("GE","Asia:Tbilisi",41.71666666666667,44.81666666666667),
    new City ("GF","America:Cayenne",4.933333333333334,-52.333333333333336),
    new City ("GG","Europe:Guernsey",49.45472222222222,-2.536111111111111),
    new City ("GH","Africa:Accra",5.55,-0.21666666666666667),
    new City ("GI","Europe:Gibraltar",36.13333333333333,-5.35),
    new City ("GL","America:Nuuk",64.18333333333334,-51.733333333333334),
    new City ("GL","America:Danmarkshavn",76.76666666666667,-18.666666666666668),
    new City ("GL","America:Scoresbysund",70.48333333333333,-21.966666666666665),
    new City ("GL","America:Thule",76.56666666666666,-68.78333333333333),
    new City ("GM","Africa:Banjul",13.466666666666667,-16.65),
    new City ("GN","Africa:Conakry",9.516666666666667,-13.716666666666667),
    new City ("GP","America:Guadeloupe",16.233333333333334,-61.53333333333333),
    new City ("GQ","Africa:Malabo",3.75,8.783333333333333),
    new City ("GR","Europe:Athens",37.96666666666667,23.716666666666665),
    new City ("GS","Atlantic:South_Georgia",-54.266666666666666,-36.53333333333333),
    new City ("GT","America:Guatemala",14.633333333333333,-90.51666666666667),
    new City ("GU","Pacific:Guam",13.466666666666667,144.75),
    new City ("GW","Africa:Bissau",11.85,-15.583333333333334),
    new City ("GY","America:Guyana",6.8,-58.166666666666664),
    new City ("HK","Asia:Hong_Kong",22.283333333333335,114.15),
    new City ("HN","America:Tegucigalpa",14.1,-87.21666666666667),
    new City ("HR","Europe:Zagreb",45.8,15.966666666666667),
    new City ("HT","America:Port-au-Prince",18.533333333333335,-72.33333333333333),
    new City ("HU","Europe:Budapest",47.5,19.083333333333332),
    new City ("ID","Asia:Jakarta",-6.166666666666667,106.8),
    new City ("ID","Asia:Pontianak",-0.03333333333333333,109.33333333333333),
    new City ("ID","Asia:Makassar",-5.116666666666666,119.4),
    new City ("ID","Asia:Jayapura",-2.533333333333333,140.7),
    new City ("IE","Europe:Dublin",53.333333333333336,-6.25),
    new City ("IL","Asia:Jerusalem",31.780555555555555,35.223888888888894),
    new City ("IM","Europe:Isle_of_Man",54.15,-4.466666666666667),
    new City ("IN","Asia:Kolkata",22.533333333333335,88.36666666666666),
    new City ("IO","Indian:Chagos",-7.333333333333333,72.41666666666667),
    new City ("IQ","Asia:Baghdad",33.35,44.416666666666664),
    new City ("IR","Asia:Tehran",35.666666666666664,51.43333333333333),
    new City ("IS","Atlantic:Reykjavik",64.15,-21.85),
    new City ("IT","Europe:Rome",41.9,12.483333333333333),
    new City ("JE","Europe:Jersey",49.183611111111105,-2.106666666666667),
    new City ("JM","America:Jamaica",17.968055555555555,-76.79333333333334),
    new City ("JO","Asia:Amman",31.95,35.93333333333333),
    new City ("JP","Asia:Tokyo",35.654444444444444,139.7447222222222),
    new City ("KE","Africa:Nairobi",-1.2833333333333332,36.81666666666667),
    new City ("KG","Asia:Bishkek",42.9,74.6),
    new City ("KH","Asia:Phnom_Penh",11.55,104.91666666666667),
    new City ("KI","Pacific:Tarawa",1.4166666666666667,173.0),
    new City ("KI","Pacific:Kiritimati",1.8666666666666667,-157.33333333333334),
    new City ("KM","Indian:Comoro",-11.683333333333334,43.266666666666666),
    new City ("KN","America:St_Kitts",17.3,-62.71666666666667),
    new City ("KP","Asia:Pyongyang",39.016666666666666,125.75),
    new City ("KR","Asia:Seoul",37.55,126.96666666666667),
    new City ("KW","Asia:Kuwait",29.333333333333332,47.983333333333334),
    new City ("KY","America:Cayman",19.3,-81.38333333333334),
    new City ("KZ","Asia:Almaty",43.25,76.95),
    new City ("KZ","Asia:Qyzylorda",44.8,65.46666666666667),
    new City ("KZ","Asia:Qostanay",53.2,63.61666666666667),
    new City ("KZ","Asia:Aqtobe",50.28333333333333,57.166666666666664),
    new City ("KZ","Asia:Aqtau",44.516666666666666,50.266666666666666),
    new City ("KZ","Asia:Atyrau",47.11666666666667,51.93333333333333),
    new City ("KZ","Asia:Oral",51.21666666666667,51.35),
    new City ("LA","Asia:Vientiane",17.966666666666665,102.6),
    new City ("LB","Asia:Beirut",33.88333333333333,35.5),
    new City ("LC","America:St_Lucia",14.016666666666667,-61.0),
    new City ("LI","Europe:Vaduz",47.15,9.516666666666667),
    new City ("LK","Asia:Colombo",6.933333333333334,79.85),
    new City ("LR","Africa:Monrovia",6.3,-10.783333333333333),
    new City ("LS","Africa:Maseru",-29.466666666666665,27.5),
    new City ("LT","Europe:Vilnius",54.68333333333333,25.316666666666666),
    new City ("LU","Europe:Luxembourg",49.6,6.15),
    new City ("LV","Europe:Riga",56.95,24.1),
    new City ("LY","Africa:Tripoli",32.9,13.183333333333334),
    new City ("MA","Africa:Casablanca",33.65,-7.583333333333333),
    new City ("MC","Europe:Monaco",43.7,7.383333333333334),
    new City ("MD","Europe:Chisinau",47.0,28.833333333333332),
    new City ("ME","Europe:Podgorica",42.43333333333333,19.266666666666666),
    new City ("MF","America:Marigot",18.066666666666666,-63.083333333333336),
    new City ("MG","Indian:Antananarivo",-18.916666666666668,47.516666666666666),
    new City ("MH","Pacific:Majuro",7.15,171.2),
    new City ("MH","Pacific:Kwajalein",9.083333333333334,167.33333333333334),
    new City ("MK","Europe:Skopje",41.983333333333334,21.433333333333334),
    new City ("ML","Africa:Bamako",12.65,-8.0),
    new City ("MM","Asia:Yangon",16.783333333333335,96.16666666666667),
    new City ("MN","Asia:Ulaanbaatar",47.916666666666664,106.88333333333334),
    new City ("MN","Asia:Hovd",48.016666666666666,91.65),
    new City ("MN","Asia:Choibalsan",48.06666666666667,114.5),
    new City ("MO","Asia:Macau",22.197222222222223,113.54166666666667),
    new City ("MP","Pacific:Saipan",15.2,145.75),
    new City ("MQ","America:Martinique",14.6,-61.083333333333336),
    new City ("MR","Africa:Nouakchott",18.1,-15.95),
    new City ("MS","America:Montserrat",16.716666666666665,-62.21666666666667),
    new City ("MT","Europe:Malta",35.9,14.516666666666667),
    new City ("MU","Indian:Mauritius",-20.166666666666668,57.5),
    new City ("MV","Indian:Maldives",4.166666666666667,73.5),
    new City ("MW","Africa:Blantyre",-15.783333333333333,35.0),
    new City ("MX","America:Mexico_City",19.4,-99.15),
    new City ("MX","America:Cancun",21.083333333333332,-86.76666666666667),
    new City ("MX","America:Merida",20.966666666666665,-89.61666666666666),
    new City ("MX","America:Monterrey",25.666666666666668,-100.31666666666666),
    new City ("MX","America:Matamoros",25.833333333333332,-97.5),
    new City ("MX","America:Mazatlan",23.216666666666665,-106.41666666666667),
    new City ("MX","America:Chihuahua",28.633333333333333,-106.08333333333333),
    new City ("MX","America:Ojinaga",29.566666666666666,-104.41666666666667),
    new City ("MX","America:Hermosillo",29.066666666666666,-110.96666666666667),
    new City ("MX","America:Tijuana",32.53333333333333,-117.01666666666667),
    new City ("MX","America:Bahia_Banderas",20.8,-105.25),
    new City ("MY","Asia:Kuala_Lumpur",3.1666666666666665,101.7),
    new City ("MY","Asia:Kuching",1.55,110.33333333333333),
    new City ("MZ","Africa:Maputo",-25.966666666666665,32.583333333333336),
    new City ("NA","Africa:Windhoek",-22.566666666666666,17.1),
    new City ("NC","Pacific:Noumea",-22.266666666666666,166.45),
    new City ("NE","Africa:Niamey",13.516666666666667,2.1166666666666667),
    new City ("NF","Pacific:Norfolk",-29.05,167.96666666666667),
    new City ("NG","Africa:Lagos",6.45,3.4),
    new City ("NI","America:Managua",12.15,-86.28333333333333),
    new City ("NL","Europe:Amsterdam",52.36666666666667,4.9),
    new City ("NO","Europe:Oslo",59.916666666666664,10.75),
    new City ("NP","Asia:Kathmandu",27.716666666666665,85.31666666666666),
    new City ("NR","Pacific:Nauru",-0.5166666666666667,166.91666666666666),
    new City ("NU","Pacific:Niue",-19.016666666666666,-169.91666666666666),
    new City ("NZ","Pacific:Auckland",-36.86666666666667,174.76666666666668),
    new City ("NZ","Pacific:Chatham",-43.95,-176.55),
    new City ("OM","Asia:Muscat",23.6,58.583333333333336),
    new City ("PA","America:Panama",8.966666666666667,-79.53333333333333),
    new City ("PE","America:Lima",-12.05,-77.05),
    new City ("PF","Pacific:Tahiti",-17.533333333333335,-149.56666666666666),
    new City ("PF","Pacific:Marquesas",-9.0,-139.5),
    new City ("PF","Pacific:Gambier",-23.133333333333333,-134.95),
    new City ("PG","Pacific:Port_Moresby",-9.5,147.16666666666666),
    new City ("PG","Pacific:Bougainville",-6.216666666666667,155.56666666666666),
    new City ("PH","Asia:Manila",14.583333333333334,121.0),
    new City ("PK","Asia:Karachi",24.866666666666667,67.05),
    new City ("PL","Europe:Warsaw",52.25,21.0),
    new City ("PM","America:Miquelon",47.05,-56.333333333333336),
    new City ("PN","Pacific:Pitcairn",-25.066666666666666,-130.08333333333334),
    new City ("PR","America:Puerto_Rico",18.46833333333333,-66.1061111111111),
    new City ("PS","Asia:Gaza",31.5,34.46666666666667),
    new City ("PS","Asia:Hebron",31.533333333333335,35.095),
    new City ("PT","Europe:Lisbon",38.71666666666667,-9.133333333333333),
    new City ("PT","Atlantic:Madeira",32.63333333333333,-16.9),
    new City ("PT","Atlantic:Azores",37.733333333333334,-25.666666666666668),
    new City ("PW","Pacific:Palau",7.333333333333333,134.48333333333332),
    new City ("PY","America:Asuncion",-25.266666666666666,-57.666666666666664),
    new City ("QA","Asia:Qatar",25.283333333333335,51.53333333333333),
    new City ("RE","Indian:Reunion",-20.866666666666667,55.46666666666667),
    new City ("RO","Europe:Bucharest",44.43333333333333,26.1),
    new City ("RS","Europe:Belgrade",44.833333333333336,20.5),
    new City ("RU","Europe:Kaliningrad",54.71666666666667,20.5),
    new City ("RU","Europe:Moscow",55.755833333333335,37.617777777777775),
    new City ("UA","Europe:Simferopol",44.95,34.1),
    new City ("RU","Europe:Kirov",58.6,49.65),
    new City ("RU","Europe:Volgograd",48.733333333333334,44.416666666666664),
    new City ("RU","Europe:Astrakhan",46.35,48.05),
    new City ("RU","Europe:Saratov",51.56666666666667,46.03333333333333),
    new City ("RU","Europe:Ulyanovsk",54.333333333333336,48.4),
    new City ("RU","Europe:Samara",53.2,50.15),
    new City ("RU","Asia:Yekaterinburg",56.85,60.6),
    new City ("RU","Asia:Omsk",55.0,73.4),
    new City ("RU","Asia:Novosibirsk",55.03333333333333,82.91666666666667),
    new City ("RU","Asia:Barnaul",53.36666666666667,83.75),
    new City ("RU","Asia:Tomsk",56.5,84.96666666666667),
    new City ("RU","Asia:Novokuznetsk",53.75,87.11666666666666),
    new City ("RU","Asia:Krasnoyarsk",56.016666666666666,92.83333333333333),
    new City ("RU","Asia:Irkutsk",52.266666666666666,104.33333333333333),
    new City ("RU","Asia:Chita",52.05,113.46666666666667),
    new City ("RU","Asia:Yakutsk",62.0,129.66666666666666),
    new City ("RU","Asia:Khandyga",62.656388888888884,135.5538888888889),
    new City ("RU","Asia:Vladivostok",43.166666666666664,131.93333333333334),
    new City ("RU","Asia:Ust-Nera",64.56027777777777,143.22666666666666),
    new City ("RU","Asia:Magadan",59.56666666666667,150.8),
    new City ("RU","Asia:Sakhalin",46.96666666666667,142.7),
    new City ("RU","Asia:Srednekolymsk",67.46666666666667,153.71666666666667),
    new City ("RU","Asia:Kamchatka",53.016666666666666,158.65),
    new City ("RU","Asia:Anadyr",64.75,177.48333333333332),
    new City ("RW","Africa:Kigali",-1.95,30.066666666666666),
    new City ("SA","Asia:Riyadh",24.633333333333333,46.71666666666667),
    new City ("SB","Pacific:Guadalcanal",-9.533333333333333,160.2),
    new City ("SC","Indian:Mahe",-4.666666666666667,55.46666666666667),
    new City ("SD","Africa:Khartoum",15.6,32.53333333333333),
    new City ("SE","Europe:Stockholm",59.333333333333336,18.05),
    new City ("SG","Asia:Singapore",1.2833333333333332,103.85),
    new City ("SH","Atlantic:St_Helena",-15.916666666666666,-5.7),
    new City ("SI","Europe:Ljubljana",46.05,14.516666666666667),
    new City ("SJ","Arctic:Longyearbyen",78.0,16.0),
    new City ("SK","Europe:Bratislava",48.15,17.116666666666667),
    new City ("SL","Africa:Freetown",8.5,-13.25),
    new City ("SM","Europe:San_Marino",43.916666666666664,12.466666666666667),
    new City ("SN","Africa:Dakar",14.666666666666666,-17.433333333333334),
    new City ("SO","Africa:Mogadishu",2.066666666666667,45.36666666666667),
    new City ("SR","America:Paramaribo",5.833333333333333,-55.166666666666664),
    new City ("SS","Africa:Juba",4.85,31.616666666666667),
    new City ("ST","Africa:Sao_Tome",0.3333333333333333,6.733333333333333),
    new City ("SV","America:El_Salvador",13.7,-89.2),
    new City ("SX","America:Lower_Princes",18.05138888888889,-63.04722222222222),
    new City ("SY","Asia:Damascus",33.5,36.3),
    new City ("SZ","Africa:Mbabane",-26.3,31.1),
    new City ("TC","America:Grand_Turk",21.466666666666665,-71.13333333333334),
    new City ("TD","Africa:Ndjamena",12.116666666666667,15.05),
    new City ("TF","Indian:Kerguelen",-49.35277777777778,70.2175),
    new City ("TG","Africa:Lome",6.133333333333334,1.2166666666666668),
    new City ("TH","Asia:Bangkok",13.75,100.51666666666667),
    new City ("TJ","Asia:Dushanbe",38.583333333333336,68.8),
    new City ("TK","Pacific:Fakaofo",-9.366666666666667,-171.23333333333332),
    new City ("TL","Asia:Dili",-8.55,125.58333333333333),
    new City ("TM","Asia:Ashgabat",37.95,58.38333333333333),
    new City ("TN","Africa:Tunis",36.8,10.183333333333334),
    new City ("TO","Pacific:Tongatapu",-21.133333333333333,-175.2),
    new City ("TR","Europe:Istanbul",41.016666666666666,28.966666666666665),
    new City ("TT","America:Port_of_Spain",10.65,-61.516666666666666),
    new City ("TV","Pacific:Funafuti",-8.516666666666667,179.21666666666667),
    new City ("TW","Asia:Taipei",25.05,121.5),
    new City ("TZ","Africa:Dar_es_Salaam",-6.8,39.28333333333333),
    new City ("UG","Africa:Kampala",0.31666666666666665,32.416666666666664),
    new City ("UM","Pacific:Midway",28.216666666666665,-177.36666666666667),
    new City ("UM","Pacific:Wake",19.283333333333335,166.61666666666667),
    new City ("US","America:New_York",40.71416666666667,-74.00638888888889),
    new City ("US","America:Detroit",42.331388888888895,-83.04583333333333),
    new City ("US","America:Kentucky:Louisville",38.25416666666667,-85.75944444444444),
    new City ("US","America:Kentucky:Monticello",36.82972222222222,-84.84916666666666),
    new City ("US","America:Indiana:Indianapolis",39.76833333333333,-86.15805555555556),
    new City ("US","America:Indiana:Vincennes",38.67722222222222,-87.5286111111111),
    new City ("US","America:Indiana:Winamac",41.05138888888889,-86.60305555555556),
    new City ("US","America:Indiana:Marengo",38.37555555555556,-86.34472222222222),
    new City ("US","America:Indiana:Petersburg",38.49194444444444,-87.2786111111111),
    new City ("US","America:Indiana:Vevay",38.74777777777778,-85.06722222222221),
    new City ("US","America:Chicago",41.85,-87.65),
    new City ("US","America:Indiana:Tell_City",37.95305555555556,-86.76138888888889),
    new City ("US","America:Indiana:Knox",41.295833333333334,-86.625),
    new City ("US","America:Menominee",45.10777777777778,-87.61416666666666),
    new City ("US","America:North_Dakota:Center",47.11638888888889,-101.29916666666666),
    new City ("US","America:North_Dakota:New_Salem",46.845,-101.41083333333334),
    new City ("US","America:North_Dakota:Beulah",47.26416666666667,-101.77777777777777),
    new City ("US","America:Denver",39.73916666666667,-104.98416666666667),
    new City ("US","America:Boise",43.61361111111111,-116.2025),
    new City ("US","America:Phoenix",33.44833333333333,-112.07333333333332),
    new City ("US","America:Los_Angeles",34.05222222222222,-118.24277777777777),
    new City ("US","America:Anchorage",61.21805555555556,-149.90027777777777),
    new City ("US","America:Juneau",58.301944444444445,-134.41972222222222),
    new City ("US","America:Sitka",57.17638888888889,-135.30194444444444),
    new City ("US","America:Metlakatla",55.12694444444445,-131.57638888888889),
    new City ("US","America:Yakutat",59.54694444444444,-139.72722222222222),
    new City ("US","America:Nome",64.50111111111111,-165.4063888888889),
    new City ("US","America:Adak",51.88,-176.65805555555556),
    new City ("US","Pacific:Honolulu",21.306944444444444,-157.85833333333332),
    new City ("UY","America:Montevideo",-34.909166666666664,-56.212500000000006),
    new City ("UZ","Asia:Samarkand",39.666666666666664,66.8),
    new City ("UZ","Asia:Tashkent",41.333333333333336,69.3),
    new City ("VA","Europe:Vatican",41.90222222222222,12.453055555555554),
    new City ("VC","America:St_Vincent",13.15,-61.233333333333334),
    new City ("VE","America:Caracas",10.5,-66.93333333333334),
    new City ("VG","America:Tortola",18.45,-64.61666666666666),
    new City ("VI","America:St_Thomas",18.35,-64.93333333333334),
    new City ("VN","Asia:Ho_Chi_Minh",10.75,106.66666666666667),
    new City ("VU","Pacific:Efate",-17.666666666666668,168.41666666666666),
    new City ("WF","Pacific:Wallis",-13.3,-176.16666666666666),
    new City ("WS","Pacific:Apia",-13.833333333333334,-171.73333333333332),
    new City ("YE","Asia:Aden",12.75,45.2),
    new City ("YT","Indian:Mayotte",-12.783333333333333,45.233333333333334),
    new City ("ZA","Africa:Johannesburg",-26.25,28.0),
    new City ("ZM","Africa:Lusaka",-15.416666666666666,28.283333333333335),
    new City ("ZW","Africa:Harare",-17.833333333333332,31.05),
  };
}