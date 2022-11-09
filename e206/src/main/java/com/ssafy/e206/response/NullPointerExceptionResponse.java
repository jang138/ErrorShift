package com.ssafy.e206.response;

import java.util.HashMap;
import java.util.Map;

public class NullPointerExceptionResponse {
    private Map<String, Object> details;
    private static StackTraceElement[] stackTrace;

    public Map<String, Object> getDetails() {
        return details;
    }

    private NullPointerExceptionResponse(final Map<String, Object> map) {
        this.details = map;
    }

    private static void setStackTraceElement(StackTraceElement[] stackTrace) {
        NullPointerExceptionResponse.stackTrace = stackTrace;
    }

    public StackTraceElement[] getStackTrace() {
        return NullPointerExceptionResponse.stackTrace;
    }

    public static void enof() {

    }

    public static NullPointerExceptionResponse of(final NullPointerException e) {
        HashMap<String, Object> map = new HashMap<>();
        // map.put("errorMessage", e.getMessage() != null ? e.getMessage() :
        // "NullPointerException");
        // map.put("location", new HashMap<String, Object>() {
        // {
        // put("fileName", e.getStackTrace()[0].getFileName());
        // put("className", e.getStackTrace()[0].getClassName());
        // put("lineNumber", e.getStackTrace()[0].getLineNumber());
        // put("methodName", e.getStackTrace()[0].getMethodName());
        // }
        // });

        StringBuilder sb = new StringBuilder();
        sb.append(e.getStackTrace()[0].getClassName()).append("클래스의 ");
        sb.append(e.getStackTrace()[0].getLineNumber()).append("째 줄 ");
        sb.append(e.getStackTrace()[0].getMethodName()).append("메소드 에서 ");
        sb.append(e.getMessage()).append("예외가 발생했습니다.");
        map.put("요약", sb);
        map.put("상세", new HashMap<String, Object>() {
            {
                put("에러 메시지", e.getMessage() != null ? e.getMessage() : "NullPointerException");
                put("에러 발생 위치", new HashMap<String, Object>() {
                    {
                        put("파일 이름", e.getStackTrace()[0].getFileName());
                        put("클래스 이름", e.getStackTrace()[0].getClassName());
                        put("줄 번호", e.getStackTrace()[0].getLineNumber());
                        put("메소드 이름", e.getStackTrace()[0].getMethodName());
                    }
                });

            }
        });

        setStackTraceElement(e.getStackTrace());
        return new NullPointerExceptionResponse(map);
    }

    @Override
    public String toString() {
        return "NullPointerException [ " + details + " ]";
    }

}
