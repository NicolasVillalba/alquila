package com.powersys.alquila.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.powersys.alquila.domain.Property;

@Repository
public interface PropertyRepository extends CrudRepository<Property, String> {

	@Query("select p from Property p where p.id = :idProperty")
	public Property  findOne(@Param("idProperty") Long idProperty);

	@Query("select p from Property p where (p.price <= :price) and (p.type=:type) and (p.propertyDetail.rooms=:rooms)")
	public List<Property> findByPriceTypeRooms(@Param("price") Integer price,@Param("type") String type, @Param("rooms") String rooms);

	@Query("select p from Property p where (p.price <= :price) and (p.type=:type)")
	public List<Property> findByPriceType(@Param("price") Integer price,@Param("type") String type);

//	@Query("select p from Property p where ((p.type=:type) and (p.propertyDetail.rooms=:rooms)")
//	public List<Property> findByTypeRooms(@Param("type") String type, @Param("rooms") String rooms);

	@Query("select p from Property p where (p.price <= :price) and (p.type=:type) and (p.propertyDetail.rooms=:rooms)")
	public List<Property> findByPriceRooms(@Param("price") Integer price, @Param("rooms") String rooms);	
	
	@Query("select p from Property p where p.propertyDetail.rooms=:rooms")
	public List<Property> findByRooms(@Param("rooms") String rooms);	

	public List<Property> findByType(String type);
	public List<Property> findByPrice(Integer price);


}
