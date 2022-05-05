package com.spring.S501.service;

import com.spring.S501.model.WhiteCollarShop;
import com.spring.S501.repository.WhiteCollarShopRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class WhiteCollarShopServiceTest {

    @Autowired
    private WhiteCollarShopService shopService;

    @MockBean
    private WhiteCollarShopRepository shopRepository;

    @Test // Test unitari
    void testGetWhiteCollarShops() {

        // given
        WhiteCollarShop collarShop5 = new WhiteCollarShop("Shop555", 555);
        WhiteCollarShop collarShop6 = new WhiteCollarShop("Shop666", 666);

        // when
        when(shopService.getWhiteCollarShops()).thenReturn(Stream.of(collarShop5, collarShop6).collect(Collectors.toList()));

        // then
        int expected = 2;
        int actual = shopService.getWhiteCollarShops().size();
        assertEquals(expected, actual, "En aquest cas, el mètode getWhiteCollarShops(size) hauria de tornar com a resultat 2.");
    }

    @Test // Test unitari
    void testAddWhiteCollarShop() {

        // given
        WhiteCollarShop collarShop = new WhiteCollarShop("Shop777", 777);
        // when
        when(shopService.addWhiteCollarShop(collarShop)).thenReturn(collarShop);
        // then
        assertEquals(collarShop, shopService.addWhiteCollarShop(collarShop));
    }
}
