package com.example.camping.dataAccess.abstracts;

import com.example.camping.entity.concretes.Products;
import org.springframework.data.jpa.repository.JpaRepository;
/*Veri erişim katmanı(Entity nesnesine)
Buradan veri, business katmanına yönlendiriliyor(servicelere).
Doğrudan entity'e kimse erişemiyor sadece burası erişebiliyor.
*/
/*
JPARepository ile , hazır operasyonları(Crud) kullanabiliyoruz.Ayıyeten yazmamıza gerek kalmıyor.
Generic ifadeye ilgili "Entity" nesnesi , ve o nesnenin ID'sinin Tipini Wrapper olarak geçiyoruz.
 */
public interface ProductDao extends JpaRepository<Products,Integer> {

}
