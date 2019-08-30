/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class CardAuthorizationApiController {

	@Autowired
	CardAuthorizationApiService service;
	
	@Assess.Activate
	public BianResponse<SDCardAuthorizationActivateOutputModel> activate(@RequestBody BianRequest<SDCardAuthorizationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Assess.Configure
	public BianResponse<SDCardAuthorizationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardAuthorizationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Evaluate
	public BianResponse<CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModel> evaluate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCreditChargeCardAuthorizationAssessmentEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Exchange
	public BianResponse<CRCreditChargeCardAuthorizationAssessmentExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditChargeCardAuthorizationAssessmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Execute
	public BianResponse<CRCreditChargeCardAuthorizationAssessmentExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditChargeCardAuthorizationAssessmentExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Feedback
	public BianResponse<SDCardAuthorizationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardAuthorizationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Grant
	public BianResponse<CRCreditChargeCardAuthorizationAssessmentGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditChargeCardAuthorizationAssessmentGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Request
	public BianResponse<CRCreditChargeCardAuthorizationAssessmentRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditChargeCardAuthorizationAssessmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Retrieve
	public BianResponse<CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Assess.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Assess.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("authentication")
	@Assess.Retrieve
	public BianResponse<BQAuthenticationRetrieveOutputModel> retrieveAuthentication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAuthentication(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("creditcheck")
	@Assess.Retrieve
	public BianResponse<BQCreditCheckRetrieveOutputModel> retrieveCreditcheck(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCreditcheck(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("devicecheck")
	@Assess.Retrieve
	public BianResponse<BQDeviceCheckRetrieveOutputModel> retrieveDevicecheck(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDevicecheck(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("fraudcheck")
	@Assess.Retrieve
	public BianResponse<BQFraudCheckRetrieveOutputModel> retrieveFraudcheck(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFraudcheck(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("standin")
	@Assess.Retrieve
	public BianResponse<BQStandInRetrieveOutputModel> retrieveStandin(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStandin(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Assess.RetrieveSD
	public BianResponse<SDCardAuthorizationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Assess.Update
	public BianResponse<CRCreditChargeCardAuthorizationAssessmentUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditChargeCardAuthorizationAssessmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("authentication")
	@Assess.Update
	public BianResponse<BQAuthenticationUpdateOutputModel> updateAuthentication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAuthenticationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAuthentication(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("devicecheck")
	@Assess.Update
	public BianResponse<BQDeviceCheckUpdateOutputModel> updateDevicecheck(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDeviceCheckUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDevicecheck(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
