package VO;

public class PlaceVO {
	/* Member Variable */
	private int placeNo; // 관광지 고유 번호
	private String placeName; // 관광지 이름
	private String img; // 관광지의 이미지에 대한 경로
	private String info; // 관광지 정보
	private float latitude; // 관광지 위도
	private float longitude; // 관광지 경도
	private String icon; // 관광지 종류에 따른 아이콘(관광명소, 게스트하우스, 맛집)
	private int cityNo; // 관광지가 속해있는 도시의 이름.

	/* Constructor */
	public PlaceVO(){super();}
	public PlaceVO(int placeNo, String placeName, String img, String info, float latitude, float longitude, String icon,
			int cityNo) {
		super();
		this.placeNo = placeNo;
		this.placeName = placeName;
		this.img = img;
		this.info = info;
		this.latitude = latitude;
		this.longitude = longitude;
		this.icon = icon;
		this.cityNo = cityNo;
	}
	/* Get/Set Method */
	public int getPlaceNo(){return placeNo;}
	public void setPlaceNo(int placeNo){this.placeNo = placeNo;}
	public String getPlaceName(){return placeName;}
	public void setPlaceName(String placeName){this.placeName = placeName;}
	public String getImg(){return img;}
	public void setImg(String img){this.img = img;}
	public String getInfo(){return info;}
	public void setInfo(String info){this.info = info;}
	public float getLatitude(){return latitude;}
	public void setLatitude(int latitude){this.latitude = latitude;}
	public float getLongitude(){return longitude;}
	public void setLongitude(int longitude){this.longitude = longitude;}
	public String getIcon(){return icon;}
	public void setIcon(String icon){this.icon = icon;}
	public int getCityNo(){return cityNo;}
	public void setCityNo(String cityName){this.cityNo = cityNo;}
}
