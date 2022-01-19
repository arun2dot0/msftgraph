package graphtutorial;

import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

// Basic lookup for mapping Windows time zone identifiers to
// IANA identifiers
// Mappings taken from
// https://github.com/unicode-org/cldr/blob/master/common/supplemental/windowsZones.xml
public class GraphToIana {

    private static final Map<String, String> timeZoneIdMap = getTimeZoneMap();

    private static Map<String,String> getTimeZoneMap(){
        Map<String,String> timezoneMap = new HashMap<>();
        timezoneMap.put("Dateline Standard Time", "Etc/GMT+12");
        timezoneMap.put("UTC-11", "Etc/GMT+11");
        timezoneMap.put("Aleutian Standard Time", "America/Adak");
        timezoneMap.put("Hawaiian Standard Time", "Pacific/Honolulu");
        timezoneMap.put("Marquesas Standard Time", "Pacific/Marquesas");
        timezoneMap.put("Alaskan Standard Time", "America/Anchorage");
        timezoneMap.put("UTC-09", "Etc/GMT+9");
        timezoneMap.put("Pacific Standard Time (Mexico)", "America/Tijuana");
        timezoneMap.put("UTC-08", "Etc/GMT+8");
        timezoneMap.put("Pacific Standard Time", "America/Los_Angeles");
        timezoneMap.put("US Mountain Standard Time", "America/Phoenix");
        timezoneMap.put("Mountain Standard Time (Mexico)", "America/Chihuahua");
        timezoneMap.put("Mountain Standard Time", "America/Denver");
        timezoneMap.put("Central America Standard Time", "America/Guatemala");
        timezoneMap.put("Central Standard Time", "America/Chicago");
        timezoneMap.put("Easter Island Standard Time", "Pacific/Easter");
        timezoneMap.put("Central Standard Time (Mexico)", "America/Mexico_City");
        timezoneMap.put("Canada Central Standard Time", "America/Regina");
        timezoneMap.put("SA Pacific Standard Time", "America/Bogota");
        timezoneMap.put("Eastern Standard Time (Mexico)", "America/Cancun");
        timezoneMap.put("Eastern Standard Time", "America/New_York");
        timezoneMap.put("Haiti Standard Time", "America/Port-au-Prince");
        timezoneMap.put("Cuba Standard Time", "America/Havana");
        timezoneMap.put("US Eastern Standard Time", "America/Indianapolis");
        timezoneMap.put("Turks And Caicos Standard Time", "America/Grand_Turk");
        timezoneMap.put("Paraguay Standard Time", "America/Asuncion");
        timezoneMap.put("Atlantic Standard Time", "America/Halifax");
        timezoneMap.put("Venezuela Standard Time", "America/Caracas");
        timezoneMap.put("Central Brazilian Standard Time", "America/Cuiaba");
        timezoneMap.put("SA Western Standard Time", "America/La_Paz");
        timezoneMap.put("Pacific SA Standard Time", "America/Santiago");
        timezoneMap.put("Newfoundland Standard Time", "America/St_Johns");
        timezoneMap.put("Tocantins Standard Time", "America/Araguaina");
        timezoneMap.put("E. South America Standard Time", "America/Sao_Paulo");
        timezoneMap.put("SA Eastern Standard Time", "America/Cayenne");
        timezoneMap.put("Argentina Standard Time", "America/Buenos_Aires");
        timezoneMap.put("Greenland Standard Time", "America/Godthab");
        timezoneMap.put("Montevideo Standard Time", "America/Montevideo");
        timezoneMap.put("Magallanes Standard Time", "America/Punta_Arenas");
        timezoneMap.put("Saint Pierre Standard Time", "America/Miquelon");
        timezoneMap.put("Bahia Standard Time", "America/Bahia");
        timezoneMap.put("UTC-02", "Etc/GMT+2");
        timezoneMap.put("Azores Standard Time", "Atlantic/Azores");
        timezoneMap.put("Cape Verde Standard Time", "Atlantic/Cape_Verde");
        timezoneMap.put("UTC", "Etc/GMT");
        timezoneMap.put("GMT Standard Time", "Europe/London");
        timezoneMap.put("Greenwich Standard Time", "Atlantic/Reykjavik");
        timezoneMap.put("Sao Tome Standard Time", "Africa/Sao_Tome");
        timezoneMap.put("Morocco Standard Time", "Africa/Casablanca");
        timezoneMap.put("W. Europe Standard Time", "Europe/Berlin");
        timezoneMap.put("Central Europe Standard Time", "Europe/Budapest");
        timezoneMap.put("Romance Standard Time", "Europe/Paris");
        timezoneMap.put("Central European Standard Time", "Europe/Warsaw");
        timezoneMap.put("W. Central Africa Standard Time", "Africa/Lagos");
        timezoneMap.put("Jordan Standard Time", "Asia/Amman");
        timezoneMap.put("GTB Standard Time", "Europe/Bucharest");
        timezoneMap.put("Middle East Standard Time", "Asia/Beirut");
        timezoneMap.put("Egypt Standard Time", "Africa/Cairo");
        timezoneMap.put("E. Europe Standard Time", "Europe/Chisinau");
        timezoneMap.put("Syria Standard Time", "Asia/Damascus");
        timezoneMap.put("West Bank Standard Time", "Asia/Hebron");
        timezoneMap.put("South Africa Standard Time", "Africa/Johannesburg");
        timezoneMap.put("FLE Standard Time", "Europe/Kiev");
        timezoneMap.put("Israel Standard Time", "Asia/Jerusalem");
        timezoneMap.put("Kaliningrad Standard Time", "Europe/Kaliningrad");
        timezoneMap.put("Sudan Standard Time", "Africa/Khartoum");
        timezoneMap.put("Libya Standard Time", "Africa/Tripoli");
        timezoneMap.put("Namibia Standard Time", "Africa/Windhoek");
        timezoneMap.put("Arabic Standard Time", "Asia/Baghdad");
        timezoneMap.put("Turkey Standard Time", "Europe/Istanbul");
        timezoneMap.put("Arab Standard Time", "Asia/Riyadh");
        timezoneMap.put("Belarus Standard Time", "Europe/Minsk");
        timezoneMap.put("Russian Standard Time", "Europe/Moscow");
        timezoneMap.put("E. Africa Standard Time", "Africa/Nairobi");
        timezoneMap.put("Iran Standard Time", "Asia/Tehran");
        timezoneMap.put("Arabian Standard Time", "Asia/Dubai");
        timezoneMap.put("Astrakhan Standard Time", "Europe/Astrakhan");
        timezoneMap.put("Azerbaijan Standard Time", "Asia/Baku");
        timezoneMap.put("Russia Time Zone 3", "Europe/Samara");
        timezoneMap.put("Mauritius Standard Time", "Indian/Mauritius");
        timezoneMap.put("Saratov Standard Time", "Europe/Saratov");
        timezoneMap.put("Georgian Standard Time", "Asia/Tbilisi");
        timezoneMap.put("Volgograd Standard Time", "Europe/Volgograd");
        timezoneMap.put("Caucasus Standard Time", "Asia/Yerevan");
        timezoneMap.put("Afghanistan Standard Time", "Asia/Kabul");
        timezoneMap.put("West Asia Standard Time", "Asia/Tashkent");
        timezoneMap.put("Ekaterinburg Standard Time", "Asia/Yekaterinburg");
        timezoneMap.put("Pakistan Standard Time", "Asia/Karachi");
        timezoneMap.put("Qyzylorda Standard Time", "Asia/Qyzylorda");
        timezoneMap.put("India Standard Time", "Asia/Calcutta");
        timezoneMap.put("Sri Lanka Standard Time", "Asia/Colombo");
        timezoneMap.put("Nepal Standard Time", "Asia/Katmandu");
        timezoneMap.put("Central Asia Standard Time", "Asia/Almaty");
        timezoneMap.put("Bangladesh Standard Time", "Asia/Dhaka");
        timezoneMap.put("Omsk Standard Time", "Asia/Omsk");
        timezoneMap.put("Myanmar Standard Time", "Asia/Rangoon");
        timezoneMap.put("SE Asia Standard Time", "Asia/Bangkok");
        timezoneMap.put("Altai Standard Time", "Asia/Barnaul");
        timezoneMap.put("W. Mongolia Standard Time", "Asia/Hovd");
        timezoneMap.put("North Asia Standard Time", "Asia/Krasnoyarsk");
        timezoneMap.put("N. Central Asia Standard Time", "Asia/Novosibirsk");
        timezoneMap.put("Tomsk Standard Time", "Asia/Tomsk");
        timezoneMap.put("China Standard Time", "Asia/Shanghai");
        timezoneMap.put("North Asia East Standard Time", "Asia/Irkutsk");
        timezoneMap.put("Singapore Standard Time", "Asia/Singapore");
        timezoneMap.put("W. Australia Standard Time", "Australia/Perth");
        timezoneMap.put("Taipei Standard Time", "Asia/Taipei");
        timezoneMap.put("Ulaanbaatar Standard Time", "Asia/Ulaanbaatar");
        timezoneMap.put("Aus Central W. Standard Time", "Australia/Eucla");
        timezoneMap.put("Transbaikal Standard Time", "Asia/Chita");
        timezoneMap.put("Tokyo Standard Time", "Asia/Tokyo");
        timezoneMap.put("North Korea Standard Time", "Asia/Pyongyang");
        timezoneMap.put("Korea Standard Time", "Asia/Seoul");
        timezoneMap.put("Yakutsk Standard Time", "Asia/Yakutsk");
        timezoneMap.put("Cen. Australia Standard Time", "Australia/Adelaide");
        timezoneMap.put("AUS Central Standard Time", "Australia/Darwin");
        timezoneMap.put("E. Australia Standard Time", "Australia/Brisbane");
        timezoneMap.put("AUS Eastern Standard Time", "Australia/Sydney");
        timezoneMap.put("West Pacific Standard Time", "Pacific/Port_Moresby");
        timezoneMap.put("Tasmania Standard Time", "Australia/Hobart");
        timezoneMap.put("Vladivostok Standard Time", "Asia/Vladivostok");
        timezoneMap.put("Lord Howe Standard Time", "Australia/Lord_Howe");
        timezoneMap.put("Bougainville Standard Time", "Pacific/Bougainville");
        timezoneMap.put("Russia Time Zone 10", "Asia/Srednekolymsk");
        timezoneMap.put("Magadan Standard Time", "Asia/Magadan");
        timezoneMap.put("Norfolk Standard Time", "Pacific/Norfolk");
        timezoneMap.put("Sakhalin Standard Time", "Asia/Sakhalin");
        timezoneMap.put("Central Pacific Standard Time", "Pacific/Guadalcanal");
        timezoneMap.put("Russia Time Zone 11", "Asia/Kamchatka");
        timezoneMap.put("New Zealand Standard Time", "Pacific/Auckland");
        timezoneMap.put("UTC+12", "Etc/GMT-12");
        timezoneMap.put("Fiji Standard Time", "Pacific/Fiji");
        timezoneMap.put("Chatham Islands Standard Time", "Pacific/Chatham");
        timezoneMap.put("UTC+13", "Etc/GMT-13");
        timezoneMap.put("Tonga Standard Time", "Pacific/Tongatapu");
        timezoneMap.put("Samoa Standard Time", "Pacific/Apia");
        timezoneMap.put("Line Islands Standard Time", "Pacific/Kiritimati");
        return timezoneMap;
    }


    public static String getIanaFromWindows(String windowsTimeZone) {
        String iana = timeZoneIdMap.get(windowsTimeZone);

        // If a mapping was not found, assume the value passed
        // was already an IANA identifier
        return (iana == null) ? windowsTimeZone : iana;
    }

    public static ZoneId getZoneIdFromWindows(String windowsTimeZone) {
        String timeZoneId = getIanaFromWindows(windowsTimeZone);

        return ZoneId.of(timeZoneId);
    }
}