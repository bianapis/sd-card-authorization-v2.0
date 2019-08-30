package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord
 */
public class BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord   {
  private String issuedDeviceSecurityCode = null;

  private String issuedDeviceCryptogram = null;

  private String issuedDeviceCVV = null;

  private String issuedDeviceBIN = null;

  private String issuedDeviceCheckDigit = null;

  private String issuedDeviceValidThrough = null;

  private String issuedDeviceCheckResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The security code associated with the issued device 
   * @return issuedDeviceSecurityCode
  **/

  public String getIssuedDeviceSecurityCode() {
    return issuedDeviceSecurityCode;
  }

  public void setIssuedDeviceSecurityCode(String issuedDeviceSecurityCode) {
    this.issuedDeviceSecurityCode = issuedDeviceSecurityCode;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The cryptogram associated with issued device 
   * @return issuedDeviceCryptogram
  **/

  public String getIssuedDeviceCryptogram() {
    return issuedDeviceCryptogram;
  }

  public void setIssuedDeviceCryptogram(String issuedDeviceCryptogram) {
    this.issuedDeviceCryptogram = issuedDeviceCryptogram;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The CVV number is a further mechanism for authenticating the device 
   * @return issuedDeviceCVV
  **/

  public String getIssuedDeviceCVV() {
    return issuedDeviceCVV;
  }

  public void setIssuedDeviceCVV(String issuedDeviceCVV) {
    this.issuedDeviceCVV = issuedDeviceCVV;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Bank Identification Number (BIN) is verified to be valid 
   * @return issuedDeviceBIN
  **/

  public String getIssuedDeviceBIN() {
    return issuedDeviceBIN;
  }

  public void setIssuedDeviceBIN(String issuedDeviceBIN) {
    this.issuedDeviceBIN = issuedDeviceBIN;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A property of the device checked using a specific algorithm (e.g. the Luhn algorithm) 
   * @return issuedDeviceCheckDigit
  **/

  public String getIssuedDeviceCheckDigit() {
    return issuedDeviceCheckDigit;
  }

  public void setIssuedDeviceCheckDigit(String issuedDeviceCheckDigit) {
    this.issuedDeviceCheckDigit = issuedDeviceCheckDigit;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A check of the expiry date 
   * @return issuedDeviceValidThrough
  **/

  public String getIssuedDeviceValidThrough() {
    return issuedDeviceValidThrough;
  }

  public void setIssuedDeviceValidThrough(String issuedDeviceValidThrough) {
    this.issuedDeviceValidThrough = issuedDeviceValidThrough;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the device properties check 
   * @return issuedDeviceCheckResult
  **/

  public String getIssuedDeviceCheckResult() {
    return issuedDeviceCheckResult;
  }

  public void setIssuedDeviceCheckResult(String issuedDeviceCheckResult) {
    this.issuedDeviceCheckResult = issuedDeviceCheckResult;
  }


}

