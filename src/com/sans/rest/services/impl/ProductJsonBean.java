/**
 * 
 */
package com.sans.rest.services.impl;

import java.util.List;

/**
 * @author sandeep_ts
 * 
 */
public class ProductJsonBean {

	private final boolean isError;
	private String returnType;
	private String priceUpdateIntervalMin;
	private String switchToHomePageIntervalMin;
	private String pageReloadIntervalMin;
	private String pageReloadingTime;
	private String pageReloadingSpanInMins;
	private String storeNumber;
	private List<String> emptyApiPartNumber;
	private String barcode;
	private String sleepHour;
	private String sleepMinute;
	private String wakeUpHour;
	private String wakeUpMinute;
	private String wakeUpRange;
	private Boolean enableStoreSetUp;
	private String feedbackSurveyUrl;
	private String feedbackSurveyId;
	private String storeManagerId;
	private String wifiReconnectInterval;
	private String wifiRetryCount;
	private String switchToVideoLoopingIntervalMin;
	// for Setting the categoryName of each item.
	private String categoryName;
	private Boolean enableStoreMap;
	private List<String> categoryLevelVideoURLs;
	private String currentTabName;
	// for Kmart
	private Integer storeType;

	private String appVersion;
	private String versionCheckTimeIntervalMin;
	private String newVersionUpdateIntervalMin;
	private String heartBeatUpdateIntervalMin;

	public String getStoreManagerId() {
		return storeManagerId;
	}

	public void setStoreManagerId(String storeManagerId) {
		this.storeManagerId = storeManagerId;
	}

	/**
	 * 
	 */
	public ProductJsonBean() {
		super();
		isError = false;

	}

	/**
	 * @return the returnType
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * @param returnType
	 *            the returnType to set
	 */
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	/**
	 * @return the priceUpdateIntervalMin
	 */
	public String getPriceUpdateIntervalMin() {
		return priceUpdateIntervalMin;
	}

	/**
	 * @param priceUpdateIntervalMin
	 *            the priceUpdateIntervalMin to set
	 */
	public void setPriceUpdateIntervalMin(String priceUpdateIntervalMin) {
		this.priceUpdateIntervalMin = priceUpdateIntervalMin;
	}

	/**
	 * @return the switchToHomePageIntervalMin
	 */
	public String getSwitchToHomePageIntervalMin() {
		return switchToHomePageIntervalMin;
	}

	/**
	 * @param switchToHomePageIntervalMin
	 *            the switchToHomePageIntervalMin to set
	 */
	public void setSwitchToHomePageIntervalMin(String switchToHomePageIntervalMin) {
		this.switchToHomePageIntervalMin = switchToHomePageIntervalMin;
	}

	/**
	 * @return the pageReloadIntervalMin
	 */
	public String getPageReloadIntervalMin() {
		return pageReloadIntervalMin;
	}

	/**
	 * @param pageReloadIntervalMin
	 *            the pageReloadIntervalMin to set
	 */
	public void setPageReloadIntervalMin(String pageReloadIntervalMin) {
		this.pageReloadIntervalMin = pageReloadIntervalMin;
	}

	/**
	 * @return the pageReloadingTime
	 */
	public String getPageReloadingTime() {
		return pageReloadingTime;
	}

	/**
	 * @param pageReloadingTime
	 *            the pageReloadingTime to set
	 */
	public void setPageReloadingTime(String pageReloadingTime) {
		this.pageReloadingTime = pageReloadingTime;
	}

	/**
	 * @return the pageReloadingSpanInMins
	 */
	public String getPageReloadingSpanInMins() {
		return pageReloadingSpanInMins;
	}

	/**
	 * @param pageReloadingSpanInMins
	 *            the pageReloadingSpanInMins to set
	 */
	public void setPageReloadingSpanInMins(String pageReloadingSpanInMins) {
		this.pageReloadingSpanInMins = pageReloadingSpanInMins;
	}

	/**
	 * @return the storeNumber
	 */
	public String getStoreNumber() {
		return storeNumber;
	}

	/**
	 * @param storeNumber
	 *            the storeNumber to set
	 */
	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}

	/**
	 * @return the emptyApiPartNumber
	 */
	public List<String> getEmptyApiPartNumber() {
		return emptyApiPartNumber;
	}

	/**
	 * @param emptyApiPartNumber
	 *            the emptyApiPartNumber to set
	 */
	public void setEmptyApiPartNumber(List<String> emptyApiPartNumber) {
		this.emptyApiPartNumber = emptyApiPartNumber;
	}

	/**
	 * @return the barcode
	 */
	public String getBarcode() {
		return barcode;
	}

	/**
	 * @param barcode
	 *            the barcode to set
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	/**
	 * @return the sleepHour
	 */
	public String getSleepHour() {
		return sleepHour;
	}

	/**
	 * @param sleepHour
	 *            the sleepHour to set
	 */
	public void setSleepHour(String sleepHour) {
		this.sleepHour = sleepHour;
	}

	/**
	 * @return the sleepMinute
	 */
	public String getSleepMinute() {
		return sleepMinute;
	}

	/**
	 * @param sleepMinute
	 *            the sleepMinute to set
	 */
	public void setSleepMinute(String sleepMinute) {
		this.sleepMinute = sleepMinute;
	}

	/**
	 * @return the wakeUpHour
	 */
	public String getWakeUpHour() {
		return wakeUpHour;
	}

	/**
	 * @param wakeUpHour
	 *            the wakeUpHour to set
	 */
	public void setWakeUpHour(String wakeUpHour) {
		this.wakeUpHour = wakeUpHour;
	}

	/**
	 * @return the wakeUpMinute
	 */
	public String getWakeUpMinute() {
		return wakeUpMinute;
	}

	/**
	 * @param wakeUpMinute
	 *            the wakeUpMinute to set
	 */
	public void setWakeUpMinute(String wakeUpMinute) {
		this.wakeUpMinute = wakeUpMinute;
	}

	/**
	 * @return the wakeUpRange
	 */
	public String getWakeUpRange() {
		return wakeUpRange;
	}

	/**
	 * @param wakeUpRange
	 *            the wakeUpRange to set
	 */
	public void setWakeUpRange(String wakeUpRange) {
		this.wakeUpRange = wakeUpRange;
	}

	/**
	 * @return the enableStoreSetUp
	 */
	public Boolean getEnableStoreSetUp() {
		return enableStoreSetUp;
	}

	/**
	 * @param enableStoreSetUp
	 *            the enableStoreSetUp to set
	 */
	public void setEnableStoreSetUp(Boolean enableStoreSetUp) {
		this.enableStoreSetUp = enableStoreSetUp;
	}

	/**
	 * @return the feedbackSurveyUrl
	 */
	public String getFeedbackSurveyUrl() {
		return feedbackSurveyUrl;
	}

	/**
	 * @param feedbackSurveyUrl
	 *            the feedbackSurveyUrl to set
	 */
	public void setFeedbackSurveyUrl(String feedbackSurveyUrl) {
		this.feedbackSurveyUrl = feedbackSurveyUrl;
	}

	/**
	 * @return the feedbackSurveyId
	 */
	public String getFeedbackSurveyId() {
		return feedbackSurveyId;
	}

	/**
	 * @param feedbackSurveyId
	 *            the feedbackSurveyId to set
	 */
	public void setFeedbackSurveyId(String feedbackSurveyId) {
		this.feedbackSurveyId = feedbackSurveyId;
	}

	/**
	 * @return the wifiReconnectInterval
	 */
	public String getWifiReconnectInterval() {
		return wifiReconnectInterval;
	}

	/**
	 * @param wifiReconnectInterval
	 *            the wifiReconnectInterval to set
	 */
	public void setWifiReconnectInterval(String wifiReconnectInterval) {
		this.wifiReconnectInterval = wifiReconnectInterval;
	}

	/**
	 * @return the wifiRetryCount
	 */
	public String getWifiRetryCount() {
		return wifiRetryCount;
	}

	/**
	 * @param wifiRetryCount
	 *            the wifiRetryCount to set
	 */
	public void setWifiRetryCount(String wifiRetryCount) {
		this.wifiRetryCount = wifiRetryCount;
	}

	/**
	 * @return the switchToVideoLoopingIntervalMin
	 */
	public String getSwitchToVideoLoopingIntervalMin() {
		return switchToVideoLoopingIntervalMin;
	}

	/**
	 * @param switchToVideoLoopingIntervalMin
	 *            the switchToVideoLoopingIntervalMin to set
	 */
	public void setSwitchToVideoLoopingIntervalMin(String switchToVideoLoopingIntervalMin) {
		this.switchToVideoLoopingIntervalMin = switchToVideoLoopingIntervalMin;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName
	 *            the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the enableStoreMap
	 */
	public Boolean getEnableStoreMap() {
		return enableStoreMap;
	}

	/**
	 * @param enableStoreMap
	 *            the enableStoreMap to set
	 */
	public void setEnableStoreMap(Boolean enableStoreMap) {
		this.enableStoreMap = enableStoreMap;
	}

	/**
	 * @return the categoryLevelVideoURLs
	 */
	public List<String> getCategoryLevelVideoURLs() {
		return categoryLevelVideoURLs;
	}

	/**
	 * @param categoryLevelVideoURLs
	 *            the categoryLevelVideoURLs to set
	 */
	public void setCategoryLevelVideoURLs(List<String> categoryLevelVideoURLs) {
		this.categoryLevelVideoURLs = categoryLevelVideoURLs;
	}

	/**
	 * @return the currentTabName
	 */
	public String getCurrentTabName() {
		return currentTabName;
	}

	/**
	 * @param currentTabName
	 *            the currentTabName to set
	 */
	public void setCurrentTabName(String currentTabName) {
		this.currentTabName = currentTabName;
	}

	/**
	 * @return the storeType
	 */
	public Integer getStoreType() {
		return storeType;
	}

	/**
	 * @param storeType
	 *            the storeType to set
	 */
	public void setStoreType(Integer storeType) {
		this.storeType = storeType;
	}

	/**
	 * @return the appVersion
	 */
	public String getAppVersion() {
		return appVersion;
	}

	/**
	 * @param appVersion
	 *            the appVersion to set
	 */
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	/**
	 * @return the versionCheckTimeIntervalMin
	 */
	public String getVersionCheckTimeIntervalMin() {
		return versionCheckTimeIntervalMin;
	}

	/**
	 * @param versionCheckTimeIntervalMin
	 *            the versionCheckTimeIntervalMin to set
	 */
	public void setVersionCheckTimeIntervalMin(String versionCheckTimeIntervalMin) {
		this.versionCheckTimeIntervalMin = versionCheckTimeIntervalMin;
	}

	/**
	 * @return the newVersionUpdateIntervalMin
	 */
	public String getNewVersionUpdateIntervalMin() {
		return newVersionUpdateIntervalMin;
	}

	/**
	 * @param newVersionUpdateIntervalMin
	 *            the newVersionUpdateIntervalMin to set
	 */
	public void setNewVersionUpdateIntervalMin(String newVersionUpdateIntervalMin) {
		this.newVersionUpdateIntervalMin = newVersionUpdateIntervalMin;
	}

	/**
	 * @return the heartBeatUpdateIntervalMin
	 */
	public String getHeartBeatUpdateIntervalMin() {
		return heartBeatUpdateIntervalMin;
	}

	/**
	 * @param heartBeatUpdateIntervalMin
	 *            the heartBeatUpdateIntervalMin to set
	 */
	public void setHeartBeatUpdateIntervalMin(String heartBeatUpdateIntervalMin) {
		this.heartBeatUpdateIntervalMin = heartBeatUpdateIntervalMin;
	}

	/**
	 * @return the isError
	 */
	public boolean isError() {
		return isError;
	}

}
