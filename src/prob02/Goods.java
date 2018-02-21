package prob02;

public class Goods {
	private String goodsName;
	private int goodsPrice;
	private int goodsCnt;
	
	public Goods() {
	
	}
	
	public Goods(String goodsName, int goodsPrice, int goodsCnt) {
		super();
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsCnt = goodsCnt;
	}

	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public int getGoodsCnt() {
		return goodsCnt;
	}
	public void setGoodsCnt(int goodsCnt) {
		this.goodsCnt = goodsCnt;
	}
	
	@Override
	public String toString() {
		return goodsName+"(가격: " + goodsPrice + "원)이 " + goodsCnt +"개 입고 되었습니다.";
	}
}
