package com.ssafy.e206.response;

public class ErrorResponse {
  private String message;
  private int status;

  public ErrorResponse() {
  }

  public ErrorResponse(String message, int status) {
    this.message = message;
    this.status = status;
  }

  public String getMessage() {
    return this.message;
  }

  public int getStatus() {
    return this.status;
  }
}
