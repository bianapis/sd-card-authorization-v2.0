package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceCheckRetrieveInputModelDeviceCheckInstanceAnalysis;
import org.bian.dto.BQDeviceCheckRetrieveInputModelDeviceCheckInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDeviceCheckRetrieveInputModel
 */
public class BQDeviceCheckRetrieveInputModel   {
  private Object deviceCheckRetrieveActionTaskRecord = null;

  private String deviceCheckRetrieveActionRequest = null;

  private BQDeviceCheckRetrieveInputModelDeviceCheckInstanceReport deviceCheckInstanceReport = null;

  private BQDeviceCheckRetrieveInputModelDeviceCheckInstanceAnalysis deviceCheckInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return deviceCheckRetrieveActionTaskRecord
  **/

  public Object getDeviceCheckRetrieveActionTaskRecord() {
    return deviceCheckRetrieveActionTaskRecord;
  }

  public void setDeviceCheckRetrieveActionTaskRecord(Object deviceCheckRetrieveActionTaskRecord) {
    this.deviceCheckRetrieveActionTaskRecord = deviceCheckRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return deviceCheckRetrieveActionRequest
  **/

  public String getDeviceCheckRetrieveActionRequest() {
    return deviceCheckRetrieveActionRequest;
  }

  public void setDeviceCheckRetrieveActionRequest(String deviceCheckRetrieveActionRequest) {
    this.deviceCheckRetrieveActionRequest = deviceCheckRetrieveActionRequest;
  }


  /**
   * Get deviceCheckInstanceReport
   * @return deviceCheckInstanceReport
  **/

  public BQDeviceCheckRetrieveInputModelDeviceCheckInstanceReport getDeviceCheckInstanceReport() {
    return deviceCheckInstanceReport;
  }

  public void setDeviceCheckInstanceReport(BQDeviceCheckRetrieveInputModelDeviceCheckInstanceReport deviceCheckInstanceReport) {
    this.deviceCheckInstanceReport = deviceCheckInstanceReport;
  }


  /**
   * Get deviceCheckInstanceAnalysis
   * @return deviceCheckInstanceAnalysis
  **/

  public BQDeviceCheckRetrieveInputModelDeviceCheckInstanceAnalysis getDeviceCheckInstanceAnalysis() {
    return deviceCheckInstanceAnalysis;
  }

  public void setDeviceCheckInstanceAnalysis(BQDeviceCheckRetrieveInputModelDeviceCheckInstanceAnalysis deviceCheckInstanceAnalysis) {
    this.deviceCheckInstanceAnalysis = deviceCheckInstanceAnalysis;
  }


}

