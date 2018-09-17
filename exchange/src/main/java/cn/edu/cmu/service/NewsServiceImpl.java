
package cn.edu.cmu.service;

import cn.edu.cmu.domain.News;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Override
    public List<News> list(News news) {
        return null;
    }
/*
   @Autowired
   private NewsDAO newsDAO;

   public List<News> list(News news){


      NewsExample example = new NewsExample();
      NewsExample.Criteria criteria = example.createCriteria();
      if (StringUtils.isNotBlank(news.getNewsTitle())) {
         criteria.andNewsTitleLike("%"+news.getNewsTitle()+"%");
      }

      List list = newsDAO.selectByExample(example);
      if(1==1 ){
          list = null;
      }

      return list;
   }*/

}

