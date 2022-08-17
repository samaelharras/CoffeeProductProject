package com.ntg.product.entity;

import javax.persistence.*;


@Entity(name="coffee")
public class Coffee {
 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="name",nullable = false)
	private String name ;
	@Column(name="price")
	private long price;
	@Column(name="image")
	private String image ;

    public Coffee() {

    }


	public long getId() {
		return id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Coffee(long id, String name, long  price, String image ) {
		super();
		this.id = id;
		this.name = name;
		this.price = price ;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
}
