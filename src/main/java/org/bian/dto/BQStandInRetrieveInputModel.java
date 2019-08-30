package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStandInRetrieveInputModelStandInInstanceAnalysis;
import org.bian.dto.BQStandInRetrieveInputModelStandInInstanceReport;

import javax.validation.Valid;
  
/**
 * BQStandInRetrieveInputModel
 */
public class BQStandInRetrieveInputModel   {
  private Object standInRetrieveActionTaskRecord = null;

  private String standInRetrieveActionRequest = null;

  private BQStandInRetrieveInputModelStandInInstanceReport standInInstanceReport = null;

  private BQStandInRetrieveInputModelStandInInstanceAnalysis standInInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return standInRetrieveActionTaskRecord
  **/

  public Object getStandInRetrieveActionTaskRecord() {
    return standInRetrieveActionTaskRecord;
  }

  public void setStandInRetrieveActionTaskRecord(Object standInRetrieveActionTaskRecord) {
    this.standInRetrieveActionTaskRecord = standInRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return standInRetrieveActionRequest
  **/

  public String getStandInRetrieveActionRequest() {
    return standInRetrieveActionRequest;
  }

  public void setStandInRetrieveActionRequest(String standInRetrieveActionRequest) {
    this.standInRetrieveActionRequest = standInRetrieveActionRequest;
  }


  /**
   * Get standInInstanceReport
   * @return standInInstanceReport
  **/

  public BQStandInRetrieveInputModelStandInInstanceReport getStandInInstanceReport() {
    return standInInstanceReport;
  }

  public void setStandInInstanceReport(BQStandInRetrieveInputModelStandInInstanceReport standInInstanceReport) {
    this.standInInstanceReport = standInInstanceReport;
  }


  /**
   * Get standInInstanceAnalysis
   * @return standInInstanceAnalysis
  **/

  public BQStandInRetrieveInputModelStandInInstanceAnalysis getStandInInstanceAnalysis() {
    return standInInstanceAnalysis;
  }

  public void setStandInInstanceAnalysis(BQStandInRetrieveInputModelStandInInstanceAnalysis standInInstanceAnalysis) {
    this.standInInstanceAnalysis = standInInstanceAnalysis;
  }


}

