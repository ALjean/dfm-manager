package com.jean.dao;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.jean.DaoDfmException;


import org.junit.Before;
import org.junit.Test;

import com.jean.BaseTest;
import com.jean.CustomDfmException;
import com.jean.analyzers.weather.ConstantsAnalyzer.KEY_MESSAGE;
import com.jean.entity.Bait;
import com.jean.entity.BaitPropertie;
import com.jean.entity.BaitType;

public class BaitDaoTest extends BaseTest {

    private int fishId;
    private int generateKey;
    private String key;
    private Date date;
    private Bait bait;
    List<Bait> baits;

    @Before
    public void init() {
	fishId = 7;
	key = KEY_MESSAGE.STYRO_POP_UP.toString();
	date = Date.valueOf("2016-06-22");
	bait = new Bait(0, "Slizzard", "For real man who want to catch real Big Fish", new BaitType(1, " "), new ArrayList<BaitPropertie>());

    }

    @Test
    public void getBaitsForFishByDateTest() throws CustomDfmException, DaoDfmException {
	baits = baitDao.getBaitsToFishesByDate(fishId, date);
	assertTrue(!baits.isEmpty());
	System.out.println(baits);
    }

    @Test(expected = DaoDfmException.class)
    public void getBaitsForFishByDateExceptionTest() throws DaoDfmException {
	baits = baitDao.getBaitsToFishesByDate(123, date);
    }

    @Test
    public void saveBaitTest() throws DaoDfmException, CustomDfmException {
	generateKey = baitDao.saveBait(bait);
	assertTrue(generateKey > 0);
	System.out.println(generateKey);
    }

    @Test
    public void deleteBaitTest() throws DaoDfmException, CustomDfmException {
	baitDao.deleteBait(43);
    }
    
    @Test
    public void getBaitByIdTest() throws DaoDfmException, CustomDfmException{
	Bait bait = baitDao.getBait(4);
	assertNotNull(bait);
	System.out.println(bait);
    }
    


   // @Test(expected = CustomDfmException.class)
    public void deleteBaitExceptionTest() throws DaoDfmException, CustomDfmException {
	baitDao.deleteBait(123);
    }

    /*
     * @Test public void getMessageByKeyTest() throws CustomDfmException,
     * DaoDfmException{ assertTrue(baitDao.getMessage(key).length() > 0); }
     * 
     * @Test public void saveTest() throws CustomDfmException, DaoDfmException{
     * Bait bait = new Bait(); bait.setName("Test");
     * bait.setDescription("Adsdssdsd"); bait.setType(BaitType.LIVEBAIT);
     * baitDao.save(bait); }
     */

}
