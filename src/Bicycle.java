class Bicycle {

	private String ownerName;
	private String tagNo;
	private String id;

	public Bicycle(){
		ownerName = "Unknown";
		tagNo = "Unknown";
	}

	public Bicycle(String tagNo, String name){
		this.id = tagNo;
		this.ownerName = name;
	}

	public String getOwnerName(){

		return ownerName;
	}

	public void setOwnerName (String name){
		ownerName = name;
	}

	public String getTagNo(){

		return tagNo;
	}

	public void setTagNo (String tag){
		tagNo = tag;
	}

	public String setId (){
		return id;
	}

	public void setId (String id_no){
		id = id_no;
	}
}
