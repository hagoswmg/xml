package com.hagos.xml.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.java.Log;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

@Log
public class Utils {

    /**
     * Logs database CRUD operation query statement and timing
     * @param queryName - name used to identify the query
     * @param query - the actual SQL query or statement
     * @param duration - milliseconds it took to execute the query/statement
     */
    public static void logQueryExecutionInfo(String queryName, String query, Long duration) {
        log.info(queryName + "=[" + query + "]");
        if (duration != null) {
            log.info(queryName + " executed and processed in " + duration + " milliseconds");
        }
    }

    public static String trimStr(String str) {
        return (str != null ? str.trim() : "");
    }

    public static String trimStr(String str, boolean nullAllowed) {
        if (nullAllowed && str == null || str.trim().equals("")) {
            return null;
        }
        return str.trim();
    }

    public static String trimControlChars(String str) {
        return (str == null ? "" : str.trim().replaceAll("[\\n\\t\\r]", ""));
    }

    /***
     * Takes user input date and returns sql query compliant date. If the date is not parse-able then
     * it uses today's date minus 24 hours UTC.
     * @param lastUpdateDate - last update date (input)
     * @return - parsed date in string format
     */
    public static String getSQLCompatibleDate(String lastUpdateDate) {
        OffsetDateTime offsetDef = OffsetDateTime.now().minusDays(1);
        Timestamp lastChangedTs = Timestamp.valueOf(LocalDateTime.ofInstant(offsetDef.toInstant(), ZoneOffset.UTC));

        if (!StringUtils.isBlank(lastUpdateDate)) {
            try {
                OffsetDateTime offset = OffsetDateTime.parse(lastUpdateDate);
                lastChangedTs = Timestamp.valueOf(LocalDateTime.ofInstant(offset.toInstant(), ZoneOffset.UTC));
            } catch (Exception e) {
                log.severe("Cannot parse date: " + lastUpdateDate + " see exception --> " + e);
                log.info("Defaulting to current date minus 24 hours in UTC.");
            }
        }
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date lastChangeDate = new Date(lastChangedTs.getTime());
        return dateformat.format(lastChangeDate);
    }

//    public static String getSqlCompliantDate(String pattern, String dateString) throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//        final Date parse = sdf.parse(dateString);
//        DateFormat outputPattern = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date lastChangeDate = new Date(parse.getTime());
//        return outputPattern.format(lastChangeDate);
//    }

    public static String getSqlCompliantDate(Date date) {
        DateFormat outputPattern = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date lastChangeDate = new Date(date.getTime());
        return outputPattern.format(lastChangeDate);
    }

    /**
     * Deserializes a string xml payload to a matching object.
     *
     * @param xmlPayload - payload as a string
     * @param theClass   - the class
     * @param <T>        - generic type
     * @return - Deserialized object representation of an xml payload
     * @throws JsonProcessingException - exception encountered while parsing
     */
    public static <T> T getObject4XmlPayload(String xmlPayload, Class<T> theClass) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(xmlPayload, theClass);
    }

    /**
     * Deserializes a string json payload to a matching object
     * @param jsonPayload - payload as a string
     * @param theClass - the class representing deserialized object
     * @param <T> - generic type
     * @return - Deserialized object representation of a json payload
     * @throws JsonProcessingException - exception encountered while parsing
     */
    public static <T> T getObject4JsonPayload(String jsonPayload, Class<T> theClass) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonPayload, theClass);
    }

//    public static ServiceError errorResponse(HttpStatus httpStatus, String path, String customMessage, String e) {
//        ServiceError serviceError = new ServiceError();
//        serviceError.setTimestamp(new Timestamp(System.currentTimeMillis()));
//        serviceError.setStatus(httpStatus.value());
//        serviceError.setPath(path);
//        serviceError.setCustomMessage(customMessage);
//        serviceError.setInternalMessage(Utils.trimControlChars(e));
//        return serviceError;
//    }

    public static String getCurrentTimestampInZone(String dateFormat, String timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        ZonedDateTime zdt = ZonedDateTime.now();
        final ZonedDateTime zonedDateTime = zdt.withZoneSameInstant(ZoneId.of(timeZone));
        Timestamp timestamp3 = Timestamp.valueOf(zonedDateTime.toLocalDateTime());
        return simpleDateFormat.format(timestamp3);
    }
}
