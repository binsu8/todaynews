package com.firetoro.todaynews.service;

import com.firetoro.todaynews.model.entity.NewsEntity;
import com.firetoro.todaynews.model.request.NewsRequest;
import com.firetoro.todaynews.model.response.DetailData;
import com.firetoro.todaynews.model.response.NewData;
import com.firetoro.todaynews.model.response.News;
import com.firetoro.todaynews.model.response.NewsResponse;
import com.firetoro.todaynews.constant.Constants;
import com.google.common.collect.Iterables;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
@Service
public class NewService {

    @PersistenceContext
    private EntityManager em;

    public NewsEntity get(Integer id) {
        if(em == null){
            System.out.println("111111111111111");
            return null;
        }
        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<NewsEntity> query = builder.createQuery(NewsEntity.class);
        Root<NewsEntity> interestTopicEntity = query.from(NewsEntity.class);

        List<Predicate> predicates = new ArrayList<Predicate>();

        predicates.add(builder.equal(interestTopicEntity.get("id"), id));

        NewsEntity ee = DataAccessUtils.singleResult(em.createQuery(
                query.where(Iterables.toArray(predicates, Predicate.class))).getResultList());

        System.out.println("===============");
        System.out.println("ee");
        return ee;
    }

    public NewsResponse getNews(NewsRequest newsRequst){

        NewsResponse newsResponse = new NewsResponse();

        /*
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<NewsEntity> query = builder.createQuery(NewsEntity.class);
        Root<NewsEntity> newsEntityRoot = query.from(NewsEntity.class);

        List<Predicate> predicates = new ArrayList<Predicate>();

        predicates.add(builder.greaterThan(newsEntityRoot.get("created"), newsRequst.getLastRefresh()));

        if(newsRequst.getCategory() != null && !newsRequst.getCategory().equals("")) {
            predicates.add(builder.equal(newsEntityRoot.get("category"), newsRequst.getCategory()));

        }

        query.where(Iterables.toArray(predicates, Predicate.class));
        query.orderBy(builder.asc(newsEntityRoot.get("created")));

        List<NewsEntity> newsEntities = em.createQuery(query)
                .setMaxResults(10)
                .getResultList();

        */
        newsResponse.setStatus(Constants.STATUS.SUCCESS);

        List<NewsEntity> newsEntities = new ArrayList<>();

        List<NewData> newDatas = new ArrayList<>();
        newsResponse.setData(newDatas);
        for(NewsEntity newsEntity : newsEntities) {
            NewData newData = new NewData();
            newData.setCode("");
            News news = new News();
            newData.setContent(news);
            news.setArticleType(newsEntity.getArticleType());
            news.setSummary(newsEntity.getSummary());

        }

        newsResponse.setTotalNumber(newDatas.size());
        newsResponse.setHasMore(false);
        newsResponse.setLoginStatus(0);
        newsResponse.setHasMoreToRefresh(true);
        newsResponse.setActionToLastStick(1);
        newsResponse.setFeedFlag(0);

        DetailData detailData = new DetailData();

        detailData.setType("app");
        detailData.setDisplayDuration(2);
        detailData.setDisplayhInfo("游戏头条有8条更新");
        detailData.setDisplayTemplate("游戏头条有%s是更新");
        detailData.setOpenUrl("");
        detailData.setDownloadUrl("");
        detailData.setAppName("游戏头条");
        detailData.setPacakageName("fireToro");

        newsResponse.setDetails(detailData);

        return newsResponse;

    }


}
