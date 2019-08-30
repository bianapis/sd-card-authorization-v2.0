package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFraudCheckRetrieveInputModelFraudCheckInstanceAnalysis;
import org.bian.dto.BQFraudCheckRetrieveInputModelFraudCheckInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFraudCheckRetrieveInputModel
 */
public class BQFraudCheckRetrieveInputModel   {
  private Object fraudCheckRetrieveActionTaskRecord = null;

  private String fraudCheckRetrieveActionRequest = null;

  private BQFraudCheckRetrieveInputModelFraudCheckInstanceReport fraudCheckInstanceReport = null;

  private BQFraudCheckRetrieveInputModelFraudCheckInstanceAnalysis fraudCheckInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fraudCheckRetrieveActionTaskRecord
  **/

  public Object getFraudCheckRetrieveActionTaskRecord() {
    return fraudCheckRetrieveActionTaskRecord;
  }

  public void setFraudCheckRetrieveActionTaskRecord(Object fraudCheckRetrieveActionTaskRecord) {
    this.fraudCheckRetrieveActionTaskRecord = fraudCheckRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fraudCheckRetrieveActionRequest
  **/

  public String getFraudCheckRetrieveActionRequest() {
    return fraudCheckRetrieveActionRequest;
  }

  public void setFraudCheckRetrieveActionRequest(String fraudCheckRetrieveActionRequest) {
    this.fraudCheckRetrieveActionRequest = fraudCheckRetrieveActionRequest;
  }


  /**
   * Get fraudCheckInstanceReport
   * @return fraudCheckInstanceReport
  **/

  public BQFraudCheckRetrieveInputModelFraudCheckInstanceReport getFraudCheckInstanceReport() {
    return fraudCheckInstanceReport;
  }

  public void setFraudCheckInstanceReport(BQFraudCheckRetrieveInputModelFraudCheckInstanceReport fraudCheckInstanceReport) {
    this.fraudCheckInstanceReport = fraudCheckInstanceReport;
  }


  /**
   * Get fraudCheckInstanceAnalysis
   * @return fraudCheckInstanceAnalysis
  **/

  public BQFraudCheckRetrieveInputModelFraudCheckInstanceAnalysis getFraudCheckInstanceAnalysis() {
    return fraudCheckInstanceAnalysis;
  }

  public void setFraudCheckInstanceAnalysis(BQFraudCheckRetrieveInputModelFraudCheckInstanceAnalysis fraudCheckInstanceAnalysis) {
    this.fraudCheckInstanceAnalysis = fraudCheckInstanceAnalysis;
  }


}

