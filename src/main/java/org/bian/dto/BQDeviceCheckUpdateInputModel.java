package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceCheckUpdateInputModel
 */
public class BQDeviceCheckUpdateInputModel   {
  private String creditChargeCardAuthorizationAssessmentInstanceReference = null;

  private String deviceCheckInstanceReference = null;

  private BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord deviceCheckInstanceRecord = null;

  private Object deviceCheckUpdateActionTaskRecord = null;

  private String deviceCheckUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Credit Charge Card Authorization Assessment instance 
   * @return creditChargeCardAuthorizationAssessmentInstanceReference
  **/

  public String getCreditChargeCardAuthorizationAssessmentInstanceReference() {
    return creditChargeCardAuthorizationAssessmentInstanceReference;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceReference(String creditChargeCardAuthorizationAssessmentInstanceReference) {
    this.creditChargeCardAuthorizationAssessmentInstanceReference = creditChargeCardAuthorizationAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Device Check instance 
   * @return deviceCheckInstanceReference
  **/

  public String getDeviceCheckInstanceReference() {
    return deviceCheckInstanceReference;
  }

  public void setDeviceCheckInstanceReference(String deviceCheckInstanceReference) {
    this.deviceCheckInstanceReference = deviceCheckInstanceReference;
  }


  /**
   * Get deviceCheckInstanceRecord
   * @return deviceCheckInstanceRecord
  **/

  public BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord getDeviceCheckInstanceRecord() {
    return deviceCheckInstanceRecord;
  }

  public void setDeviceCheckInstanceRecord(BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord deviceCheckInstanceRecord) {
    this.deviceCheckInstanceRecord = deviceCheckInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return deviceCheckUpdateActionTaskRecord
  **/

  public Object getDeviceCheckUpdateActionTaskRecord() {
    return deviceCheckUpdateActionTaskRecord;
  }

  public void setDeviceCheckUpdateActionTaskRecord(Object deviceCheckUpdateActionTaskRecord) {
    this.deviceCheckUpdateActionTaskRecord = deviceCheckUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return deviceCheckUpdateActionRequest
  **/

  public String getDeviceCheckUpdateActionRequest() {
    return deviceCheckUpdateActionRequest;
  }

  public void setDeviceCheckUpdateActionRequest(String deviceCheckUpdateActionRequest) {
    this.deviceCheckUpdateActionRequest = deviceCheckUpdateActionRequest;
  }


}

