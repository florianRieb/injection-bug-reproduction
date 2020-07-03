package de.fri;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
@Schema(description = "err object")
public class ErrorTO {

  @Schema(description = "code", required = true)
  private int errorCode;

  @Schema(description = "status", required = true)
  private int httpStatusCode;

  @Schema(description = "msg", required = true)
  private String errorMessage;

  @Schema(description = "corId", required = false)
  private String correlationId;

  public ErrorTO() {
  }

  public ErrorTO(int errorCode, int httpStatusCode, String errorMessage, String correlationId) {
    this.errorCode = errorCode;
    this.httpStatusCode = httpStatusCode;
    this.errorMessage = errorMessage;
    this.correlationId = correlationId;
  }

  public int getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }

  public int getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(int httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

}
