package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditCheckRetrieveInputModelCreditCheckInstanceAnalysis;
import org.bian.dto.BQCreditCheckRetrieveInputModelCreditCheckInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCreditCheckRetrieveInputModel
 */
public class BQCreditCheckRetrieveInputModel   {
  private Object creditCheckRetrieveActionTaskRecord = null;

  private String creditCheckRetrieveActionRequest = null;

  private BQCreditCheckRetrieveInputModelCreditCheckInstanceReport creditCheckInstanceReport = null;

  private BQCreditCheckRetrieveInputModelCreditCheckInstanceAnalysis creditCheckInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditCheckRetrieveActionTaskRecord
  **/

  public Object getCreditCheckRetrieveActionTaskRecord() {
    return creditCheckRetrieveActionTaskRecord;
  }

  public void setCreditCheckRetrieveActionTaskRecord(Object creditCheckRetrieveActionTaskRecord) {
    this.creditCheckRetrieveActionTaskRecord = creditCheckRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return creditCheckRetrieveActionRequest
  **/

  public String getCreditCheckRetrieveActionRequest() {
    return creditCheckRetrieveActionRequest;
  }

  public void setCreditCheckRetrieveActionRequest(String creditCheckRetrieveActionRequest) {
    this.creditCheckRetrieveActionRequest = creditCheckRetrieveActionRequest;
  }


  /**
   * Get creditCheckInstanceReport
   * @return creditCheckInstanceReport
  **/

  public BQCreditCheckRetrieveInputModelCreditCheckInstanceReport getCreditCheckInstanceReport() {
    return creditCheckInstanceReport;
  }

  public void setCreditCheckInstanceReport(BQCreditCheckRetrieveInputModelCreditCheckInstanceReport creditCheckInstanceReport) {
    this.creditCheckInstanceReport = creditCheckInstanceReport;
  }


  /**
   * Get creditCheckInstanceAnalysis
   * @return creditCheckInstanceAnalysis
  **/

  public BQCreditCheckRetrieveInputModelCreditCheckInstanceAnalysis getCreditCheckInstanceAnalysis() {
    return creditCheckInstanceAnalysis;
  }

  public void setCreditCheckInstanceAnalysis(BQCreditCheckRetrieveInputModelCreditCheckInstanceAnalysis creditCheckInstanceAnalysis) {
    this.creditCheckInstanceAnalysis = creditCheckInstanceAnalysis;
  }


}

