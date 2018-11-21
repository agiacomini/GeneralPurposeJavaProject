package com.giacomini.andrea.utils;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
 * Created by Andrea on 24/03/2018.
 */
public class Constants {

    //------- Group profiles  -----

    public static final String PROFILE_SUPERVISOR = "Supervisor";
    public static final String PROFILE_NPHQ = "NP-HQ";
    public static final String PROFILE_ATO = "ATO RTX";

    //------ User status --------

    public static final int USER_STATUS_ENABLE  = 1;
    public static final int USER_STATUS_DISABLE = 0;

    //------ Error messages ------

    public static final String MSGERROR_LOGOPERATIONNOTSUPPORTED = "Warning the log operation is not supported:";

    //---- Logging message -----

    public static final String LOGPARAMETER_USERID = "UserID";
    public static final String LOGPARAMETER_USERNAME = "UserName";
    public static final String LOGPARAMETER_SCHEDULERID = "SchedulerID";
    public static final String LOGPARAMETER_EQUIPMENTID = "EquipmentID";
    public static final String LOGPARAMETER_EQUIPMENTNAME = "EquipmentName";
    public static final String LOGPARAMETER_EQUIPMENTNODEID = "Node ID";
    public static final String LOGPARAMETER_EQUIPMENTMODEL = "Model";
    public static final String LOGPARAMETER_EQUIPMENTLOOPBACK0 = "LoopBack0";
    public static final String LOGPARAMETER_EQUIPMENTLOOPBACK1 = "LoopBack1";
    public static final String LOGPARAMETER_SCHEDULERNAME = "SchedulerName";
    public static final String LOGPARAMETER_SCHEDULEFUNCTIONID = "SchedulerFunctionID";
    public static final String LOGPARAMETER_CURRENTTHREAD = "Current thread";

    //---- Generics ----------------

    public static String OPERATION = "OPERAZIONE";
    public static String MESSAGE = "MESSAGGIO";

    //------ Error messages ------

    public static final String MSGERROR_PARAMETEREMPTY = "Warning, the parameter is EMPTY:";
    public static final String MSGERROR_PARAMETERNULL = "Warning, the parameter is NULL:";
    public static final String MSGERROR_INVALIDMAXIMUMFIELDLENGTH = "Warning, the maximum field length is wrong:";
    public static final String MSGERROR_INVALIDPARAMETERTYPE = "Warning, the parameter type is wrong:";
    public static final String MSGERROR_INVALIDUSERIDID = "Warning, the given userID is not valid:";
    public static final String MSGERROR_GENERICERROR = "Generic error";

    //------- Messages --------------

    public static final String MSG_ENTERMETOD = "Entrata nel metodo:";
    public static final String MSG_EXITMETOD = "Uscita dal metodo:";
    public static final String MSG_OPERATIONINPROGRESS = "Operation in progress...";

    //--------- Page parameters --------------------------------------
    //--------- Pattern PAGE_<pagename>_PARAM_<paramname> ------------

    public static final String PAGE_SCHEDULER_PARAM_SCHEDULERID = "schedulerID";
    public static final String PAGE_SCHEDULER_PARAM_FROMSCHEDULERPAGE = "fromSchedulerPage";


    //-------- Callback function name -------------------
    //---------- Pattern FUNCTION_<nomeSchedulatore>

    public static final String FUNCTION_CMSAPPARATI = "CMS_APPARATI";
    public static final String FUNCTION_APPARATINORTH = "APPARATI_NORTH";
    public static final String FUNCTION_APPARATISOUTH = "APPARATI_SOUTH";

    //--------- Users --------------
    //----- Pattern USER_<user> ----

    public static final String USER_SYSTEM = "SYSTEM";

    //------- Generic constants -----

    public static final String SPACE = " ";
    public static final String EMPTYSTRING = "";
    public static final String CODE = "Code:";
    public static final String PARAMETERS = "PARAMETRI";
    public static final String TRUE = "TRUE";
    public static final String FALSE = "FALSE";
    public static final String SCHEDULER_DEFAULTVALUE = "*";
    public static final String NEW_LINE = System.getProperty("line.separator");
    public static final int RTCMSAPPARATI_FIRSTINDEX = 0;
    public static final String HASHTAG = "#";

    public static final String WAFER_VERSION = "1.0 20171031";

    public static final String KPI_DATE_FORMAT = "dd/MM/yyyy HH:mm:ss";

    public static final String KPI_STATUS_ANALYZED = "ANALYZED";
    public static final String KPI_STATUS_PROCESSING = "PROCESSING";
    public static final String KPI_STATUS_TO_ANALYZE = "TO_ANALYZE";
    public static final String KPI_STATUS_ERROR = "ERROR";

    public static final String KPI_BADPLCP = "BADPLCP";
    public static final String KPI_GLITCH = "GLITCH";
    public static final String KPI_KNOISE = "KNOISE";
    public static final String KPI_TXOP = "TXOP";
    public static final String KPI_CHANNEL = "CHANNEL";
    public static final String KPI_RXPACK = "RXPACK";
    public static final String KPI_TXPACK = "TXPACK";
    public static final String KPI_CONNDEVICE = "CONNDEVICE";
    public static final String KPI_SCANAP = "SCANAP";
    public static final String KPI_BANDSTEER = "BANDSTEER";

    public static final BigDecimal BD_5000 = BigDecimal.valueOf( 5000l ) ;
    public static final BigDecimal BD_2400 = BigDecimal.valueOf( 2400l ) ;

    public static final String BAND_CODE_2G = "2G" ;
    public static final String BAND_CODE_5G = "5G" ;


    public static final String BAND_FILENAME_STR_2G = "2_4Ghz" ;
    public static final String BAND_FILENAME_STR_5G = "5Ghz" ;


    public static final String KPI_INPUTLOG_PATH = "KPI_INPUTLOG_PATH" ;
    public static final String VSAF_KPI_INPUTLOG_PATH = "VSAF_KPI_INPUTLOG_PATH" ;
    public static final String VSAF_KPI_ARCHIVE_PATH = "VSAF_KPI_ARCHIVE_PATH" ;


    public static final String VSAF_MSG_LINK_MONITORING = "link_monitoring".toLowerCase() ;
    public static final String VSAF_MSG_WIFI_SPECTRUM_ANALYZER = "wifi_spectrum_analyzer".toLowerCase() ;
    public static final String VSAF_MSG_AP_MONITORING = "ap_monitoring".toLowerCase() ;
    public static final String VSAF_MSG_AIR_MONITORING = "air_monitoring".toLowerCase() ;

    public static final Map<String, String> KpiTypeToChartMap = new HashMap<String, String>();
    static
    {
        KpiTypeToChartMap.put(KPI_BADPLCP+HASHTAG+BAND_CODE_2G, 	"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_BADPLCP+HASHTAG+BAND_CODE_5G, 	"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_GLITCH+HASHTAG+BAND_CODE_2G,		"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_GLITCH+HASHTAG+BAND_CODE_5G,		"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_KNOISE+HASHTAG+BAND_CODE_2G,		"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_KNOISE+HASHTAG+BAND_CODE_5G,		"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_TXOP+HASHTAG+BAND_CODE_2G,		"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_TXOP+HASHTAG+BAND_CODE_5G,		"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_CHANNEL+HASHTAG+BAND_CODE_2G,	"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_CHANNEL+HASHTAG+BAND_CODE_5G,	"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_RXPACK+HASHTAG+BAND_CODE_2G,		"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_RXPACK+HASHTAG+BAND_CODE_5G,		"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_TXPACK+HASHTAG+BAND_CODE_2G,		"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_TXPACK+HASHTAG+BAND_CODE_5G,		"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_CONNDEVICE+HASHTAG+BAND_CODE_2G,	"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_CONNDEVICE+HASHTAG+BAND_CODE_5G,	"KpiChart.xhtml");
        KpiTypeToChartMap.put(KPI_SCANAP+HASHTAG+BAND_CODE_2G,		"KpiScanApChart2G.xhtml");
        KpiTypeToChartMap.put(KPI_SCANAP+HASHTAG+BAND_CODE_5G,		"KpiScanApChart5G.xhtml");
        KpiTypeToChartMap.put(KPI_BANDSTEER,						"KpiBandSteerChart.xhtml");
    }

    public static final Pattern VSAF_JSON_FileNamePattern = Pattern.compile(
            "(?i)^((\\d+)_(\\d+)_(" +
                    Constants.VSAF_MSG_LINK_MONITORING + "|" +
                    Constants.VSAF_MSG_AP_MONITORING + "|" +
                    Constants.VSAF_MSG_WIFI_SPECTRUM_ANALYZER + "|" +
                    Constants.VSAF_MSG_AIR_MONITORING +
                    ")_(" +
                    BAND_FILENAME_STR_2G + "|" +
                    BAND_FILENAME_STR_5G +
                    ")|(" +
                    "wifi_dump-([^-]*)-([^.]+)" +
                    "))\\.(LOG|TXT|JSON)$"
    ) ;

    public static final Pattern VSAF_LOG_FileNamePattern = Pattern.compile(
            "(?i)^(\\d+)_(\\d+)_(" +
                    Constants.KPI_BADPLCP	+ "|" +
                    Constants.KPI_GLITCH	+ "|" +
                    Constants.KPI_KNOISE	+ "|" +
                    Constants.KPI_TXOP		+ "|" +
                    Constants.KPI_CHANNEL	+
                    ")_(" +
                    BAND_FILENAME_STR_2G + "|" +
                    BAND_FILENAME_STR_5G +
                    ")\\.(LOG|TXT)$"
    ) ;



    public static final Map<String,String> VSAF_TYPE_TO_DOMAIN_TYPE_MAP = null ;
    static {
        /*
        Map<String,String> aMap = new TreeMap<>() ;

        aMap.put( Constants.VSAF_MSG_LINK_MONITORING.toUpperCase(), WfKpiType.CODE_CONNDEVICE ) ;
        aMap.put( Constants.VSAF_MSG_WIFI_SPECTRUM_ANALYZER.toUpperCase(), WfKpiType.CODE_SCANAP ) ;
        aMap.put( Constants.VSAF_MSG_AP_MONITORING.toUpperCase(), WfKpiType.CODE_RXPACK ) ;

        aMap.put( Constants.KPI_BADPLCP.toUpperCase(),	WfKpiType.CODE_BADPLCP ) ;
        aMap.put( Constants.KPI_GLITCH.toUpperCase(),	WfKpiType.CODE_GLITCH )	 ;
        aMap.put( Constants.KPI_KNOISE.toUpperCase(),	WfKpiType.CODE_KNOISE )	 ;
        aMap.put( Constants.KPI_TXOP.toUpperCase(),		WfKpiType.CODE_TXOP	 )	 ;
        aMap.put( Constants.KPI_CHANNEL.toUpperCase(),	WfKpiType.CODE_CHANNEL ) ;

        VSAF_TYPE_TO_DOMAIN_TYPE_MAP = Collections.unmodifiableMap( aMap ) ;
        */
    }

    /* test comment to commit; */
    /* test 2 comment to commit; */

    public static final Map<String,String> VSAF_BAND_TO_DOMAIN_BAND_MAP ;
    static {
        Map<String,String> aMap = new TreeMap<>() ;
        aMap.put( Constants.BAND_CODE_2G.toUpperCase(), Constants.BAND_CODE_2G ) ;
        aMap.put( Constants.BAND_CODE_5G.toUpperCase(), Constants.BAND_CODE_5G ) ;
        aMap.put( Constants.BAND_FILENAME_STR_2G.toUpperCase(), Constants.BAND_CODE_2G ) ;
        aMap.put( Constants.BAND_FILENAME_STR_5G.toUpperCase(), Constants.BAND_CODE_5G ) ;
        VSAF_BAND_TO_DOMAIN_BAND_MAP = Collections.unmodifiableMap( aMap ) ;
    }

    private Constants() {

    }

}
