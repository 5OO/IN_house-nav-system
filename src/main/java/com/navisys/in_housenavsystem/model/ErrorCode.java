package com.navisys.in_housenavsystem.model;

public enum ErrorCode {
    NO_ERROR(0, "No error"),
    DATA_NOT_FOUND(1, "Data not found"),
    INVALID_REQUEST(2, "Invalid request"),
    INTERNAL_ERROR(3, "Internal error");

    private final int code;
    private final String description;

    ErrorCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
