package thess.tourism.creative.creativetourismthessapp.DbFiles;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import thess.tourism.creative.creativetourismthessapp.DbFiles.Category;
import thess.tourism.creative.creativetourismthessapp.DbFiles.StartPoint;
import thess.tourism.creative.creativetourismthessapp.DbFiles.Creator;
import thess.tourism.creative.creativetourismthessapp.DbFiles.BikesParkingPois;

import thess.tourism.creative.creativetourismthessapp.DbFiles.CategoryDao;
import thess.tourism.creative.creativetourismthessapp.DbFiles.StartPointDao;
import thess.tourism.creative.creativetourismthessapp.DbFiles.CreatorDao;
import thess.tourism.creative.creativetourismthessapp.DbFiles.BikesParkingPoisDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig categoryDaoConfig;
    private final DaoConfig startPointDaoConfig;
    private final DaoConfig creatorDaoConfig;
    private final DaoConfig bikesParkingPoisDaoConfig;

    private final CategoryDao categoryDao;
    private final StartPointDao startPointDao;
    private final CreatorDao creatorDao;
    private final BikesParkingPoisDao bikesParkingPoisDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        categoryDaoConfig = daoConfigMap.get(CategoryDao.class).clone();
        categoryDaoConfig.initIdentityScope(type);

        startPointDaoConfig = daoConfigMap.get(StartPointDao.class).clone();
        startPointDaoConfig.initIdentityScope(type);

        creatorDaoConfig = daoConfigMap.get(CreatorDao.class).clone();
        creatorDaoConfig.initIdentityScope(type);

        bikesParkingPoisDaoConfig = daoConfigMap.get(BikesParkingPoisDao.class).clone();
        bikesParkingPoisDaoConfig.initIdentityScope(type);

        categoryDao = new CategoryDao(categoryDaoConfig, this);
        startPointDao = new StartPointDao(startPointDaoConfig, this);
        creatorDao = new CreatorDao(creatorDaoConfig, this);
        bikesParkingPoisDao = new BikesParkingPoisDao(bikesParkingPoisDaoConfig, this);

        registerDao(Category.class, categoryDao);
        registerDao(StartPoint.class, startPointDao);
        registerDao(Creator.class, creatorDao);
        registerDao(BikesParkingPois.class, bikesParkingPoisDao);
    }
    
    public void clear() {
        categoryDaoConfig.getIdentityScope().clear();
        startPointDaoConfig.getIdentityScope().clear();
        creatorDaoConfig.getIdentityScope().clear();
        bikesParkingPoisDaoConfig.getIdentityScope().clear();
    }

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

    public StartPointDao getStartPointDao() {
        return startPointDao;
    }

    public CreatorDao getCreatorDao() {
        return creatorDao;
    }

    public BikesParkingPoisDao getBikesParkingPoisDao() {
        return bikesParkingPoisDao;
    }

}
