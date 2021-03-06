package com.hoau.crm.module.bse.api.shared.domain;

import com.hoau.hbdp.framework.entity.BaseEntity;

/**
 * 部门基础信息实体
 *
 * @author 蒋落琛
 * @date 2015-10-8
 */
public class BseDepartmentBean extends BaseEntity{
	
	private static final long serialVersionUID = 6950974334426273968L;

	/**
	 * 部门编码
	 */
	private String deptCode;
	
	/**
	 * 部门名称
	 */
	private String deptName;
	
	/**
	 * 上级部门编码
	 */
	private String parentDeptCode;
	
	/**
	 * 上级部门名称
	 */
	private String parentDeptName;
	
	/**
	 * 部门性质
	 * 将int类型转换成二进制，由低位至高位，每位上的值1表示是，0表示不是，倒数第一位表示是否门店，倒数第二位表示是否平台
	 * 现阶段只有2位，后续需要添加部门属性则向高位设置1或者0
	 * 比如2转换成二进制为10，倒数第一位0表示不是门店，倒数第二位是1表示是平台
	 */
	private int deptNature;
	
	
	/**
	 * 所在大区编码
	 */
	private String bigRegionCode;
	/**
	 * 所在事业部编码
	 */
	private String divisionCode;
	
	/**
	 * 物流代码
	 */
	private String logistCode;
	
	/**
	 * 负责人编号
	 */
	private String managerCode;
	
	/**
	 * 负责人姓名
	 */
	private String managerName;
	
	/**
	 * 省份
	 */
	private String province;
	
	/**
	 * 省份编码
	 */
	private String provinceCode;
	
	/**
	 * 城市
	 */
	private String city;
	
	/**
	 * 城市编码
	 */ 
	private String cityCode;
	
	/**
	 * 区县
	 */
	private String county;
	
	/**
	 * 区县编码
	 */
	private String countyCode;
	
	/**
	 * 区号(座机区号)
	 */
	private String areaCode;
	
	/**
	 * 电话
	 */
	private String phone;
	
	/**
	 * 传真
	 */
	private String fax;
	
	/**
	 * 详细地址
	 */
	private String addressDetail;
	
	/**
	 * 经度
	 */
	private Double lng;
	
	/**
	 * 纬度
	 */
	private Double lat;
	
	/**
	 * 是否提供定日达
	 */
	private String isSpecifiedTime;
	
	/**
	 * 是否可发货
	 */
	private String isShipment;
	
	/**
	 * 是否可送货
	 */
	private String isDelivery;
	
	/**
	 * 是否可自提
	 */
	private String isPickUp;
	
	/**
	 *是否是门店
	 */
	private String isStore;
	/**
	 *是否是路区
	 */
	private String isRoad;
	/**
	 *是否是大区
	 */
	private String isRegion;
	/**
	 *是否是事业部
	 */
	private String isBusiness;
	
	/**
	 * 是否激活
	 */
	private String active;

	/**
	 *版本号
	 */
	private long versionNo;
	
	/**
	 *部门性质名称
	 */
	private String deptNatureName;
	
	public String getDeptNatureName() {
		return deptNatureName;
	}

	public void setDeptNatureName(String deptNatureName) {
		this.deptNatureName = deptNatureName;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getParentDeptCode() {
		return parentDeptCode;
	}

	public void setParentDeptCode(String parentDeptCode) {
		this.parentDeptCode = parentDeptCode;
	}

	public String getParentDeptName() {
		return parentDeptName;
	}

	public void setParentDeptName(String parentDeptName) {
		this.parentDeptName = parentDeptName;
	}

	public int getDeptNature() {
		return deptNature;
	}

	public void setDeptNature(int deptNature) {
		this.deptNature = deptNature;
	}

	public String getManagerCode() {
		return managerCode;
	}

	public void setManagerCode(String managerCode) {
		this.managerCode = managerCode;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public String getIsSpecifiedTime() {
		return isSpecifiedTime;
	}

	public void setIsSpecifiedTime(String isSpecifiedTime) {
		this.isSpecifiedTime = isSpecifiedTime;
	}

	public String getIsShipment() {
		return isShipment;
	}

	public void setIsShipment(String isShipment) {
		this.isShipment = isShipment;
	}

	public String getIsDelivery() {
		return isDelivery;
	}

	public void setIsDelivery(String isDelivery) {
		this.isDelivery = isDelivery;
	}

	public String getIsPickUp() {
		return isPickUp;
	}

	public void setIsPickUp(String isPickUp) {
		this.isPickUp = isPickUp;
	}

	public String getIsStore() {
		return isStore;
	}

	public void setIsStore(String isStore) {
		this.isStore = isStore;
	}

	public String getIsRoad() {
		return isRoad;
	}

	public void setIsRoad(String isRoad) {
		this.isRoad = isRoad;
	}

	public String getIsRegion() {
		return isRegion;
	}

	public void setIsRegion(String isRegion) {
		this.isRegion = isRegion;
	}

	public String getIsBusiness() {
		return isBusiness;
	}

	public void setIsBusiness(String isBusiness) {
		this.isBusiness = isBusiness;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public long getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(long versionNo) {
		this.versionNo = versionNo;
	}

	public String getLogistCode() {
		return logistCode;
	}

	public void setLogistCode(String logistCode) {
		this.logistCode = logistCode;
	}

	public String getBigRegionCode() {
		return bigRegionCode;
	}

	public void setBigRegionCode(String bigRegionCode) {
		this.bigRegionCode = bigRegionCode;
	}

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}
	
}
