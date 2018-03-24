package com.giacomini.andrea.utils.enums;

import static com.giacomini.andrea.utils.Constants.SPACE;
import static com.giacomini.andrea.utils.Constants.CODE;

/**
 * Created by Andrea on 24/03/2018.
 */

/**
 * LogOperationEnum<br/>
 * This enumeration contains the operation code to use in the utility logging.
 */
public enum LogOperationEnum {

    LOGOPERATION_USER_SEARCH("RICERCA UTENTE"),
    LOGOPERATION_USER_INSERT("INSERIMENTO UTENTE"),
    LOGOPERATION_USER_MODIFY("MODIFICA UTENTE"),
    LOGOPERATION_USER_DELETE("CANCELLAZIONE UTENTE"),
    LOGOPERATION_SCHEDULER_INSERT("INSERIMENTO SCHEDULATORE"),
    LOGOPERATION_SCHEDULER_MODIFY("MODIFICA SCHEDULATORE"),
    LOGOPERATION_SCHEDULER_DELETE("CANCELLAZIONE SCHEDULATORE"),
    LOGOPERATION_SCHEDULER_DELETEEQUIPMENTS("CANCELLAZIONE EQUIPMENTS"),
    LOGOPERATION_SCHEDULER_DELETEALLEQUIPMENTS("CANCELLAZIONE ALL EQUIPMENTS"),
    LOGOPERATION_SCHEDULER_REFRESHSOUTHEQUIPMENTS("REFRESH APPARATI SUD"),
    LOGOPERATION_SCHEDULER_REFRESHNORTHEQUIPMENTS("REFRESH APPARATI NORD"),
    LOGOPERATION_SCHEDULER_REFRESHCMSEQUIPMENTS("REFRESH APPARATI CMS"),
    LOGOPERATION_WEB_REFRESHNORTHEQUIPMENT("REFRESH NORTH EQUIPMENT FROM WEB"),
    LOGOPERATION_WEB_REFRESHSOUTHQUIPMENT("REFRESH SOUTH EQUIPMENT FROM WEB");

    private final String fCode;


    public String getCode() {

        return fCode;

    }

    private LogOperationEnum(String aCode) {

        this.fCode = aCode;

    }

    /**
     * Give back the LogOperationEnum associated to the given code.
     *
     * @param aCode (String): Operation Code.
     * @return LogOperationEnum
     */
    public static LogOperationEnum FromValue(String aCode) {

        for (LogOperationEnum logOperation : LogOperationEnum.values()) {
            if (logOperation.fCode.equalsIgnoreCase(aCode)) {
                return logOperation;
            }
        }

        throw new IllegalArgumentException(new StringBuilder(MSGERROR_LOGOPERATIONNOTSUPPORTED).append(SPACE).append(CODE).append(SPACE).append("<").append(aCode).append(">").toString());

    }

    /**
     *
     * Verify if a given code is contained in the enumeration
     *
     * @param aCode (String): OperationCode to verify.
     * @return boolean: TRUE if exists, FALSE if not exists
     */
    public static boolean Exists(String aCode) {

        for (LogOperationEnum logOperation : LogOperationEnum.values()) {
            if (logOperation.fCode.equalsIgnoreCase(aCode)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {

        StringBuilder toStrigBuilder = new StringBuilder();

        toStrigBuilder.append("[");
        toStrigBuilder.append(SPACE);
        toStrigBuilder.append("OBJECT:");
        toStrigBuilder.append(SPACE);
        toStrigBuilder.append(this.getClass().getName());
        toStrigBuilder.append(SPACE);
        toStrigBuilder.append("CODE:");
        toStrigBuilder.append(SPACE);
        toStrigBuilder.append(fCode);
        toStrigBuilder.append(SPACE);
        toStrigBuilder.append("]");

        return toStrigBuilder.toString();


    }

}
